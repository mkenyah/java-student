class  Father{
int netWorth = 600000;
}
class  Son extends Father{
    int inheritance = 200000;
}
public  class inheritance{
    public  static void main(String[] args){
        Son fam = new Son();
        System.out.println("Your inheritance  is " + fam.netWorth );
        System.out.println("Your networth is "+ fam.inheritance);

        System.out.println("Your total networth is "+ (fam.netWorth + fam.inheritance));



    }
}
