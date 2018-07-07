public class Student extends Person {

    @Override
    String getName() {
        return name;
    }

    @Override
    void setName(String name) {
        this.name = name;

    }

    @Override
    int getStudentID() {
        return studentId;
    }

    @Override
    void setSudentID(int id) {
        studentId = id;
    }

}
