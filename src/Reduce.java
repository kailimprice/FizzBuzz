public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        for (int n = 100; n > 0;) {
            boolean even = n % 2 == 0;
            if (even) {
                n = n / 2;
            }
            else {
                n--;
            }
            count++;
        }
        System.out.println(count);
    }
}
