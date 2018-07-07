import java.util.Scanner;

public class CourseRecommender {

    public static void main(String[] args) {
        Course course1 = new Course("Math 10", "Math", 10);
        Course course2 = new Course("Pre-Calculus 11", "Math", 11);
        Course course3 = new Course("Pre-Calculus 12", "Math", 12);
        Course course4 = new Course("Calculus 12", "Math", 12);
        Course course5 = new Course("Science 10", "Science", 10);
        Course course6 = new Course("Biology 11", "Science", 11);
        Course course7 = new Course("Biology 12", "Science", 12);
        Course course8 = new Course("Physics 11", "Science", 11);
        Course course9 = new Course("Physics 12", "Science", 12);
        Course course10 = new Course("Chemistry 11", "Science", 11);
        Course course11 = new Course("Chemistry 12", "Science", 12);
        Course course12 = new Course("English 10", "Language", 10);
        Course course13 = new Course("English 11", "Language", 11);
        Course course14 = new Course("English 12", "Language", 12);

        //System.out.print(course1.getName());

        Scanner sc = new Scanner(System.in);
         String input = sc.nextLine();
         if (input.equals("math")){
             System.out.println( course1.getName()) ;
             System.out.println( course2.getName()) ;
             System.out.println( course3.getName()) ;
             System.out.println( course4.getName()) ;

        }
        if (input.equals("science")){
            System.out.println(course5.getName());
            system.out.println
            }

        }

    }




