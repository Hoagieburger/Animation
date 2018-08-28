import javax.swing.*;
import java.awt.*;

final public class MyAnimate {

    JFrame frame;
    DrawPanel drawPanel;

    //Stars Starting Locations (Y)
    private int oneY = 251; 
    private int twoY = 338; 
    private int threeY = 42;
    private int fourY = 233;
    private int fiveY = 351;
    private int sixY = 243;
    private int sevenY = 390;
    private int eightY = 228;
    private int nineY = 459;
    private int tenY = 96;
    private int elevenY = 300;
    private int twelveY = 101;
    private int thirteenY = 255;
    private int fourteenY = 161;
    private int fifteenY = 336;
    private int sixteenY = 239;
    private int seventeenY = 256;
    private int eighteenY = 95;
    private int nineteenY = 402;
    private int twentyY = 74;
    
    //Tiefighter Starting Location
    private int tieY = 700;
    
    //Laser Position
    private int laserY = tieY + 10;
    
    private int dotSize = 4;
    private int screenWidth = 500;
    private int screenHeight = 500;

    boolean up = false;
    boolean down = true;
    boolean left = false;
    boolean right = true;

    public static void main(String[] args) {
        new MyAnimate().go();
    }

    private void go() {
        frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawPanel = new DrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(screenWidth, screenHeight);
        frame.setLocation(375, 55);
        moveDot();
    }

    class DrawPanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = -3030379568821478211L;
		
		public void paintComponent(Graphics g) {
        	//White Border
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            //Gray Border
            g.setColor(Color.GRAY);
            g.fillRect(3, 3, this.getWidth()-6, this.getHeight()-6);
            //Background Color
            g.setColor(Color.BLACK);
            g.fillRect(6, 6, this.getWidth()-12, this.getHeight()-12);
            
            //Stars
            g.setColor(Color.WHITE);
            g.fillRect(79, oneY, dotSize, dotSize); 
            g.fillRect(107, twoY, dotSize, dotSize);
            g.fillRect(16, threeY, dotSize, dotSize);
            g.fillRect(139, fourY, dotSize, dotSize);
            g.fillRect(368, fiveY, dotSize, dotSize);
            g.fillRect(251, sixY, dotSize, dotSize);
            g.fillRect(324, sevenY, dotSize, dotSize);
            g.fillRect(194, eightY, dotSize, dotSize);
            g.fillRect(350, nineY, dotSize, dotSize);
            g.fillRect(403, tenY, dotSize, dotSize);
            g.fillRect(261, elevenY, dotSize, dotSize);
            g.fillRect(229, twelveY, dotSize, dotSize);
            g.fillRect(23, thirteenY, dotSize, dotSize);
            g.fillRect(177, fourteenY, dotSize, dotSize);
            g.fillRect(325, fifteenY, dotSize, dotSize);
            g.fillRect(357, sixteenY, dotSize, dotSize);
            g.fillRect(271, seventeenY, dotSize, dotSize);
            g.fillRect(343, eighteenY, dotSize, dotSize);
            g.fillRect(475, nineteenY, dotSize, dotSize);
            g.fillRect(28, twentyY, dotSize, dotSize);

            //Tie Lasers
            g.setColor(Color.GREEN);
            g.fillRect(228, laserY, 2, 50);
            g.fillRect(270, laserY, 2, 50);
            
            //Tie Fighter
            g.setColor(Color.GRAY);
            g.fillOval(200, tieY, 100, 100);
            g.fillRect(150, tieY + 40, 75, 25);
            g.fillRect(275, tieY + 40, 75, 25);
            g.fillRect(150, tieY - 25, 10, 150);
            g.fillRect(340, tieY - 25, 10, 150);
            g.setColor(Color.BLACK);
            g.drawOval(210, tieY + 10, 80, 80);
            g.fillRect(235, tieY + 50, 10, 38);
            g.fillRect(255, tieY + 50, 10, 38);
            g.fillRect(215, tieY + 55, 10, 25);
            g.fillRect(275, tieY + 55, 10, 25);
            g.drawRect(195, tieY + 47, 10, 7);
            g.drawRect(295, tieY + 47, 10, 7);
            g.fillRect(179, tieY + 40, 2, 25);
            g.fillRect(319, tieY + 40, 2, 25);
            g.setColor(Color.CYAN);
            g.fillOval(230, tieY, 40, 10);
            
            //X-Wing
            g.setColor(new Color(234, 237, 192)); //X-Wing body color
            g.fillOval(225, 150, 30, 100);
            g.fillRect(225, 200, 30, 70);
            g.fillRect(220, 270, 40, 60);
            g.fillRect(215, 310, 50, 25);
            g.fillRect(210, 335, 60, 100);
            g.fillOval(210, 425, 60, 20);
            g.fillRect(40, 345, 170, 60);
            g.fillRect(80, 405, 130, 7);
            g.fillRect(120, 412, 90, 7);
            g.fillRect(160, 419, 50, 7);
            g.fillRect(270, 345, 170, 60);
            g.fillRect(270, 405, 130, 7);
            g.fillRect(270, 412, 90, 7);
            g.fillRect(270, 419, 50, 7);
            
            
            
        }
    }

    private void moveDot() {
        while(true){
            moveLoc();
            starReset();
            try{
                Thread.sleep(10);
            } catch (Exception exc){}
            frame.repaint();
        }
    }
    private void moveLoc(){
        //Star Movement
    	oneY += 4;
        twoY++;
        threeY++;
        fourY += 3;
        fiveY++;
        sixY++;
        sevenY++;
        eightY += 3;
        nineY += 2;
        tenY++;
        elevenY += 2;
        twelveY++;
        thirteenY += 3;
        fourteenY += 2;
        fifteenY++;
        sixteenY++;
        seventeenY++;
        eighteenY++;
        nineteenY += 4;
        twentyY += 2;
        
        //Tie Movement
        //tieY -= 2;
        
        //Laser Movement
        if (tieY > 300) {
        	laserY -= 2;
        }else {
        	laserY -= 5;
        }
    }
    private void starReset() {
    	if (oneY >= 500) {
    		oneY = 0;
    	}
    	if (twoY >= 500) {
    		twoY = 0;
    	}
    	if (threeY >= 500) {
    		threeY = 0;
    	}
    	if (fourY >= 500) {
    		fourY = 0;
    	}
    	if (fiveY >= 500) {
    		fiveY = 0;
    	}
    	if (sixY >= 500) {
    		sixY = 0;
    	}
    	if (sevenY >= 500) {
    		eightY = 0;
    	}
    	if (nineY >= 500) {
    		nineY = 0;
    	}
    	if (tenY >= 500) {
    		tenY = 0;
    	}
    	if (elevenY >= 500) {
    		elevenY = 0;
    	}
    	if (twelveY >= 500) {
    		twelveY = 0;
    	}
    	if (thirteenY >= 500) {
    		thirteenY = 0;
    	}
    	if (fourteenY >= 500) {
    		fourteenY = 0;
    	}
    	if (fifteenY >= 500) {
    		fifteenY = 0;
    	}
    	if (sixteenY >= 500) {
    		sixteenY = 0;
    	}
    	if (seventeenY >= 500) {
    		seventeenY = 0;
    	}
    	if (eighteenY >= 500) {
    		eighteenY = 0;
    	}
    	if (nineteenY >= 500) {
    		nineteenY = 0;
    	}
    	if (twentyY >= 500) {
    		twentyY = 0;
    	}
    }
}