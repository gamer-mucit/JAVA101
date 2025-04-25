public class Ders60 {
    String type = "sedan";
    String model;
    String color;
    int speed;
    int limitSpeed = 180;

    void increaseSpeed(int increment){
        if((speed + increment) < limitSpeed){
            speed += increment;
            }
    }
    void decreaseSpeed(int decrease){
        if(speed > 0) {
            speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println(model + " Hızınız: " + speed);
    }
}
