public class BoxDemo {
    public static void main(String[] args) {
        Box b1=new Box();
        b1.initialize(200,300,400);
        b1.display();
        System.out.println(b1.getVolume());



       b1.setLength(b1.getLength()*110/100);
        b1.setWidth(b1.getWidth()*110/100);
        b1.setHeight(b1.getHeight()*110/100);

        b1.display();
        System.out.println(b1.getVolume());

    }
}
