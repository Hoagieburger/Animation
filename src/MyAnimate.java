import javax.swing.*;
import java.awt.*;

final public class MyAnimate {

    JFrame frame;
    DrawPanel drawPanel;
    
    private int screenWidth = 500;
    private int screenHeight = 500;

    //Stars Starting Locations (Y)
    private int oneY = ((int)(Math.random() * (screenHeight - 18) + 7)); 
    private int twoY = ((int)(Math.random() * (screenHeight - 18) + 7)); 
    private int threeY = ((int)(Math.random() * (screenHeight - 18) + 7));
    private int fourY = ((int)(Math.random() * (screenHeight - 18) + 7));
    private int fiveY = ((int)(Math.random() * (screenHeight - 18) + 7));
    private int sixY = ((int)(Math.random() * (screenHeight - 18) + 7));
    private int sevenY = ((int)(Math.random() * (screenHeight - 18) + 7));
    private int eightY = ((int)(Math.random() * (screenHeight - 18) + 7));
    private int nineY = ((int)(Math.random() * (screenHeight - 18) + 7));
    private int tenY = ((int)(Math.random() * (screenHeight - 18) + 7));
    private int elevenY = ((int)(Math.random() * (screenHeight - 18) + 7));
    private int twelveY = ((int)(Math.random() * (screenHeight - 18) + 7));
    private int thirteenY = ((int)(Math.random() * (screenHeight - 18) + 7));
    private int fourteenY = ((int)(Math.random() * (screenHeight - 18) + 7));
    private int fifteenY = ((int)(Math.random() * (screenHeight - 18) + 7));
    private int sixteenY = ((int)(Math.random() * (screenHeight - 18) + 7));
    private int seventeenY = ((int)(Math.random() * (screenHeight - 18) + 7));
    private int eighteenY = ((int)(Math.random() * (screenHeight - 18) + 7));
    private int nineteenY = ((int)(Math.random() * (screenHeight - 18) + 7));
    private int twentyY = ((int)(Math.random() * (screenHeight - 18) + 7));
    
  //Stars Starting Locations (X)
    private int oneX = ((int)(Math.random() * (screenWidth - 18) + 7)); 
    private int twoX = ((int)(Math.random() * (screenWidth - 18) + 7)); 
    private int threeX = ((int)(Math.random() * (screenWidth - 18) + 7));
    private int fourX = ((int)(Math.random() * (screenWidth - 18) + 7));
    private int fiveX = ((int)(Math.random() * (screenWidth - 18) + 7));
    private int sixX = ((int)(Math.random() * (screenWidth - 18) + 7));
    private int sevenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    private int eightX = ((int)(Math.random() * (screenWidth - 18) + 7));
    private int nineX = ((int)(Math.random() * (screenWidth - 18) + 7));
    private int tenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    private int elevenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    private int twelveX = ((int)(Math.random() * (screenWidth - 18) + 7));
    private int thirteenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    private int fourteenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    private int fifteenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    private int sixteenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    private int seventeenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    private int eighteenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    private int nineteenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    private int twentyX = ((int)(Math.random() * (screenWidth - 18) + 7));
    
    //Stars Speed
    private int oneSpeed = (int)(Math.random() * 5 + 1);
    private int twoSpeed = (int)(Math.random() * 5 + 1);
    private int threeSpeed = (int)(Math.random() * 5 + 1);
    private int fourSpeed = (int)(Math.random() * 5 + 1);
    private int fiveSpeed = (int)(Math.random() * 5 + 1);
    private int sixSpeed = (int)(Math.random() * 5 + 1);
    private int sevenSpeed = (int)(Math.random() * 5 + 1);
    private int eightSpeed = (int)(Math.random() * 5 + 1);
    private int nineSpeed = (int)(Math.random() * 5 + 1);
    private int tenSpeed = (int)(Math.random() * 5 + 1);
    private int elevenSpeed = (int)(Math.random() * 5 + 1);
    private int twelveSpeed = (int)(Math.random() * 5 + 1);
    private int thirteenSpeed = (int)(Math.random() * 5 + 1);
    private int fourteenSpeed = (int)(Math.random() * 5 + 1);
    private int fifteenSpeed = (int)(Math.random() * 5 + 1);
    private int sixteenSpeed = (int)(Math.random() * 5 + 1);
    private int seventeenSpeed = (int)(Math.random() * 5 + 1);
    private int eighteenSpeed = (int)(Math.random() * 5 + 1);
    private int nineteenSpeed = (int)(Math.random() * 5 + 1);
    private int twentySpeed = (int)(Math.random() * 5 + 1);
    
