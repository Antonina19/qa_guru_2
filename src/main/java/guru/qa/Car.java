package guru.qa;

public class Car {

    static String firstCreationDate = "1888";

    String color;
    boolean isUsed;
    char category = 'a';
    int power;
    double aDouble;

 //   byte aByte;
//    short aShort;
//    long aLong;
 //   float aFloat;
 //   double aDouble;

    String getColor(){

        return color;
    }

    void setPower(int power){
        this.power = power;
    }

    public Car(String color, char category, int power) {
        this.color = color;
        this.category = category;
        this.power = power;
    }

    public Car() {
    }

    static void sayCreationDateForAllCars(){
        System.out.println(firstCreationDate);
    }


}
