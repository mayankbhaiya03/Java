class student {
    int rollno;
    String Name;

}

public class oops {

    public static void main(String[] args) {
        student s1 = new student();
        s1.rollno = 01;
        s1.Name = "Aarush";
        System.out.println(s1.rollno);
        System.out.println(s1.Name);

        student s2 = new student();
        s2.rollno = 02;
        s2.Name = "Aaryamik";
        System.out.println(s2.rollno);
        System.out.println(s2.Name);

    }
}