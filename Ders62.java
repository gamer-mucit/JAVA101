public class Ders62 {
    public static void main(String[] args) {
        Ders62_0A t1 = new Ders62_0A("mahmut hoca","TRH","900555555");
        Ders62_0A t2 = new Ders62_0A("graham bell","FZK","900000000");
        Ders62_0A t3 = new Ders62_0A("Külyutmaz","BIO","11111");

        Ders62_0B tarih = new Ders62_0B("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Ders62_0B fizik = new Ders62_0B("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Ders62_0B biyoloji = new Ders62_0B("Biyoloji","101","BIO");
        biyoloji.addTeacher(t3);

        Ders62_0C s1 = new Ders62_0C("inek şaban","123","4",tarih,fizik,biyoloji);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Ders62_0C s2 = new Ders62_0C("güdük necmi","444","4",tarih,fizik,biyoloji);
        s2.addBulkExamNote(50,30,70);
        s2.isPass();
    }
}
