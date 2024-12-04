package Comparable;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("joe",12,3.5);
        Student s2 = new Student("Bob",11,3.7);
        System.out.println("compare to returns:"+s1.compareTo(s2));
        int result = s1.compareTo(s2);
        System.out.println(result);

    }
}
