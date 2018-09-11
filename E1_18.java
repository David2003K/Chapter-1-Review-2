import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class E1_18
{
   public static void main(String[] args) throws Exception
   {
      URL imageLocation = new URL(
            ("file:///C:/Users/871649/Downloads/Penguin.png"));
      JOptionPane.showMessageDialog(null, "Hi", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
   }
}