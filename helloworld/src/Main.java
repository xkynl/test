public class Main {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(a + "和" + b + "和" + c + "中最大的数是" + max);
    }
}