public class RomanNumbers {

    public String translateToRomanNumbers(int input) {
        String returnValue = "";
        // logic
        if(input > 100) {
            int hundredsValue =  input / 100;
            returnValue = getRomanValue(hundredsValue,returnValue, "C", "D", "M");
            input = input % 100;
        }
        if(input > 10){
            int tensValue = input / 10;
            returnValue = getRomanValue(tensValue,returnValue, "X", "L", "C");
            input = input % 10;
        }
        returnValue = getRomanValue(input, returnValue, "I", "V", "X");

        return returnValue;
    }

    private String getRomanValue(int input, String returnValue, String incrementerValue, String lowerConstant, String upperConstant) {
        int result = 0;
        if(input > 3 && input <=8) {
            result = 5 - input;
            if (result > 0) {
                returnValue =  returnValue + incrementerValue + lowerConstant;
                input = 0;
            } else {
                input = result * -1;
                returnValue = returnValue + lowerConstant;
            }
        }

        if(input > 8) {
            result = 10 - input;
            if (result > 0) {
                returnValue = returnValue + incrementerValue + upperConstant;
                input = 0;
            } else {
                input = result * -1;
                returnValue = returnValue + upperConstant;
            }
        }

        for(int i = 0; i< input; i++){
            returnValue = returnValue + incrementerValue;
        }
        return returnValue;
    }

}
