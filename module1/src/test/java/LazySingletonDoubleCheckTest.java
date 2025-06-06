import org.example.singleton.LazySingletonDoubleCheck;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LazySingletonDoubleCheckTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        LazySingletonDoubleCheck s1 = LazySingletonDoubleCheck.getInstance();

        System.out.println(s1);

        LazySingletonDoubleCheck s2 = LazySingletonDoubleCheck.getInstance();

        System.out.println(s2);

        Constructor<LazySingletonDoubleCheck> con  = LazySingletonDoubleCheck.class.getDeclaredConstructor();

        con.setAccessible(true);

        LazySingletonDoubleCheck s3 = con.newInstance();

        System.out.println(s3);

    }
}
