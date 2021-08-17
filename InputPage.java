/* Duyen Dang
 * March 29, 2019
 * A frame for users to input given information, choose what value to calculate
with a short direction and menu bar, which has detailed direction*/
package dangsteam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author DuyenDang
 */
public class InputPage extends JFrame implements ActionListener
{
    //declare constants
    private final java.net.URL LOGO_URL = getClass().getResource("logo.png");
    private final ImageIcon LOGO_IMAGE = new ImageIcon(new ImageIcon(LOGO_URL).getImage().getScaledInstance(33, 32 , Image.SCALE_DEFAULT));
    private final Font SMALL_LABEL = new Font("Times New Roman", Font.PLAIN, 12);
    private final Font MEDIUM_LABEL = new Font("Times New Roman", Font.PLAIN, 13);
    private final Color GRAY_COLOR = new Color(226, 226, 226);
    private final Color BLACK_COLOR = new Color(0,0,0);
    
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
    
    //declare variable
    private JLabel iniPresLabel;
    private JLabel iniVolLabel;
    private JLabel iniTempLabel;
    private JLabel fiPresLabel;
    private JLabel fiVolLabel;
    private JLabel fiTempLabel;
    private JTextField iniPresField;
    private JTextField iniVolField;
    private JTextField iniTempField;
    private JTextField fiPresField;
    private JTextField fiVolField;
    private JTextField fiTempField;
    
    //other labels
    private JLabel logoImageLabel;
    private JLabel headLabel;
    private JLabel infoLabel;
    private JLabel directionLabel;
    private JLabel lineLabel;
    private JLabel secLineLabel;
    private JLabel seperateLabel;
    
    //panels
    private JPanel northPanel;
    private JPanel centerPanel;
    private JPanel westPanel;
    private JPanel buttonPanel;
    private JPanel southPanel;
    
    //buttons
    private JButton applyButton;
    private JButton calculateButton;
    private JButton displayButton;
    private JButton homeButton;
    private JButton backButton;
    private JButton exitButton;
    
    //RadioButton
    private JRadioButton noVolButton;
    private JRadioButton noPresButton;
    private JRadioButton noTempButton;
    private JRadioButton noSpecialButton;
    private JRadioButton finalButton;
    private JRadioButton initialButton;
    private JRadioButton pressureButton;
    private JRadioButton volumeButton;
    private JRadioButton temperatureButton;
    private ButtonGroup caseGroup;
    private ButtonGroup timeGroup;
    private ButtonGroup typeGroup;
    
    //Arrays
    private ArrayList<CalculatingGas> gasList = new ArrayList<>();
    private Object[][] gasArray = new Object[gasList.size()][2];
    
