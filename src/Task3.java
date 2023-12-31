public class Task3 {
    /*
    Задача 3: Расчет расхода топлива (FuelCalculation)
Описание
У вас есть автомобиль, который расходует N литров топлива на 100 км. Вам нужно рассчитать,
сколько топлива потребуется для поездки на расстояние M км. (calculateFuelConsumption)

Ожидаемый вывод
Расход топлива для 150 км при расходе 8 л/100 км.
Расход топлива для 300 км при расходе 10 л/100 км.
     */
    public static void main(String[] args) {
        double result = calculateFuelConsumption(8,  107);
        System.out.println("Для поездки на 107 км при расходе 8 л/100 км потребуется " + result + " литров топлива");
        result = calculateFuelConsumption(10, 303);
        System.out.println("Для поездки на 303 км при расходе 10 л/100 км потребуется " + result + " литров топлива");
    }

    public static double calculateFuelConsumption(double l, double km) {
        return l / 100 * km;
    }
}
