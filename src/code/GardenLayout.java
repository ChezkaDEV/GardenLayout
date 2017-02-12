package code;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.shape.Box;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Scale;
import code.Flower;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GardenLayout extends Application {
	
	Stage mapStage;
	Scene scene;
	Pane pane;
	@Override
	public void start(Stage mapStage) throws Exception {
		
		pane = new AnchorPane();
		scene = new Scene(pane, 650, 600, Color.BEIGE);
		this.mapStage = mapStage;
		
		mapStage.setTitle("Garden Layout Flower Game");
		mapStage.setScene(scene);
		mapStage.show();
				
		gardenContainer();
		createFlower();
		createVegs();
		createFlowerBed();
		createTree();
	}
		
	public void gardenContainer(){
		Rectangle leftSide = new Rectangle(0, 0, 200, 600);
		leftSide.setFill(Color.FLORALWHITE);
		leftSide.setStrokeWidth(1);
		leftSide.setStroke(Color.BLACK);
		pane.getChildren().add(leftSide);
	}
	
	public void createFlower(){
		Label itemLabel = new Label("Flowers");
		itemLabel.setFont(Font.font ("Verdana", FontWeight.NORMAL, 15));
		itemLabel.setLayoutX(10);
		itemLabel.setLayoutY(5);
		pane.getChildren().add(itemLabel);
		
		Flower f1 = new Flower(30, 50, 10, Color.CRIMSON);
		pane.getChildren().add(f1.getCircle());
		
	    Flower f2 = new Flower(55, 50, 10, Color.AQUAMARINE);
		pane.getChildren().add(f2.getCircle());
	    
		Flower f3 = new Flower(80, 50, 10, Color.DEEPSKYBLUE);
		pane.getChildren().add(f3.getCircle());
	    
		Flower f4 = new Flower(105, 50, 10, Color.HOTPINK);
		pane.getChildren().add(f4.getCircle());
	    
		Flower f5 = new Flower(130, 50, 10, Color.LIGHTPINK);
		pane.getChildren().add(f5.getCircle());
		
	}
	
	public void createVegs(){
		Label itemLabel = new Label("Vegetables");
		itemLabel.setFont(Font.font ("Verdana", FontWeight.NORMAL, 15));
		itemLabel.setLayoutX(10);
		itemLabel.setLayoutY(100);
		pane.getChildren().add(itemLabel);
		
		Vegetable v1 = new Vegetable(30, 140, 10, Color.GREENYELLOW);
		pane.getChildren().add(v1.getCircle());
		
	    Vegetable v2 = new Vegetable(55, 140, 10, Color.DARKGREEN);
		pane.getChildren().add(v2.getCircle());
	    
	    Vegetable v3 = new Vegetable(80, 140, 10, Color.DARKSEAGREEN);
		pane.getChildren().add(v3.getCircle());
	    
	    Vegetable v4 = new Vegetable(105, 140, 10, Color.LIMEGREEN);
		pane.getChildren().add(v4.getCircle());
	    
	    Vegetable v5 = new Vegetable(130, 140, 10, Color.SEAGREEN);
		pane.getChildren().add(v5.getCircle());	
	}
	
	
	public void createFlowerBed(){
		Label itemLabel = new Label("Flower Bed");
		itemLabel.setFont(Font.font ("Verdana", FontWeight.NORMAL, 15));
		itemLabel.setLayoutX(10);
		itemLabel.setLayoutY(195);
		pane.getChildren().add(itemLabel);
	    
	    FlowerBed fb1 = new FlowerBed(15, 230, 150, 200, Color.BURLYWOOD);
		pane.getChildren().add(fb1.getRectangle());	
		
	}
	
	public void createTree(){
		Label itemLabel = new Label("Tree");
		itemLabel.setFont(Font.font ("Verdana", FontWeight.NORMAL, 15));
		itemLabel.setLayoutX(10);
		itemLabel.setLayoutY(450);
		pane.getChildren().add(itemLabel);	
	    
	    Tree t1 = new Tree(75, 530, 50, Color.DARKGREEN);
		pane.getChildren().add(t1.getCircle());	
	}
	
	public static void main(String[] args){
		launch(args);
	}

}
