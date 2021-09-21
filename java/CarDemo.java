public class CarDemo {
    public static void main(String[] args) {
        Tyre v=new Tyre("MRF",12);
        Tyre c=new Tyre("appolo",12);
        Tyre b=new Tyre("vv",12);
        MusicSystem music=new MusicSystem("sony",2,true,6);
        MusicSystem mu=new MusicSystem("boat",4,false,12);
        MusicSystem mus=new MusicSystem("mi",2,true,11);
        Car r2=new Car("nexon","petrol",1200,6,12000,v,music);
       Car r1=new Car("audi","petrol",2300,5,66000,c,mu);
        Car r =new Car("bmw","petrol",2200,7,77000,b,mus);
        r2.accelerate();
        r2.applyBrake();
        r2.changeGear();
        r2.steer();
        r2.display();
        r1.accelerate();
        r1.applyBrake();
        r1.changeGear();
        r1.steer();
        r1.display();
        r.accelerate();
        r.applyBrake();
        r.changeGear();
        r.steer();
        r.display();
        r.display("tyre");

       r.display();
       r.setTyre(v);


    }
}
