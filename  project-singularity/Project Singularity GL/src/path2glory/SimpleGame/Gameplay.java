package path2glory.SimpleGame;


//import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
//import org.newdawn.slick.svg.InkscapeLoader;
//import org.newdawn.slick.svg.NonGeometricData;
//import org.newdawn.slick.svg.SimpleDiagramRenderer;




public class Gameplay extends BasicGameState {
 
	//dmz is value of continent, public static int dmz = 1;

	public static int dmz = 0;
	public int xvalue = 0;
	//public static int cntinent = 0 ;
    int stateID = 1;
    Image gameback = null;
    Image text757 = null;
    Image pause = null;
    Image play = null;
    Image ff = null;
    Image sff = null;
    Image uff = null;
    Image researchmg = null;
    Image researchdg = null;
    Image knowledge = null;
    Image shadow = null;
    
    Image shadow2 = null;
    //but
    Image africa = null;
    Image asia = null;
    Image namerica = null;
    Image samerica = null;
    Image europe = null;
    Image antarctic = null;
    
    
	//private Timer timer;
	//private int counter;
    private static int menuX = 5;
    private static int menuY = 10;
    private static int kmenuX = 1350;
    private static int kmenuY = 850;
    int gamecash = 0;
    int gamecpu = 0;
    int timersec = 0;
    int timersecnd = 0;
    int timemin = 0;
    int timehr = 0;
    int timedt = 0;
    int timesem = 1;
    int timesem2 =1;
    boolean timerstop = false;
    
    int w;
    int h;
    int a = 1;
    int b ;
    int o = -1535 ;
    //africa pos
    int afrx = 810;
    int afry = 360;
    //europe pos
    int eux = 800;
    int euy = 210;
    //asia pos
    int asiax = 1100;
    int asiay = 200;
    //north america pos 
    int northamex = 300; 
    int northamey = 240;
    //south america pos
    int southamex = 460;
    int southamey = 450;
    //antarctic pos
      //int antarcticx = ;
      //int antarcticy = ;
    
    
    public Gameplay( int stateID ) 
    {
       this.stateID = stateID;
    }
 
