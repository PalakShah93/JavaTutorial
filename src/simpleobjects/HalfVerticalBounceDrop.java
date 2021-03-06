package simpleobjects;

public class HalfVerticalBounceDrop extends Drop {
	private boolean goUp;
	private int halfHeight;
	private int previousHalf;
	
	public HalfVerticalBounceDrop(int xpos, int ypos, int xvel, int yvel, int size) {

		super(xpos, ypos, xvel, yvel, size);
		goUp = false;
		halfHeight = 0;
		previousHalf = 0;
	}

	public void move(int width, int height) {
		
			if(ypos == height){
				goUp = true;
				
				if(halfHeight == 0){
					previousHalf = halfHeight = height/2;
				}
				else{
					previousHalf =  previousHalf/2;
					
					if((previousHalf+halfHeight) < height) {
						halfHeight = previousHalf+halfHeight;
					}
				}
				
			}
			
			if(ypos == halfHeight)
			{
				goUp = false;
			}
			
			if(goUp)
			{
				ypos = ypos - yvel;
			}
			
			if(!goUp)
			{
				ypos = ypos + yvel;
			}
		
	}

}
