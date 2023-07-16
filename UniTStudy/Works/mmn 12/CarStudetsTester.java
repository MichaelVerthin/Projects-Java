/**
 * Tester for students for class Car.
 * IMPORTENT: This tester checks only the methods' names and not their
 * correctness.
 * 
 * @author Course Stass
 */

public class CarStudetsTester {
    public static void main(String[] args) {
        System.out.println("********** Test Car - Started **********");
        System.out.println("\n1. Testing Constructors and toString:");
        CarCar c1 = new CarCar(1234567, 'A', "Toyota", true);
        CarCar c2 = new CarCar(c1);
        System.out.println("\tc1:" + c1);
        System.out.println("\tc2:" + c2);

        System.out.println("\n2. Testing accessors and mutators:");
        c1.setId(8888888);
        c1.setType('B');
        c1.setBrand("Mazda");
        c1.setIsManual(false);
        System.out.println("\tc1:" + c1 + "\n");
        System.out.println("\tid of c1:" + c1.getId());
        System.out.println("\tbrand of c1:" + c1.getBrand());
        System.out.println("\ttype of c1:" + c1.getType());
        System.out.println("\tisManual of c1:" + c1.isManual());

        System.out.println("\n3. Testing equals method:");
        CarCar c3 = new CarCar(888888, 'B', "Mazda", false);
        CarCar c4 = new CarCar(888888, 'B', "Mazda", false);
        System.out.println("\tc2:" + c2);
        System.out.println("\tc3:" + c3);
        System.out.println("\tc4:" + c4 + "\n");
        if (c2.equals(c3))
            System.out.println("\tc2 is the same Car as c3");
        else
            System.out.println("\tc2 isn't the same Car as c3");
        if (c3.equals(c4))
            System.out.println("\tc3 is the same Car as c4");
        else
            System.out.println("\tc3 isn't the same date as c4");

        System.out.println("\n4. Testing better method:");
        if (c2.better(c3))
            System.out.println("\tc2 is better than c3");
        else
            System.out.println("\tc2 isn't better than c3");
        System.out.println("\n5. Testing worse method:");
        if (c2.worse(c3))
            System.out.println("\tc2 is worse than c3");
        else
            System.out.println("\tc2 isn't worse than c3");

        System.out.println("\n********** Test Date - Finished **********\n");

    }
}
