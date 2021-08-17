/* Duyen Dang
 * April 2, 2019
 * A help frame describes how to use welcome page, what functions does the
welcome have with pictures*/
package dangsteam;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author DuyenDang
 */
public class HelpStartFrame extends JFrame implements ActionListener
{
    private final java.net.URL START_URL = getClass().getResource("startImage.png");
    private final ImageIcon START_IMAGE = new ImageIcon(new ImageIcon(START_URL).getImage().getScaledInstance(251, 91 , Image.SCALE_DEFAULT));
    private final java.net.URL SONG_URL = getClass().getResource("songImage.png");
    private final ImageIcon SONG_IMAGE = new ImageIcon(new ImageIcon(SONG_URL).getImage().getScaledInstance(285, 38 , Image.SCALE_DEFAULT));
    private final java.net.URL LAWS_URL = getClass().getResource("laws.png");
    private final ImageIcon LAWS_IMAGE = new ImageIcon(new ImageIcon(LAWS_URL).getImage().getScaledInstance(179, 107 , Image.SCALE_DEFAULT));
    private final java.net.URL INFO_URL = getClass().getResource("infoImage.png");
    private final ImageIcon INFO_IMAGE = new ImageIcon(new ImageIcon(INFO_URL).getImage().getScaledInstance(184, 68 , Image.SCALE_DEFAULT));
    private final Font LABEL_FONT = new Font("Arial", Font.BOLD, 13);
    
    private JLabel headerLabel;
    private JLabel startImageLabel;
    private JLabel startLabel;
    private JLabel buttonLabel;
    private JLabel songImageLabel;
    private JLabel songLabel;
    private JLabel lawsImageLabel;
    private JLabel lawsLabel;
    private JLabel infoImageLabel;
    private JLabel infoLabel;
    private JLabel lineLabel;
    private JLabel secLineLabel;
    private JLabel thirdLineLabel;
    
    private JButton startButton;
    
    public HelpStartFrame()
    {
        //Constructing frame
        super("Help in welcome page");
        this.setBounds(0, 0, 350, 620);
        this.setLayout(new FlowLayout());
        this.getContentPane().setBackground(new Color(255, 255, 255));
        
        //Constructing label
        headerLabel = new JLabel("HOW TO USE WELCOME PAGE");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 16));
        startImageLabel = new JLabel(START_IMAGE);
        startLabel = new JLabel("Go to input page by clicking start button");
        startLabel.setFont(LABEL_FONT);
        buttonLabel = new JLabel("in welcome page or by this button");
        buttonLabel.setFont(LABEL_FONT);
        songImageLabel = new JLabel(SONG_IMAGE);
        songLabel = new JLabel("A periodic song will be played if you need");
        songLabel.setFont(LABEL_FONT);
        lawsImageLabel = new JLabel(LAWS_IMAGE);
        lawsLabel = new JLabel("All gas law formulas are in the menu bar");
        lawsLabel.setFont(LABEL_FONT);
        infoImageLabel = new JLabel(INFO_IMAGE);
        infoLabel = new JLabel("Background/More information is in the menu bar");
        infoLabel.setFont(LABEL_FONT);
        lineLabel = new JLabel("_________________________________________");
        lineLabel.setFont(LABEL_FONT);
        secLineLabel = new JLabel("_________________________________________");
        secLineLabel.setFont(LABEL_FONT);
        thirdLineLabel = new JLabel("_________________________________________");
        thirdLineLabel.setFont(LABEL_FONT);
        
        //Constructing button
        startButton = new JButton("Click here to start");
        startButton.addActionListener(this);
        
        //Adding component into frame
        this.add(headerLabel);
        this.add(startImageLabel);
        this.add(startLabel);
        this.add(buttonLabel);
        this.add(startButton);
        this.add(lineLabel);
        this.add(songImageLabel);
        this.add(songLabel);
        this.add(secLineLabel);
        this.add(infoImageLabel);
        this.add(infoLabel);
        this.add(thirdLineLabel);
        this.add(lawsImageLabel);
        this.add(lawsLabel);
        
        //Make frame visible
        this.setVisible(true);
    }
    
//    public static void main(String[] args)
//    {
//        HelpStartFrame helpFrame = new HelpStartFrame();
//    }
    
    @Override
    public void actionPerformed( ActionEvent e)
    {
        String command = e.getActionCommand();
        if (command.equals("Click here to start"))
        {
            InputPage inputPage = new InputPage();
        }
    }
}
