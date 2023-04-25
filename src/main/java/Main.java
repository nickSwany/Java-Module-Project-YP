public class Main {


    public static void main(String[] args) {
        Calc calculate = new Calc();
        Money rub = new Money();

        calculate.guestsAndGoods();
        calculate.finalCoast();

        String end1 = String.format("%.2f", calculate.finalCoast());
        System.out.println("С каждого человека  - " + end1 + rub.nameRub(Calc.finalCoast()) + ".");
    }
}
