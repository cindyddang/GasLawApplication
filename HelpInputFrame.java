/* Duyen Dang
 * April 8, 2019
 * A help frame decribes how to use input page with detailed steps to input information
and button to display used value list with pictures*/
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
public class HelpInputFrame extends JFrame
{
    private final java.net.URL CASE_URL = getClass().getResource("caseImage.png");
    private final ImageIcon CASE_IMAGE = new ImageIcon(new ImageIcon(CASE_URL).getImage().getScaledInstance(151, 147 , Image.SCALE_DEFAULT));
    private final java.net.URL FIELD_URL = getClass().getResource("fields.png");
    private final ImageIcon FIELD_IMAGE = new ImageIcon(new ImageIcon(FIELD_URL).getImage().getScaledInstance(852, 82 , Image.SCALE_DEFAULT));
    private final java.net.URL CAL_URL = getClass().getResource("calculateButton.png");
    private final ImageIcon CAL_IMAGE = new ImageIcon(new ImageIcon(CAL_URL).getImage().getScaledInstance(841, 66 , Image.SCALE_DEFAULT));
    private final java.net.URL BUTTON_URL = getClass().getResource("buttonImage.png");
    private final ImageIcon BUTTON_IMAGE = new ImageIcon(new ImageIcon(BUTTON_URL).getImage().getScaledInstance(674, 39 , Image.SCALE_DEFAULT));
    private final Font TEXT_FONT = new Font("Times New Roman", Font.PLAIN, 20);
    
    private JLabel useLabel;
    private JLabel calImageLabel;
    private JLabel calculateLabel;
    private JLabel caseImageLabel;
    private JLabel caseLabel;
    private JLabel fieldImageLabel;
    private JLabel fieldLabel;
    private JLabel displayLabel;
    private JLabel displayImageLabel;
    
    
    public HelpInputFrame()
    {
        //Constructing frame
        super("Help in Input Page");
        this.setBounds(0, 0, 900, 600);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.getContentPane().setBackground(new Color(255, 255, 255));
        
        //Constructing label
        useLabel = new JLabel("                                         HOW TO USE INPUT PAGE                                       ");
        useLabel.setFont(new Font("Arial", Font.BOLD, 23));
        calImageLabel = new JLabel(CAL_IMAGE);
        calculateLabel = new JLabel("Step 3: Tick boxes the value you want to calculate");
        calculateLabel.setFont(TEXT_FONT);
        caseImageLabel = new JLabel(CASE_IMAGE);
        caseLabel = new JLabel("            Step 1: Determine the case of problem first and check if any value is missing               ");
        caseLabel.setFont(TEXT_FONT);
        fieldImageLabel = new JLabel(FIELD_IMAGE);
        fieldLabel = new JLabel("Step 2: Fill value in correct fields.");
        fieldLabel.setFont(TEXT_FONT);
        displayLabel = new JLabel("<html>Display button: shows information already used"
                + "<br/> Home button: brings back to welcome page"
                + "<br/> Back button: also brings back to welcome page"
                + "<br/> Exit button: terminates program immediately </html>");
        displayLabel.setFont(TEXT_FONT);
        displayImageLabel = new JLabel(BUTTON_IMAGE);
        
        //Adding components into frame
        this.add(useLabel);
        this.add(caseImageLabel);
        this.add(caseLabel);
        this.add(fieldImageLabel);
        this.add(fieldLabel);
        this.add(calImageLabel);
        this.add(calculateLabel);
        this.add(displayImageLabel);
        this.add(displayLabel);
        
        //Making the frame visible
        this.setVisible(true);
    }
    
//    public static void main(String[] args)
//    {
//        HelpInputFrame helpInput = new HelpInputFrame();
//    }
}
