package path2glory.SimpleGame;

	import org.newdawn.slick.AppGameContainer;
	import org.newdawn.slick.GameContainer;
	import org.newdawn.slick.SlickException;
	import org.newdawn.slick.state.*;

	import org.newdawn.slick.gui.*;
	import org.newdawn.slick.geom.*;
	import org.newdawn.slick.fills.*;
	import mdes.slick.sui.*;
	import mdes.slick.sui.event.*;

	
	/**
	 *
	 * @author Spiegel & staberas
	 *
	 */
	public class SingularityProject extends StateBasedGame {
	 

		
	    public static final int MAINMENUSTATE          = 0;
	    public static final int GAMEPLAYSTATE          = 1;
	    public static final int OPTIONSTATE            = 2;
	    public static final int KNOWLEDGESTATE         = 3;
	    public static final int CONTINENTSTATE         = 4;
	    public static final int OPENBASESTATE	       = 5;
	    public static final int NEWBASESTATE		   = 6;
	    public static final int POWERSTATESTATE		   = 7;    	
	    public static final int DESTROYBASESTATE	   = 8;
	    //TO DO main menu change of resolution
	    public static int xrem;
	    public static int yrem;
	    
	        
	    public SingularityProject()
	    {
	        super("Project Singularity");
	 
	        this.addState(new MainMenu(MAINMENUSTATE));
	        this.addState(new Gameplay(GAMEPLAYSTATE));
	        this.addState(new Options(OPTIONSTATE));
	        //change niftygui to Knowledges
	        this.addState(new Knowledges(KNOWLEDGESTATE));
	        this.addState(new Continent(CONTINENTSTATE));
	        this.addState(new OpenBase(OPENBASESTATE));
	        this.addState(new NewBase(NEWBASESTATE));
	        this.addState(new PowerState(POWERSTATESTATE));
	        this.addState(new DestroyBase(DESTROYBASESTATE));
	        this.enterState(MAINMENUSTATE);
	    }
	    
	    public static void main(String[] args) throws SlickException
	    {

	        
	    	
	         AppGameContainer app = new AppGameContainer(new SingularityProject());

	          
	         if (xrem == 0 || yrem == 0 ){ 
		        	app.setDisplayMode(1536, 900, false); 
		        	app.start();

	         }
	         else{
		         app.setDisplayMode(xrem, yrem, false);
		         app.start();

	         }
	    }
	
     
	    
	    public void initStatesList(GameContainer gameContainer) throws SlickException {
	 
	        this.getState(MAINMENUSTATE).init(gameContainer, this);
	        this.getState(GAMEPLAYSTATE).init(gameContainer, this);
	        this.getState(OPTIONSTATE).init(gameContainer, this);
	        this.getState(KNOWLEDGESTATE).init(gameContainer, this);
	        this.getState(CONTINENTSTATE).init(gameContainer, this);
	        
	        this.getState(OPENBASESTATE).init(gameContainer, this);
	        this.getState(NEWBASESTATE).init(gameContainer, this);
	        this.getState(POWERSTATESTATE).init(gameContainer, this);
	        this.getState(DESTROYBASESTATE).init(gameContainer, this);
	    }

	

	}