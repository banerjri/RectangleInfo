import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double Height = 0.0;
        double Width = 0.0;
        double Area = 0.0;
        double Diagonal=0.0;
        String Trash = "";
        String Trash1 = "";
        boolean done = false;
        boolean done1 = false;
        do
        {
            System.out.print("Enter the Height of the Rectangle ");
            if(in.hasNextDouble())
            {
                Height = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                Trash = in.nextLine();
                System.out.println("\nYou said the Height is : " + Trash);
                System.out.println("invalid Entry");
            }
        }while (!done);
        do
        {
            System.out.print("Enter the Width of the Rectangle ");
            if(in.hasNextDouble())
            {
                Width = in.nextDouble();
                in.nextLine();
                done1 = true;
            }
            else
            {
                Trash1 = in.nextLine();
                System.out.println("\nYou said the Width is : " + Trash1);
                System.out.println("invalid Entry");
            }
        }while (!done1);
        Area = Height * Width;
        Diagonal = ((Height * Height) + (Width * Width));
        System.out.println("the area = " +Area);
        System.out.println("the diagonal "+ Math.sqrt(Diagonal));


    }
}