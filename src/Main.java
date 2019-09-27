public class Main {
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;

        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers    available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
        System.out.println( );


        //Problem 2
        int x;
        String course = "Computer Science";
        x = 113;
        double y;
        y = 2.71828;


        System.out.println("My favourite number is " + x);
        System.out.println("The number " + y + " is known as a double!");
        System.out.println("I learn the most in " + course + "!");

        System.out.println();

        //Schedule

        //Courses
        String c1, c2, c3, c4, c5, c6, c7, c8;
        c1 = "English ";
        c2 = "Chemistry ";
        c3 = "Physics ";
        c4 = "Pre-Calculus ";
        c5 = "Community Service ";
        c6 = "Computer Programming ";
        c7 = "Physical Health and Conditioning ";
        c8 = "Senior Choir ";
        //Teachers
        String t1, t2, t3, t4, t5, t6, t7, t8;
        t1 = "Ms. Au";
        t2 = "Mrs. Liu";
        t3 = "Mr. Jung";
        t4 = "Mr. Griffiths";
        t5 = "Mrs. A. Lee";
        t6 = "Mr. Zaremba";
        t7 = "Mr. Ng";
        t8 = "Mrs. A. Lee";
        int a,b;
        a =  11;
        b = 12;
        System.out.println("+------------------------------------------------------------+");
        System.out.println("| 1 |                           "+ c1 + a+" |          "+ t1 +" |");
        System.out.println("| 2 |                         "+ c2 + a+" |        "+ t2 +" |");
        System.out.println("| 3 |                           "+ c3 + a+" |        "+ t3 +" |");
        System.out.println("| 4 |                      "+ c4 + b+" |   "+ t4 +" |");
        System.out.println("| 5 |                 "+ c5 + a+" |     "+ t5 +" |");
        System.out.println("| 6 |              "+ c6 + a+" |     "+ t6 +" |");
        System.out.println("| 7 |  "+ c7 + a+" |          "+ t7 +" |");
        System.out.println("| 8 |                      "+ c8 + a+" |     "+ t8 +" |");
        System.out.println("+------------------------------------------------------------+");
    }
}
