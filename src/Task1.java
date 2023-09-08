public class Task1 {
    /*
    Задача 1: Калькулятор
Напишите методы для выполнения основных арифметических операций:
-- сложения (add)
-- вычитания (subtract)
-- умножения (multiply)
-- деления (divide)
-- нахождения остатка от деления (modulo)
-- Каждый метод должен принимать два аргумента и возвращать результат.
     */
    public static void main(String[] args) {
        double result = add(10.3, 10);
        System.out.println(result);
        result = subtract(20, 10.5);
        System.out.println(result);
        result = multiply(5.3, 5.2);
        System.out.println(result);
        result = divide(17.5, 3);
        System.out.println(result);
        result = modulo(35.5, 5.5);
        System.out.println(result);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double modulo(double a, double b) {
        return a % b;
    }
}
