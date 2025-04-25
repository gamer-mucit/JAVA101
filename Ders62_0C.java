public class Ders62_0C {
    Ders62_0B c1;
    Ders62_0B c2;
    Ders62_0B c3;
    String name;
    String StuNo;
    String classes;
    double avarage;
    boolean isPass;

    Ders62_0C(String name, String No, String classes, Ders62_0B c1, Ders62_0B c2, Ders62_0B c3) {
        this.name = name;
        this.StuNo = No;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int not1, int not2, int not3) {
        if (not1 >= 0 && not1 <= 100)
            this.c1.note = not1;
        if (not2 >= 0 && not2 <= 100)
            this.c2.note = not2;
        if (not3 >= 0 && not3 <= 100)
            this.c3.note = not3;
    }
    void isPass(){
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if(this.avarage > 55)
            System.out.println("hababam sınıfı uyanıyor");
        else
            System.out.println("hababam sınıfı sınıfta kaldı");

        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name+ " notu: "+ this.c1.note);
        System.out.println(this.c2.name+ " notu: "+ this.c2.note);
        System.out.println(this.c3.name+ " notu: "+ this.c3.note);
        System.out.println("ortalamanız: " + this.avarage);
    }

}