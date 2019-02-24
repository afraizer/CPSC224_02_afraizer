import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame
{
    boolean isXTurn;

    private PlayerPanel player1;
    private PlayerPanel player2;
    private JPanel buttonPanel;
    private JButton newGame;
    private JButton reset;
    private JButton exit;

    //buttons
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    
    ImageIcon X;
    ImageIcon O;


    public TicTacToe()
    {
        isXTurn = true;
        
        newGame = new JButton("New Game");
        reset = new JButton("Reset");
        exit = new JButton("Exit");
        
        
        newGame.addActionListener(new NewGameListener());
        reset.addActionListener(new ResetListener());
        exit.addActionListener(new ExitListener());
        

        setTitle("Tic Tac Toe");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        player1 = new PlayerPanel();
        player2 = new PlayerPanel();

        X = new ImageIcon("x.JPG");
        O = new ImageIcon("O.JPG");
        
        
        buildButtonPanel();

        add(player1, BorderLayout.NORTH);
        add(player2, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(newGame, BorderLayout.SOUTH);
        add(reset, BorderLayout.SOUTH);
        add(exit, BorderLayout.SOUTH);

        
        pack();
        setVisible(true);
        
    }

    private void buildButtonPanel() 
    {
        buttonPanel = new JPanel();

        button1 = new JButton("");
        button2 = new JButton("");
        button3 = new JButton("");
        button4 = new JButton("");
        button5 = new JButton("");
        button6 = new JButton("");
        button7 = new JButton("");
        button8 = new JButton("");
        button9 = new JButton("");

        button1.addActionListener(new ButtonListener());
        button2.addActionListener(new ButtonListener());
        button3.addActionListener(new ButtonListener());
        button4.addActionListener(new ButtonListener());
        button5.addActionListener(new ButtonListener());
        button6.addActionListener(new ButtonListener());
        button7.addActionListener(new ButtonListener());
        button8.addActionListener(new ButtonListener());
        button9.addActionListener(new ButtonListener());

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        
        
    }

    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (isXTurn)
            {
                if(button1.isSelected())
                    button1.setIcon(X);
                else if(button2.isSelected())
                    button2.setIcon(X);
                else if(button3.isSelected())
                    button3.setIcon(X);
                else if(button4.isSelected())
                    button4.setIcon(X);
                else if(button5.isSelected())
                    button5.setIcon(X);
                else if(button6.isSelected())
                    button6.setIcon(X);
                else if(button7.isSelected())
                    button7.setIcon(X);
                else if(button8.isSelected())
                    button8.setIcon(X);
                else if(button9.isSelected())
                    button9.setIcon(X);  
            }
            else
            {
                if(button1.isSelected())
                    button1.setIcon(O);
                else if(button2.isSelected())
                    button2.setIcon(O);
                else if(button3.isSelected())
                    button3.setIcon(O);
                else if(button4.isSelected())
                    button4.setIcon(O);
                else if(button5.isSelected())
                    button5.setIcon(O);
                else if(button6.isSelected())
                    button6.setIcon(O);
                else if(button7.isSelected())
                    button7.setIcon(O);
                else if(button8.isSelected())
                    button8.setIcon(O);
                else if(button9.isSelected())
                    button9.setIcon(O); 
            }
        }
    }
    
    private class NewGameListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
        }
    }
    
    private class ResetListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
        }
    }
    
    private class ExitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
}
