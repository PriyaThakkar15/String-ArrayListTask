package DevloperApi;

public class DevloperString {
    public int strlen(String string)

    {
        return string.length();
    }
    public String uprcase(String string)

    {
        return string.toUpperCase();
    }
    public String lwrcase(String string)

    {
        return string.toLowerCase();
    }
    public String substr(String string)
    {
        int start=2,end = 4;
        return string.substring(start,end);
    }

    public static void main(String arg[])
    {
        DevloperString dsop =new DevloperString();
        System.out.println(dsop.strlen("priyanka"));
        System.out.println(dsop.lwrcase("priyanka"));
        System.out.println(dsop.uprcase(("priyanka")));
        System.out.println(dsop.substr("priyanka"));
    }
}
