package StaticMethod;

public class StaticMethod {
    public static void main(String[] args) {
        Main.change();

        //Create Student 1
        Main s1 = new Main(111, "Chuan");
        Main s2 = new Main(222, "Thu");
        Main s3 = new Main(333, "Vuong");

        //Call Display
        s1.display();
        s2.display();
        s3.display();
    }
}