    public InputPage()
    {
        //Constructing frame
        super("Input");
        this.setBounds(330, 230, 1000, 350);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
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
        iniPresLabel = new JLabel("                            Initial Pressure");
        iniPresLabel.setFont(SMALL_LABEL);
        iniVolLabel = new JLabel("Initial Volume");
        iniVolLabel.setFont(SMALL_LABEL);
        iniTempLabel = new JLabel("Initial Temperature");
        iniTempLabel.setFont(SMALL_LABEL);
        fiPresLabel = new JLabel("                             Final Pressure");
        fiPresLabel.setFont(SMALL_LABEL);
        fiVolLabel = new JLabel("Final Volume");
        fiVolLabel.setFont(SMALL_LABEL);
        fiTempLabel = new JLabel("Final Temperature");
        fiTempLabel.setFont(SMALL_LABEL);
        headLabel = new JLabel("READ DIRECTION BEFORE USING");
        headLabel.setFont(new Font("Arial", Font.BOLD, 17));
        headLabel.setForeground(GRAY_COLOR);
        infoLabel = new JLabel("Direction: Check boxes about cases on the left. Determine value of gases and input in correct fields.");
        infoLabel.setFont(MEDIUM_LABEL);
        directionLabel = new JLabel("Leave field blank if you want to find that information." + " Then, choose the button of value that you want to calculate.");
        directionLabel.setFont(MEDIUM_LABEL);
        lineLabel = new JLabel("___Input fields______________________________________________________________________________________________________________");
        secLineLabel = new JLabel("___Calculate Button (Choose what value you want to find)___________________________________________________________________");
        seperateLabel = new JLabel("    |   ");
        
        //Constructing textfield
        iniPresField = new JTextField(10);
        iniVolField = new JTextField(10);
        iniTempField = new JTextField(10);
        fiPresField = new JTextField(10);
        fiVolField = new JTextField(10);
        fiTempField = new JTextField(10);
        
        //Constructing button
        applyButton = new JButton("Apply");
        applyButton.addActionListener(this);
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        displayButton = new JButton("Display list");
        displayButton.addActionListener(this);
        homeButton = new JButton("Home");
        homeButton.addActionListener(this);
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        backButton = new JButton("Back");
        backButton.addActionListener(this);
        
               
        
        //Constructing Radio Button
        noVolButton = new JRadioButton("No Volume");
        noPresButton = new JRadioButton("No Pressure");
        noTempButton = new JRadioButton ("No Tempereature");
        noSpecialButton = new JRadioButton("No Special case");
        initialButton = new JRadioButton("Initial");
        finalButton = new JRadioButton("Final");
        pressureButton = new JRadioButton("Pressure");
        volumeButton = new JRadioButton("Volume");
        temperatureButton = new JRadioButton("Temperature");
       
        
        //Constructing button group
        caseGroup = new ButtonGroup();
        caseGroup.add(noVolButton);
        caseGroup.add(noPresButton);
        caseGroup.add(noTempButton);
        caseGroup.add(noSpecialButton);
        timeGroup = new ButtonGroup();
        timeGroup.add(finalButton);
        timeGroup.add(initialButton);
        typeGroup = new ButtonGroup();
        typeGroup.add(pressureButton);
        typeGroup.add(volumeButton);
        typeGroup.add(temperatureButton);
        

        //Constructing panel
        buttonPanel = new JPanel();
        buttonPanel.add(initialButton);
        buttonPanel.add(finalButton);
        buttonPanel.add(seperateLabel);
        buttonPanel.add(pressureButton);
        buttonPanel.add(volumeButton);
        buttonPanel.add(temperatureButton);
        buttonPanel.add(calculateButton);
        centerPanel = new JPanel();
        centerPanel.add(infoLabel);
        centerPanel.add(directionLabel);
        centerPanel.add(lineLabel);
        centerPanel.add(iniPresLabel);
        centerPanel.add(iniPresField);
        centerPanel.add(iniVolLabel);
        centerPanel.add(iniVolField);
        centerPanel.add(iniTempLabel);
        centerPanel.add(iniTempField);
        centerPanel.add(fiPresLabel);
        centerPanel.add(fiPresField);
        centerPanel.add(fiVolLabel);
        centerPanel.add(fiVolField);
        centerPanel.add(fiTempLabel);
        centerPanel.add(fiTempField);
        centerPanel.add(secLineLabel);
        centerPanel.add(buttonPanel);
        northPanel = new JPanel();
        northPanel.setBackground(BLACK_COLOR);
        northPanel.add(logoImageLabel);
        northPanel.add(headLabel);
        southPanel = new JPanel();
        southPanel.add(displayButton);
        southPanel.add(homeButton);
        southPanel.add(backButton);
        southPanel.add(exitButton);
        southPanel.setBackground(BLACK_COLOR);
        westPanel = new JPanel();
        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.LINE_AXIS));
        
        //Constructing box
        Box caseBox = Box.createVerticalBox();
        caseBox.add(noSpecialButton);
        caseBox.add(noPresButton);
        caseBox.add(noVolButton);
        caseBox.add(noTempButton);
        caseBox.add(applyButton);
        caseBox.setBorder(BorderFactory.createTitledBorder("Special case"));
        westPanel.add(caseBox);
        
        //Adding components into frame
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(northPanel, BorderLayout.NORTH);
        this.add(westPanel, BorderLayout.WEST);
        this.add(southPanel, BorderLayout.SOUTH);
                
        //Make frame and menu visible
        this.setJMenuBar(mainBar);
        this.setVisible(true);
    }
    
