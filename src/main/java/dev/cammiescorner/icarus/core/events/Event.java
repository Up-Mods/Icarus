/**
 * MIT License
 * <p>
 * Copyright (c) 2020 Mirsario
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.cammiescorner.icarus.core.events;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Function;

public class Event<T> {
	private final Class<? super T> type;
	private final Function<T[], T> invokerFactory;
	private final T dummyInvoker;
	private T[] handlers;
	private T invoker;

	public Event(Class<? super T> type, T dummyInvoker, Function<T[], T> invokerFactory) {
		this.type = type;
		this.dummyInvoker = dummyInvoker;
		this.invokerFactory = invokerFactory;

		Update();
	}

	public void Register(T listener) {
		if(listener == null) {
			throw new NullPointerException("Tried to register a null listener!");
		}

		if(handlers == null) {
			handlers = (T[]) Array.newInstance(type, 1);
			handlers[0] = listener;
		}
		else {
			handlers = Arrays.copyOf(handlers, handlers.length + 1);
			handlers[handlers.length - 1] = listener;
		}

		Update();
	}

	public void Update() {
		if(handlers == null) {
			if(dummyInvoker != null) {
				invoker = dummyInvoker;
			}
			else {
				invoker = invokerFactory.apply((T[]) Array.newInstance(type, 0));
			}
		}
		else if(handlers.length == 1) {
			invoker = handlers[0];
		}
		else {
			invoker = invokerFactory.apply(handlers);
		}
	}

	public final T Invoker() {
		return invoker;
	}
}
