public class PowerTable {
    public static void main(String[] args) {
        System.out.println("a	b	pow(a, b)");
        for (int a = 1; a <= 5; a++) {
            int b = a + 1;
            int result = (int) Math.pow(a, b);
            System.out.printf("%d	%d	%d%n", a, b, result);
        }
    }
}