package path2glory.SimpleGame;
 

//import org.newdawn.slick.AppGameContainer;
//import org.newdawn.slick.BasicGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.Input;

import de.matthiasmann.twl.Button;




public class MainMenu extends BasicTWLGameState {

   // Image background = null;
    Image startGameOption = null;
    Image exitOption = null;


    @Override
    protected void createRootPane() {
        super.createRootPane();
        rootPane.setTheme("");

    }
    
    float startGameScale = 1;
    float exitScale = 1;
    
//-------------------------------------------
    int stateID = 0;
    //boolean lol = false;
    
    
    public MainMenu(int stateID ) 
    {
       this.stateID = stateID;
    }
 
    @Override
    public int getID() {
        return stateID;
    }
 	
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		// TODO Auto-generated method stub
        //background image for the menu
    	//background = new Image("data/menu.jpg");

	}

	@SuppressWarnings("unchecked")
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub
    	// render the background
    	//background.draw(0, 0);
    	
		
    	//load font file 
		
    	String fontPath = "data/Misc-Fixed.ttf";
    	UnicodeFont uFont = new UnicodeFont(fontPath , 15, false, false); 
    	uFont.addAsciiGlyphs();   
    	uFont.addGlyphs(400, 600);
    	uFont.getEffects().add(new ColorEffect(java.awt.Color.WHITE)); 
    	uFont.loadGlyphs();
    	 //write lol 
    	uFont.drawString(5, 80, "Linux Terminal");
    	uFont.drawString(5, 100, "Kernel Version: 2.6.25.18");
    	uFont.drawString(10, 140, "1. Intitialise Neural Network AI");
    	uFont.drawString(10, 160, "2. Select Parameter Options");
    	uFont.drawString(10, 180, "3. Exit & Poweroff");
    	uFont.drawString(5, 210, "Please Make Your Selection: ");
		//if ( lol == true ) {
			//uFont.drawString(5, 240, "LOOOOL");
		//}
		
	}

	
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		// TODO Auto-generated method stub
	    Input input = gc.getInput();	
	    
	    gc.setMinimumLogicUpdateInterval(100);
		

		 if(input.isKeyPressed(Input.KEY_1)){
			
	     sbg.enterState(SingularityProject.GAMEPLAYSTATE);
	     
        		 
		 }
		
		 if(input.isKeyPressed(Input.KEY_2)){
				
	     sbg.enterState(SingularityProject.OPTIONSTATE);
	           
		 }
		 
		 if(input.isKeyPressed(Input.KEY_3)){
				
			 gc.exit();
			 
		 }
		 
		 
		 
	}
	
	
	
 
/*
	public static void main(String[] args)
			throws SlickException
    {
         AppGameContainer app = 
			new AppGameContainer(new MainMenu());
 
         app.setDisplayMode(1024, 768, false);
         app.start();
    }
   */
}


	 