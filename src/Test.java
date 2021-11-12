public class Test
{

    public static void main(String[] args)
    {
        Circle circle1 = new Circle();
        //circle1.getR(2);
        //circle1.getX(3);
        // circle1.getY(6);
        circle1.setR(5);
        circle1.setX(7);
        circle1.setY(8);

        System.out.println(circle1.circumference());
        System.out.println(circle1.area());
        
       System.out.println("**changes**");
    
    }
}
