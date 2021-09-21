import java.util.Scanner;

public class Car
{
    private String name;
    private  String fuelType;
    private int engineCapacity;
    private int  no_of_gears;
    private float power;
    private Tyre tyre;
    private MusicSystem musicSystem;

    public Car() {
    }

    public Car(String name, String fuelType, int engineCapacity, int no_of_gears, float power,Tyre tyre,MusicSystem musicSystem) {
        this.name = name;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.no_of_gears = no_of_gears;
        this.power = power;
        this.tyre=tyre;
        this.musicSystem=musicSystem;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public int getNo_of_gears() {
        return no_of_gears;
    }

    public MusicSystem getMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    public void setNo_of_gears(int no_of_gears) {
        this.no_of_gears = no_of_gears;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public void accelerate()
    {
        System.out.println(name+"car is accelerating");
    }
    public void applyBrake()
    {
        System.out.println(name+"car is applying brake");
    }
    public void steer()
    {
        System.out.println(name+"car is steering");
    }
    public void changeGear()
    {
        System.out.println(name+"car is changing gear");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number  gear to be changed");
        int y=sc.nextInt();
        if(y<=no_of_gears)
        {
            System.out.println(name+" has changed to gear "+y);
        }
        else
        {
            System.out.println("wrong gear entered");
        }
    }
    public  void display()
    {
        System.out.println("Features of"+name+"car");
        System.out.println("------------------------");
        System.out.println("Engine capacity: "+engineCapacity+"car");
        System.out.println("Fuel type: "+fuelType);
        System.out.println("Power: "+power+" BHP");
        System.out.println("No Of Gears: "+no_of_gears);
        System.out.println("tyre :name->"+tyre.getName()+" size->"+tyre.getSize()+" inches");
        System.out.println("name is "+musicSystem.getName()+" no_of_speakers " +musicSystem.getNo_of_speakers()+" subwoofer "+musicSystem.isSubwoofer()+" lcdscreensize "+musicSystem.getLcdScreenSize()+" inches");
        System.out.println();
    }
    public  void display(String feature)
    {
        if (feature.equals("tyre"))
        {
            System.out.println("tyre :name->"+tyre.getName()+" size->"+tyre.getSize()+" inches");
        }
        if (feature.equals("musixSystem"))
        {
            System.out.println("name is "+musicSystem.getName()+" no_of_speakers" +musicSystem.getNo_of_speakers()+" subwoofer "+musicSystem.isSubwoofer()+" lcdscreensize "+musicSystem.getLcdScreenSize()+" inches");
        }
    }
}