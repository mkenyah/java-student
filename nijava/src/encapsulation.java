//Encapsuation
class  person {
private  int age;
public  int getAge() {
    return age;
}
    public void setAge(int age){
        this.age = age;
    }
}
  public class encapsulation{
        public static void main(String [] args){
            person person = new person();
            person.setAge(19);
            System.out.println("The age of person is: "+ person.getAge());
        }
  }