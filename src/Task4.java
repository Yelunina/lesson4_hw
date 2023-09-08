public class Task4 {
    /*
    Задача 4: Расчет стоимости звонков (CallCost)
Описание
У вас есть тарифный план, по которому минута разговора стоит X центов.
 Вам нужно рассчитать, сколько вы потратите на Y минут разговора. (calculateCallCost)

Ожидаемый вывод
Стоимость 15 минут разговора при стоимости 20 центов за минуту.
Стоимость 30 минут разговора при стоимости 15 центов за минуту.
     */
    public static void main(String[] args) {
        double result = calculateCallCost(15, 20);
        System.out.println("Стоимость 15 минут разговора при стоимости 20 центов за минуту - " + result + " евро");
        result = calculateCallCost(30, 15);
        System.out.println("Стоимость 30 минут разговора при стоимости 15 центов за минуту - " + result + " евро");
    }

    public static double calculateCallCost(double minutes, double cents) {
        return minutes * cents / 100;
    }
}
