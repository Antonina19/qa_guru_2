package guru.qa;

public class Main  {

    public static void main(String[] args) {
        Car vw = new Car("white",'b',249);
        Car audi = new Car();
        vw.color = "White";

        vw.setPower(249);
        audi.setPower(200);

        Car.sayCreationDateForAllCars();
        System.out.println(audi.getColor());


        //System.out.println(car.color + " " + car.power + " " + car.isUsed);


    }
}
