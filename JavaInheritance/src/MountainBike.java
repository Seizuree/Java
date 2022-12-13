public class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int gear, int speed, int height) {
        super(gear, speed);
        this.seatHeight = height;
    }
    public int getSeatHeight() {
        return this.seatHeight;
    }
    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
    public void printBike(){
        System.out.println("gear: " + super.gear);
        System.out.println("speed: " + super.speed);
        System.out.println("height: " + this.seatHeight);
    }
}
