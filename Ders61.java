public class Ders61 {
    String type ;
    String model ;
    String color;
    int speed;
    int limitSpeed ;

    Ders61 (String model,int speed,String color){
        System.out.println("Parametre kurucu oluştu");
        this.model = model;
        this.speed = speed;
        this.type ="sedan";
        this.color = color;
        this.limitSpeed = 180;
    }
    Ders61(){
        System.out.println("Boş kurucu metodu oluştu");
    }
    void increaseSpeed(int increment){
            this.speed += increment;
    }
    void decreaseSpeed(int decrease){
        if(this.speed > 0) {
            this.speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println(model + " Hızınız: " + this.speed);
    }
    void printInfo(){
        System.out.println("Model: " + this.model);
        System.out.println("Renk: " + this.color);
        System.out.println("Type: " + this.type);
        System.out.println("Hız: " + this.speed);
    }
}
