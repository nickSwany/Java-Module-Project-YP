import java.util.Scanner;

public class Calc {
static int people;

    public static int guestsAndGoods() {
        Goods goods = new Goods();

        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("Введите количество человек на которое необходимо разделить счет!");
        people = scanner.nextInt();
        if (people >= 1) {
        break;
        }
    }
        goods.goods();
        return people;
    }

public static double finalCoast() {
    Goods goods = new Goods();
    double coast = goods.sumCoastGoods;
    return coast / people;
}








}
