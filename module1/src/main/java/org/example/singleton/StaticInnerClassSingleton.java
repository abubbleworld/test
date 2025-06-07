package org.example.singleton;

public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton () {
        if (StaticInner.instance != null) {
            throw new RuntimeException("cannot create instance using reflection!");
        }
    }

    private static class StaticInner {
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return StaticInner.instance;
    }

}
