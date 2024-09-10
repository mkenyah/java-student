//POLYMORPHISM Compile-time polymorphism
class  Multiplications{
    public  int multiply (int a, int b){
        return  a * b;
    }
    public  int multiply (int a, int b, int c){
        return  a * b * c;
    }
    public  double multiply(double a, double b){
        return  a * b;
    }
}
class Compiletime {
    public  static void main(String[] args){
        Multiplications operation = new Multiplications();

        System.out.println("The multiplication of the integers " + operation.multiply (5, 10));
        System. out.println("The multiplication of the integers " + operation. multiply (5, 10, 15));
        System. out.println("The multiplication of the integers " + operation.multiply (5.5, 10.6));
    }
}
