import java.util.Scanner;

public class Goods {
    static double sumCoastGoods = 0.00;

    static String sumGoods = "";

    public static double goods() {
        Scanner scanner = new Scanner(System.in);
        Money rub = new Money();
        while (true) {
            System.out.println("Введите назваине товара");
            String goods = scanner.nextLine();
            System.out.println("Введите стоиомость товара");
            if (scanner.hasNextDouble()) {
                double coast = scanner.nextDouble();

                while (coast < 0) {
                    System.out.println("Введите повтороно стоимость товара");
                    coast = scanner.nextDouble();
                    if (coast >= 0) {
                        break;
                    }
                    scanner.next();
                }

                System.out.println("Товар успешно добавлен!");
                sumCoastGoods = sumCoastGoods + coast;
                sumGoods = sumGoods + goods + "\n";
                System.out.println("Итоговая стоимость товаров составляет - " + sumCoastGoods + rub.nameRub(sumCoastGoods) + "\nВведите \"Завершить\", чтобы закончить подсчет товаров, если хотите продолжить введите любой символ.");
                String finish = scanner.nextLine();
                String end = "завершить";
                if (scanner.nextLine().equalsIgnoreCase(end)) {
                    System.out.println("Подсчет товаров окончен.\nИтоговая сумма составляет - " + sumCoastGoods + rub.nameRub(sumCoastGoods));
                    System.out.println("Список товаров:\n" + sumGoods + "\n");
                    return sumCoastGoods;
                }
            }
        }

    }
}


