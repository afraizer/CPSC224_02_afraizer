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

	private int lineX1;
	private int lineX2;
	private int lineX3;
	private int lineX4;
	private int lineX5;
	private int lineY1;
	private int lineY2;
	private int lineY3;

	private boolean isMouseInFrame;

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

		lineX1 = 210;
		lineX2 = 220;
		lineX3 = 270;
		lineX4 = 320;
		lineX5 = 330;
		lineY1 = -30;
		lineY2 = 30;
		lineY3 = 90;

		isMouseInFrame = false;
	}

	public void paint(Graphics g) {
		
		super.paint(g);
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
		if(isMouseInFrame) {
			g.setColor(Color.YELLOW);

			g.drawLine(lineX2, lineY1, lineX4, lineY3);
			g.drawLine(lineX4, lineY1, lineX2, lineY3);
			g.drawLine(lineX3, lineY1, lineX3, lineY3);
			g.drawLine(lineX1, lineY2, lineX5, lineY2);
		}
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
			isMouseInFrame = true;
		}
		public void mouseExited(MouseEvent e) {
			isMouseInFrame = false;
			repaint();
		}
	}

	private class MyMotionListener implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {
			
			
		}
		public void mouseMoved(MouseEvent e) {
			
			//double moveFactor1 = (int) e.getX() + 3;
			//double moveFactor2 = (int) e.getX() + 2;
			//double moveFactor3 = (int) e.getX() + 1;

			//double moveFactor1Y = (int) e.getY() * .4;
			//double moveFactor2Y = (int) e.getY() * .2;
			//double moveFactor3Y = (int) e.getY() * .05;

			int moveFactor1 = 3;
			int moveFactor2 = 2;
			int moveFactor3 = 1;	

			if(e.getX() < 150 && e.getY() < 150) {
				hill1X -= moveFactor2;
				hill1Y -= moveFactor2;
				hill2X -= moveFactor2;
				hill2Y -= moveFactor2;

				grassX -= moveFactor1;
				grassY -= moveFactor1;

				trunkX -= moveFactor1;
				trunkY -= moveFactor1;
				treeX -= moveFactor1;
				treeY -= moveFactor1;

				sunX -= moveFactor3;
				sunY -= moveFactor3;
				lineX1 -= moveFactor3;
				lineX2 -= moveFactor3;
				lineX3 -= moveFactor3;
				lineX4 -= moveFactor3;
				lineX5 -= moveFactor3;
				lineY1 -= moveFactor3;
				lineY2 -= moveFactor3;
				lineY3 -= moveFactor3;
			} else if(e.getX() < 150 && e.getY() > 150) {
				hill1X -= moveFactor2;
				hill1Y += moveFactor2;
				hill2X -= moveFactor2;
				hill2Y += moveFactor2;

				grassX -= moveFactor1;
				grassY += moveFactor1;

				trunkX -= moveFactor1;
				trunkY += moveFactor1;
				treeX -= moveFactor1;
				treeY += moveFactor1;

				sunX -= moveFactor3;
				sunY += moveFactor3;
				lineX1 -= moveFactor3;
				lineX2 -= moveFactor3;
				lineX3 -= moveFactor3;
				lineX4 -= moveFactor3;
				lineX5 -= moveFactor3;
				lineY1 += moveFactor3;
				lineY2 += moveFactor3;
				lineY3 += moveFactor3;
			} else if(e.getX() > 150 && e.getY() < 150) {
				hill1X += moveFactor2;
				hill1Y -= moveFactor2;
				hill2X += moveFactor2;
				hill2Y -= moveFactor2;

				grassX += moveFactor1;
				grassY -= moveFactor1;

				trunkX += moveFactor1;
				trunkY -= moveFactor1;
				treeX += moveFactor1;
				treeY -= moveFactor1;

				sunX += moveFactor3;
				sunY -= moveFactor3;
				lineX1 += moveFactor3;
				lineX2 += moveFactor3;
				lineX3 += moveFactor3;
				lineX4 += moveFactor3;
				lineX5 += moveFactor3;
				lineY1 -= moveFactor3;
				lineY2 -= moveFactor3;
				lineY3 -= moveFactor3;
			} else {
				hill1X += moveFactor2;
				hill1Y += moveFactor2;
				hill2X += moveFactor2;
				hill2Y += moveFactor2;

				grassX += moveFactor1;
				grassY += moveFactor1;

				trunkX += moveFactor1;
				trunkY += moveFactor1;
				treeX += moveFactor1;
				treeY += moveFactor1;

				sunX += moveFactor3;
				sunY += moveFactor3;
				lineX1 += moveFactor3;
				lineX2 += moveFactor3;
				lineX3 += moveFactor3;
				lineX4 += moveFactor3;
				lineX5 += moveFactor3;
				lineY1 += moveFactor3;
				lineY2 += moveFactor3;
				lineY3 += moveFactor3;
			}
			repaint();
			
		}
	}

	public static void main(String[] args) {
		new Parallax();
	}
}
