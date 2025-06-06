package org.example.singleton;

public class LazySingletonDoubleCheck {

    private static volatile LazySingletonDoubleCheck instance;

    private LazySingletonDoubleCheck() {
        if (instance != null) {
            throw new IllegalStateException("instance already exists!");
        }
    }

    public static LazySingletonDoubleCheck getInstance() {

        if (instance == null) {
            synchronized (LazySingletonDoubleCheck.class) {
                if (instance == null) {
                    return instance = new LazySingletonDoubleCheck();
                }
            }
        }
        return instance;
    }

}
