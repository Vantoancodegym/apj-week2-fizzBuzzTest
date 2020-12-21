public class FizzBuzz {

    public static final int FIZZ_VLALUE = 3;
    public static final int BUZZ_VLALUE = 5;
    public static final int FIZZ_BUZZ_VLALUE = 15;
    public static final char CHAR_OF_FIZZ_VALUE = '3';
    public static final char CHAR_OF_BUZZ_VALUE = '5';

    public static String getFizzBuzz(int number){
        String result="";
        boolean isNagatice=number<=0;
        if (isNagatice){
            result="invalid value";
        }else if (number%FIZZ_BUZZ_VLALUE==0){
            result="FizzBuzz";
        }
        else if (number%FIZZ_VLALUE==0){
            result="Fizz";
        }else if (number%BUZZ_VLALUE==0){
            result="Buzz";
        }else {
            if (isHasFIZZ_VLALUE(number)){
                result="Fizz";
            }else if (isHasBUZZ_VLALUE(number)){
                result="Buzz";
            }
            else {
                if (number<=100) result=convertNumberToString(number);
                else result = String.valueOf(number);
            }
        }
        return result;
    }
    public static boolean isHasFIZZ_VLALUE(int number){
        String stringOfNumber=String.valueOf(number);
        for (int i = 0; i < stringOfNumber.length(); i++) {
            if (stringOfNumber.charAt(i)== CHAR_OF_FIZZ_VALUE) {
                return true;
            }
        }
        return false;
    }
    public static boolean isHasBUZZ_VLALUE(int number){
        String stringOfNumber=String.valueOf(number);
        for (int i = 0; i < stringOfNumber.length(); i++) {
            if (stringOfNumber.charAt(i)== CHAR_OF_BUZZ_VALUE) {
                return true;
            }
        }
        return false;
    }
    public static String convertNumberToString(int number){
        String result="";
        String[] numbersSmallThan20={"one","two","three","four","five","six","seven","eight","nine","ten",
                "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        int[] numbers={1,2,3,4,5,6,7,8,9,10,1,12,13,14,15,16,17,18,19};
        if (number<20) {
            for (int i = 0; i < numbers.length; i++) {
                if (number == numbers[i]) {
                    return result = numbersSmallThan20[i];
                }
            }
        }else {
            result = getStringOfNumber(number, numbersSmallThan20, numbers);

        }

        return result;
    }
    private static String getStringOfNumber(int number, String[] numbersSmallThan20, int[] numbers) {
        String result;
        String str="";
        int dozens= number /10;
        int unitRow= number -dozens*10;
        switch (dozens) {
            case 2:
                str += "twenty";
                break;
            case 3:
                str += "thirty";
                break;
            case 5:
                str += "fifty";
                break;
            default:
                for (int i = 0; i < numbers.length; i++) {
                    if (dozens == numbers[i]) {
                        str += numbersSmallThan20[i] + "ty";
                        break;
                    }
                }
        }
        if (unitRow==0){
            str+="";
        }    else {
            for (int i = 0; i < numbers.length; i++) {
                if (unitRow== numbers[i]){
                    str+=" "+ numbersSmallThan20[i];
                    break;
                }
            }
        }
        result=str;
        return result;
    }
}
