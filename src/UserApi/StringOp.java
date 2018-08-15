package UserApi;

import java.util.Scanner;

public class StringOp {
    private Scanner getinput;
    private String[] nameStringArray;
    private int i;

    public StringOp() {
        getinput = new Scanner(System.in);
        initArray();
    }

    public void initArray() {
        System.out.println("how many string you want to enter: ");
        int st = Integer.parseInt(getinput.nextLine());
        nameStringArray = new String[st];
        for (int i = 0; i < st; i++) {
            System.out.println("enter a string : " + (i + 1) + ".");
            nameStringArray[i] = getinput.nextLine();
        }
        choiceOperation();
    }

    private void choiceOperation() {
        int number;
        System.out.println("<---menu--->");
        System.out.println("1. length ");
        System.out.println("2. uppercase ");
        System.out.println("3. lowercase ");
        System.out.println("4. substring ");
        System.out.println("5. copy ");
        System.out.println("6. compare ");
        System.out.println("7. concate ");
        System.out.println("choose operation you want to perform: ");
        number = getinput.nextInt();
        switch (number) {
            case 1:
                strlen();
                break;
            case 2:
                uprcase();
                break;
            case 3:
                lwrcase();
                break;
            case 4:
                substr();
                break;
            default:
                System.out.println("wrong choice..!!");
        }
    }

    public void strlen() {
        for (int i = 0; i < nameStringArray.length; i++) {
            System.out.println("length of string:" + nameStringArray[i].length());
        }
    }

    public void uprcase() {
        for (int i = 0; i < nameStringArray.length; i++) {
            System.out.println("string in uppercase: " + nameStringArray[i].toUpperCase());
        }
    }

    public void lwrcase() {
        for (int i = 0; i < nameStringArray.length; i++) {
            System.out.println("string in lower case: " + nameStringArray[i].toLowerCase());
        }
    }

    public void substr() {
        for (int i = 0; i < nameStringArray.length; i++) {
            int start, end;
            System.out.println("enter starting point of string: ");
            start = getinput.nextInt();
            System.out.println("enter ending point of string: ");
            end = getinput.nextInt();
            System.out.println("substring of the string: " + nameStringArray[i].substring(start, end));
        }
    }
}



