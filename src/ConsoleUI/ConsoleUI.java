package ConsoleUI;

import core.Field;

public class ConsoleUI {
    private Field field;

    public void run() {
        field = new Field(6,7);

        printField();

    }

    private void printField() {
        System.out.println(field);
    }

}
