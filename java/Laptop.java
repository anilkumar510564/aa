public class Laptop {
   private int ram;
   private int hdd;
   private String processor;
   private double screenSize;
   public Laptop()
   {
       System.out.println("laptop");
   }
   public void initialize(int R,int H, String P,int S)
   {
       ram=R;
       hdd=H;
       processor=P;
       screenSize=S;
   }
   public void display()
   {
       for (int i=1;i<=2;i++) {
           System.out.println("laptop"+ i);
           System.out.println("laptop RAM is"+" "+ram+"GB");
           System.out.println("laptop RAM is"+" "+hdd+"GB");
           System.out.println("laptop RAM is"+" "+processor);
           System.out.println("laptop RAM is"+" "+screenSize+"px");
       }
       System.out.println();
   }

}
