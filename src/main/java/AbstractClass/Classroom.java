package AbstractClass;

class Classroom extends Main{
    public static void main(String[] args){
        Student myStudent = new Student();

        System.out.println("Name: " + myStudent.firstName);
        System.out.println("Age:" + myStudent.age);
        System.out.println("Graduation year: " + myStudent.graduationYear);
        myStudent.study();
    }

    @Override
    public void study() {

    }
}
