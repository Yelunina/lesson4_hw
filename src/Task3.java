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
        double result = calculateFuelConsumption(8, 100, 150);
        System.out.println(result);
        result = calculateFuelConsumption(10, 100, 300);
        System.out.println(result);
    }

    public static double calculateFuelConsumption(double l, double km, double n) {
        return l / km * n;
    }
}
