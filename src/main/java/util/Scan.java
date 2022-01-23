package util;

import java.util.Scanner;

public class Scan {

    public void scanner(Scanner scan) {
        String[] str = scan.nextLine().trim().split(" ");

        if(str.length > 3) {
            System.out.println("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        else if (str.length < 3){
            System.out.println("строка не является математической операцией");
        }
        else {
            Parser pars = new Parser(str[0], str[2], str[1]);
            pars.printAfterParse();
        }
    }
}
