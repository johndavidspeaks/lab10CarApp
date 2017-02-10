/**
 * Created by johndavid on 2/9/17.
 */
public class Buyer {


    private int age;
    private String name;
    private String city;
    private String state;
    private double budget;



    // make a constructor for the buyer

    public Buyer (int age, String name, String city, String state, double budget) {

        this.age = age;
        this.name = name;
        this.city =city;
        this.state = state;
        this.budget = budget;





    } // end constructor

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public double getBudget() {
        return budget;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }


    @Override    // we will use this override alot
    public String toString (){
        return age + "\t" + name + "\t" + city + state + "\t$" + budget;
    }


}


