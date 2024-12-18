public class Boat extends Vehicle{
   public Boat(String brand) {
    super(brand);
   } 
   public String doStuff() {
    return "Je suis " + getBrand() + " et je fais glouglou !";
}
}
