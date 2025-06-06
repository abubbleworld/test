import org.example.singleton.LazySingletonEnum;

public class LazySingletonEnumTest {

    public static void main() {
        LazySingletonEnum se = LazySingletonEnum.INSTANCE;

        System.out.println(se);

        LazySingletonEnum se2 = LazySingletonEnum.INSTANCE;

        System.out.println(se2);

        System.out.println(se == se2);
    }

}
