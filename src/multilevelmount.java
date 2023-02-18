class Mountains{

    protected String mname;
    public int altitude;
    Mountains(String mname, int altitude)
    {
        this.mname=mname;
        this.altitude=altitude;
    }

    public String getmname(){
        return this.mname;
    }

    public int getaltitude(){
        return this.altitude;
    }


}

class Peak1 extends Mountains{
public String location;
 Peak1(String mname, int altitude, String location){
super(mname,altitude);
this.location=location;
}

public void city(){
System.out.println("The Mountain " + mname + " which is " + altitude + "m high is situated at " + location );
}

}

class Peak2 extends Peak1{
    protected String state;
     Peak2(String mname, int altitude, String location, String state){
        super(mname,altitude,location);
        this.state=state;
    }
    
    public void position(){
    System.out.println("The Mountain " + mname + " which is " + altitude + "m high is situated at " + location + " is in "+ state + " state" );
    }
    
    }
public class multilevelmount {
    public static void main(String[]args)
    {
        Peak2 mt = new Peak2("Kilimanjaro", 5895, "Africa", "Dormant");
        System.out.println(mt.getmname());
        System.out.println(mt.getaltitude());
        System.out.println(mt.location);
        mt.city();
        System.out.println(mt.state);
        mt.position();
    }
}
