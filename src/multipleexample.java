//Multiple inheritance example
interface PetAnimal
{
    String name="Ronny";
    int age=5;
  
    void getAge();
    void getName();
}
interface Dog{
String breed="Kombai";

void getBreed();
}

class Pup implements PetAnimal,Dog{
    private String favouriteToy="Ball";
 
    public void getAge()
    {
         //this.age=5;
         System.out.println(age);
    }
    public void getName()
    {
        //this.name="Ronny";
        System.out.println(name);
    }
    public void getBreed()
    {
        //this.breed="Kombai";
        System.out.println(breed);
    }
    public void getFavouriteToy(){
        //this.favoriteToy="Ball";
        System.out.println(favouriteToy);
      }

    
}

public class multipleexample{
public static void main(String []args)
{
    Pup d=new Pup();
    d.getName();
    d.getAge();
    d.getBreed();
    d.getFavouriteToy();
}
}
