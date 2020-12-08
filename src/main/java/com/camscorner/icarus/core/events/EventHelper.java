// From CameraOverhaul, licensed under MIT.

package com.camscorner.icarus.core.events;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public final class EventHelper
{
	private static final List<Event<?>> Events = new ArrayList<>();

	private EventHelper() { }

	public static void Update()
	{
		Events.forEach(Event::Update);
	}

	public static <T> Event<T> createEvent(Class<? super T> type, Function<T[], T> invokerFactory)
	{
		return createEvent(type, null, invokerFactory);
	}

	public static <T> Event<T> createEvent(Class<? super T> type, T emptyInvoker, Function<T[], T> invokerFactory)
	{
		Event<T> event = new Event<>(type, emptyInvoker, invokerFactory);

		Events.add(event);

		return event;
	}
}
