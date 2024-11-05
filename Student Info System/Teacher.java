public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String branch, String mpno){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print(){
        System.out.println("Ad : " + this.name);
        System.out.println("Telefon numarasi : " + this.mpno);
        System.out.println("Bransi : " + this.branch);
    }
}
