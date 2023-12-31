public class Task5 {
    /*
    Задача 5: Расчет калорий (CalorieCalculation)
Описание
Вы занимаетесь спортом и хотите рассчитать, сколько калорий вы сжигаете за T минут бега,
зная, что сжигается Z калорий в минуту. (calculateCaloriesBurnt)

Ожидаемый вывод
Количество сожженных калорий за 20 минут при сжигании 8 калорий в минуту.
Количество сожженных калорий за 30 минут при сжигании 10 калорий в минуту.
     */
    public static void main(String[] args) {
        double result = calculateCaloriesBurnt(20, 8);
        System.out.println("Количество сожженных калорий за 20 минут при сжигании 8 калорий в минуту - " + result);
        result = calculateCaloriesBurnt(30, 10);
        System.out.println("Количество сожженных калорий за 30 минут при сжигании 10 калорий в минуту - " + result);
    }

    public static double calculateCaloriesBurnt(double minutes, double caloriePerMinuteBurnt) {
        return minutes * caloriePerMinuteBurnt;
    }
}
