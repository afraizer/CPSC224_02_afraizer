import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Parallax extends JFrame {
	private int hill1X;
	private int hill1Y;
	private int hill2X;
	private int hill2Y;

	private int grassX;
	private int grassY;

	private int treeX;
	private int treeY;
	private int trunkX;
	private int trunkY;

	private int sunX;
	private int sunY;

	Parallax() {
		setTitle("Motion Parallax");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setBackground(Color.CYAN);
		addMouseListener(new MyMouseListener());
		addMouseMotionListener(new MyMotionListener());

		hill1X = -100;
		hill1Y = 130;
		hill2X = 150;
		hill2Y = 110;

		grassX = 0;
		grassY = 240;

		treeX = 170;
		treeY = 150;
		trunkX = 180;
		trunkY = 200;

		sunX = 240;
		sunY = 0;
	}

	public void paint(Graphics g) {
		//hills
		g.setColor(new Color(69, 155, 18));
		g.fillOval(hill1X, hill1Y, 330, 130);
		g.setColor(Color.BLACK);
		g.drawOval(hill1X, hill1Y,330,130);
		g.setColor(new Color(69, 155, 18));
		g.fillOval(hill2X, hill2Y,330,400);
		g.setColor(Color.BLACK);
		g.drawOval(hill2X, hill2Y,330,400);
		//grass
		g.setColor(Color.GREEN);
		g.fillRect(grassX, grassY,300,60);
		//tree
		g.setColor(new Color(79, 72, 45));
		g.fillRect(trunkX, trunkY,20,40);
		g.setColor(new Color(66, 124, 32));
		g.fillOval(treeX, treeY,40,60);
		//sun
		g.setColor(Color.YELLOW);
		g.fillOval(sunX, sunY,60,60);
	}

	private class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {

		}
		public void mouseClicked(MouseEvent e) {
			
		}
		public void mouseReleased(MouseEvent e) {
			
		}
		public void mouseEntered(MouseEvent e) {
			
		}
		public void mouseExited(MouseEvent e) {
			
		}
	}

	private class MyMotionListener implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {

		}
		public void mouseMoved(MouseEvent e) {
			
		}
	}

	public static void main(String[] args) {
		new Parallax();
	}
}