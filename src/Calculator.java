public class Calculator {

    static <T extends Number, V extends Number> double divide (T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }

    static <T extends Number, V extends Number> double sum (T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    static <T extends Number, V extends Number> double multiply (T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    static  <T extends Number, V extends Number> double subtract (T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }


}
