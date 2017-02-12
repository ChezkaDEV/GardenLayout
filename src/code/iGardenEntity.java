package code;
import javafx.geometry.Point2D;
import javafx.scene.input.MouseEvent;

public interface iGardenEntity {
	public iGardenEntity getContainer(Point2D point);
	public void displayInformation();
	void handle(MouseEvent mouseEvent);
	void move(double dx, double dy);
}
