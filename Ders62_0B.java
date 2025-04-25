public class Ders62_0B {
    Ders62_0A teacher;
    String name;
    String code;
    String prefix;
    int note;

    Ders62_0B(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }
    void addTeacher(Ders62_0A teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else
            System.out.println("öğretmen ve ders bölümleri uyuşmuyor");

    }

    void printTeacher(){
        this.teacher.print();
    }
}
