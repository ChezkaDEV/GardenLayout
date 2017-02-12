package code;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Vegetable implements iGardenEntity {
	
	Circle circle;
	Point2D lastPosition = null;
	
	public Vegetable(int X, int Y, int width, Color color){
		circle = new Circle(X, Y, width);
	    circle.setFill(color);
	    circle.setStrokeWidth(1);
	    circle.setStroke(Color.BLACK);
	    circle.setOnMouseDragged(mouseHandler);
		circle.setOnMouseReleased(mouseHandler);
		circle.setOnMousePressed(mouseHandler);
	}

	@Override
	public iGardenEntity getContainer(Point2D point) {
		if(circle.contains(point))
			return this;
		else
			return null;
	}
		
	public Circle getCircle(){
		return circle;
	}
	@Override
	public void displayInformation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handle(MouseEvent mouseEvent) {
		// TODO Auto-generated method stub
		
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
	public void move(double dx, double dy) {
		circle.setCenterY(circle.getCenterY() + dy);
		circle.setCenterX(circle.getCenterX() + dx);
	}
}
