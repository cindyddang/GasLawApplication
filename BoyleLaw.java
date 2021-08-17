/* Duyen Dang
 * April 10, 2019
 * A small frame display Boyle's Law formula*/
package dangsteam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author DuyenDang
 */
public class BoyleLaw extends JFrame
{
    //declare constants
    private final java.net.URL BOYLE_URL = getClass().getResource("boyleImage.png");
    private final ImageIcon BOYLE_IMAGE = new ImageIcon(new ImageIcon(BOYLE_URL).getImage().getScaledInstance(471, 116 , Image.SCALE_DEFAULT));
    
    //declare varible
    private JLabel headerLabel;
    private JLabel iniPresLabel;
    private JLabel iniVolLabel;
    private JLabel fiPresLabel;
    private JLabel fiVolLabel;
    private JLabel imageLabel;
    
    private JPanel formulaPanel;
    private JPanel headerPanel;
    
    public BoyleLaw()
    {
        //Constructing frame
        super("Boyle's Law Formula");
        this.setBounds(10, 10, 410 , 270);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        //Constructing label
        iniPresLabel = new JLabel("<html>P<sub>1</sub>: Initial Pressure (atm)</html>");
        iniVolLabel = new JLabel("<html>V<sub>1</sub>: Initial Volume(L) </html>");
        fiPresLabel = new JLabel("<html>P<sub>2</sub>: Final Pressure (atm) </html>");
        fiVolLabel = new JLabel("<html>V<sub>2</sub>: Final Volume (L) </html>");
        imageLabel = new JLabel(BOYLE_IMAGE);
        headerLabel = new JLabel("BOYLE'S LAW FORMULA");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 18));
        
        //Constructing panel
        formulaPanel = new JPanel();
        formulaPanel.setBackground(new Color(255,255, 255));
        formulaPanel.add(imageLabel);
        formulaPanel.add(iniPresLabel);
        formulaPanel.add(fiPresLabel);
        formulaPanel.add(iniVolLabel);
        formulaPanel.add(fiVolLabel);
        headerPanel = new JPanel();
        headerPanel.add(headerLabel);
        headerPanel.setBackground(new Color(118, 131, 235));
    
        //Adding components into frame
        this.add(formulaPanel, BorderLayout.CENTER);
        this.add(headerPanel, BorderLayout.NORTH);
        
        //Making frame visibible
        this.setVisible(true);
    }
    
//    public static void main(String[] args)
//    {
//        BoyleLaw boyleFormula = new BoyleLaw();
//    }
}
