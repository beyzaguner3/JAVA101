public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuno;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuno, String classes, Course c1, Course c2, Course c3 ){
        this.name = name;
        this.stuno = stuno;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int y1, int s1, int y2, int s2, int y3, int s3){
        if(y1 >= 0 && y1 <= 100) {
           this.c1.yNot = y1;
        }
        if(s1 >= 0 && s1 <= 100) {
            this.c1.sNot = s1;
        }
        if(y2 >= 0 && y2 <= 100) {
            this.c2.yNot = y2;
        }
        if(s2 >= 0 && s2 <= 100) {
            this.c2.sNot = s2;
        }
        if(y3 >= 0 && y3 <= 100) {
            this.c3.yNot = y3;
        }
        if(s3 >= 0 && s3 <= 100) {
            this.c3.sNot = s3;
        }
    }


    void isPass(){
        System.out.println("================");
        this.average = ((this.c1.yNot * this.c1.yEtki) + (this.c2.yNot * this.c2.yEtki) + (this.c3.yNot * this.c3.yEtki)
                + (this.c1.sNot * this.c1.sEtki) + (this.c2.sNot * this.c2.sEtki) + (this.c3.sNot * this.c3.sEtki)) / 6.0;
        if(this.average > 55){
            System.out.println("Sinifi gectiniz:)))");
            this.isPass = true;
        }else {
            System.out.println("Sinifta kaldiniz:((");
            this.isPass = false;
        }

        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name + " Yazili Notu\t:" + this.c1.yNot);
        System.out.println(this.c1.name + " Sözlü Notu\t:" + this.c1.sNot);
        System.out.println(this.c2.name + " Yazili Notu\t:" + this.c2.yNot);
        System.out.println(this.c2.name + " Sözlü Notu\t:" + this.c2.sNot);
        System.out.println(this.c3.name + " Yazili Notu\t:" + this.c3.yNot);
        System.out.println(this.c3.name + " Sözlü Notu\t:" + this.c3.sNot);


        System.out.println("Ortalamaniz : " + this.average);
    }



}
