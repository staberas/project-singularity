package path2glory.SimpleGame;

//import mdes.slick.sui.Button;
//import mdes.slick.sui.Display;

//import mdes.slick.sui.Container;

//import mdes.slick.sui.Label;
//import mdes.slick.sui.layout.RowLayout;


//import TWLDebuggerConsole;
//import TWLMain;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import de.matthiasmann.twl.ActionMap;
import de.matthiasmann.twl.Button;
import de.matthiasmann.twl.EditField;
import de.matthiasmann.twl.Label;
import de.matthiasmann.twl.Widget;



public class NewBase extends BasicTWLGameState {
	private Button btn;

    public int stateID = 6;


    public NewBase(int stateID ) 
    {
       this.stateID = stateID;
    }
    

	//@Override
	public int getID() {
		  return stateID;
	}


    @Override
    protected void createRootPane() {
        super.createRootPane();
        rootPane.setTheme("");

        btn = new Button("Hello World");
        btn.addCallback(new Runnable() {
            public void run() {
                System.out.println("It works!");
            }
        });
        rootPane.add(btn);
    }

    @Override
    protected void layoutRootPane() {
        btn.adjustSize();
        btn.setPosition(100, 100);
    }
	
	
	//@Override
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		// TODO Auto-generated method stub

	}


	//@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub

	}

	//@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		// TODO Auto-generated method stub

	}


}
