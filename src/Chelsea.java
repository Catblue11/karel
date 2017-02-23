import becker.robots.*;
        
public class Chelsea {
    private Robot joe;
    private City unal;
    private Thing balon;
    
      public Chelsea(){
        this.unal = new City (40,40);
        this.balon = new Thing (this.unal,2, 2);
        this.joe = new Robot (unal,1,1, Direction.WEST);
    }
    
      public void advance(){
          joe.move();
          joe.turnLeft();
         
      }
}
