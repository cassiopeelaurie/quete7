public abstract class Vehicle {
//attributs

private String brand;
private int kilometers;

//constructeur 
public Vehicle (String brand) {
    this.brand = brand;
    this.kilometers = 0;
}

//accesseurs et mutateurs
public String getBrand() {
    return this.brand;
}

public void setBrand(String brand) {
this.brand = brand;
}

public int getKilometers() {
return this.kilometers;
}

public void setKilometers(int kilometers) {
    this.kilometers = kilometers;
}

public abstract String doStuff();
}
