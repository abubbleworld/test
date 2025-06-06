package org.example.singleton;

public enum LazySingletonEnum {

    INSTANCE;

    public static LazySingletonEnum getInstance() {
        return INSTANCE;
    }

}
