import org.example.singleton.StaticInnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class StaticInnerClassSingletonTest {

    public static void main() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        StaticInnerClassSingleton s1 = StaticInnerClassSingleton.getInstance();

        StaticInnerClassSingleton s2 = StaticInnerClassSingleton.getInstance();

        System.out.println(s1 == s2);

        Constructor<StaticInnerClassSingleton> con  = StaticInnerClassSingleton.class.getDeclaredConstructor();

        con.setAccessible(true);

        StaticInnerClassSingleton s3 = con.newInstance();

        System.out.println(s1 == s3);
    }

}
