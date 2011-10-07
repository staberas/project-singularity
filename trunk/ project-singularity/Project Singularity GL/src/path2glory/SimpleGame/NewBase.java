package path2glory.SimpleGame;

//import mdes.slick.sui.Button;
//import mdes.slick.sui.Display;

//import mdes.slick.sui.Container;

//import mdes.slick.sui.Label;
//import mdes.slick.sui.layout.RowLayout;


import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import de.matthiasmann.twl.ActionMap;
import de.matthiasmann.twl.Button;





public class NewBase extends BasicTWLGameState {
    private Button btn;


    public int stateID = 6;

 //   private Display display;
   


    public NewBase(int stateID ) 
    {
       this.stateID = stateID;
    }
    
	@Override
	public int getID() {
		  return stateID;
	}
	

	@Override
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		// TODO Auto-generated method stub


		
		
/**
        //we create a Sui display from our Slick container
        display = new Display(gc);

      //create a dark gray colored container for our components
        Container content = new Container();
        content.setSize(600, 400); //sets panel size
        content.setLocation(100, 100); //sets panel loc relative to parent (display)
        content.setOpaque(true); //ensures that the background is drawn
        content.setBackground(Color.darkGray); //sets the background color
        
        //give our content a row layout that is aligned (horiz) left and (vert) center.
        RowLayout layout = new RowLayout(true, RowLayout.LEFT, RowLayout.CENTER);
        content.setLayout(layout);
        
        //add a button to our content panel
        Button btn = new Button("Clicky");
        btn.pack(); //pack the button to the text
        content.add(btn);
        

        
        //add a label to our content panel
        Label label = new Label("This is a test");
        label.setForeground(Color.white); //sets the foreground (text) color
        label.pack(); //pack the label with the current text, font and padding
        label.setHeight(btn.getHeight()); //set same size between the two components
        content.add(label); //add the label to this display so it can be rendered
        
        //add the content panel to the display so it can be rendered
        display.add(content);
        */
	}


	
	
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub

        //render the display and its components
  //      display.render(gc, g);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		// TODO Auto-generated method stub

        //update the display and its components
 //       display.update(gc, delta);
        
        if (gc.getInput().isKeyPressed(Input.KEY_ESCAPE))
            gc.exit();

	}



	

}
