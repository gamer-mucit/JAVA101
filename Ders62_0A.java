public class Ders62_0A {
    String name;
    String mpno;
    String branch;

    Ders62_0A(String name, String branch, String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }
    void print(){
        System.out.println("Adı: " + this.name);
        System.out.println("bölüm: " + this.branch);
        System.out.println("Telefonu: " + this.mpno);
    }

}
