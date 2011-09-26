package path2glory.SimpleGame;


import org.newdawn.slick.Input;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;



 
//import java.io.*;


public class Niftygui extends BasicGameState{


public static int xrem;
public static int yrem;  

//-------------------------------------------
  int stateID = 7;
  int y = 10;
  

  
  public Niftygui(int stateID ) 
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

		
	}
			 
		

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub

	  //	String fontPath = "data/Misc-Fixed.ttf";
	 // 	UnicodeFont uFont = new UnicodeFont(fontPath , 15, false, false); 
	  //	uFont.addAsciiGlyphs();   
	  //	uFont.addGlyphs(400, 600);
	  //	uFont.getEffects().add(new ColorEffect(java.awt.Color.WHITE)); 
	  //	uFont.loadGlyphs();
	//		uFont.drawString(5, 155, "Enter Selection : ");
	  	
	}
 
	
	
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		// TODO Auto-generated method stub
	    Input input = gc.getInput();	
  	  		  	   
	      if(input.isKeyPressed(Input.KEY_1)){
			
		    sbg.enterState(SingularityProject.GAMEPLAYSTATE);
            // lol = true;
		    
	

		    
		    
		 }
		 

		 
		
	}

}


