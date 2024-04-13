package dev.cammiescorner.icarus.util;

import java.util.function.Supplier;

@FunctionalInterface
public interface Registrar<TYPE> {

    <T extends TYPE> Supplier<T> register(String name, Supplier<? extends T> factory);
}
