


public class Enum {
    public static void main(String[] args) {
        System.out.println(Car.Bmw);
        Car cars = Car.Mercedies;
        if(cars==cars.Mercedies){
            System.out.println("Matched");

        }
        switch(cars){
            case Bmw:
            System.out.println("BMW");
            break;
            case Maruti_suzuki:
            System.out.println("Maruti Suzuki");
            break;
            case Mercedies:
            System.out.println("Mercedies");
            break; 
        }
    }
}
enum Car{
    Mercedies,
    Maruti_suzuki,
    Bmw
}