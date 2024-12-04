package Comparable;

public class Student {
    private String name;
    private  int grade;
    private  double gpa;

    public Student(String n, int gr, double g) {
        name = n;
        grade = gr;
        gpa = g;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getGpa() {
        return gpa;
    }
    public boolean equals (Student other){
        return this.getGrade() == other.getGrade();
    }
    public int compareTo(Object temp){
        Student other = (Student) temp;
        if(getGrade() > other.getGrade()){
            return 1;
        }
       else if(getGrade() < other.getGrade()){
            return -1;
        }
       else
           return 0;
    }
    public  String toString(){
        return "Name:" + getName()+",Grade:" + getGrade()+",GPA:"+getGpa();
    }

}
