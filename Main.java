package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Car> getMake(String make, ArrayList<Car> carList) {

        ArrayList<Car> carsByMake = new ArrayList<Car>();

        for (int i = 0; i < carList.size(); i++) {

            if (make.equalsIgnoreCase(carList.get(i).getMake())) {
                carsByMake.add(carList.get(i));
            }
        }
        return carsByMake;
    }


    public static ArrayList<Car> getYear(int Year, ArrayList<Car> carList) { //this method returns a new ArrayList of cars separated by year

        ArrayList<Car> carsByYear = new ArrayList<Car>();

        for (int i = 0; i < carList.size(); i++) {

            if (Year == (carList.get(i).getYear())) {
                carsByYear.add(carList.get(i));
            }
        }
        return carsByYear;
    }


    public static int getValidInteger() {
        Scanner scan1 = new Scanner(System.in);
        //validation for numbers
        while (!scan1.hasNextInt()) {
            scan1.nextLine(); //clears the buffer
            System.out.println("Please enter an integer! "); //tells user to enter number
        }
        return scan1.nextInt();
    }


    public static ArrayList<Car> getPrice(double input, ArrayList<Car> carList) {

        ArrayList<Car> carsByPrice = new ArrayList<Car>();

        for (int i = 0; i < carList.size(); i++) {

            if (input >= (carList.get(i).getPrice())) {
                carsByPrice.add(carList.get(i));
            }
        }
        return carsByPrice;
    }


    public static ArrayList<Car> getCondition(String input, ArrayList<Car> carList) {

        ArrayList<Car> carsByPrice = new ArrayList<Car>();

        for (int i = 0; i < carList.size(); i++) {
            if (input.equalsIgnoreCase(carList.get(i).getCondition())) {
                carsByPrice.add(carList.get(i));
            }
        }
        return carsByPrice;
    }


    public static void main(String[] args) {

        //THIS IS LAB 11. I THINK AT THIS POINT I AM UNABLE TO REFERENCE THE NEW ARRAYLISTS I PRINT FROM THE METHODS
              //  BECAUSE OF THIS ERROR I AM UNABLE TO ADJUST THE INVENTORY
        //ONLY SOLUTION I CAN THINK OF AT THIS POINT IS TO MAKE A SUB CLASS THAT HAS DIFFERENT ARRAYLISTS.




        /*   Scanner scan = new Scanner(System.in);
        ArrayList<Car> carList = new ArrayList<>(); // this is how you create a new array list
        ArrayList<Car> newMakeList = new ArrayList<>();


        // now we need to add item to our array
        carList.add(new Car("Ford", "Explorer", 2016, 27999.99, "new"));
        carList.add(new Car("Jeep", "Grand Cherokee", 2017, 49999.00, "new"));
        carList.add(new Car("Jeep", "Patriot", 2016, 39999.00, "new"));
        carList.add(new Car("Dodge", "Ram", 2012, 19999.00, "new"));
        carList.add(new Car("Dodge", "Journey", 2016, 13000.00, "new"));
        carList.add(new Car("Ford", "F150", 2009, 3000.00, "new"));
        carList.add(new UsedCar("Fiat", "Spyder", 2010, 14000, "Used", 4000));
        carList.add(new UsedCar("Nikolia", "Model S", 2016, 54999.90, "Used", 23000.00));
        carList.add(new UsedCar("GC", "Chirpus coupe", 2012, 23444.00, "Used", 12000.00));
        carList.add(new UsedCar("Ford", "Fiesta", 2012, 14000.00, "Used", 3000.00));
        carList.add(new Car("Dodge", "Magnum", 2009, 8000.00, "new"));
        carList.add(new Car("Ford", "F150", 2003, 3000.00, "new"));
        carList.add(new UsedCar("Fiat", "Spyder", 2000, 14000, "Used", 4000));
        carList.add(new UsedCar("Nikolia", "Model S", 2017, 54999.90, "Used", 23000.00));
        carList.add(new UsedCar("GC", "Chirpus", 2012, 23444.00, "Used", 12000.00));
        carList.add(new UsedCar("Ford", "Fusion", 2012, 15000.00, "Used", 3000.00));

        System.out.println("");
        boolean buyCar = true;
        while (buyCar) { // this will loop till user enters "N" or "n" for buying car

            System.out.println("Hello, welcome to CARS FOR LESS");
            System.out.println("Would you like to search cars by make, year, price, or condition?: ");

            String searchCriteria = scan.next();
            String condition = "Condition";
            String carMake = "Make";
            String carYear = "Year";
            String price = "Price";


            if (searchCriteria.equalsIgnoreCase(condition)) {
                boolean wrongAnswer = true;
                while (wrongAnswer) {

                    System.out.println("Would you like to view new or used cars?: ");

                    String newOrUsed = scan.next(); // Validation needed FIXME

                    if (newOrUsed.equalsIgnoreCase("used") || (newOrUsed.equalsIgnoreCase("new"))) {

                        System.out.print(getCondition(newOrUsed, carList));
                        wrongAnswer = false;

                    } else {
                        System.out.println("Please enter |new| or |used|");
                        wrongAnswer = true;
                    }
                }


            } else if (searchCriteria.equalsIgnoreCase(carYear)) {  //works
                boolean anotherYear = true;
                while (anotherYear) {

                    System.out.println("What year car would you like to search?: ");

                    int yearSearch = getValidInteger();

                    if ((yearSearch == 2012) || (yearSearch == 2017) || (yearSearch == 2003) || (yearSearch == 2016) || (yearSearch == 2000) || (yearSearch == 2009) || (yearSearch == 2010)) {

                        anotherYear = false;
                    } else {
                        System.out.println("Please enter another year:");
                        anotherYear = true;
                    }
                }


            } else if (searchCriteria.equalsIgnoreCase(carMake)) {
                boolean anotherMake = true;
                while (anotherMake) {

                    System.out.println("What make car would you like to search?: ");

                    String makeSearch = scan.next(); //validate to make sure its a String FIXME

                    if ((makeSearch.equalsIgnoreCase("Ford")) || (makeSearch.equalsIgnoreCase("Dodge")) || (makeSearch.equalsIgnoreCase("Jeep")) || (makeSearch.equalsIgnoreCase("GC")) || (makeSearch.equalsIgnoreCase("Fiat")) || (makeSearch.equalsIgnoreCase("Nikolia"))) {

                        System.out.println(getMake(makeSearch, carList));
                        anotherMake = false;

                    } else {

                        System.out.println("We don't have that make. Please enter another make: ");
                        anotherMake = true;
                    }
                }


            } else if (searchCriteria.equalsIgnoreCase(price)) { // this works so far

                boolean lowerPrice = true;
                while (lowerPrice) {

                    System.out.println("Please enter your maximum price in dollars and cents:E.g. 12000.00 Max: ");
                    double maxPrice = scan.nextDouble(); //Validation FIXME


                    if (maxPrice >= 3000.00) {
                        System.out.println(getPrice(maxPrice, carList));
                        lowerPrice = false;

                    } else if (maxPrice < 3000.00) {
                        System.out.println("Please enter a higher number: ");
                        lowerPrice = true;
                    }
                }


            } else {
                System.out.println("Please enter a valid answer"); // need to make a loop for this


            }


            System.out.println("Press |0| to Quit");

            System.out.println("Which car would you like?: ");

            int input = scan.nextInt();//FIXME Validation

            System.out.println(carList.get(input)); // this prints the car the user has selected FIXME (numbers arent adjusting because its coming from origianl list

            if (input == 0) // need to fix this and add booleans at every step
                buyCar = false; //this means if the user enters "Quit" it will break FIXME

            String userInput = "";
            char answer = '-';

            System.out.println("Do you want to buy this car? y/n");

            userInput = scan.next();
            answer = userInput.charAt(0);

            if ((answer == 'Y') || (answer == 'y'))

            {
                System.out.println("Excellent! Our finance department will be in touch shortly.");
                carList.remove(input - 1); //removes the car selected from inventory FIXME this needs to remove from updated list.

            } else if ((answer == 'N') || (answer == 'n'))

            {
                buyCar = false;
            }
            System.out.println("Goodbye");

        }
    }

}
*/



    // THIS IS LAB 10. I COPIED IT PRIOR TO MAKING CHANGES FOR LAB 11.

    Scanner scan = new Scanner(System.in);
    //this is the object. All objects start with "new"
    //car1 is a new object of the type Car. Car() is the constructor
    // Car car1 = new Car("Ford", "Explorer", 2016, 27999.99);
    //System.out.println(car1.toString());

    ArrayList<Car> carList = new ArrayList<>(); // this is how you create a new array list

                carList.add(new Car("Ford", "Explorer", 2016, 27999.99));
                carList.add(new Car("Jeep", "Grand Cherokee", 2017, 49999.00));
                carList.add(new Car("Jeep", "Patriot", 2016, 39999.00));
                carList.add(new Car("Dodge", "Ram", 2012, 19999.00));
                carList.add(new Car("Dodge", "Journey", 2009, 8000.00));
                carList.add(new Car("Ford", "F150", 2003, 3000.00));
                carList.add(new UsedCar("Fiat", "Spyder", 2000, 14000, "Used", 4000));
                carList.add(new UsedCar("Nikolia", "Model S", 2017, 54999.90, "Used", 23000.00));
                carList.add(new UsedCar ("GC", "Chirpus", 2012, 23444.00, "Used", 12000.00));
                carList.add(new UsedCar("Ford", "Focus", 2012, 14000.00, "Used", 3000.00));

                boolean buyCar = true;
                while (buyCar) { // this will loop till user enters "N" or "n" for buying car

                int counter = 1; // counter for looping inventory list
                for (Car c : carList) {
                //this prints out our initial list. "%d. "adds 1.,2.,3.,...etc
                System.out.printf ("%d. "+c.toString()+"\n", counter++); // if we want to print formatted we need to print methods formatted. ex. "\t" + c.getModel()
                }

                System.out.printf("%d. Quit\n", carList.size()+1); // this adds "Quit" to the end of our list.

                System.out.println("Which car would like?: ");

                int input = scan.nextInt();

                System.out.println(carList.get(input - 1)); // this prints the car the user has selected

                if (input== carList.size() )
                buyCar = false; //this means if the user enters "Quit" it will break

                Scanner scnr = new Scanner(System.in);
                String userInput = "";
                char answer = '-';

                System.out.println("Do you want to buy this car? y/n");

                userInput = scnr.next();
                answer = userInput.charAt(0);

                if ((answer == 'Y') || (answer == 'y')) {
                System.out.println("Excellent! Our finance department will be in otuch shortly.");
                carList.remove(input - 1);

                } else if ((answer == 'N') || (answer == 'n')) {
                buyCar = false;
                }
                System.out.println("Goodbye");

                }

                }
                }





