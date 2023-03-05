package StaticMethod;

public class Main {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";

    Main(int r, String n) {
        rollNo = r;
        name = n;
    }

    static void change() {
        college = "Rikkei Academy";
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
