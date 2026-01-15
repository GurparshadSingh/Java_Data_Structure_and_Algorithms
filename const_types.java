public class const_types {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Gps");
        Student s3 = new Student(12);
    }
    static class Student{
        String name;
        int roll;

        Student(){
            System.out.print("const. is called...");
        }

        Student (String name){
            this.name = name;
        }

        Student (int roll){
            this.roll = roll;
        }

    }
}
