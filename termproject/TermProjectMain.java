/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termproject;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import serverPkg.*;

/**
 *
 * @author USER
 */

class newThread implements Runnable
{
    Thread t;
    //serverController sControl;
    newThread()
    {
        t=new Thread(this);
        //sControl=sc;
        //if(sc==null) System.out.println("sc is null");
        t.start();
    }
    public void run()
    {
        new Server();
    }
}

public class TermProjectMain extends Application {
    
    homepageController hc;
    Stage stg;
    Server serv;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader=new FXMLLoader();
        if(loader==null)System.out.println("loader is null inside main");
        loader.setLocation(getClass().getResource("homepage.fxml"));
        

        Parent root = loader.load();
        hc=loader.getController();
        if(hc==null)System.out.println("hc is null inside main");
        hc.init();
        hc.setMain(this);
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        stg=stage;
        new newThread();
    }


    public void personalForm() throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("PersonalForm.fxml"));
        Parent root = loader.load();

        //Personal Controller
        PersonalController controller = loader.getController();
        controller.setMain(this);

        //Set The Primary stage
        stg.setTitle("Personal Form");
        stg.setScene(new Scene(root, 600, 400));
        stg.show();
    }

    public void showTicket() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("TicketViewController.fxml"));
        Parent root = loader.load();

        //Loading TicketView
        TicketViewController controller = loader.getController();
        controller.setMain(this);

        //set the primary Stage
        stg.setTitle("Ticket");
        stg.setScene(new Scene(root, 500, 300));
        stg.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
