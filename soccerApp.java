import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class soccerApp extends JPanel {
	private JButton portlandButton;
	private JButton gameButton;
	private JButton seattleButton;
	private JFrame soccer;
	private JPanel panel;
	private final int WINDOW_WIDTH = 500;
	private final int WINDOW_HEIGHT = 500;


	public soccerApp() {
		setLayout(new GridLayout(3, 1));
		setTitle("Cascadia Rivaly");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}

	private void buildPanel() {
		portlandButton = new JButton("PORTLAND THORNS");
		gameButton = new JButton("PLAY GAME");
		seattleButton = new JButton("SEATTLE REIGN"); 

		portlandButton.addActionListener(new PortlandButtonListener());
		gameButton.addActionListener(new GameButtonListener());
		seattleButton.addActionListener(new SeattleButtonListener());

		panel = new JPanel();
		panel.add(portlandButton);
		panel.add(gameButton);
		panel.add(seattleButton);

	}

	private class PortlandButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      }
  }

  private class GameButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      }
  }

  private class SeattleButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      }
  }


}
