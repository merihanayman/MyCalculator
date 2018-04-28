import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.text.Text;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MyButton extends Application{
	Button b1 = new Button("1");
	Button b2 = new Button("2");
	Button b3 = new Button("3");
	Button b4 = new Button("4");
	Button b5 = new Button("5");
	Button b6 = new Button("6");
	Button b7 = new Button("7");
	Button b8 = new Button("8");
	Button b9 = new Button("9");
	public void start(Stage primaryStage){}
	public void numbersButtonsEdit(Button bt){
		bt.setShape(new Circle(1.5));
		bt.setStyle("-fx-background-color:grey;");
		bt.setFont(Font.font ("arial",FontWeight.BOLD, 20));
		bt.setMinSize(50,50);
	}
	
	public void zeroButtonsEdit(Button bt){
		bt.setShape(new Circle(1.5));
		bt.setStyle("-fx-background-color:grey;");
		bt.setFont(Font.font ("arial",FontWeight.BOLD, 20));
		bt.setMinSize(130,50);
	}
  public void operationButtonsEdit(Button bt){
	bt.setShape(new Circle(1.5));
	bt.setMaxSize(3,3);
	bt.setFont(Font.font ("arial", FontWeight.BOLD,20));
	bt.setStyle("-fx-background-color:orange;");
	bt.setMinSize(50,50);
		
	}

  public void prevButtonsEdit(Button bt){
	    Image im1 =new Image("arrowLeft.png");
		ImageView view1 = new ImageView(im1);
	  bt.setGraphic(view1);
		bt.setStyle("-fx-background-color:grey;");
		bt.setMinSize(50,50);
		view1.setFitHeight(bt.getMaxHeight());
		view1.setFitWidth(bt.getMaxWidth());
  }
  public void nextButtonsEdit(Button bt){
	  Image im2 =new Image("arrowRight.png");
		ImageView view2 = new ImageView(im2);
		bt.setGraphic(view2);
		bt.setStyle("-fx-background-color:grey;");
		bt.setMinSize(50,50);
		view2.setFitHeight(bt.getMaxHeight());
		view2.setFitWidth(bt.getMaxWidth());
				
	  
  }
  public void textDesignEdit(Text t1){
	  t1.setFill(Color.WHITE);
		t1.setFont(new Font(20));
		t1.setTextAlignment(TextAlignment.RIGHT);
  }
	
  public void numberLight(Button bt){
  bt.setOnMousePressed(e1->{bt.setStyle("-fx-background-color:grey;-fx-border-color:#ff0000;-fx-border-width: 8px;");});
	
}
  public void operationLight(Button bt){
  bt.setOnMousePressed(e1->{bt.setStyle("-fx-background-color:orange;-fx-border-color:#ff0000;-fx-border-width: 8px;");});
	
}
}