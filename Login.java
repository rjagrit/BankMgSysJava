import javax.swing.*;// using javax (x stands for extended and Swing comes from this pacakage

public class Login extends JFrame
{
    //class constructor
    Login()
    {
        setSize(800,480); //frame size
        setVisible(true); //make frame visible
    }
   public static void main(String [] args)
   {
       new Login();// making a class object and with help of this, frame automatically opened cuz class object bante hi
                    // constructor automatically calls up thats why we have to write our whole code inside constructor
   }
}
