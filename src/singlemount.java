import java.io.*;
class Mountains{
    private String mname;
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
System.out.println("The Mountain " + getmname() + " which is " + getaltitude() + "m high is situated at " + location );
}

}

public class singlemount {
    public static void main(String[]args)
    {
        Peak1 mt = new Peak1("Kilimanjaro", 5895, "Africa");
        System.out.println(mt.getmname());
        System.out.println(mt.getaltitude());
        System.out.println(mt.location);
        mt.city();
        
    }
}
