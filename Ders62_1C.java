public class Ders62_1C {
    String name, stuNo;
    int classes;
    Ders62_1B mat;
    Ders62_1B fizik;
    Ders62_1B kimya;
    double avarage;
    boolean isPass;
    double fizikort, matort, kimyaort;

    Ders62_1C(String name, int classes, String stuNo, Ders62_1B mat, Ders62_1B fizik, Ders62_1B kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    // Sözlü notlarını ekleme
    public void Sozlu(int mats, int fiziks, int kimyas) {
        this.mat.Sozlu(mats, 0, 0);
        this.fizik.Sozlu(0, fiziks, 0);
        this.kimya.Sozlu(0, 0, kimyas);
    }

    public void addBulkExamNote(double mat, double fizik, double kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double fizik = this.fizik.note * 0.8 + this.fizik.fiziks * 0.2;
        double kimya = this.kimya.note * 0.8 + this.kimya.kimyas * 0.2;
        double mat = this.mat.note * 0.8 + this.mat.mats * 0.2;

        this.fizikort = fizik;
        this.matort = mat;
        this.kimyaort = kimya;
        this.avarage = (this.fizikort + this.matort + this.kimyaort) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println();
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + "\t Sözlü: " + this.mat.mats);
        System.out.println("Matematik Ortalaması: " + this.matort);
        System.out.println("Fizik Notu : " + this.fizik.note + "\t\t Sözlü: " + this.fizik.fiziks);
        System.out.println("Fizik Ortalaması: " + this.fizikort);
        System.out.println("Kimya Notu : " + this.kimya.note + "\t\t Sözlü: " + this.kimya.kimyas);
        System.out.println("Kimya Ortalaması: " + this.kimyaort);
    }
}
