package ConsoleUI;

import core.Field;

import java.util.Scanner;

public class ConsoleUI {
    private Field field;

    public void run() {
        field = new Field(6,7);

        printField();
       // readInput();

        System.out.println(readInput());

    }

    private void printField() {
        System.out.println(field);
        printColumnIdentifiers();
    }

    private void printColumnIdentifiers() {
        for(int k = 0; k < field.getColumnCount(); k++) {
            System.out.print("|" +(k+1)+ "| ");
        }
    }

    private int readInput() {
        Scanner sc = new Scanner(System.in);
        int input;

        if(sc.hasNext()) {
            input = sc.nextInt();
        }

        else
            input = 991;

        return input;
    }
}
