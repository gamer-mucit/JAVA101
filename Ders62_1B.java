public class Ders62_1B {
    Ders62_1A courseTeacher;
    String name;
    String code;
    String prefix;
    double mats, fiziks, kimyas;
    double note;

    public Ders62_1B(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Ders62_1A t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void Sozlu(int mats, int fiziks, int kimyas) {
        if (mats >= 0 && mats <= 100) {
            this.mats = mats;
        } else {
            System.out.println("Matematik sözlü notu geçersiz!");
        }

        if (fiziks >= 0 && fiziks <= 100) {
            this.fiziks = fiziks;
        } else {
            System.out.println("Fizik sözlü notu geçersiz!");
        }

        if (kimyas >= 0 && kimyas <= 100) {
            this.kimyas = kimyas;
        } else {
            System.out.println("Kimya sözlü notu geçersiz!");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
