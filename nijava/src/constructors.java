//CONSTRUCTORS
class  Instituition{
String name;
int rank;
Instituition(String name, int rank){
this.name = name;
this .rank =  rank;


}
public static class Main{
    public  static void  main(String [] args) {
        Instituition inst = new Instituition("Zetech university", 1);
        System.out.println("Your instituition is  " + inst.name + "ranked number  " + inst.rank);
    }
    }
    }

