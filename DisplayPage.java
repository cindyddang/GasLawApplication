/* Duyen Dang
 * April 6, 2019
 * A small frame displays values that already used with results from solved problems*/
package dangsteam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

/**
 *
 * @author DuyenDang
 */
public class DisplayPage extends JFrame implements ActionListener
{
    private final java.net.URL LOGO_URL = getClass().getResource("logo.png");
    private final ImageIcon LOGO_IMAGE = new ImageIcon(new ImageIcon(LOGO_URL).getImage().getScaledInstance(33, 32 , Image.SCALE_DEFAULT));
    
    //declare constants
    private final String[] TABLE_HEADER = {"V1", "P1", "T1", "V2", "P2", "T2"};       
    
    //declare variables
    private JLabel infoLabel;
    private JLabel logoImageLabel;
    private JPanel northPanel;
    private JPanel southPanel;
    
    private JButton backButton;
    private JButton exitButton;
    
    //menu
    private JMenuBar mainBar;
    private JMenu infoBar;
    private JMenu formulaBar;
    private JMenu helpBar;
    private JMenuItem meItem;
    private JMenuItem programItem;
    private JMenuItem boyleItem;
    private JMenuItem charlesItem;
    private JMenuItem gayLussacItem;
    private JMenuItem combinedItem;
    private JMenuItem welcomeItem;
    private JMenuItem inputItem;
    private JMenuItem displayItem;
    
    //array
    private Object[][] gasArray;
    private JTable gasTable;
    private JScrollPane gasPane;
    private JTableHeader gasHeader;
    
    public DisplayPage(Object[][] gasArray)
    {
        //Constructing the frame
        super("Value List");
        this.setBounds(0, 0, 500, 400);
        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        this.gasArray = gasArray;
        
        //Constructing the menu
        mainBar = new JMenuBar();
        infoBar = new JMenu("More Information");
        formulaBar = new JMenu("Gas Formula");
        helpBar = new JMenu("Help");
        meItem = new JMenuItem("About me");
        meItem.addActionListener(this);
        programItem = new JMenuItem("About this program");
        programItem.addActionListener(this);
        boyleItem = new JMenuItem("Boyle's Law");
        boyleItem.addActionListener(this);
        charlesItem = new JMenuItem("Charles's Law");
        charlesItem.addActionListener(this);
        gayLussacItem = new JMenuItem("Gay-Lussac's Law");
        gayLussacItem.addActionListener(this);
        combinedItem = new JMenuItem("Combined Gas Law");
        combinedItem.addActionListener(this);
        welcomeItem = new JMenuItem("Help in start page");
        welcomeItem.addActionListener(this);
        inputItem = new JMenuItem("Help in input page");
        inputItem.addActionListener(this);
        displayItem = new JMenuItem("Help in display page");
        displayItem.addActionListener(this);
        
        //Adding menu
        //Adding the menus
        infoBar.add(meItem);
        infoBar.add(programItem);
        formulaBar.add(boyleItem);
        formulaBar.add(charlesItem);
        formulaBar.add(gayLussacItem);
        formulaBar.add(combinedItem);
        helpBar.add(welcomeItem);
        helpBar.add(inputItem);
        helpBar.add(displayItem);
        mainBar.add(helpBar);
        mainBar.add(infoBar);
        mainBar.add(formulaBar);
        
        //Constructing label
        logoImageLabel = new JLabel(LOGO_IMAGE);
        infoLabel = new JLabel("This table shows values you already used");
        infoLabel.setFont(new Font("Arial", Font.BOLD, 17));
        infoLabel.setForeground(new Color(255, 255, 255));
        
        //Constructing button
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        backButton = new JButton("Back");
        backButton.addActionListener(this);
        
        //Constructing table
        gasTable = new JTable(gasArray, TABLE_HEADER);
      
        //Formatting table
        gasTable.setGridColor(new Color(0, 0, 0));
        gasTable.setBackground(new Color(255, 255, 255));
        
        //Formatting header
        gasHeader = gasTable.getTableHeader();
        gasHeader.setBackground(new Color(0, 0, 0));
        gasHeader.setForeground(new Color(255, 255, 255));
        gasHeader.setFont(new Font("Arial", Font.BOLD, 13));
        
        //Constructing pane
        gasPane = new JScrollPane();
        gasPane.getViewport().add(gasTable);
        
        //Make table visible
        gasTable.setVisible(true);

        //Constructing panel
        northPanel = new JPanel();
        northPanel.add(logoImageLabel);
        northPanel.add(infoLabel);
        northPanel.setBackground(new Color(0, 0, 0));
        southPanel = new JPanel();
        southPanel.add(backButton);
        southPanel.add(exitButton);
        southPanel.setBackground(new Color(0, 0, 0));
        
        //Adding component into frame
        this.add(gasPane, BorderLayout.CENTER);
        this.add(northPanel, BorderLayout.NORTH);
        this.add(southPanel, BorderLayout.SOUTH);
        
        //Making frame visibile
        this.setJMenuBar(mainBar);
        this.setVisible(true);
    }
//    
//    public static void main(String[] args)
//    {
//        Object[][] tempArray = new Object[2][6];
//        
//        DisplayPage displayPage = new DisplayPage(tempArray);
//    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        if(command.equals("Help in start page"))
        {
            HelpStartFrame helpStart = new HelpStartFrame();
        }
        if(command.equals("Help in input page"))
        {
            HelpInputFrame helpInput = new HelpInputFrame();
        }
        if(command.equals("Help in display page"))
        {
            HelpDisplayFrame helpDisplay = new HelpDisplayFrame();
        }
        if(command.equals("About me"))
        {
            ProgrammerInfo programmerInfo = new ProgrammerInfo();
        }
        if(command.equals("About this program"))
        {
            ProgramInfo infoPage = new ProgramInfo();
        }
        if(command.equals("Combined Gas Law"))
        {
            CombinedGasLaw combinedFormula = new CombinedGasLaw();
        }
        if(command.equals("Boyle's Law"))
        {
            BoyleLaw boyleFormula = new BoyleLaw();
        }
        if(command.equals("Gay-Lussac's Law"))
        {
            GayLussacLaw gayLussacFormula = new GayLussacLaw();
        }
        if(command.equals("Charles's Law"))
        {
            CharlesLaw charlesFormula = new CharlesLaw();
        }
        if(command.equals("Back"))
        {
            this.dispose();
        }
        if(command.equals("Exit"))
        {
            System.exit(0);
        }
    }
   
}
