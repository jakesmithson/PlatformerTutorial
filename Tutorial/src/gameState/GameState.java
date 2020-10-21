package gameState;

/**
 * Defines common methods between game states
 * 
 * @author Jake Smithson
 *
 */
public abstract class GameState {
	
	/** Reference to the GSM, all states have to have this */
	protected GameStateManager gsm;
	
	/**
	 * Initializes all the variables for the state
	 */
	public abstract void init();
	
	/**
	 * Updates all the variables for the state
	 */
	public abstract void update();
	
	/**
	 * Draws to the panel
	 * @param g the Graphics object to be drawn
	 */
	public abstract void draw(java.awt.Graphics2D g);
	
	/**
	 * Performs an action when a key is pressed
	 * @param k the key code of the key pressed
	 */
	public abstract void keyPressed(int k);
	
	/**
	 * Performs an action when a key is released
	 * @param k the key code of the key pressed
	 */
	public abstract void keyReleased(int k);
	
}
