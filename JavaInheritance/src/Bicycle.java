public class Bicycle {
    public int gear;
    public int speed;
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    public int getGear() {
        return this.gear;
    }
    public void setGear(int gear) {
        this.gear = gear;
    }
    public int getSpeed() {
        return this.speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }
}
