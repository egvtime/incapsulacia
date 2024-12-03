public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private int course;
    private double gradePointAverage;

    int maxgrade = 0;


    public Students(String firstName, String lastName, int age, int course, double gradePointAverage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
        this.gradePointAverage = gradePointAverage;
    }

    public void printDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("GPA: " + gradePointAverage);
    }

    public double getGradePointAverage() {
        return gradePointAverage;
    }

    public void setGradePointAverage(double gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }

    public static Students findHighestGPAStudent(Students[] students) {

        Students topStudent = students[0];
        for (Students student : students) {
            if (student.getGradePointAverage() > topStudent.getGradePointAverage()) {
                topStudent = student;
            }
        }

        return topStudent;
    }

    }
