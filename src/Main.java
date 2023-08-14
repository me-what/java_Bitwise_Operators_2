public class Main {
    public static void main(String[] args) throws InterruptedException{
        int a = 10;

        System.out.println(" a = " + a + "; binary string: " + Integer.toBinaryString(a)); // 1010
        System.out.println("~a = " + ~a + "; binary string: " + Integer.toBinaryString(~a)); // 0101
        System.out.println();

        int aa1 = 89478485;
        animateNegation(aa1);
    }

    private static void animateNegation(int aa1) throws InterruptedException {
        String pattern = " aa1 = %d; binary string: ";
        String negationPattern = "~aa1 = %d; binary string: ";

        System.out.print(String.format(pattern, aa1)); // aa1 = 89478485; binary string: 00000101010101010101010101010101
        printByChar(binaryString(aa1));

        System.out.println();

        System.out.print(String.format(negationPattern, ~aa1)); // ~aa1 = -89478486; binary string: 11111010101010101010101010101010
        printByChar(binaryString(~aa1));
    }

    private static void printByChar(String s) throws InterruptedException{
        int delay = 250;
        for (char ch : s.toCharArray()) {
            Thread.sleep(delay);
            System.out.print(ch);
        }
    }

    private static String binaryString(int a) {
        return String.format("%32s", Integer.toBinaryString(a))
                .replace(' ', '0');
    }
}