/* Duyen Dang
 * April 10, 2019
 * A small frame displays Combined Gas Law formula*/
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
public class CombinedGasLaw extends JFrame
{
    //declare constants
    private final java.net.URL COMBINED_URL = getClass().getResource("combinedImage.png");
    private final ImageIcon COMBINED_IMAGE = new ImageIcon(new ImageIcon(COMBINED_URL).getImage().getScaledInstance(243, 138 , Image.SCALE_DEFAULT));
    
    //declare varible
    private JLabel headerLabel;
    private JLabel iniPresLabel;
    private JLabel iniVolLabel;
    private JLabel iniTempLabel;
    private JLabel fiPresLabel;
    private JLabel fiVolLabel;
    private JLabel fiTempLabel;
    private JLabel imageLabel;
    
    private JPanel formulaPanel;
    private JPanel headerPanel;
    
    public CombinedGasLaw()
    {
        //Constructing frame
        super("Combined Gas Law Formula");
        this.setBounds(10, 10, 350 , 290);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        //Constructing label
        iniPresLabel = new JLabel("P1: Initial Pressure (atm)");
        iniVolLabel = new JLabel("V1: Initial Volume(L)");
        iniTempLabel = new JLabel("T1: Initial Temperature(K)");
        fiPresLabel = new JLabel("P2: Final Pressure (atm)");
        fiVolLabel = new JLabel("V2: Final Volume (L)");
        fiTempLabel = new JLabel("T2: Final Temperature (K)");
        imageLabel = new JLabel(COMBINED_IMAGE);
        headerLabel = new JLabel("COMBINED GAS LAW FORMULA");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 18));
        
        //Constructing panel
        formulaPanel = new JPanel();
        formulaPanel.setBackground(new Color(255,255, 255));
        formulaPanel.add(imageLabel);
        formulaPanel.add(iniPresLabel);
        formulaPanel.add(fiPresLabel);
        formulaPanel.add(iniVolLabel);
        formulaPanel.add(fiVolLabel);
        formulaPanel.add(iniTempLabel);
        formulaPanel.add(fiTempLabel);
        headerPanel = new JPanel();
        headerPanel.add(headerLabel);
        headerPanel.setBackground(new Color(241, 211, 70));
    
        //Adding components into frame
        this.add(formulaPanel, BorderLayout.CENTER);
        this.add(headerPanel, BorderLayout.NORTH);
        
        //Making frame visibible
        this.setVisible(true);
    }
//    
//    public static void main(String[] args)
//    {
//        CombinedGasLaw boyleFormula = new CombinedGasLaw();
//    }
}
