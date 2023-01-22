public class StringDemo {
    public static void main(String[] args) {
        var x = "";
        String[] ss = { "1", "2", "3" };
        System.out.println(x);
        x = String.join("YY", ss);
        System.out.println(x);

    }
}
