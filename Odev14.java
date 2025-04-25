public class Odev14 {
    public static void main(String[] args) {
        Odev14_0A f1 = new Odev14_0A("kemal",2000.0,45,1985);

        f1.tax();
        f1.bonus();
        f1.raiseSalary();

        f1.tostring();
        System.out.println("Vergi : " + f1.vergi);
        System.out.println("Bonus : " + f1.bonus);
        System.out.println("Maaş artışı : " + f1.artis);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (f1.salary + f1.bonus - f1.vergi));
        System.out.println("Toplam Maaşı : " + (f1.salary + f1.bonus - f1.vergi +f1.artis));
    }

}
