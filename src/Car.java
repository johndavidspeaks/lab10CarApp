/**
 * Created by johndavid on 2/9/17.
 */
public class Car {

    private String make;
    private String model;
    private int year;
    private double price;

    // create a constructor
    public Car(String make, String model, int year, double price) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;


    } // end car constructor


    /// constructor getters

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }


    //constructor setters

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString (){           /// i dont understand this at all
        return make + "\t" + model + "\t" + year + "\t$" + price;
    }




}

