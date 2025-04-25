public class Ders59 {
    String type;
    String model;
    String color;
    int speed;
    int limitSpeed;
    void increaseSpeed(int increment){
        if((speed + increment) < limitSpeed)
            speed += increment;
    }
    void decreaseSpeed(int decrease){
        if(speed > 0) {
            speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println("Hızınız: " + speed);
    }
}
