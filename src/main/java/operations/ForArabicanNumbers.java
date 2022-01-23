package operations;


import core.PrintService;

public class ForArabicanNumbers implements PrintService {
    public int firstArabic;
    public int secondArabic;
    public String operand;

    public ForArabicanNumbers(int firstArabic, int secondArabic, String operand) {
        this.firstArabic = firstArabic;
        this.secondArabic = secondArabic;
        this.operand = operand;
    }

    public void calculate(){
        if (moreThanZero(firstArabic, secondArabic)) {
            switch (operand) {
                case "+" -> System.out.println(firstArabic + secondArabic);
                case "-" -> System.out.println(firstArabic - secondArabic);
                case "/" -> System.out.println(firstArabic / secondArabic);
                case "*" -> System.out.println(firstArabic * secondArabic);
            }
        } else {
            System.out.println("Цисло меньще 1 или больше 10");
        }
    }

    public boolean moreThanZero(int first, int second) {
        return first > 0 && second > 0 && first <= 10 && second <= 10;
    }
}
