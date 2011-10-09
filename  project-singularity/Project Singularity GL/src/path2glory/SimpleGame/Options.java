package path2glory.SimpleGame;


import java.io.BufferedWriter;
import java.io.FileWriter;
//import java.io.IOException;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.Input;
//import java.io.*;

public class Options extends BasicTWLGameState{


public static int xrem;
public static int yrem;  

//-------------------------------------------
  int stateID = 2;

  
  
  public Options(int stateID ) 
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

	@SuppressWarnings("unchecked")
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub
  	// render the background

  	
		
  	//load font file 
		
  	String fontPath = "data/Misc-Fixed.ttf";
  	UnicodeFont uFont = new UnicodeFont(fontPath , 15, false, false); 
  	uFont.addAsciiGlyphs();   
  	uFont.addGlyphs(400, 600);
  	uFont.getEffects().add(new ColorEffect(java.awt.Color.WHITE)); 
  	uFont.loadGlyphs();
  	 //write 
  	uFont.drawString(5, 80, "To Change Resolution");
  	uFont.drawString(5, 95, " A. 800 x 600");
  	uFont.drawString(5, 105, " B. 1024 x 768");
  	uFont.drawString(5, 155, "Enter Selection : ");
  	uFont.drawString(5, 205, "To return to the menu Press 1.");
	}

	
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		// TODO Auto-generated method stub
	    Input input = gc.getInput();	
  	  

  	  
	     if(input.isKeyPressed(Input.KEY_A)){
			
		     xrem = 800;
		     yrem = 600;

		        try {
		  	    // Create file 
		  	    FileWriter fstream = new FileWriter("data/resource.txt");
		  	        BufferedWriter out = new BufferedWriter(fstream);
		  	    out.write(""+xrem);
		  	    out.write(""+yrem);
		  	    //Close the output stream
		  	  	out.close();
		        }
		        catch (Exception e){//Catch exception if any
		            System.err.println("Error: " + e.getMessage());
		          }

		  	   
	     }

		 if(input.isKeyPressed(Input.KEY_1)){
			
		    sbg.enterState(SingularityProject.MAINMENUSTATE);
            // lol = true;
		 }
		 

		 
		
	}

}


	 