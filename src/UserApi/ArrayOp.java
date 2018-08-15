package UserApi;

import java.util.Scanner;

public class ArrayOp {
    private Scanner getinput;
    private int[] nameArray;
    private int i;
    private int x;
    private int s;

    public ArrayOp() {
        getinput = new Scanner(System.in);
        initArray();
        choiceOperation();
    }

    public void initArray() {
        System.out.println("enter the number u want to array");
        //int s = 0;
        s = getinput.nextInt();
        nameArray = new int[s];
        for (int i = 0; i < nameArray.length; i++) {
            System.out.println("enter the Array" + (i + 1) + ",");
            nameArray[i] = getinput.nextInt();
        }
        choiceOperation();

    }

    public void choiceOperation() {

        int number;
        System.out.println("choose one choice");
        System.out.println("1. INSERT");
        System.out.println("2. UPDATE");
        System.out.println("3. DELETE");
        System.out.println("4. SORT");
        number = getinput.nextInt();

        switch (number) {

            case 1:
                insert(x);

                break;

            case 2:

                break;

            case 3:

                break;

            default:
                System.out.println("error");

        }
    }

    public int insert(int x) {
        System.out.println("enter no u want to insert");
        x = getinput.nextInt();

        {
            int size, insert, i, pos;
            int arr[] = new int[50];

            System.out.print("Enter Element to be Insert : ");
            insert = getinput.nextInt();
            System.out.print("At Which Position ? (Enter Index Number ) : ");
            pos = getinput.nextInt();
            for (i = s; i > pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos] = insert;

            System.out.print("Element inserted Successfully..!!\n");

            System.out.print("Now the New Array is :\n");
            for (i = 0; i < s + 1; i++) {
                System.out.print(arr[i] + " ");
            }
            return 0;
        }
    }
}
