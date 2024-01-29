public class Task8 {
    public static void main(String[] args) {
        int m = 0;
        for (int i = 1; i <= 12; i++) {
            m += 29000;
            System.out.println("Месяц " + i + ": сумма накоплений - " + m + " рублей");
        }
    }
}
