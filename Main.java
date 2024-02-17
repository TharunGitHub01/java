/**
 * Main
 */
/**
 * InnerMain
 */
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
    public static void main(String[] args) {
        int n = 3, m = 6;
        Helper g = new Helper();
        int s = g.sum(n, m);
        System.out.println("Sum is = " + s);
        String name = InnerMain.name();
        System.out.println("Name : " + name);
    }
}