    //Tiefighter Starting Information
    private int tieY = 700;
    private int tieX = 200;
    
    //X-Wing Starting Location
    private int xWingY = 1200;
    private int xWingX = 0;
    
    //Laser Position
    private int laserY = tieY + 10;
    
    //X-Wing Laser Position
    private int xLaserY = xWingY + 40;
    
    private int dotSize = 4;

    boolean up = false;
    boolean down = true;
    boolean left = false;
    boolean right = true;

    public static void main(String[] args) {
        new MyAnimate().go();
    }
    
    public void setWidth(int w) {
    	screenWidth = w;
    }
    
    public void setHeight(int h) {
    	screenHeight = h;
    }

    private void go() {
        frame = new JFrame("Star Wars Dog Fight");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawPanel = new DrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setVisible(true);
        frame.setResizable(true);
        frame.setSize(screenWidth, screenHeight);
        frame.setLocation(0, 0);
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
            g.fillRect(oneX, oneY, dotSize, dotSize); 
            g.fillRect(twoX, twoY, dotSize, dotSize);
            g.fillRect(threeX, threeY, dotSize, dotSize);
            g.fillRect(fourX, fourY, dotSize, dotSize);
            g.fillRect(fiveX, fiveY, dotSize, dotSize);
            g.fillRect(sixX, sixY, dotSize, dotSize);
            g.fillRect(sevenX, sevenY, dotSize, dotSize);
            g.fillRect(eightX, eightY, dotSize, dotSize);
            g.fillRect(nineX, nineY, dotSize, dotSize);
            g.fillRect(tenX, tenY, dotSize, dotSize);
            g.fillRect(elevenX, elevenY, dotSize, dotSize);
            g.fillRect(twelveX, twelveY, dotSize, dotSize);
            g.fillRect(thirteenX, thirteenY, dotSize, dotSize);
            g.fillRect(fourteenX, fourteenY, dotSize, dotSize);
            g.fillRect(fifteenX, fifteenY, dotSize, dotSize);
            g.fillRect(sixteenX, sixteenY, dotSize, dotSize);
            g.fillRect(seventeenX, seventeenY, dotSize, dotSize);
            g.fillRect(eighteenX, eighteenY, dotSize, dotSize);
            g.fillRect(nineteenX, nineteenY, dotSize, dotSize);
            g.fillRect(twentyX, twentyY, dotSize, dotSize);

            //Tie Lasers
            g.setColor(Color.GREEN);
            g.fillRect(tieX + 28, laserY, 2, 50);
            g.fillRect(tieX + 70, laserY, 2, 50);
            
            //X-Wing Lasers
            g.setColor(Color.RED);
            g.fillRect(xWingX + 31, xLaserY, 2, 50);
            g.fillRect(xWingX + 447, xLaserY, 2, 50);
            
            //Tie Fighter
            g.setColor(Color.GRAY);
            g.fillOval(tieX, tieY, 100, 100);
            g.fillRect(tieX - 50, tieY + 40, 75, 25);
            g.fillRect(tieX + 75, tieY + 40, 75, 25);
            g.fillRect(tieX - 50, tieY - 25, 10, 150);
            g.fillRect(tieX + 140, tieY - 25, 10, 150);
            g.setColor(Color.BLACK);
            g.drawOval(tieX + 10, tieY + 10, 80, 80);
            g.fillRect(tieX + 35, tieY + 50, 10, 38);
            g.fillRect(tieX + 55, tieY + 50, 10, 38);
            g.fillRect(tieX + 15, tieY + 55, 10, 25);
            g.fillRect(tieX + 75, tieY + 55, 10, 25);
            g.drawRect(tieX - 5, tieY + 47, 10, 7);
            g.drawRect(tieX + 95, tieY + 47, 10, 7);
            g.fillRect(tieX - 21, tieY + 40, 2, 25);
            g.fillRect(tieX + 119, tieY + 40, 2, 25);
            g.setColor(Color.CYAN);
            g.fillOval(tieX + 30, tieY, 40, 10);
            
            //X-Wing
            g.setColor(new Color(234, 237, 192)); //X-Wing body color
            g.fillOval(xWingX + 225, xWingY - 50, 30, 100);
            g.fillRect(xWingX + 225, xWingY, 30, 70);
            g.fillRect(xWingX + 220, xWingY + 70, 40, 60);
            g.fillRect(xWingX + 215, xWingY + 110, 50, 25);
            g.fillRect(xWingX + 210, xWingY + 135, 60, 100);
            g.fillOval(xWingX + 210, xWingY + 225, 60, 20);
            g.fillRect(xWingX + 40, xWingY + 145, 170, 60); //Left wing main body
            g.fillRect(xWingX + 80, xWingY + 205, 130, 7);
            g.fillRect(xWingX + 120, xWingY + 212, 90, 7);
            g.fillRect(xWingX + 160, xWingY + 219, 50, 7);
            g.fillRect(xWingX + 270, xWingY + 145, 170, 60); //Right Wing main body
            g.fillRect(xWingX + 270, xWingY + 205, 130, 7);
            g.fillRect(xWingX + 270, xWingY + 212, 90, 7);
            g.fillRect(xWingX + 270, xWingY + 219, 50, 7);
            g.setColor(Color.BLACK); //Motor background
            g.drawRect(xWingX + 163, xWingY + 139, 47, 66);
            g.drawRect(xWingX + 181, xWingY + 204, 11, 41);
            g.drawRect(xWingX + 269, xWingY + 139, 47, 66);
            g.drawRect(xWingX + 287, xWingY + 204, 11, 41);
            g.setColor(new Color(234, 237, 192)); //Engines
            g.fillRect(xWingX + 164, xWingY + 140, 46, 65);
            g.fillRect(xWingX + 182, xWingY + 205, 10, 40);
            g.fillRect(xWingX + 270, xWingY + 140, 46, 65);
            g.fillRect(xWingX + 288, xWingY + 205, 10, 40);
            g.setColor(Color.BLACK);
            g.drawRect(xWingX + 23, xWingY + 124, 17, 91);
            g.drawRect(xWingX + 439, xWingY + 124, 17, 91);
            g.setColor(new Color(234, 237, 192)); // Weapons
            g.fillRect(xWingX + 24, xWingY + 125, 16, 90);
            g.fillRect(xWingX + 440, xWingY + 125, 16, 90);
            g.fillRect(xWingX + 30, xWingY + 35, 4, 185);
            g.fillRect(xWingX + 446, xWingY + 35, 4, 185);
            g.fillRect(xWingX + 26, xWingY + 40, 12, 4);
            g.fillRect(xWingX + 442, xWingY + 40, 12, 4);
            g.setColor(Color.BLACK);
            g.fillOval(xWingX + 225, xWingY + 65, 30, 65);
            g.drawRect(xWingX + 224, xWingY + 114, 31, 16);
            g.setColor(new Color(200, 200, 200));
            g.fillRect(xWingX + 225, xWingY + 115, 30, 15);
            g.setColor(Color.DARK_GRAY);
            g.fillOval(xWingX + 220, xWingY + 165, 40, 90);
            g.fillRect(xWingX + 182, xWingY + 218, 10, 2);
            g.fillRect(xWingX + 182, xWingY + 238, 10, 7);
            g.fillRect(xWingX + 288, xWingY + 218, 10, 2);
            g.fillRect(xWingX + 288, xWingY + 238, 10, 7);
            g.setColor(Color.YELLOW);            //Droid body
            g.fillOval(xWingX + 232, xWingY + 180, 16, 16);
            g.setColor(Color.BLACK);
            g.fillRect(xWingX + 238, xWingY + 188, 4, 8);
            g.setColor(new Color(62, 149, 249)); // BLUE
            g.fillRect(xWingX + 50, xWingY + 145, 50, 60); //Left Wing Color
            g.fillRect(xWingX + 80, xWingY + 205, 20, 7);
            g.fillRect(xWingX + 380, xWingY + 145, 50, 60); //Right Wing Color
            g.fillRect(xWingX + 380, xWingY + 205, 20, 7);
            g.fillRect(xWingX + 238, xWingY - 49, 4, 115); //Nose line
            g.setColor(new Color(45, 168, 26)); // GREEN
            g.fillRect(xWingX + 164, xWingY + 145, 46, 4); //Engine Lines
            g.fillRect(xWingX + 270, xWingY + 145, 46, 4);
            g.fillRect(xWingX + 50, xWingY + 145, 45, 40); //Left Wing Color
            g.fillRect(xWingX + 85, xWingY + 200, 5, 12);            
            g.fillRect(xWingX + 95, xWingY + 200, 5, 12);
            g.fillRect(xWingX + 105, xWingY + 200, 5, 12);
            g.fillRect(xWingX + 95, xWingY + 185, 15, 5);
            g.fillRect(xWingX + 385, xWingY + 145, 45, 40); //Right Wing Color
            g.fillRect(xWingX + 390, xWingY + 200, 5, 12);
            g.fillRect(xWingX + 380, xWingY + 200, 5, 12);
            g.fillRect(xWingX + 370, xWingY + 200, 5, 12);
            g.fillRect(xWingX + 370, xWingY + 185, 15, 5);
            g.fillRect(xWingX + 225, xWingY - 20, 5, 90);
            g.fillRect(xWingX + 250, xWingY - 20, 5, 90);
            
            setWidth(this.getWidth());
            setHeight(this.getHeight());
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
    	oneY += oneSpeed;
        twoY += twoSpeed;
        threeY += threeSpeed;
        fourY += fourSpeed;
        fiveY += fiveSpeed;
        sixY += sixSpeed;
        sevenY += sevenSpeed;
        eightY += eightSpeed;
        nineY += nineSpeed;
        tenY += tenSpeed;
        elevenY += elevenSpeed;
        twelveY += twelveSpeed;
        thirteenY += thirteenSpeed;
        fourteenY += fourteenSpeed;
        fifteenY += fifteenSpeed;
        sixteenY += sixteenSpeed;
        seventeenY += seventeenSpeed;
        eighteenY += eighteenSpeed;
        nineteenY += nineteenSpeed;
        twentyY += twentySpeed;
        
        //Tie Movement
        tieY -= 2;
        
        //Laser Movement
        if (tieY > screenHeight / 2 + 50) {
        	laserY -= 2;
        }else {
        	laserY -= 5;
        }
        
        //X-Wing Movement
        xWingY -= 2;
        
        //xLaser Movement
        if (xWingY > screenHeight / 2 - 50){
        	xLaserY -= 2;
        }else {
        	xLaserY -= 5;
        }
        
        if (xWingY < -500 || xWingY > screenHeight) { // X-Wing Reset
        	xWingY = tieY + 500;
        	xWingX = tieX - 200;
        	xLaserY = xWingY + 40;
        }
        
        if (tieY < -500) { // Tie Reset
        	tieY = screenHeight + 200;
        	tieX = screenWidth / 2 - 50;
        	laserY = screenHeight + 210;
        }
    }
    private void starReset() {
    	if (oneY >= screenHeight) {
    		oneY = 0;
    		oneX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		oneSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (twoY >= screenHeight) {
    		twoY = 0;
    		twoX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		twoSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (threeY >= screenHeight) {
    		threeY = 0;
    		threeX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		threeSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (fourY >= screenHeight) {
    		fourY = 0;
    		fourX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		fourSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (fiveY >= screenHeight) {
    		fiveY = 0;
    		fiveX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		fiveSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (sixY >= screenHeight) {
    		sixY = 0;
    		sixX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		sixSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (sevenY >= screenHeight) {
    		sevenY = 0;
    		sevenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		sevenSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (eightY >= screenHeight) {
    		eightY = 0;
    		eightX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		eightSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (nineY >= screenHeight) {
    		nineY = 0;
    		nineX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		nineSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (tenY >= screenHeight) {
    		tenY = 0;
    		tenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		tenSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (elevenY >= screenHeight) {
    		elevenY = 0;
    		elevenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		elevenSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (twelveY >= screenHeight) {
    		twelveY = 0;
    		twelveX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		twelveSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (thirteenY >= screenHeight) {
    		thirteenY = 0;
    		thirteenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		thirteenSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (fourteenY >= screenHeight) {
    		fourteenY = 0;
    		fourteenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		fourteenSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (fifteenY >= screenHeight) {
    		fifteenY = 0;
    		fifteenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		fifteenSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (sixteenY >= screenHeight) {
    		sixteenY = 0;
    		sixteenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		sixteenSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (seventeenY >= screenHeight) {
    		seventeenY = 0;
    		seventeenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		seventeenSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (eighteenY >= screenHeight) {
    		eighteenY = 0;
    		eighteenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		eighteenSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (nineteenY >= screenHeight) {
    		nineteenY = 0;
    		nineteenX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		nineteenSpeed = (int)(Math.random() * 5 + 1);
    	}
    	if (twentyY >= screenHeight) {
    		twentyY = 0;
    		twentyX = ((int)(Math.random() * (screenWidth - 18) + 7));
    		twentySpeed = (int)(Math.random() * 5 + 1);
    	}
    }
}