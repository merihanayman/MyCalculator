

import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

	import java.lang.Double;

import javafx.stage.Stage;
	public class TestMyButton  extends MyButton  {
		
		 String firOperand="";
		 String secOperand = "";
		 String operation= "";
		 String[] history = new String[5];
		 int i=0;
			int counterpointer;
		 
		@Override
		public void start(Stage stage2){
			Button b0 = new Button("0");
			zeroButtonsEdit(b0);
			Button b1 = new Button("1");
			numbersButtonsEdit(b1);
			Button b2 = new Button("2");
			numbersButtonsEdit(b2);
			Button b3 = new Button("3");
			numbersButtonsEdit(b3);
			Button b4 = new Button("4");
			numbersButtonsEdit(b4);
			Button b5 = new Button("5");
			numbersButtonsEdit(b5);
			Button b6 = new Button("6");
			numbersButtonsEdit(b6);
			Button b7 = new Button("7");
			numbersButtonsEdit(b7);
			Button b8 = new Button("8");
			numbersButtonsEdit(b8);
			Button b9 = new Button("9");
			numbersButtonsEdit(b9);

			Button dot = new Button(".");
			numbersButtonsEdit( dot);
			Button equal = new Button("=");
			numbersButtonsEdit( equal);
			Button reset = new Button("AC");
			numbersButtonsEdit(reset);
			
			
			Button add= new Button("+");
			operationButtonsEdit(add);
		    Button sub= new Button("-");
			operationButtonsEdit(sub);
		    Button div = new Button("/");
			operationButtonsEdit(div);
		    Button mult = new Button("*");
			operationButtonsEdit(mult);
			
			Button prev = new Button();
			prevButtonsEdit(prev);
//		
			Button next= new Button();
			nextButtonsEdit(next);
			
			Text t1= new Text("0");
			textDesignEdit(t1);
			
			
			b0.setOnAction(e->{
				numberLight(b0);
				String x= b0.getText();
				if(operation=="")
					{ firOperand=firOperand+x;
					t1.setText(firOperand);
					}		
				else
				{secOperand=secOperand+x;
				t1.setText(secOperand);}
				b0.setStyle("-fx-background-color:grey;");
				
				});
			
			b1.setOnAction(e->{
				numberLight(b1);
				String x= b1.getText();
				if(operation=="")
					{firOperand=firOperand+x;
				t1.setText(firOperand);
			
					}		
				else
				{	//System.out.println(v2);
			//	System.out.println(x);
				secOperand=secOperand+x;
				t1.setText(secOperand);}
				b1.setStyle("-fx-background-color:grey;");
				
				
			});
	
			b2.setOnAction(e->{
				numberLight(b2);
				String x= b2.getText();
				if(operation=="")
					{firOperand=firOperand+x;
				t1.setText(firOperand);
					}		
				else
				{secOperand=secOperand+x;
				t1.setText(secOperand);}
				b2.setStyle("-fx-background-color:grey;");
			});
			b3.setOnAction(e->{
				numberLight(b3);
				String x= b3.getText();
				if(operation=="")
					{firOperand=firOperand+x;
				t1.setText(firOperand);
					}		
				else{
				secOperand=secOperand+x;
				t1.setText(secOperand);}
				b3.setStyle("-fx-background-color:grey;");
				
				});
			b4.setOnAction(e->{
				numberLight(b4);
				String x= b4.getText();
				if(operation=="")
					{firOperand=firOperand+x;
				t1.setText(firOperand);
					}		
				else{
				secOperand=secOperand+x;
				t1.setText(secOperand);}
				b4.setStyle("-fx-background-color:grey;");
				});
			b5.setOnAction(e->{
				numberLight(b5);
				String x= b5.getText();
				if(operation=="")
					{firOperand=firOperand+x;
				t1.setText(firOperand);
					}		
				else
				{secOperand=secOperand+x;
				t1.setText(secOperand);}
				b5.setStyle("-fx-background-color:grey;");
				});
			
			b6.setOnAction(e->{
				numberLight(b6);
				String x= b6.getText();
				if(operation=="")
					{firOperand=firOperand+x;
				t1.setText(firOperand);
					}		
				else
				{secOperand=secOperand+x;
				t1.setText(secOperand);}
				b6.setStyle("-fx-background-color:grey;");
				});
			
			b7.setOnAction(e->{
				numberLight(b7);
				String x= b7.getText();
				if(operation=="")
				{firOperand=firOperand+x;
			t1.setText(firOperand);
				}		
			else
			{secOperand=secOperand+x;
			t1.setText(secOperand);}
				b7.setStyle("-fx-background-color:grey;");
				});
			
			
			b8.setOnAction(e->{
				numberLight(b8);
				String x= b8.getText();
				if(operation=="")
					{firOperand=firOperand+x;
				t1.setText(firOperand);
					}		
				else
				{	secOperand=secOperand+x;
				t1.setText(secOperand);}
				b8.setStyle("-fx-background-color:grey;");
				});
			
			b9.setOnAction(e->{
				numberLight(b9);
				String x= b9.getText();
				if(operation=="")
					{firOperand=firOperand+x;
				t1.setText(firOperand);
					}		
				else
				{secOperand=secOperand+x;
				t1.setText(secOperand);}
				b9.setStyle("-fx-background-color:grey;");
				});
			
			dot.setOnAction(e->{
				numberLight(dot);
				String x= dot.getText();
				if(operation=="")
					{firOperand=firOperand+x;
				t1.setText(firOperand);
					}		
				else
				{secOperand=secOperand+x;
				t1.setText(secOperand);}
				dot.setStyle("-fx-background-color:grey;");
				});
			
			
			add.setOnAction(e->{
				operationLight(add);
				if (operation=="")
					 operation = add.getText();
					else 
					{
						double a = Double.parseDouble(firOperand);
						double b =  Double.parseDouble(secOperand);
						double out=0;
						 if(operation=="-")
						 { out= a-b;
						 }
						 if(operation=="+")
						 { out = a+b;
						 }
						 if(operation=="*")
						 { out=a*b;
						 }
						 if(operation=="/")
						 { out = a/b;
						 }
						 String z = Double.toString(out);
						 t1.setText(z);
						 firOperand=z;
						 secOperand="";
						 operation="+";
					}
				add.setStyle("-fx-background-color:orange;");
				//System.out.println(op);
			});
			mult.setOnAction(e->{
				operationLight(mult);
				if (operation=="")
					 operation = mult.getText();
					else 
					{
						double a = Double.parseDouble(firOperand);
						double b =  Double.parseDouble(secOperand);
						double out=0;
						 if(operation=="-")
						 { out= a-b;
						 }
						 if(operation=="+")
						 { out = a+b;
						 }
						 if(operation=="*")
						 { out=a*b;
						 }
						 if(operation=="/")
						 { out = a/b;
						 }
						 String z = Double.toString(out);
						 t1.setText(z);
						 firOperand=z;
						 secOperand="";
						 operation="*";
					}
				mult.setStyle("-fx-background-color:orange;");
			});
			
			div.setOnAction(e->{
				operationLight(div);
				if (operation=="")
					 operation = div.getText();
					else 
					{
						double a = Double.parseDouble(firOperand);
						double b =  Double.parseDouble(secOperand);
						double out=0;
						 if(operation=="-")
						 { out= a-b;
						 }
						 if(operation=="+")
						 { out = a+b;
						 }
						 if(operation=="*")
						 { out=a*b;
						 }
						 if(operation=="/")
						 { out = a/b;
						 }
						 String z = Double.toString(out);
						 t1.setText(z);
						 firOperand=z;
						 secOperand="";
						 operation="/";
					}
				div.setStyle("-fx-background-color:orange;");
			});
			
			sub.setOnAction(e->{
				operationLight(sub);
				if (operation=="")
				 operation = sub.getText();
				else 
				{
					double a = Double.parseDouble(firOperand);
					double b =  Double.parseDouble(secOperand);
					double out=0;
					 if(operation=="-")
					 { out= a-b;
					 }
					 if(operation=="+")
					 { out = a+b;
					 }
					 if(operation=="*")
					 { out=a*b;
					 }
					 if(operation=="/")
					 { out = a/b;
					 }
					 String z = Double.toString(out);
					 t1.setText(z);
					 firOperand=z;
					 secOperand="";
					 operation="-";
				}
				sub.setStyle("-fx-background-color:orange;");
				 //System.out.println(op);
			});
			
			
			
			equal.setOnAction(e->{
				numberLight(equal);
				double a = Double.parseDouble(firOperand);
				double b =  Double.parseDouble(secOperand);
				double out=0;
				 if(operation=="-")
				 { out= a-b;
				 }
				 if(operation=="+")
				 { out = a+b;
				 }
				 if(operation=="*")
				 { out=a*b;
				 }
				 if(operation=="/")
				 { out = a/b;
				 }
				 
				 String z = Double.toString(out);
				 t1.setText(z);
				 firOperand=z;
				
				 if(i<5)
				 { history[i]=z;
				 i=i+1;
				 }
				 else 
					 
				 {   i=i-1;
					 history[i]=firOperand;
							 
				 }
				 counterpointer=i;
		//		 System.out.println(h);
				 secOperand="";
				 operation="";
				 equal.setStyle("-fx-background-color:grey;");
			});
		
			
			prev.setOnAction(e->{
				numberLight(prev);
				//System.out.println(h);
				counterpointer=counterpointer-1;
				t1.setText(history[counterpointer]);
		      // System.out.println(h);
				firOperand=history[counterpointer];
				prev.setStyle("-fx-background-color:grey;");
			});
			next.setOnAction(e->{
				numberLight(next);
			//	System.out.println(h);
				counterpointer=counterpointer+1;
				t1.setText(history[counterpointer]);
				//System.out.println(h);
				firOperand=history[counterpointer];
				next.setStyle("-fx-background-color:grey;");
			});
			
			reset.setOnAction(e->{
				numberLight(reset);
				t1.setText("0");
				firOperand="";
				secOperand="";
				operation="";
				reset.setStyle("-fx-background-color:grey;");
			});
			
		HBox h1 = new HBox(40);
		h1.setAlignment(Pos.CENTER);
		h1.getChildren().addAll(b7,b8,b9,div);
		HBox h2 = new HBox(40);
		h2.setAlignment(Pos.CENTER);
		h2.getChildren().addAll(b4,b5,b6,mult);
		HBox h3 = new HBox(40);
		h3.setAlignment(Pos.CENTER);
		h3.getChildren().addAll(b1,b2,b3,sub);
		HBox h4= new HBox(40);
		h4.setAlignment(Pos.CENTER);
		h4.getChildren().addAll(b0,dot,add);
		HBox h5= new HBox(40);
		h5.setAlignment(Pos.CENTER);
		h5.getChildren().addAll(equal,reset,prev,next);
		
		VBox vb1 = new VBox(40);
		vb1.setAlignment(Pos.CENTER);
		vb1.getChildren().addAll(t1,h5,h1,h2,h3,h4);
		vb1.setStyle("-fx-background:black;-fx-border-color:black;");

			Scene scene = new Scene(vb1, 400 , 550);
			stage2.setTitle("IOS Calculator");
					stage2.setScene(scene);
					stage2.show();
		
		
	}
		public static void main(String[] args) {
			Application.launch(args);

		}

	}
