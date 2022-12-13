public class App {
    public static void main(String[] args) throws Exception {
        MountainBike polygon = new MountainBike(1, 1, 1);
        polygon.printBike();
        System.out.println("--next action--");
        polygon.applyBrake(1);
        polygon.printBike();
        System.out.println("--next action--");
        polygon.setGear(2);
        polygon.speedUp(3);
        polygon.setSeatHeight(4);
        polygon.printBike();
    }
}
