/**
 * Created by johndavid on 2/9/17.
 */
public class UsedCar extends Car {

    private double miles;

    public UsedCar(String make, String model, int year, double price, double miles) {
        super(make, model, year, price);
        this.miles = miles;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

     @Override
    public String toString (){           /// i dont understand this at all
           return super.toString()+ "\t" + miles;     }

    }
    
