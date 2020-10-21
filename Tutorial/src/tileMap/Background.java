package tileMap;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

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
		} catch(Exception e) {
			
		}
		
	}
	
}
