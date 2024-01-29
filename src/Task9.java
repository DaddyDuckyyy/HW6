public class Task9 {
    public static void main(String[] args) {
        double m = 0;
        for (int i = 1; i <= 12; i++) {
            m += 29000;
            m += m * 0.01;
            System.out.println("Месяц " + i + ": сумма накоплений - " + m + " руб");
        }
    }
}
