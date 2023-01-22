import java.math.BigDecimal;

public class bigIntegerDemo {
    public static void main(String[] args) {
        System.out.println(new BigDecimal(0.01)
                .equals(new BigDecimal("0.01000000000000000020816681711721685132943093776702880859375"))); // true
        var x = new BigDecimal(0.00003);
        var y = new BigDecimal(0.00003);
        System.out.println(x.add(y));

    }
}
