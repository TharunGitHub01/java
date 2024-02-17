class Data {
    String id;
    String name;
    String branch;
    static String clg;

    Data(String id, String name, String branch, String clg) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.clg = clg;
    }

    void display() {
        System.out.println(
                "id : " + id + ", " + "name : " + name + ", " + "branch : " + branch + ", " + "college : " + clg);
    }
}

public class Student {
    public static void main(String[] args) {
        Data tharun = new Data("20HT1A0523", "THARUN KUMAR", "CSE", "CITY");
        Data sampath = new Data("20HT1A0524", "DURGA SAMPATH", "CSE", "CITY");

        tharun.display();
        sampath.display();
    }
}
