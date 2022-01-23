package operations;

import core.PrintService;
import enums.RimNumbers;

public class ForRimNumbers implements PrintService {
    public String firstRim;
    public String secondRim;
    public String operand;

    public ForRimNumbers(String firstRim, String secondRim, String operand) {
        this.firstRim = firstRim;
        this.secondRim = secondRim;
        this.operand = operand;
    }

    public void calculate(){
        int fRim = RimNumbers.valueOf(firstRim).getInt();
        int sRim = RimNumbers.valueOf(secondRim).getInt();

        if (moreThanZeroRim(fRim, sRim)) {

            int result = 0;

            switch (operand) {

                case "+": result = fRim + sRim;
                break;
                case "-": result = fRim - sRim;
                break;
                case "/": result = fRim / sRim;
                break;
                case "*": result = fRim * sRim;
                break;
            }

            if (result < 1) {
                System.out.println("в римской системе нет отрицательных чисел");
            } else {
                System.out.println(RimNumbers.getRimByNumber(result));
            }

        } else {
            System.out.println("Цисло меньще 1 или больше 10");
        }
    }

    public boolean moreThanZeroRim(int firstRim, int secondRim) {
        return firstRim > 0 && secondRim > 0 && firstRim <= 10 && secondRim <= 10;
    }
}
