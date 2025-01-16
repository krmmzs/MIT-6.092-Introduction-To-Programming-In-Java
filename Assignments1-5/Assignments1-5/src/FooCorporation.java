public class FooCorporation {
    public static void total_pay(double base_pay, int hours) {
        if (base_pay < 8.0 || hours > 60) {
            System.out.println("Error");
            return;
        }
        double sum = 0.0;
        if (hours <= 40) {
            sum = base_pay * hours;
        } else {
            sum = 40 * base_pay + (hours - 40) * 1.5 * base_pay;
        }
        System.out.println(sum);
    }
    public static void main(String[] arguments) {
        total_pay(7.50, 35);
        total_pay(8.20, 47);
        total_pay(10.00, 73);
    }
}
