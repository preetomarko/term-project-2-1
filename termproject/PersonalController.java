// not modified by ARKO. have to replace the TextField by Labels and use setVisible() method

package termproject;


/**
 * Created by HP on 11/29/2015.
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PersonalController {

    public static TermProjectMain main;

    @FXML
    private TextField customerName;

    @FXML
    private TextField customerAddress;

    @FXML
    private TextField customerAge;

    @FXML
    private TextField customerMobile;

    @FXML
    private TextField customerEmail;

    @FXML
    private Button customerInfoSubmission;
    TicketViewController ticketViewController;
//PersonalInfo(String name,String mobile,String address,String email,String gender,int age)

    @FXML
    void submit(ActionEvent event) throws Exception {

        System.out.println("Submitted");
        PersonalInfo customer = new PersonalInfo(customerName.getText(), customerMobile.getText(), customerAddress.getText(), customerEmail.getText(), customerAge.getText());

        System.out.println(customer.getName());
        System.out.println(customer.getAddress());
        System.out.println(customer.getEmail());
        System.out.println(customer.getMobile());
        //ticketViewController.setCustomer(this);


        try {
            main.showTicket();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void setMain(TermProjectMain main){
        this.main = main;
    }

}
