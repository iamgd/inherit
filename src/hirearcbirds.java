class birds
{
    private String BirdName;
    private String Colour;
  
    birds(String BirdName, String Colour)
     {
        this.BirdName=BirdName;
        this.Colour=Colour;
     }

    protected String getBirdName()
     {
      return this.BirdName;
     }

    protected String getColour()
     {
      return this.Colour;
     }
}

class Diurnal extends birds
{

    String beak;
    Diurnal(String BirdName, String Colour, String beak)
   {
    super(BirdName, Colour);
    this.beak=beak;
   }
 public void active()
 {
   System.out.println(  getBirdName() + " are " + getColour() + " in colour with a " + beak + " beak" );
   System.out.println("They are active in the day time");
 }
}

 class Waterfowl extends birds{

    int weight;
    Waterfowl(String BirdName, String Colour, int weight)
   {
    super(BirdName, Colour);
    this.weight=weight;
   }
 public void nature()
 {
    System.out.println(  getBirdName() + " are " + getColour() + " in colour weighing " + weight + " kg" );
    System.out.println("They live near water resources");
 }

}


public class hirearcbirds {
   public static void main(String[]args)
   {
      Diurnal d = new Diurnal("Eagles", "Brown" , "hooked");
      System.out.println(d.getBirdName());
      System.out.println(d.getColour());
      System.out.println(d.beak);  
      d.active();
      
      Waterfowl w = new Waterfowl("Swans", "White", 4);
      System.out.println(w.getBirdName());
      System.out.println(w.getColour());
      System.out.println(w.weight);  
      w.nature();

   }
    
}