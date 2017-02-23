
import becker.robots.*;


public class futbol {
    private Robot joe;
    private City unal;
    private Thing balon;
    
    public futbol(){
        this.unal = new City (10,10);
        this.balon = new Thing (this.unal,9, 9);
        this.joe = new Robot (unal,9,9, Direction.WEST);
    }
    
    public void advance(){
        joe.pickThing();
        joe.move();
        joe.move();
        joe.putThing();
        joe.turnLeft();
        joe.turnLeft();
        joe.turnLeft();
        joe.pickThing();
        joe.move();
        joe.putThing();
        joe.turnLeft();
        joe.pickThing();
        joe.move();
        joe.move();
        joe.turnLeft();
        joe.turnLeft();
        joe.turnLeft();
        joe.putThing();
        joe.pickThing();
        joe.move();
        joe.putThing();
        joe.turnLeft();
        joe.pickThing();
        joe.move();
        joe.move();
        joe.putThing();
        
        
        
        
        
        
        
    }
    
    public void advanceLeft(){
        
    }
    public void advanceRight(){
    
     
    }
}
