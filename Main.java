class InnerMain {
    public static String name() {
        return "tharun";
    }    
}
class Helper {
    public int sum(int n, int m) {
        return m + n;
    }
}

class Main {
    void nonStaticFunction() {
        String name = "tharunkumargampala";
        String rollno = "20HT1A0523";
        String branch = "CSE";

        System.out.println(name+ " " + rollno + " " + branch);
    }

    static void staticFunction() {
        String name = "mahendragampala";
        String rollno = "20HT1A0524";
        String branch = "CSE";

        System.out.println(name+ " " + rollno+ " " + branch);
    }

    public static void main(String[] args) {
        int n = 3, m = 6;
        Helper g = new Helper();
        int s = g.sum(n, m);
        System.out.println("Sum is = " + s);
        String name = InnerMain.name();
        System.out.println("Name : " + name);

        Main obj = new Main();
        // non-static function
        obj.nonStaticFunction();
        // static function
        staticFunction();
    }
}