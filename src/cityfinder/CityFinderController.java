package cityfinder;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import org.controlsfx.control.textfield.TextFields;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CityFinderController implements Initializable {

    @FXML
    private TextField textfield;

    @FXML
    private Button search;

    @FXML
    private Label country;

    @FXML
    private Label city;
    private Map<String, String>map;
   
    
    public void Search()
    {
    	country.setText("");
    	city.setText("");
    	String text = textfield.getText().toUpperCase();
    	if (map.containsKey(text)) {
			country.setText("The City of "+ text +" is");
			city.setText(map.get(text));
		}
    	else
    	{
    		country.setText("There is no Recored in CityFinder");
    	}
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		map = new HashMap<String, String>();
		map.put("MYANMAR", "NAPYITAW");
		map.put("THAILAND", "BANKOK");
		map.put("SINGAPORE", "SINGAPORE");
		map.put("USA", "LONDON");
		map.put("JAPAN", "TOKYO");
		TextFields.bindAutoCompletion(textfield, map.keySet());
	}
	
	

}