    @Override
    public int getID() {
        return stateID;

    }
 
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
    	System.out.println("init the background");
        //background image for the game
    	gameback = new Image("data/world.jpg");
    	//menu img
    	text757 = new Image("data/text3757.png");
    	researchmg = new Image("data/RESEARCH.png");
    	//pause play ff sff uff controls
    	pause = new Image ("data/pause.png");
    	play = new Image ("data/play.png");
    	ff = new Image ("data/ff.png");
    	sff = new Image ("data/sff.png");
    	uff = new Image("data/uff.png");
    	researchdg = new Image("data/techtree.png");
    	knowledge = new Image("data/knowledge.png");
     	shadow = new Image("data/shadow.png");
    	shadow2 = new Image("data/shadow2.png");
    	//buttons 
    	africa = new Image("data/info.png");
    	asia = new Image("data/info.png");
    	namerica = new Image("data/info.png");
    	samerica = new Image("data/info.png");
    	europe = new Image("data/info.png");
    	antarctic = new Image("data/info.png");
    }
 
    @SuppressWarnings("unchecked")
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

    	
    	gameback.draw(0, 60);
    	
        shadow.draw((a++), 60);
        shadow2.draw((o++),60);
    	
        if (a > b ) {
    	a=0;
    	}
    	if (o == 0){
    	   o = -1536;
    	}
    	
    	pause.draw(320, 10);
    	play.draw(342, 10);
    	ff.draw(364, 10);
    	sff.draw(386, 10);
    	uff.draw(408, 10);
    	researchmg.draw(160, 30);
    	//knowledge.draw(1350,850);
    	//svg images
       // SimpleDiagramRenderer svgimg = new SimpleDiagramRenderer(InkscapeLoader.load("data/menui.svg"));
    	//svgimg.render(g);
    	//Color c = svgimg.diagram.getFigure(0).getData().getAsColor(NonGeometricData.FILL);
    	//String id = svgimg.diagram.getFigure(0).getData().getAttribute("id");
    	text757.draw(menuX, menuY);
    	knowledge.draw(kmenuX, kmenuY);
    	africa.draw(afrx, afry);
    	asia.draw(asiax, asiay);
    	europe.draw(eux, euy);
    	namerica.draw(northamex, northamey);
    	samerica.draw(southamex, southamey);
    	String fontPath = "data/Misc-Fixed.ttf";
    	UnicodeFont uFont = new UnicodeFont(fontPath , 19, false, false); 
    	uFont.addAsciiGlyphs();   
    	uFont.addGlyphs(400, 600);
    	uFont.getEffects().add(new ColorEffect(java.awt.Color.WHITE)); 
    	uFont.loadGlyphs();
    	 //testtt
    	//uFont.drawString(5, 80, ""+timersec);
    	//uFont.drawString(5, 100, ""+timersecnd);
    	//uFont.drawString(5, 120, ""+timemin);
    	//uFont.drawString(5, 150, ""+timehr);
    	//uFont.drawString(5, 165, ""+timedt);
    	//time
    	uFont.drawString(150, 10, "DAY "+timedt);
    	uFont.drawString(200, 10, ", "+timehr);
    	uFont.drawString(240, 10, ": "+timemin);
    	uFont.drawString(275, 10, ": "+timersecnd); 
    	uFont.drawString(900, 11, " CASH  :  "+gamecash);
    	uFont.drawString(900, 30, "  CPU  : "+gamecpu);
    	//uFont.drawString(900, 60, "  width  : "+africa.getWidth());

    	
    }
 
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
 
    	
    	gc.setMinimumLogicUpdateInterval(20);
    	
        //Dimension d = size();
        w = gameback.getWidth();
        h = gameback.getHeight();
        
        b = shadow.getWidth();
       // h = shadow.getHeight();
      

    	
	    Input input = gc.getInput();	
	    int mouseX = input.getMouseX();
	    int mouseY = input.getMouseY();
        

	    boolean pausef = false;
	    boolean playf = false;
	    boolean fff = false;
	    boolean sfff = false;
	    boolean ufff = false;
	    
	    
	    boolean menu757 = false;
	    boolean kmenu = false;
	    boolean africab = false;
	    // enter the state of continent (control)
	    boolean asiab = false;
	    boolean europeb = false;
	    boolean namericab = false;
	    boolean samericab = false;
	    

	    if  (timerstop == false){
	    	timersec = timersec+timesem ;
	    	if (timersec >= 10){
	    		timersec=0;
	    		timersecnd = timersecnd+timesem;//+1 here anti gia timesem
	    	}
	    	if (timersecnd >= 59){
	    		timersecnd=0;
	    		timemin = timemin+1;
	    	}
	    	if (timemin >= 59){
	    		timemin=0;
	    		timehr = timehr+1;
	    	}
	    	if (timehr >= 24){
	    		timehr=0;
	    		timedt = timedt+1;
	    	}
	    }

	    
	    //pause
        if( ( mouseX >= 320 && mouseX <= 320 + pause.getWidth()) &&
                ( mouseY >= 10 && mouseY <= 10 + pause.getHeight()) )
            {
        	pausef = true;
            }
        
        if(pausef)
        {

        if ( input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON) ){
            timerstop = true;
         }
        }
        //play normal speed
        if( ( mouseX >= 342 && mouseX <= 342 + play.getWidth()) &&
                ( mouseY >= 10 && mouseY <= 10 + play.getHeight()) )
            {
        	playf = true;
        	
            }
        
        if(playf)
        {

        if ( input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON) ){
        	timerstop = false;
            timesem = 1;
            timesem2 =1;
         }
        }
        //ff faster speed
        if( ( mouseX >= 364 && mouseX <= 364 + ff.getWidth()) &&
                ( mouseY >= 10 && mouseY <= 10 + ff.getHeight()) )
            {
        	fff = true;
        	
            }
        
        if(fff)
        {

        if ( input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON) ){
           
            timesem = 10;
            
         }
        } 
      //sff super faster speed
        if( ( mouseX >= 386 && mouseX <= 386 + sff.getWidth()) &&
                ( mouseY >= 10 && mouseY <= 10 + sff.getHeight()) )
            {
        	sfff = true;
        	
            }
        
        if(sfff)
        {

        if ( input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON) ){
           
            timesem = 30;
            timesem2 = 1;
         }
        } 
        //uff ultra faster speed
        if( ( mouseX >= 408 && mouseX <= 408 + uff.getWidth()) &&
                ( mouseY >= 10 && mouseY <= 10 + uff.getHeight()) )
            {
        	ufff = true;
        	
            }
        
        if(ufff)
        {

        if ( input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON) ){
            timesem  = 100;
           // timesem2 = 100;
         }
        } 
        
        
	   
		//menu button
	        if( ( mouseX >= menuX && mouseX <= menuX + text757.getWidth()) &&
	                ( mouseY >= menuY && mouseY <= menuY + text757.getHeight()) )
	            {
	        	menu757 = true;
	            }
	        
	        if(menu757)
	        {

	        if ( input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON) ){
	            sbg.enterState(SingularityProject.MAINMENUSTATE);
	         }
	        }
		 //knowledge
		 
	        
	        if( ( mouseX >= kmenuX && mouseX <= kmenuX + knowledge.getWidth()) &&
	                ( mouseY >= kmenuY && mouseY <= kmenuY + knowledge.getHeight()) )
	            {
	        	kmenu = true;
	            }
	        
	        if(kmenu)
	        {

	        if ( input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON) ){
	        	sbg.enterState(SingularityProject.KNOWLEDGESTATE);
	         }
	        }
		 
		 //africa
	        if( ( mouseX >= afrx && mouseX <= afrx + africa.getWidth()) &&
	                ( mouseY >= afry && mouseY <= afry + africa.getHeight()) )
	            {
	        	africab = true;
	            }
	        
	        if(africab)
	        {

	        if ( input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON) ){
	        	//add stuff;
	        	
	        	dmz = 4;
	        	//cntinent = 1;
	        	System.out.println("**Dmz =" + dmz);
	        	sbg.enterState(SingularityProject.CONTINENTSTATE);
	        	
	         }
	        }
	        
			 //europe
	        if( ( mouseX >= eux && mouseX <= eux + europe.getWidth()) &&
	                ( mouseY >= euy && mouseY <= euy + europe.getHeight()) )
	            {
	        	europeb = true;
	            }
	        
	        if(europeb)
	        {

	        if ( input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON) ){
	        	//add stuff;
	        	dmz = 3;
	        	System.out.println("**Dmz =" + dmz);
	        	sbg.enterState(SingularityProject.CONTINENTSTATE);
	        	
	         }
	        }
	        
			 //Asia
	        if( ( mouseX >= asiax && mouseX <= asiax + asia.getWidth()) &&
	                ( mouseY >= asiay && mouseY <= asiay + asia.getHeight()) )
	            {
	        	asiab = true;
	            }
	        
	        if(asiab)
	        {

	        if ( input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON) ){
	        	dmz = 12;
	        	
             	System.out.println("**Dmz =" + dmz);
	        	sbg.enterState(SingularityProject.CONTINENTSTATE);

	         }
	        }
	        
			 //North America
	        if( ( mouseX >= northamex && mouseX <= northamex + namerica.getWidth()) &&
	                ( mouseY >= northamey && mouseY <= northamey + namerica.getHeight()) )
	            {
	        	namericab = true;
	            }
	        
	        if(namericab)
	        {

	        if ( input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON) ){
	        	//add stuff;
	        	
	        	dmz = 1;
	        	System.out.println("**Dmz =" + dmz);
	        	sbg.enterState(SingularityProject.CONTINENTSTATE);
	        	
	         }
	        }
	        
			 //South America
	        if( ( mouseX >= southamex && mouseX <= southamex + samerica.getWidth()) &&
	                ( mouseY >= southamey && mouseY <= southamey + samerica.getHeight()) )
	            {
	        	samericab = true;
	            }
	        
	        if(samericab)
	        {

	        if ( input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON) ){
	        	//add stuff;
	        	dmz = 2;
	        	System.out.println("**Dmz =" + dmz);
	        	sbg.enterState(SingularityProject.CONTINENTSTATE);
	        	
	         }
	        }
	        
	        /**
			 //Antarctic
	        if( ( mouseX >= southamex && mouseX <= southamex + samerica.getWidth()) &&
	                ( mouseY >= southamey && mouseY <= southamey + samerica.getHeight()) )
	            {
	        	africab = true;
	            }
	        
	        if(africab)
	        {

	        if ( input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON) ){
	        	//add stuff;
	        	dmz = 5;
	        	sbg.enterState(SingularityProject.CONTINENTSTATE);
	        	
	         }
	        }
	        */
	        
	        
		 
    }
    
	
    }
	 

