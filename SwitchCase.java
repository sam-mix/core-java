public class SwitchCase {
    public static void main(String[] args) {
        int s = 1;
        var x = switch (s) {
            case 1, 2, 3, 4 ->
                0;
            case 5 -> {
                System.out.println("5");
                yield 5;
            }
            default ->
                100;
        };
        System.out.println(x);

        switch (x) {
            case 1:
                System.out.println(": 1");
                break;

        }
    }
}
