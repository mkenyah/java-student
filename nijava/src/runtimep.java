//RUNTIME POLYMORPHISM
class  fruit{
Void fruitType(){
    System.out.println("Some type of fruits");
    return null;
}
}
class  apple extends fruit {
    Void fruitType(){
        System.out.println("Green");
        return null;
    }
}
class  mango extends fruit {
    Void fruitType(){
        System.out.println("yellow");
        return null;
    }
}
public  class runtimep{
    public  static void main (String [] args){
        fruit apple = new apple();
        fruit mango = new mango();
        System.out.println(apple.fruitType());
        System.out.println(mango.fruitType());

    }
}