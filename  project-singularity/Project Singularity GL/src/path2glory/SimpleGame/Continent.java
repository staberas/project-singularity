package path2glory.SimpleGame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import org.newdawn.slick.Color;
import org.newdawn.slick.ShapeFill;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;
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
	  String prnt;
	  String prnt2;
	  String prnt3;
	  String prnt4;
	  String sd[]  = new String[4];  
	  String andname = " and NAME= ";
	  Integer choice;
	  Integer n = 0;
	  Integer v[] = new Integer[4];
	  Integer x[] = new Integer[4];
	  Integer i = 0;
	  //---------------------
	  boolean lightblue=false;
	  boolean lightblue1=false;
	  boolean lightblue2=false;
	  boolean lightblue3=false;
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
			      
			      //bases
			      
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
					       
					        
					        ResultSet rs = stmt2.executeQuery("select NAME from BASES where LOCID=" +choice);
					        //int num = 0;
					      
					        
					        
					        while (rs.next()) {
					          System.out.println("Text2 " + rs.getString(1));
					          prnt2 = (rs.getString(1));
					          sd[n++] = prnt2;
					           if (n == 3 ) {
					        	   n=0;
					        	   
					           }
					          System.out.println("sd[0] " +sd[0]);
					          System.out.println("sd[1] " +sd[1]);
					        }
					        rs.close();

					 
					      } catch (Exception e) {
					        e.printStackTrace();
					      }
			      
			      
			      }
			      // queries status & state -------------------------------------
			      			
			      for(i=0; i<4; i++){
				    		  System.out.println("Status" +i);
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
				       
				        String sdalias = sd[i]; 
				        ResultSet rs = stmt2.executeQuery("select STATUS from BASES where LOCID=" +choice +"and NAME= '" +sdalias +"'");
				        //int num = 0; prnt2
				      
				         //  if (i == 3 ) {
				       	//   i=0;
				        	   
				        //   }
				        
				        while (rs.next()) {
				          System.out.println("Text3 " + rs.getString(1));
				          prnt3 = (rs.getString(1));
				          int status = Integer.parseInt(prnt3);
				          System.out.println(status);
				          v[i]=status;
				         
				        }
				        rs.close();

				    	  
				    	 
				      } catch (Exception e) {
				        e.printStackTrace();
				      }
		      
			      }
			      
			      for(i=0; i<4; i++){
		    		  System.out.println("State#" +i);
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
					       
					        String sdalias = sd[i]; 
					        ResultSet rs = stmt2.executeQuery("select STATE from BASES where LOCID=" +choice +"and NAME= '" +sdalias +"'");
					        //int num = 0;
					      
					        
					        
					        while (rs.next()) {
					          System.out.println("Text4 " + rs.getString(1));
					          prnt4 = (rs.getString(1));
					          
					         int state = Integer.parseInt(prnt4);
					         x[i]=state;
					        }
					        rs.close();

					 
					      } catch (Exception e) {
					        e.printStackTrace();
					      }
			      
			      }
			      
			      
			      
			      
			      
			      
			}
			//
			
		    //colors
			Color green = new Color(0,255,0);
			Color red = new Color(255,0,0);
	        Color light_blue = new Color(150,150,255);	
	        //shapes
		    Shape redf = new Rectangle(100,100,200,300);
		    g.draw(redf);
		    //shapes ui		    
		    g.setColor(Color.white);
		    g.drawRect(680, 78, 550, 20); 
		    g.setColor(Color.blue); 
		    if(lightblue==true){
			    g.setColor(light_blue);			    
		    }
		    g.fillRect(681, 79, 549, 19);   
		    
		    g.setColor(Color.white);
		    g.drawRect(680, 98, 550, 20);
		    g.setColor(Color.blue);
		    if(lightblue1==true){
			    g.setColor(light_blue);			    
		    }
		    g.fillRect(681, 99, 549, 19); 
		   	 	    
		    g.setColor(Color.white);
		    g.drawRect(680, 118, 550, 20);
	        g.setColor(Color.blue);
		    if(lightblue2==true){
			    g.setColor(light_blue);			    
		    }
		    g.fillRect(681, 119, 549, 19); 		    		    
		    
		    g.setColor(Color.white);
		    g.drawRect(680, 138, 550, 20);
		    g.setColor(Color.blue);
		    if(lightblue3==true){
			    g.setColor(light_blue);			    
		    }
		    g.fillRect(681, 139, 549, 19);
		   
			//Rectangle(100,100,200,300);
		
	    	String fontPath = "data/Misc-Fixed.ttf";
	    	UnicodeFont uFont = new UnicodeFont(fontPath , 19, false, false); 
	    	uFont.addAsciiGlyphs();   
	    	uFont.addGlyphs(400, 600);
	    	uFont.getEffects().add(new ColorEffect(java.awt.Color.WHITE)); 
	    	uFont.loadGlyphs();
	    	 //lol messages
	    	uFont.drawString(90, 8, "press f1 to go back " );
	    	//AREA
	    	uFont.drawString(870, 50, "" +prnt);
	    	//uFont.drawString(5, 300, "BASES  : " +prnt2);

	    	
	    	if(sd[0]!=null){ 
	    	  uFont.drawString(690, 80, " " +sd[0]);
	    	  //Complete or In Progress notice UI
	    	  if(v[0]==1){
		    		uFont.drawString(900, 80, "Complete");
		      }
	    	  if(v[0]==0){
	    		    uFont.drawString(900, 80, "In Progress");
	    	  }
	    	  if(x[0]==1){
		    		uFont.drawString(1120, 80, "Active",Color.green);	
		      }
	    	  if(x[0]==0){
	    		    uFont.drawString(1120, 80, "Sleep",Color.red);
	    	  }
	    	}
	    	
	    	if(sd[1]!=null){ 
	    	 uFont.drawString(690, 100, " " +sd[1]);

	    	if(v[1]==1){
		    		uFont.drawString(900, 100, "Complete");
		      }
	    	  if(v[1]==0){
	    		    uFont.drawString(900, 100, "In Progress");
	    	  }
	    	  if(x[1]==1){
		    		uFont.drawString(1120, 100, "Active",Color.green);
		      }
	    	  if(x[1]==0){
	    		    uFont.drawString(1120, 100, "Sleep",Color.red);
	    	  }
		}	
	    	
	    	
	    	if(sd[2]!=null){
	    	 uFont.drawString(690, 120, " " +sd[2]);
	    	  if(v[2]==1){
		    		uFont.drawString(900, 120, "Complete");
		      }
	    	  if(v[2]==0){
	    		    uFont.drawString(900, 120, "In Progress");
	    	  }
	    	  if(x[2]==1){
		    		uFont.drawString(1120, 120, "Active",Color.green);
		      }
	    	  if(x[2]==0){
	    		    uFont.drawString(1120, 120, "Sleep",Color.red);
	    	  }
		}
	    	if(sd[3]!=null){
	    	 uFont.drawString(690, 140, " " +sd[3]);
	    	  if(v[3]==1){
		    		uFont.drawString(900, 140, "Complete");
		      }
	    	  if(v[3]==0){
	    		    uFont.drawString(900, 140, "In Progress");
	    	  }
	    	  if(x[3]==1){
		    		uFont.drawString(1120, 140, "Active",Color.green);
		      }
	    	  if(x[3]==0){
	    		    uFont.drawString(1120, 140, "Sleep",Color.red);
	    	  }
	    	}
	    }
	 
		
		
		@Override
		public void update(GameContainer gc, StateBasedGame sbg, int delta)
				throws SlickException {
			// TODO Auto-generated method stub
			
		    Input input = gc.getInput();	
		    int mouseX = input.getMouseX();
		    int mouseY = input.getMouseY();
						
            //-------------------
			if (Gameplay.dmz != 0){
				
				qcode = true;
				choice = Gameplay.dmz;
				Gameplay.dmz = 0;	
			}
			//----------
			
			if(input.isKeyPressed(Input.KEY_F2)){
				System.out.println("Mouse X & Y  " +mouseX +"  "+mouseY);
			}
		      if(input.isKeyPressed(Input.KEY_F1)){
				sd[0]=null;
				sd[1]=null;
				sd[2]=null;
				sd[3]=null;
			    sbg.enterState(SingularityProject.GAMEPLAYSTATE);
	            // lol = true;  
			 }
			
		     
		        //box1 UI
		        if( ( mouseX >=680  && mouseX <=1227  ) &&
		                ( mouseY >=79  && mouseY <=98 ))
		            {
		        	lightblue=true;		        	      	
		            }
		        else{
		        	lightblue=false;	
		        }
		        	//box2 UI
		        if( ( mouseX >=680  && mouseX <=1227  ) &&
		                ( mouseY >=100  && mouseY <=119 ))
		            {
		        	lightblue1=true;		        	      	
		            }
		        else{
		        	lightblue1=false;	
		        }
		         
		        //box3 UI
		        if( ( mouseX >=680  && mouseX <=1227  ) &&
		                ( mouseY >=120  && mouseY <=139 ))
		            {
		        	lightblue2=true;		        	      	
		            }
		        else{
		        	lightblue2=false;	
		        }
		        
		        //box4 UI
		        if( ( mouseX >=680  && mouseX <=1227  ) &&
		                ( mouseY >=139  && mouseY <=159 ))
		            {
		        	lightblue3=true;		        	      	
		            }
		        else{
		        	lightblue3=false;	
		        }
		        

		        
			    
			 }





			 

			 
			
		}

	


