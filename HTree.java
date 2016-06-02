
public class HTree {
	public void drawHTree(double centerX, double centerY, double length, int depth ){
		if (depth == 0){
			return;
		} else {
			double leftEndX = centerX - length/2;
			double rightEndX = centerX + length/2;
			double endYUp = centerY + length/2;
			double endYDown = centerY - length/2;
			drawLine(leftEndX, centerY, rightEndX, centerY);
			drawLine(leftEndX, endYUp, leftEndX, endYDown);
			drawLine(rightEndX, endYUp, rightEndX, endYDown);
			
			drawHTree(leftEndX, endYUp, length/Math.sqrt(2), depth -1);
			drawHTree(leftEndX, endYDown, length/Math.sqrt(2), depth -1);
			drawHTree(rightEndX, endYUp, length/Math.sqrt(2), depth -1);
			drawHTree(rightEndX, endYDown, length/Math.sqrt(2), depth -1);
					
		}
	}
	
	public void drawLine(double x1, double y1, double x2, double y2){
		
	}
}
