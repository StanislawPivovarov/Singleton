package enumS;
//в программировании тип данных,
//чьё множество значений представляет собой
//ограниченный список идентификаторов
public enum SingletonEnum {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}