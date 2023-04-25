public class Money {

    Calc calculate = new Calc();

    public static String nameRub(double a) {
        String name = "";
        if ((int) (a % 100 / 10) == 1) {
            return name = " рублей";
        } else {
            switch ((int) (a % 10)) {
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
}



