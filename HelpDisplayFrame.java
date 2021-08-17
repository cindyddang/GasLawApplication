/* Duyen Dang
 * April 14, 2019
 * A small frame helps user to understand display frame*/
package dangsteam;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author DuyenDang
 */
public class HelpDisplayFrame extends JFrame
{
    private final java.net.URL MENU_URL = getClass().getResource("menuImage.png");
    private final ImageIcon MENU_IMAGE = new ImageIcon(new ImageIcon(MENU_URL).getImage().getScaledInstance(500, 20 , Image.SCALE_DEFAULT));
    private final java.net.URL TABLE_URL = getClass().getResource("tableImage.png");
    private final ImageIcon TABLE_IMAGE = new ImageIcon(new ImageIcon(TABLE_URL).getImage().getScaledInstance(498, 56 , Image.SCALE_DEFAULT));
    private final java.net.URL BUTTON_URL = getClass().getResource("buttonsImage.png");
    private final ImageIcon BUTTON_IMAGE = new ImageIcon(new ImageIcon(BUTTON_URL).getImage().getScaledInstance(499, 34 , Image.SCALE_DEFAULT));
    private final Font LABEL_FONT = new Font("Arial", Font.PLAIN, 13);
    
    private JLabel headerLabel;
    private JLabel menuImageLabel;
    private JLabel menuLabel;
    private JLabel tableImageLabel;
    private JLabel tableLabel;
    private JLabel buttonImageLabel;
    private JLabel buttonLabel;
    
   public HelpDisplayFrame()
   {
       //Constructing frame
       super("Help Display page");
       this.setBounds(20, 20, 510, 300);
       this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       this.setLayout(new FlowLayout());
       this.getContentPane().setBackground(new Color(255, 255, 255));
       
       //Constructing label
       headerLabel = new JLabel("HOW TO USE DISPLAY PAGE");
       headerLabel.setFont(new Font("Arial", Font.BOLD, 17));
       menuImageLabel = new JLabel(MENU_IMAGE);
       menuLabel = new JLabel("More information is in menu bar");
       menuLabel.setFont(LABEL_FONT);
       tableImageLabel = new JLabel(TABLE_IMAGE);
       tableLabel = new JLabel("Table displays used information");
       tableLabel.setFont(LABEL_FONT);
       buttonImageLabel = new JLabel(BUTTON_IMAGE);
       buttonLabel = new JLabel("<html>Functional buttons are in the bottom"
               + "<br/> + Back button: Go back to input page"
               + "<br/> + Exit button: Force exit program immediately</html>");
       buttonLabel.setFont(LABEL_FONT);
       
       //Adding components into frame
       this.add(headerLabel);
       this.add(menuImageLabel);
       this.add(menuLabel);
       this.add(tableImageLabel);
       this.add(tableLabel);
       this.add(buttonImageLabel);
       this.add(buttonLabel);
       
       //Making frame visible
       this.setVisible(true);
   }
//   
//   public static void main(String[] args)
//   {
//       HelpDisplayFrame helpDisplay = new HelpDisplayFrame();
//   }
}
