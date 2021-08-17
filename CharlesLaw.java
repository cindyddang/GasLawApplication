/* Duyen Dang
 * April 10, 2019
 * A small frame display Charles' Law formula*/
package dangsteam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author DuyenDang
 */
public class CharlesLaw extends JFrame
{
    //declare constants
    private final java.net.URL CHARLES_URL = getClass().getResource("charlesImage.png");
    private final ImageIcon CHARLES_IMAGE = new ImageIcon(new ImageIcon(CHARLES_URL).getImage().getScaledInstance(215, 147 , Image.SCALE_DEFAULT));
    
    //declare varible
    private JLabel headerLabel;
    private JLabel iniVolLabel;
    private JLabel iniTempLabel;
    private JLabel fiVolLabel;
    private JLabel fiTempLabel;
    private JLabel imageLabel;
    
    private JPanel formulaPanel;
    private JPanel headerPanel;
    
    public CharlesLaw()
    {
        //Constructing frame
        super("Charles Law Formula");
        this.setBounds(10, 10, 340 , 270);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        //Constructing label
        iniVolLabel = new JLabel("<html>V<sub>1</sub>: Initial Volume(L)</html>");
        iniTempLabel = new JLabel("<html>T<sub>1</sub>: Initial Temperature(K)</html>");
        fiVolLabel = new JLabel("<html>V<sub>2</sub>: Final Volume (L)</html>");
        fiTempLabel = new JLabel("<html>T<sub>2</sub>: Final Temperature (K) </html>");
        imageLabel = new JLabel(CHARLES_IMAGE);
        headerLabel = new JLabel("CHARLES' LAW FORMULA");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 18));
        
        //Constructing panel
        formulaPanel = new JPanel();
        formulaPanel.setBackground(new Color(255,255, 255));
        formulaPanel.add(imageLabel);
        formulaPanel.add(iniVolLabel);
        formulaPanel.add(fiVolLabel);
        formulaPanel.add(iniTempLabel);
        formulaPanel.add(fiTempLabel);
        headerPanel = new JPanel();
        headerPanel.add(headerLabel);
        headerPanel.setBackground(new Color(244, 197, 149));
    
        //Adding components into frame
        this.add(formulaPanel, BorderLayout.CENTER);
        this.add(headerPanel, BorderLayout.NORTH);
        
        //Making frame visibible
        this.setVisible(true);
    }
    
//    public static void main(String[] args)
//    {
//        CharlesLaw charlesFormula = new CharlesLaw();
//    }
}
