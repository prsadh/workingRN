public class Application {
    public static void main(String[] args) {
        System.out.println("Application Started!!");
        RomanNumbers romanNumbers = new RomanNumbers();
        int input = 1;
        String value = romanNumbers.translateToRomanNumbers(input);
        System.out.printf("Roman Numerical for %s is %s",input,value);
    }
}
