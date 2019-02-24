import javax.swing.*;
import java.awt.*;


public class PlayerPanel extends JPanel
{
	private int playerNum;
	private int wins;
	private int losses;
	private JTextField name;
	private JLabel winField;
	private JLabel lossField;
	
    public PlayerPanel(int playerNum)
    {
		setLayout(new GridLayout(3, 1));
		
		wins = 0;
		losses = 0;
		winField = new JLabel("Wins:        " + wins);
		lossField = new JLabel("Losses:     " + losses);
		name = new JTextField("Player " + playerNum);
		
		setBorder(BorderFactory.createTitledBorder("Player " + playerNum);
		
		add(name);
		add(winField);
		add(lossField);
    }
	
	public void addWin() {
		wins++;
		winField.setText("Wins:        " + wins);
	}
	
	public void addLoss() {
		losses++;
		lossField.setText("Losses:     " + losses);
	}
}