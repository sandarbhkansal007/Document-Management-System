import javax.swing.*;
import java.util.*;
import java.awt.*; 
public class Main {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your user name: ");
        String name=sc.nextLine();
        System.out.println("Enter the password: ");
        String password=sc.next();

        if((name.equals("Dhruv")||name.equals("Kushal")||name.equals("Sandarbh"))&&password.equals("C24"))
        {
            System.out.println("Welcome "+name);
            JFrame jFrame = new JFrame();
                jFrame.setTitle("CHOOSING PAGE");

                Add a = new Add();
                Container cPane = jFrame.getContentPane();
                Newclass template = new Newclass(a, cPane);
                jFrame.setSize(template.getSize());
                jFrame.setResizable(false);
                cPane.add(template);

                jFrame.setVisible(true);
                jFrame.setLocationRelativeTo(null);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
        else
        {
            System.out.println("Sorry !! "+name+" \nEither username or password is wrong ");
        }


        
    }
    
}
