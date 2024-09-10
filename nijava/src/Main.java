
////QUESTION 1A
class Vehicle {
public  void vehicleColor(){
    System.out.println("The vehicle color ");
}
}
class car extends Vehicle{
    public  void vehicleColor(){
        super.vehicleColor();
        System.out.println("The car is blue");
    }
}
public  class Main {
    public  static void main(String[] args){
        Vehicle favCar = new car();
        favCar.vehicleColor();
    }
}









