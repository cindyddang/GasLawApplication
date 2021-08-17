/* Duyen Dang
 * April 7, 2019
 * A small frame displays problem's result only */
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
import javax.swing.JPanel;

/**
 *
 * @author DuyenDang
 */
public class OutputPage extends JFrame implements ActionListener
{
    private final java.net.URL IMAGE_URL = getClass().getResource("result.gif");
    private final ImageIcon RESULT_IMAGE = new ImageIcon(new ImageIcon(IMAGE_URL).getImage().getScaledInstance(240, 240 , Image.SCALE_DEFAULT));

    private JLabel resultLabel;
    private JLabel messageLabel;
    private JLabel congratLabel;
    
    private JLabel imageLabel;
    
    private JButton backButton;
    private JButton exitButton;
    
    private JPanel centerPanel;
    private JPanel buttonPanel;
    
    public OutputPage(double result)
    {
       super("Result");
       this.setBounds(100, 50, 300, 300);
       this.setLayout(new BorderLayout());
       this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       
       //Constructing label
       resultLabel = new JLabel();
       resultLabel.setText(Double.toString(result));
       resultLabel.setFont(new Font("Arial", Font.BOLD, 20));
       messageLabel = new JLabel("Your lovely result is ");
       messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));
       congratLabel = new JLabel("CONGRATULATION! YOU GOT IT!");
       congratLabel.setFont(new Font("Arial", Font.BOLD, 18));
       congratLabel.setForeground(new Color(206,76,68));
       imageLabel = new JLabel(RESULT_IMAGE); 
       
       //Constructing button
       backButton = new JButton("BACK");
       backButton.addActionListener(this);
       exitButton = new JButton("EXIT");
       exitButton.addActionListener(this);
       
       //Constructing panel
       centerPanel = new JPanel();
       centerPanel.setBackground(new Color(255, 255, 255));
       centerPanel.add(messageLabel);
       centerPanel.add(resultLabel);
       centerPanel.add(congratLabel);
       centerPanel.add(imageLabel);
       buttonPanel = new JPanel();
       buttonPanel.add(backButton);
       buttonPanel.add(exitButton);
       buttonPanel.setBackground(new Color(0,0,0)); 
       
       //Adding component into frame
       this.add(centerPanel, BorderLayout.CENTER);
       this.add(buttonPanel, BorderLayout.SOUTH);
       
       //Make this frame visible
       this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        if(command.equals("BACK"))
        {
            this.dispose();
        }
        if(command.equals("EXIT"))
        {
            System.exit(0);
        }
    }
//    
//    public static void main(String[] args)
//    {
//        OutputPage outputPage = new OutputPage(8.3);
//    }
}
