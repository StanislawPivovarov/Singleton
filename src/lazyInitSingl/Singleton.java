package lazyInitSingl;
//когда некоторая ресурсоёмкая операция (создание объекта, вычисление значения)
// выполняется непосредственно перед тем, как будет использован её результат.
public class Singleton {

    private static Singleton INSTANCE;

    private Singleton() {}

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}