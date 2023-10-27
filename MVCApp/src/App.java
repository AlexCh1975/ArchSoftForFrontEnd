import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.Interface.iGetModel;
import Controller.Interface.iGetView;
import Model.ModelStudent;
import Model.Domain.Student;
import View.ViewStudent;

public class App {
    public static void main(String[] args) throws Exception {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student("Sergey", 20, 1); 
        Student s2 = new Student("Oleg", 21, 2); 
        Student s3 = new Student("Iliy", 19, 3); 
        Student s4 = new Student("Anna", 20, 4); 
        Student s5 = new Student("Taniana", 21, 5); 
        Student s6 = new Student("Olga", 19, 6);

       students.add(s1); 
       students.add(s2); 
       students.add(s3); 
       students.add(s4); 
       students.add(s5); 
       students.add(s6); 

       // MVC
    //    ModelStudent model = new ModelStudent(students);
    //    ViewStudent view = new ViewStudent();

    // MVP
        iGetModel model = new ModelStudent(students);
       iGetView view = new ViewStudent();

       Controller controller = new Controller(model, view);
       controller.update();
    }
}
