public class Odev14_0A {
    String name;
    double salary,vergi,artis;
    int workHours,hireYear,bonus;

    Odev14_0A(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    void tax(){
        if(this.salary <= 1000){
            return;
        }
        else{
            this.vergi = this.salary * 0.03;
        }
    }

    void bonus(){
        if(this.workHours > 40){
            this.workHours -= 40;
            this.bonus = this.workHours * 30;
        }
    }

    void raiseSalary(){
        if(2021 - this.hireYear > 0){
            if ((2021 - this.hireYear) < 10) {
               this.artis = (this.salary * 0.05);
            } else if ((2021 - this.hireYear) >= 10 && (2021 - this.hireYear) < 20) {
               this.artis = (this.salary * 0.1);
            } else {
               this.artis = this.salary * 0.15;
            }
        }
        else{
            System.out.println("lütfen geçerli bir yıl girin");
        }
    }

    void tostring(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma saati : " + this.workHours);
        System.out.println("başlangıç yılı : " + this.hireYear);

    }
}
