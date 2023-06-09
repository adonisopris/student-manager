package loose.oose.fis.lab.student.manager.model;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double meanGrade;

    public Student(String firstName, String lastName, int age, double meanGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.meanGrade = meanGrade;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", meanGrade=" + meanGrade +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Student student = (Student) object;
        return age == student.age && java.lang.Double.compare(student.meanGrade, meanGrade) == 0 && java.util.Objects.equals(firstName, student.firstName) && java.util.Objects.equals(lastName, student.lastName);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), firstName, lastName, age, meanGrade);
    }
}
