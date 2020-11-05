package application;



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CriteriaController implements Initializable {
	
	static HouseList availableHouses;
	
	
	@FXML
	public TextField minimumPrice;
	@FXML
	public TextField maximumPrice;
	@FXML
	public TextField minimumArea;
	@FXML
	public TextField maximumArea;
	@FXML
	public TextField minimumNumberOfBedrooms;
	@FXML
	public TextField maximumNumberOfBedrooms;
	@FXML
	public TextField chosenHome;
	
	@FXML
	public Button id1;
	
	@FXML
	public Button id2;
	
	int minPrice;
	int  maxPrice;
	int  minArea;
	int  maxArea;
	int  minNoBedrooms;
	int maxNoBedrooms;
//	private String minPrice;
	
	public void findMyDreamHouse(ActionEvent e){
		
		if(!minimumPrice.getText().equals("")){
			minPrice=Integer.parseInt(minimumPrice.getText());
		}else{
			minPrice=0;
		}
		if(!maximumPrice.getText().equals("")){
			maxPrice=Integer.parseInt(maximumPrice.getText());
		}else{
			maxPrice=9999999;
		}
		if(!minimumArea.getText().equals("")){
			minArea=Integer.parseInt(minimumArea.getText());
		}else{
			minArea=0;
		}
		if(!maximumArea.getText().equals("")){
			maxArea=Integer.parseInt(maximumArea.getText());
		}else{
			maxArea=999999;
		}
		if(!minimumNumberOfBedrooms.getText().equals("")){
			minNoBedrooms=Integer.parseInt(minimumNumberOfBedrooms.getText());
		}else{
			minNoBedrooms=0;
		}
		if(!maximumNumberOfBedrooms.getText().equals("")){
			maxNoBedrooms=Integer.parseInt(maximumNumberOfBedrooms.getText());
		}else{
			maxNoBedrooms=9999999;
		}
	
		availableHouses = new HouseList("houses.txt");
	    Criteria c1 = new Criteria(minPrice, maxPrice, minArea, maxArea, minNoBedrooms, maxNoBedrooms);
	    
	    String res=availableHouses.printHouses(c1);
	    
	    chosenHome.setText(res);
		id1.setDisable(false);
		id2.setDisable(true);
	}
	
	public void findMeAnother(ActionEvent e){
		
		availableHouses = new HouseList("houses.txt");
		Criteria c1 = new Criteria(minPrice, maxPrice, minArea, maxArea, minNoBedrooms, maxNoBedrooms);
	    String res=availableHouses.printHouses(c1);
	    
	    chosenHome.setText(res);
	}

	public void reset(ActionEvent e){
		minimumPrice.clear();
		maximumPrice.clear();
		minimumArea.clear();
		maximumArea.clear();
		minimumNumberOfBedrooms.clear();
		maximumNumberOfBedrooms.clear();
		chosenHome.clear();
		
		id1.setDisable(true);
		id2.setDisable(false);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	
	}


}
