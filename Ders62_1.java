public class Ders62_1 {
    public static void main(String[] args) {


        Ders62_1B mat = new Ders62_1B("Matematik", "MAT101", "MAT");
        Ders62_1B fizik = new Ders62_1B("Fizik", "FZK101", "FZK");
        Ders62_1B kimya = new Ders62_1B("Kimya", "KMY101", "KMY");


        Ders62_1A t1 = new Ders62_1A("Mahmut Hoca", "90550000000", "MAT");
        Ders62_1A t2 = new Ders62_1A("Fatma Ayşe", "90550000001", "FZK");
        Ders62_1A t3 = new Ders62_1A("Ali Veli", "90550000002", "KMY");


        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);


        Ders62_1C s1 = new Ders62_1C("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50, 20, 40);
        s1.Sozlu(80, 90, 60);
        s1.isPass();

        Ders62_1C s2 = new Ders62_1C("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100, 50, 40);
        s2.Sozlu(90, 85, 80);
        s2.isPass();

        Ders62_1C s3 = new Ders62_1C("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50, 20, 40);
        s3.Sozlu(100, 50, 80);
        s3.isPass();

    }
}

