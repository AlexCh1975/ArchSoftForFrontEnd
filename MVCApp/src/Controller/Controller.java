package Controller;

import java.util.List;

import Controller.Interface.iGetModel;
import Controller.Interface.iGetView;
import Model.ModelStudent;
import Model.Domain.Student;
import View.ViewStudent;

public class Controller {
    // private ModelStudent model; // MVC
    // private ViewStudent view;  // MVC

    private iGetModel model;  // MVP
    private iGetView view;   //  MVP

    private List<Student> students; // MVP

    // MVC
    // public Controller(ModelStudent model, ViewStudent view) {
    //     this.model = model;
    //     this.view = view;
    // }

    // MVP
    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> studs){
        // MVP
        if (studs.size()>0){
            return true;
        }
        else {
            return false;
        }
    }

    public void update(){
        // MVC
        // view.printAllStudent(model.getAllStudents());

        //MVP
        students = model.getAllStudents();
        if (testData(students)){
            view.printAllStudent(students);
        }
        else{
            System.out.println("List students empty!");
        }
    }
    
}
