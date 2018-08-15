package DevloperApi;

import java.util.ArrayList;
import java.util.Scanner;

public class DevloperArray
{
    Scanner sc;
    ArrayList A = new ArrayList();

    public DevloperArray() {
        ArrayList A = new ArrayList();
    }
    public int insert(int x) {
        A.add(x);
        return x;
    }
    public int delete(int x) {
        A.remove(2);
        return x;
    }
    public int search(int x)
    {
        x=sc.nextInt();
        return x;
    }
    public int update(int x)
    {
        A.set(0,x);
        return x;
    }
    public static void main(String[] args) {
        DevloperArray darrayApi = new DevloperArray();
        System.out.println(darrayApi.insert(12));
        System.out.println(darrayApi.insert(34));
        System.out.println(darrayApi.insert(24));
        System.out.println(darrayApi.insert(38));
        System.out.println(darrayApi.A);
        System.out.println(darrayApi.delete(12));
        System.out.println(darrayApi.A);
        System.out.println(darrayApi.update(11));
        System.out.println(darrayApi.A);
        System.out.println(darrayApi.search(34));
        System.out.println(darrayApi.A);
    }

}
