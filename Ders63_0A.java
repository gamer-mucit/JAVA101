public class Ders63_0A {
    String name;
    int damage,health,weight,dodge;

    Ders63_0A(String name, int damage, int health, int weight,int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if(dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        }
        else{
            this.dodge = 0;
        }
    }

    int hit(Ders63_0A foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu. " );

        if(foe.isDodge()){
            System.out.println(foe.name + " gelen hasarı blokladı!");
            System.out.println("----------------");
            return foe.health;
        }
        if(foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100 ;
        return randomNumber <= this.dodge;
    }
}
