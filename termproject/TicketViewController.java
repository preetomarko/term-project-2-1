
/**
 * Created by HP on 11/29/2015.
 */

package termproject;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TicketViewController {

    @FXML
    private TextField startingStation;

    @FXML
    private TextField pin;

    @FXML
    private TextField destinationStation;

    @FXML
    private TextField cost;

    @FXML
    private TextField seats;

    private TermProjectMain main;
    PersonalInfo customer;
    public void setMain(TermProjectMain main) {
        this.main = main;
    }

    public void setCustomer(PersonalController personalController) {
        this.customer = customer;
    }
}
