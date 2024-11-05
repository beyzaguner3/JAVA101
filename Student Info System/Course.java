public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double yEtki;
    double sEtki;
    int yNot;
    int sNot;



    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.yEtki = 0.9;
        this.sEtki = 0.1;
        this.yNot = 0;
        this.sNot = 0;
    }
    void addTeacher(Teacher t1){
        if(t1.branch.equals(this.prefix)) {
            this.teacher = teacher;
            //printTeacher();
        }else{
            System.out.println("Ögretmen bransi ile brans uyusmuyor!");
        }
    }
    void printTeacher(){
        this.teacher.print();
    }
}
