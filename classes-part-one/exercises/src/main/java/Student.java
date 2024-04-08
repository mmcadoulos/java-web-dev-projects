public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    // My constructor
    public Student (String name, int studentId, int numberOfCredits, double gpa){
        setName(name);
        setStudentId(studentId);
        setNumberOfCredits(numberOfCredits);
        setGpa(gpa);
    }
    // Drop your getters and setters below for the Student class.
    protected void setName(String aName) {
        this.name = aName;
    }

    protected String getName() {
        return this.name;
    }

    protected void setStudentId(int aStudentId) {
        this.studentId = aStudentId;
    }

    protected int getStudentId() {
        return this.studentId;
    }

    protected void setNumberOfCredits(int aNumberOfCredits) {
        this.numberOfCredits = aNumberOfCredits;
    }

    protected int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    protected void setGpa(double aGpa) {
        this.gpa = aGpa;
    }

    protected double getGpa() {
        return this.gpa;
    }
    // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
