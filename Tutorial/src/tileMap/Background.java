package tileMap;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import main.GamePanel;

/**
 * Does something I'll let you know when I figure it out
 * 
 * @author Jake Smithson
 *
 */
public class Background {
	
	private BufferedImage image;
	
	private double x;
	private double y;
	private double dx;
	private double dy;
	
	private double moveScale;
	
	public Background(String s, double ms) {
		
		try { 
			image = ImageIO.read(getClass().getResourceAsStream(s));
			moveScale = ms;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void setPosition(double x, double y) {
		this.x = (x * moveScale) % GamePanel.WIDTH;
		this.y = (y * moveScale) % GamePanel.HEIGHT;
		
	}
	
	public void setVector(double dx, double dy) {
		this.dx = dx;
		this.dy = dy;
	}
	
	public void update() {
		x += dx;
		y += dy;
	}
	
	/**
	 * Draws the background and ensures that there is no empty space
	 * caused by the side-scrolling
	 * @param g the Graphics object
	 */
	public void draw(Graphics2D g) {
		g.drawImage(image, (int)x, (int)y, null);
		if(x < 0) g.drawImage(image, (int) x + GamePanel.WIDTH, (int) y, null);
		if(x > 0) g.drawImage(image, (int) x - GamePanel.WIDTH, (int) y, null);
	}
}
