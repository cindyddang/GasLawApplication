/* Duyen Dang
 * April 10, 2019
 * A small frame displays Gay-Lussac's Law formula*/
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
public class GayLussacLaw extends JFrame
{
    //declare constants
    private final java.net.URL GAY_LUSSAC_URL = getClass().getResource("gayLussacImage.png");
    private final ImageIcon GAY_LUSSAC_IMAGE = new ImageIcon(new ImageIcon(GAY_LUSSAC_URL).getImage().getScaledInstance(232, 161 , Image.SCALE_DEFAULT));
    
    //declare varible
    private JLabel headerLabel;
    private JLabel iniPresLabel;
    private JLabel iniTempLabel;
    private JLabel fiPresLabel;
    private JLabel fiTempLabel;
    private JLabel imageLabel;
    
    private JPanel formulaPanel;
    private JPanel headerPanel;
    
    public GayLussacLaw()
    {
        //Constructing frame
        super("Gay-Lussac Law Formula");
        this.setBounds(10, 10, 350 , 290);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        //Constructing label
        iniPresLabel = new JLabel("<html>P<sub>1</sub>: Initial Pressure (atm) </html>");
        iniTempLabel = new JLabel("<html>T<sub>1</sub>: Initial Temperature(K) </html>");
        fiPresLabel = new JLabel("<html>P<sub>2</sub>: Final Pressure (atm) </html>");
        fiTempLabel = new JLabel("<html>T<sub>2</sub>: Final Temperature (K) </html>");
        imageLabel = new JLabel(GAY_LUSSAC_IMAGE);
        headerLabel = new JLabel("GAY-LUSSAC'S LAW FORMULA");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 18));
        
        //Constructing panel
        formulaPanel = new JPanel();
        formulaPanel.setBackground(new Color(255,255, 255));
        formulaPanel.add(imageLabel);
        formulaPanel.add(iniPresLabel);
        formulaPanel.add(fiPresLabel);
        formulaPanel.add(iniTempLabel);
        formulaPanel.add(fiTempLabel);
        headerPanel = new JPanel();
        headerPanel.add(headerLabel);
        headerPanel.setBackground(new Color(206, 211, 163));
    
        //Adding components into frame
        this.add(formulaPanel, BorderLayout.CENTER);
        this.add(headerPanel, BorderLayout.NORTH);
        
        //Making frame visibible
        this.setVisible(true);
    }
    
//    public static void main(String[] args)
//    {
//        GayLussacLaw gayLussacFormula = new GayLussacLaw();
//    }
    
}
