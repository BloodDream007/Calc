package util;

import enums.RimNumbers;
import operations.ForArabicanNumbers;
import operations.ForRimNumbers;

import java.util.Arrays;

public class Parser {
    String firstNum;
    String secondNum;
    String operand;

    public Parser(String firstNum, String secondNum, String operand) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operand = operand;
    }

    public void printAfterParse() {
//        if (Arrays.stream(RimNumbers.values()).) {
//        }
        //ARAB
        if (isNumeric(firstNum) && isNumeric(secondNum)){
            int f = Integer.parseInt(firstNum);
            int s = Integer.parseInt(secondNum);
            ForArabicanNumbers arab = new ForArabicanNumbers(f, s, operand);
            arab.calculate();
            System.out.println("arab, work");
        }

        //RIM
        else if(isRim(firstNum) && isRim(secondNum)){
            ForRimNumbers rims = new ForRimNumbers(firstNum, secondNum, operand);
            rims.calculate();
            System.out.println("rim, work");
        }
        else {
        System.out.println("Вы ввели не число");}
    }

    private boolean isNumeric(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    private boolean isRim(String string) {
//        for (RimNumbers rim : values()) {
//            if (rim.getInt() == number) {
//                return rim;
//            }
//        }
            return true;
        }

}
