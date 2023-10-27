package Model.Domain;

public class Student extends Person implements Comparable<Student>{
    private int id;

    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString() + ", id=" + id + "]";
    }

    @Override
    public int compareTo(Student o) { 

        System.out.println(super.getName()+" - "+o.getName());
        if(super.getAge()==o.getAge()){
            if(id==o.id)return 0;
            if(id>o.id)return 1;
            else return -1;
        }

        if(super.getAge()>o.getAge())
            return 1;
        else
            return -1;
    }
}
