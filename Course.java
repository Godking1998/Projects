public class Course {

    private String name;
    private String type;
    private int grade;


    public Course(String cname, String ctype, int cgrade) {
        name = cname;
        type = ctype;
        grade = cgrade;
    }


    public String getName() {
        return name;
    }
    public String gettype() {return type;}
    public int getgrade() {return grade;}

}