//    public static void main(String[] args)
//    {
//        InputPage inputPage = new InputPage();
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
        if(command.equals("Display list"))
        {
            DisplayPage outputList = new DisplayPage(gasArray);
        }
        if(command.equals("Apply"))
        {
            if(noVolButton.isSelected())
            {
                iniVolField.setEditable(false);
                fiVolField.setEditable(false);
                volumeButton.setEnabled(false);
            }
            
            if(noPresButton.isSelected())
            {
                iniPresField.setEditable(false);
                fiPresField.setEditable(false);
                pressureButton.setEnabled(false);
            }
            
            if(noTempButton.isSelected())
            {
                iniTempField.setEditable(false);
                fiTempField.setEditable(false);
                temperatureButton.setEnabled(false);
            }
        }
        
        if(command.equals("Calculate"))
        {
            try
            {
                iniVolField.setEditable(true);
                fiVolField.setEditable(true);
                iniPresField.setEditable(true);
                fiPresField.setEditable(true);
                iniTempField.setEditable(true);
                fiTempField.setEditable(true);
                
                temperatureButton.setEnabled(true);
                pressureButton.setEnabled(true);
                volumeButton.setEnabled(true);
                
                CalculatingGas gasInfo = new CalculatingGas();
                double result;

                if(noVolButton.isSelected())
                {                
                    gasInfo.setFiVolume(1);
                    gasInfo.setIniVolume(1);

                    if(initialButton.isSelected())
                    {
                        if(pressureButton.isSelected())
                        {
                            double iniTemperature = Double.parseDouble(iniTempField.getText());
                            double fiTemperature = Double.parseDouble(fiTempField.getText());
                            double fiPressure = Double.parseDouble(fiPresField.getText());

                            gasInfo.setFiPressure(fiPressure);
                            gasInfo.setFiTemperature(fiTemperature);
                            gasInfo.setIniTemperature(iniTemperature);  

                            result = gasInfo.computeIniPressure();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(0.0, result, iniTemperature, 0.0, fiPressure, fiTemperature);
                            gasList.add(tempGas);
                        }

                        if(temperatureButton.isSelected())
                        {
                            double iniPressure = Double.parseDouble(iniPresField.getText());
                            double fiTemperature = Double.parseDouble(fiTempField.getText());
                            double fiPressure = Double.parseDouble(fiPresField.getText());

                            gasInfo.setFiPressure(fiPressure);
                            gasInfo.setFiTemperature(fiTemperature);
                            gasInfo.setIniPressure(iniPressure);

                            result = gasInfo.computeIniTemperature();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(0.0, iniPressure, result, 0.0, fiPressure, fiTemperature);
                            gasList.add(tempGas);
                        }
                    }

                    if(finalButton.isSelected())
                    {
                        if(pressureButton.isSelected())
                        {
                            double iniTemperature = Double.parseDouble(iniTempField.getText());
                            double iniPressure = Double.parseDouble(iniPresField.getText());
                            double fiTemperature = Double.parseDouble(fiTempField.getText());

                            gasInfo.setFiTemperature(fiTemperature);
                            gasInfo.setIniPressure(iniPressure);
                            gasInfo.setIniTemperature(iniTemperature);

                            result = gasInfo.computeFiPressure();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(0.0, iniPressure, iniTemperature, 0.0, result, fiTemperature);
                            gasList.add(tempGas);
                        }

                        if(temperatureButton.isSelected())
                        {
                            double iniTemperature = Double.parseDouble(iniTempField.getText());
                            double iniPressure = Double.parseDouble(iniPresField.getText());
                            double fiPressure = Double.parseDouble(fiPresField.getText());

                            gasInfo.setFiPressure(fiPressure);
                            gasInfo.setIniPressure(iniPressure);
                            gasInfo.setIniTemperature(iniTemperature);  

                            result = gasInfo.computeFiTemperature();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(0.0, iniPressure, iniTemperature, 0.0, fiPressure, result);
                            gasList.add(tempGas);
                        }
                    }  
                }

                if(noPresButton.isSelected())
                {
                    gasInfo.setFiPressure(1);
                    gasInfo.setIniPressure(1);

                    if(initialButton.isSelected())
                    {
                        if(temperatureButton.isSelected())
                        {
                            double fiVolume = Double.parseDouble(fiVolField.getText());
                            double iniVolume = Double.parseDouble(iniVolField.getText());
                            double fiTemperature = Double.parseDouble(fiTempField.getText());

                            gasInfo.setFiTemperature(fiTemperature);
                            gasInfo.setFiVolume(fiVolume);
                            gasInfo.setIniVolume(iniVolume);

                            result = gasInfo.computeIniTemperature();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(iniVolume, 0.0, result, fiVolume, 0.0, fiTemperature);
                            gasList.add(tempGas);
                        }
                        if(volumeButton.isSelected())
                        {
                            double fiVolume = Double.parseDouble(fiVolField.getText());
                            double iniTemperature = Double.parseDouble(iniTempField.getText());
                            double fiTemperature = Double.parseDouble(fiTempField.getText());

                            gasInfo.setFiTemperature(fiTemperature);
                            gasInfo.setFiVolume(fiVolume);
                            gasInfo.setIniTemperature(iniTemperature);

                            result = gasInfo.computeIniVolume();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(result, 0.0, iniTemperature, fiVolume, 0.0, fiTemperature);
                            gasList.add(tempGas);
                        }
                    }

                    if(finalButton.isSelected())
                    {
                        if(temperatureButton.isSelected())
                        {
                            double fiVolume = Double.parseDouble(fiVolField.getText());
                            double iniVolume = Double.parseDouble(iniVolField.getText());
                            double iniTemperature = Double.parseDouble(iniTempField.getText());

                            gasInfo.setFiVolume(fiVolume);
                            gasInfo.setIniTemperature(iniTemperature);
                            gasInfo.setIniVolume(iniVolume);

                            result = gasInfo.computeFiTemperature();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(iniVolume, 0.0, iniTemperature, fiVolume, 0.0, result);
                            gasList.add(tempGas);
                        }

                        if(volumeButton.isSelected())
                        {
                            double iniVolume = Double.parseDouble(iniVolField.getText());
                            double iniTemperature = Double.parseDouble(iniTempField.getText());
                            double fiTemperature = Double.parseDouble(fiTempField.getText());

                            gasInfo.setFiTemperature(fiTemperature);
                            gasInfo.setIniTemperature(iniTemperature);
                            gasInfo.setIniVolume(iniVolume);

                            result = gasInfo.computeFiVolume();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(iniVolume, 0.0, iniTemperature, result, 0.0, fiTemperature);
                            gasList.add(tempGas);
                        }
                    }
                }

                if(noTempButton.isSelected())
                {
                    gasInfo.setFiTemperature(1);
                    gasInfo.setIniTemperature(1);

                    if(initialButton.isSelected())
                    {
                        if(pressureButton.isSelected())
                        {
                            double fiVolume = Double.parseDouble(fiVolField.getText());
                            double iniVolume = Double.parseDouble(iniVolField.getText());
                            double fiPressure = Double.parseDouble(fiPresField.getText());

                            gasInfo.setFiPressure(fiPressure);
                            gasInfo.setFiVolume(fiVolume);
                            gasInfo.setIniVolume(iniVolume);

                            result = gasInfo.computeIniPressure();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(iniVolume, result, 0.0, fiVolume, fiPressure, 0.0);
                            gasList.add(tempGas);
                        }
                        if(volumeButton.isSelected())
                        {
                            double fiVolume = Double.parseDouble(fiVolField.getText());
                            double iniPressure = Double.parseDouble(iniPresField.getText());
                            double fiPressure = Double.parseDouble(fiPresField.getText());

                            gasInfo.setFiPressure(fiPressure);
                            gasInfo.setFiVolume(fiVolume);
                            gasInfo.setIniPressure(iniPressure);

                            result = gasInfo.computeIniVolume();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(result, iniPressure, 0.0, fiVolume, fiPressure, 0.0);
                            gasList.add(tempGas);
                        }
                    }

                    if(finalButton.isSelected())
                    {
                        if(pressureButton.isSelected())
                        {
                            double fiVolume = Double.parseDouble(fiVolField.getText());
                            double iniVolume = Double.parseDouble(iniVolField.getText());
                            double iniPressure = Double.parseDouble(iniPresField.getText());

                            gasInfo.setFiVolume(fiVolume);
                            gasInfo.setIniPressure(iniPressure);
                            gasInfo.setIniVolume(iniVolume);

                            result = gasInfo.computeFiPressure();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(iniVolume, iniPressure, 0.0, fiVolume, result, 0.0);
                            gasList.add(tempGas);
                        }
                        
                        if(volumeButton.isSelected())
                        {
                            double iniVolume = Double.parseDouble(iniVolField.getText());
                            double iniPressure = Double.parseDouble(iniPresField.getText());
                            double fiPressure = Double.parseDouble(fiPresField.getText());

                            gasInfo.setFiPressure(fiPressure);
                            gasInfo.setIniPressure(iniPressure);
                            gasInfo.setIniVolume(iniVolume);

                            result = gasInfo.computeFiVolume();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(iniVolume, iniPressure, 0.0, result, fiPressure, 0.0);
                            gasList.add(tempGas);
                        }
                    }
                }

                if(noSpecialButton.isSelected())
                {
                    if(initialButton.isSelected())
                    {
                        double fiVolume = Double.parseDouble(fiVolField.getText());
                        double fiPressure = Double.parseDouble(fiPresField.getText());
                        double fiTemperature = Double.parseDouble(fiTempField.getText());

                        gasInfo.setFiTemperature(fiTemperature);
                        gasInfo.setFiPressure(fiPressure);
                        gasInfo.setFiVolume(fiVolume);

                        if(pressureButton.isSelected())
                        {
                            double iniVolume = Double.parseDouble(iniVolField.getText());
                            double iniTemperature = Double.parseDouble(iniTempField.getText());

                            gasInfo.setIniVolume(iniVolume);
                            gasInfo.setIniTemperature(iniTemperature);

                            result = gasInfo.computeIniPressure();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(iniVolume, result, iniTemperature, fiVolume, fiPressure, fiTemperature);
                            gasList.add(tempGas);
                        }
                        if(temperatureButton.isSelected())
                        {
                            double iniPressure = Double.parseDouble(iniPresField.getText());
                            double iniVolume = Double.parseDouble(iniVolField.getText());

                            gasInfo.setIniVolume(iniVolume);
                            gasInfo.setIniPressure(iniPressure);

                            result = gasInfo.computeIniTemperature();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(iniVolume, iniPressure, result, fiVolume, fiPressure, fiTemperature);
                            gasList.add(tempGas);
                        }
                        if(volumeButton.isSelected())
                        {
                            double iniPressure = Double.parseDouble(iniPresField.getText());
                            double iniTemperature = Double.parseDouble(iniTempField.getText());

                            gasInfo.setIniPressure(iniPressure);
                            gasInfo.setIniTemperature(iniTemperature);

                            result = gasInfo.computeIniVolume();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(result, iniPressure, iniTemperature, fiVolume, fiPressure, fiTemperature);
                            gasList.add(tempGas);
                        }
                    }

                    if(finalButton.isSelected())
                    {
                        double iniVolume = Double.parseDouble(iniVolField.getText());
                        double iniPressure = Double.parseDouble(iniPresField.getText());
                        double iniTemperature = Double.parseDouble(iniTempField.getText());

                        gasInfo.setIniTemperature(iniTemperature);
                        gasInfo.setIniPressure(iniPressure);
                        gasInfo.setIniVolume(iniVolume);

                        if(pressureButton.isSelected())
                        {
                            double fiVolume = Double.parseDouble(fiVolField.getText());
                            double fiTemperature = Double.parseDouble(fiTempField.getText());

                            gasInfo.setFiTemperature(fiTemperature);
                            gasInfo.setFiVolume(fiVolume);

                            result = gasInfo.computeFiPressure();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(iniVolume, iniPressure, iniTemperature, fiVolume, result, fiTemperature);
                            gasList.add(tempGas);
                        }

                        if(temperatureButton.isSelected())
                        {
                            double fiVolume = Double.parseDouble(fiVolField.getText());
                            double fiPressure = Double.parseDouble(fiPresField.getText());

                            gasInfo.setFiPressure(fiPressure);
                            gasInfo.setFiVolume(fiVolume);

                            result = gasInfo.computeFiTemperature();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(iniVolume, iniPressure, iniTemperature, fiVolume, fiPressure, result);
                            gasList.add(tempGas);
                        }
                        if(volumeButton.isSelected())
                        {
                            double fiPressure = Double.parseDouble(fiPresField.getText());
                            double fiTemperature = Double.parseDouble(fiTempField.getText());

                            gasInfo.setFiTemperature(fiTemperature);
                            gasInfo.setFiPressure(fiPressure);

                            result = gasInfo.computeFiVolume();
                            OutputPage resultPage = new OutputPage(result);
                            CalculatingGas tempGas = new CalculatingGas(iniVolume, iniPressure, iniTemperature, result, fiPressure, fiTemperature);
                            gasInfo = tempGas;
                            gasList.add(tempGas);
                        }
                    }
                }
                
                Object[][] tempArray = new Object[gasList.size()][6];
                
                for (int i=0; i<tempArray.length; i++)
                {
                    gasInfo = gasList.get(i);
                    tempArray[i][0] = gasInfo.getIniVolume();
                    tempArray[i][1] = gasInfo.getIniPressure();
                    tempArray[i][2] = gasInfo.getIniTemperature();
                    tempArray[i][3] = gasInfo.getFiVolume();
                    tempArray[i][4] = gasInfo.getFiPressure();
                    tempArray[i][5] = gasInfo.getFiTemperature();
                }
                
                gasArray = tempArray;
            }
            catch (NumberFormatException nfe)
            {
                WarningPage warningPage = new WarningPage();
            }
        }  

        if(command.equals("Home"))
        {
            WelcomePage welcomePage = new WelcomePage();
            this.dispose();
        }
        if(command.equals("Back"))
        {
            WelcomePage welcomePage = new WelcomePage();
            this.dispose();
        }
        if(command.equals("Exit"))
        {
            System.exit(0);
        }
    }
}

