package code;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class FlowerBed implements iGardenEntity {
	
	Rectangle rectangle;
	Point2D lastPosition = null;
	
	public FlowerBed(int X, int Y, int Z, int width, Color color){
		rectangle = new Rectangle(X, Y, Z, width);
		rectangle.setFill(color);
		rectangle.setStrokeWidth(1);
		rectangle.setStroke(Color.BLACK);
		rectangle.setOnMouseDragged(mouseHandler);
	    rectangle.setOnMouseReleased(mouseHandler);
		rectangle.setOnMousePressed(mouseHandler);
	}

	
	EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent mouseEvent){
			Point2D clickPoint = new Point2D(mouseEvent.getX(), mouseEvent.getY());
			
			if(lastPosition == null){
				lastPosition = clickPoint;
			}
			
			String eventName = mouseEvent.getEventType().getName();
			
			switch(eventName){
			case "MOUSE_DRAGGED":
				System.out.println("Dragging");
				double deltaX = clickPoint.getX()-lastPosition.getX();
				double deltaY = clickPoint.getY()-lastPosition.getY();
				move(deltaX, deltaY);
			break;					
			}
			lastPosition = clickPoint;
		}
	};
	

	@Override
	public iGardenEntity getContainer(Point2D point) {
		if(rectangle.contains(point))
			return this;
		else
			return null;
	}
		
	public Rectangle getRectangle(){
		return rectangle;
	}
	
	@Override
	public void displayInformation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handle(MouseEvent mouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(double dx, double dy) {
		rectangle.setY(rectangle.getY() + dy);
		rectangle.setX(rectangle.getX() + dx);
		
	}
}
