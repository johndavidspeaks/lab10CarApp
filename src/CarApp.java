import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class CarApp {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        ArrayList<Car> carList = new ArrayList<Car>();// CREATES A NEW ARRAY
        carList.add(new Car("ford", "edge", 2016, 33000));  // creates a new object in a array list
        carList.add(new Car("chevy", "malibu", 2017, 42000));
        carList.add(new Car("dodge", "charger", 2017, 33000));
        carList.add(new UsedCar("Lamborghini", "polostorico", 1964, 200000, 2000));
        carList.add(new UsedCar("toyota", "FJ", 2013, 14000, 102333));
        carList.add(new UsedCar("buick", "regal", 2005, 2000, 111555));


        boolean saleCloser = true;
        boolean rightcar = true;
        String carChoice;
        int carPick = 0;


        while (saleCloser) {
            while (rightcar) {


                System.out.println("Here is what we have available ");
                for (Car cd : carList) {
                    System.out.println(cd);

                    //break;
                }


                System.out.println("Please pick your new car");


                carChoice = input.nextLine();


                if (carChoice.equalsIgnoreCase("ford edge") || carChoice.equalsIgnoreCase("edge") || carChoice.equalsIgnoreCase("2016 ford edge")
                        || carChoice.equalsIgnoreCase("edge")||carChoice.equalsIgnoreCase("ford")) {
                    carPick = 0;
                    rightcar = false;


                } else if (carChoice.equalsIgnoreCase("Chevy malibu") || carChoice.equalsIgnoreCase("malibu") ||
                        carChoice.equals("2017 malibu") || carChoice.equalsIgnoreCase("2017 chevy malibu")) {
                    carPick = 1;
                    rightcar = false;


                } else if (carChoice.equalsIgnoreCase("dodge") || carChoice.equalsIgnoreCase("charger") ||
                        carChoice.equals("2017 charger") || carChoice.equalsIgnoreCase("2017 dodge charger")) {
                    carPick = 2;
                    rightcar = false;


                } else if (carChoice.equalsIgnoreCase("Lamborghini") || carChoice.equalsIgnoreCase("lambo") ||
                        carChoice.equals("1964 Lamborghini") || carChoice.equalsIgnoreCase("2017 Lamborghini polostorico") ||
                        carChoice.equalsIgnoreCase("polostorico")) {
                    carPick = 3;
                    rightcar = false;


                } else if (carChoice.equalsIgnoreCase("toyota") || carChoice.equalsIgnoreCase("fj") ||
                        carChoice.equals("2013 fj") || carChoice.equalsIgnoreCase("2013 toyota fj") ||
                        carChoice.equalsIgnoreCase("toyota fj")) {
                    carPick = 4;
                    rightcar = false;


                } else if (carChoice.equalsIgnoreCase("jeep") || carChoice.equalsIgnoreCase("Jeep Wranger") ||
                        carChoice.equals("1999 jeep") || carChoice.equalsIgnoreCase("1999 jeep wrangler") ||
                        carChoice.equalsIgnoreCase("99 wrangler")) {
                    carPick = 5;
                    rightcar = false;

                } else if (carChoice.equalsIgnoreCase("buick") || carChoice.equalsIgnoreCase("buick regal") ||
                            carChoice.equals("05 regal") || carChoice.equalsIgnoreCase("2005 buick regal") ||
                            carChoice.equalsIgnoreCase("2005 regal")) {
                        carPick = 6;
                        rightcar = false;


                } else {


                    System.out.println("please pick something we have");
                    rightcar = true;

                }


                //System.out.println("you picked " + carList.get(carPick));


                System.out.println("Would you like to buy? y or n");
                String buy;
                buy = input.next();


                System.out.println(buy);


                if (buy.equalsIgnoreCase("y")) {
                    System.out.println("great this way to the finance dept");
                   // carList.remove(carPick);
                    System.out.println(" here's what we have left if anyone you know wants one ");
                    for (Car c : carList) {
                        System.out.println(c.toString());
                    }

                } else if (buy.equalsIgnoreCase("N")) {
                    System.out.println("ok beat it bum ");
                    saleCloser = false;


                } else {
                    System.out.println("what?");


                    saleCloser = true;

                }
            }

        }

    }


}