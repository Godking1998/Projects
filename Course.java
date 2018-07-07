import java.util.ArrayList;

public class Course {
    private String name;
    private String coursetype;
    private ArrayList<Student> listStudent;

    public Course(String cname, String ctype) {
        name = cname;
        coursetype = ctype;
        listStudent = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public String setName() {
        return null;
    }

    public String getCoursetype(){
        return coursetype;
    }
    public String setCoursetype(){
        return null;
    }

    public void addStudent(Student student) {
        listStudent.add(student);
    }




}
