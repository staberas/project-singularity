

package path2glory.SimpleGame;


import java.awt.Checkbox;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.Input;

 
//import java.io.*;



public class Knowledges extends BasicGameState{
	 
	  static Connection conn;
	  String  prnt;
	  Integer choice;
	  boolean sqlboolean;
	  boolean main = true;
	  boolean tech = false;
	  
	  
public static int xrem;
public static int yrem; 


//------------------------------------------- temp change state id to 3
  int stateID = 3;
  int fy = 10;
  
  
  public Knowledges(int stateID ) 
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
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub

		
		
		
	  	//load font file 
		
	  	String fontPath = "data/Misc-Fixed.ttf";
	  	UnicodeFont uFont = new UnicodeFont(fontPath , 15, false, false); 
	  	uFont.addAsciiGlyphs();   
	 	uFont.addGlyphs(400, 600);
	  	uFont.getEffects().add(new ColorEffect(java.awt.Color.WHITE)); 
	  	uFont.loadGlyphs();
		
	  	
	  	if (main==true){
	  	uFont.drawString(5, 155, "1. Tech (To programma mporei na kolisi sto query give it time)");
	  	
	  	}
	  	
	  	if (tech == true){
	  		
	  		uFont.drawString(5, 155, "1. PC ");
	  		uFont.drawString(5, 250, "2. Gaming Pc");
	  	}
		          
		      //    uFont.drawString(101, 100, "HELP");
	
  	 //write 
  //	uFont.drawString(5, 155, "Enter Selection : ");
  	uFont.drawString(5, 205, "To return to the game, Press F1.");
  //	uFont.drawString(5, 255, "To return to the game, Press 2. " + doc.getDocumentElement().getNodeName());


		

    
    String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    String connectionURL = "jdbc:derby:myDB";
    
    if (sqlboolean == true){
    
    try {
        Class.forName(driver);
      } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
      }
      try {
        conn = DriverManager.getConnection(connectionURL);
        //Statement stmt = conn.createStatement();
        //stmt.executeUpdate(createString);


        Statement stmt2 = conn.createStatement();
        ResultSet rs = stmt2.executeQuery("select gtext from technology where id=" +choice);
        //int num = 0;
        while (rs.next()) {
          System.out.println("Text" + rs.getString(1));
          prnt = (rs.getString(1));
        }
        rs.close();
        sqlboolean=false;
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
	    
	      uFont.drawString(401, 400, "HELP : " + prnt);

    

		
}
	
	
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		// TODO Auto-generated method stub

		//Input
		Input input = gc.getInput();	
  	  		  	   
	      if(input.isKeyPressed(Input.KEY_F1)){
			
		    sbg.enterState(SingularityProject.GAMEPLAYSTATE);
            // lol = true;
		 }
	      
	      if(input.isKeyPressed(Input.KEY_0)){
	    	  if (tech == true) {
	    	  tech=false;
	    	  main=true;
	    	  }
	    	  //if (){
	    	  
	    	 // }
	    		  
			 }


	      if(input.isKeyPressed(Input.KEY_1)){
	    	 
	    	  if (tech == true) {
					sqlboolean = true;
		    	  	choice = 1;
		    	  }
	    	 
	    	  if (main == true) {
	    	    tech = true;
	    	    main = false;
	    	  }

			 }

	      if(input.isKeyPressed(Input.KEY_2)){
				sqlboolean = true;
	    	  	choice = 2;
			 }

	      if(input.isKeyPressed(Input.KEY_3)){
				sqlboolean = true;
	    	  	choice = 3;
			 }

	      if(input.isKeyPressed(Input.KEY_4)){
				sqlboolean = true;
	    	  	choice = 4;
			 }

	      if(input.isKeyPressed(Input.KEY_5)){
				sqlboolean = true;
	    	  	choice = 5;
			 }
		
	}
   


}

