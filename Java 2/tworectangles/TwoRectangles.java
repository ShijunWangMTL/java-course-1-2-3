package tworectangles;

public class TwoRectangles
{
    public static void main(String[] args)
    {
        // declare two objects of Rectangle class
        Rectangle box1, box2;

        box1 = new Rectangle();

        System.out.println("The box1 object's length "
                + "and width are "
                + box1.getLength() + " and "
                + box1.getWidth());

        box2 = new Rectangle(5.0, 10.0);
        System.out.println("The box2 object's length "
                + "and width are "
                + box2.getLength() + " and "
                + box2.getWidth() + " and the area is "
                + box2.getArea());
    }
}
