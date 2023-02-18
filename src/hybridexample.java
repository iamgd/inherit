//Hybrid example
class Animal1{
    private String name;
    private int age;
    protected Animal1(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void climb()
    {
        System.out.println("Cat is climbing");
    }
    public String getName(){
        return this.name;
    }
    public void play(){
        System.out.println("Dog is playing");
    }
    public int getAge(){
     //   return Character.getNumericValue(this.age);
    return this.age;
    }
}
class Cat1 extends Animal1{
    private String breed;
    public Cat1(String name,int age,String breed)
    {
        super(name,age);
        
        this.breed=breed;
    }
    public void makeNoise(){
        System.out.println("Cat Meows!");
    }
}
class Dog1 extends Animal1{
    private String breed;
    public Dog1(String name,int age,String breed)
    {
        super(name,age);
        
        this.breed=breed;
    }
    public void makeNoise(){
        System.out.println("Dog Barks!!");
    }
}

class BabyCat extends Cat1 {
    private String favouriteToy;
  
    public BabyCat(String name, int age, String breed, String favouriteToy) {
      super(name, age, breed);
      this.favouriteToy = favouriteToy;
    }
    public String getFavouriteToy(){
        return this.favouriteToy;
      }
    public void writhe() {
      System.out.println("Baby cat is writhing");
    }
  }


class hybridexample{
    public static void main(String []args)
    {
        BabyCat cat=new BabyCat("Limo",3,"Tiger","ball");
        Dog1 dog=new Dog1("Ronny",4,"Kombai");
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getFavouriteToy());       
        cat.climb();
        cat.makeNoise();
        cat.writhe();
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        dog.play();
        dog.makeNoise();
    }
}