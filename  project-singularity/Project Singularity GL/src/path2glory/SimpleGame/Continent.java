package path2glory.SimpleGame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
//new list
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.layout.FillLayout;
//import org.eclipse.swt.widgets.Display;
//import org.eclipse.swt.widgets.List;
//import org.eclipse.swt.widgets.Shell;




public class Continent  extends BasicGameState{

	
	public static int xrem;
	public static int yrem;  

	//-------------------------------------------
	  int stateID = 4;
	  boolean qcode= false;
	  boolean a = true;
	  //------------------
	  static Connection conn;
	  String  prnt;
	  String prnt2;
	  Integer choice;
	  //---------------------
	  
	  
	  // Strings to use as list items
	  //private static final String[] ITEMS = { "A", "B", "C", "D" };
	  

	  
	  public Continent(int stateID ) 
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
			System.out.println("enter conti Dmz =" + Gameplay.dmz);
			

	//	-------------

}
				 

		@SuppressWarnings("unchecked")
		public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
				throws SlickException {
			// TODO Auto-generated method stub
			
			if (qcode == true){
			    String driver = "org.apache.derby.jdbc.EmbeddedDriver";
			    String connectionURL = "jdbc:derby:myDB";
			    
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
			        // Statement stmt3 = conn.createStatement(); 
			       
			        
			        ResultSet rs = stmt2.executeQuery("select LOCNAME from LOCATIONS where LOCID=" +choice);
			        //int num = 0;
			      
			        
			        
			        while (rs.next()) {
			          System.out.println("Text " + rs.getString(1));
			          prnt = (rs.getString(1));
			        }
			        rs.close();

			        qcode = false;
			      } catch (Exception e) {
			        e.printStackTrace();
			      }
			      
			      //lol
			      
			      if (a == true){

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
					        // Statement stmt3 = conn.createStatement();
					       
					        
					        ResultSet rs = stmt2.executeQuery("");
					        //int num = 0;
					      
					        
					        
					        while (rs.next()) {
					          System.out.println("Text2 " + rs.getString(1));
					          prnt2 = (rs.getString(1));
					        }
					        rs.close();

					 
					      } catch (Exception e) {
					        e.printStackTrace();
					      }
			      
			      
			      }
			      
			}
			
			
			
			
	    	String fontPath = "data/Misc-Fixed.ttf";
	    	UnicodeFont uFont = new UnicodeFont(fontPath , 19, false, false); 
	    	uFont.addAsciiGlyphs();   
	    	uFont.addGlyphs(400, 600);
	    	uFont.getEffects().add(new ColorEffect(java.awt.Color.WHITE)); 
	    	uFont.loadGlyphs();
	    	 //lol messages
	    	uFont.drawString(5, 80, "press f1 to go back " );
	    	uFont.drawString(5, 155, "query result test : " +prnt);
	    	uFont.drawString(5, 300, "query result test for  : " +prnt2);

		}
	 
		
		
		@Override
		public void update(GameContainer gc, StateBasedGame sbg, int delta)
				throws SlickException {
			// TODO Auto-generated method stub
//-------
			if (Gameplay.dmz != 0){
				
				qcode = true;
				choice = Gameplay.dmz;
				Gameplay.dmz = 0;	
			}
			//----------
			
		    Input input = gc.getInput();	
 		  	   
		      if(input.isKeyPressed(Input.KEY_F1)){
				
			    sbg.enterState(SingularityProject.GAMEPLAYSTATE);
	            // lol = true;
			      
			    
			 }
			    
			    
			 }
			 

			 
			
		}

	


