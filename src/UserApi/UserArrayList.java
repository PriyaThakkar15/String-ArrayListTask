package UserApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserArrayList {
    ArrayList al;
    private Scanner getdata;
    private int Arrayval;
    private int x;
    private int newval;

    public UserArrayList() {
        al = new ArrayList();
        getdata = new Scanner(System.in);
        choice();
    }

    public void choice() {
        int i = 0;
        System.out.println("...choice...");
        System.out.println("1. ADD");
        System.out.println("2. REMOVE");
        System.out.println("3. UPDATE");
        System.out.println("4. SORT");
        System.out.println("5. EXIT");

        System.out.println("enter your choice.. ");
        i = getdata.nextInt();

        switch (i) {
            case 1:
                add();
                break;
            case 2:
                remove();
                break;
            case 3:
                update();
                break;
            case 4:
                sort();
                break;
            case 5:
                exit();
                break;
            default:
                System.out.println("error...!!");
                break;
        }
    }
    public void add() {
        int x;
        System.out.println("enter value in array");
        x = getdata.nextInt();
        al.add(x);
        System.out.println(x);
        System.out.println(al);
        choice();
    }
    public void remove()
    {
        System.out.println("array is:");
        System.out.println(al);
        System.out.println("on which position you want to delete element..");
        x=getdata.nextInt();
        al.remove(x);
        System.out.println("after remove element array is...");
        System.out.println(al);
        choice();
    }
    public void update()
    {
        System.out.println("available array is:");
        System.out.println(al);
        System.out.println("on which position you want to update element..");
        x=getdata.nextInt();
        System.out.println("new value:");
        newval=getdata.nextInt();
        al.set(x,newval);
        System.out.println("after update element array is...");
        System.out.println(al);

        choice();
    }
    public void sort()
    {
        System.out.println("available array is:");
        System.out.println(al);
        Collections.sort(al);
        System.out.println("after sort the array is:");
        System.out.println(al);
        choice();
    }
    public void exit()
    {
       System.exit(1);
    }
}
