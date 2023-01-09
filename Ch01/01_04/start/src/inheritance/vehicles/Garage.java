package inheritance.vehicles;

public class Garage {

    public static void main(String[] args) {
    Coupe myCar = new Coupe();
    myCar.setColor("red");

        System.out.printf("My car is %s and has %s doors.%n",
            myCar.getColor(), myCar.getDoors());
    }
}
