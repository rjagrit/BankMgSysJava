import javax.swing.*;// using javax (x stands for extended and Swing comes from this pacakage
import java.awt.*; //contains the Image class

public class Login extends JFrame
{
    //class constructor
    Login()
    {
        setTitle(" BANK MANAGEMENT SYSTEM");
        ImageIcon imgiconobj= new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); // Class used to put image on Frame giving path
        Image imgobj= imgiconobj.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT); //for resizing the image
        JLabel label1= new JLabel(imgiconobj); // we use label so to place image first on label
        add(label1); //using add function to place anything on the frame
        setSize(800,480); //frame size
        setVisible(true); //make frame visible
        setLocation(350,200); //frame location
    }
   public static void main(String [] args)
   {
       new Login();// making a class object and with help of this, frame automatically opened cuz class object bante hi
                    // constructor automatically calls up thats why we have to write our whole code inside constructor
   }
}
