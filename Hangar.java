public class Hangar {
    public static void main(String[] args) {
        Boat boat = new Boat("Titanic");
        Car car = new Car("Ferrari");

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}
