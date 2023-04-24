public class Money {

    Calc calculate = new Calc();

    public static String nameRub1() {
        String name = "";
        switch ((int) (Calc.finalCoast() % 10)) {
            case 1:
                return name = " рубль";
            case 2:
            case 3:
            case 4:
                return name = " рубля";
            default:
                return name = " рублей";

        }

    }

    public static String nameRub2() {
        Goods goods = new Goods();
        String name = "";
        switch ((int) (goods.sumCoastGoods % 10)) {
            case 1:
                return name = " рубль";
            case 2:
            case 3:
            case 4:
                return name = " рубля";
            default:
                return name = " рублей";

        }

    }


}



