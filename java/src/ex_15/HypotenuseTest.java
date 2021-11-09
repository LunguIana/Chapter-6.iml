package ex_15;
public class HypotenuseTest
{
    public static void main(String[]args)
    {
        Hypotenuse h = new Hypotenuse();

        System.out.println("The hypotenuse of Triangle 1 is :"+h.Hypo(3.0,4.0));

        Hypotenuse h2 = new Hypotenuse();

        System.out.println("The hypotenuse of Triangle 2 is :"+h2.Hypo(5.0,12.0));

        Hypotenuse h3 = new Hypotenuse();

        System.out.println("The hypotenuse of Triangle 3 is :"+h3.Hypo(8.0,15.0));

    }
}