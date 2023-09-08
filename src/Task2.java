public class Task2 {
    /*
    Задача 2: Калькулятор электроэнергии для Анны (EnergyCalculator)
Описание:
Анна использует различные электроприборы в своем доме. У неё есть холодильник,
который потребляет 150 Вт, и кондиционер с потреблением 2000 Вт.

Анна хочет узнать, сколько она тратит на электроэнергию в месяц, если стоимость 1 кВт·ч составляет 0.15 евро.

Вопросы:
Сколько электроэнергии тратят холодильник и кондиционер вместе в час? (calculateHourlyConsumption)

Сколько Анна тратит на электроэнергию в месяц? (calculateMonthlyCost)

Ожидаемый вывод:
Для холодильника 150 Вт и кондиционера 2000 Вт, стоимость 1 кВт·ч — 0.15 евро.
Для холодильника 200 Вт и кондиционера 1800 Вт, стоимость 1 кВт·ч — 0.20 евро.
Примечание:
Ваша программа должна быть готова к тому, что все значения могут меняться,
 и расчёт должен быть произведён в любом случае.
     */
    public static void main(String[] args) {
        double result = calculateHourlyConsumption(150, 2000, 0.15);
        System.out.println("Для холодильника 150 Вт и кондиционера 2000 Вт, стоимость 1 кВт·ч - " + result + " евро");
        result = calculateHourlyConsumption(200, 1800, 0.2);
        System.out.println("Для холодильника 200 Вт и кондиционера 1800 Вт, стоимость 1 кВт·ч - " + result + " евро");
        result = calculateMonthlyCost(150, 2000, 0.15, 24, 30);
        System.out.println("Стоимость электроэнергии в месяц для холодильника 150 Вт и кондиционера 2000 Вт - " + result + " евро");
        result = calculateMonthlyCost(200, 1800, 0.2, 24, 15);
        System.out.println("Стоимость электроэнергии в месяц для холодильника 200 Вт и кондиционера 1800 Вт - " + result + " евро");
    }

    public static double calculateHourlyConsumption(double pow1, double pow2, double cost) {
        return (pow1 + pow2) / 1000 * cost;
    }

    public static double calculateMonthlyCost(double pow1, double pow2, double cost, double hours, double days) {
        double res = calculateHourlyConsumption(pow1, pow2, cost);
        return res * hours * days;
    }
}
