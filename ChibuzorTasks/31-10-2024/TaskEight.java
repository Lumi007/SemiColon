public class TaskEight {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 4; i <= 10; i += 4) {
            sum += i + i*i + i*i*i + i*i*i*i + i*i*i*i*i;
        }
        System.out.printf("%d", sum);
    }
}