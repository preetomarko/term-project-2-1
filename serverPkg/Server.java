package serverPkg;

import java.net.ServerSocket;
import java.net.Socket;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import networkUtil.*;
import clientInfoPkg.*;



public class Server {

	private ServerSocket ServSock;
    //serverController sControl;
	
	public Server() {
        System.out.println("inside Server class constructor");
        //sControl=sc;
       // if(sControl==null) System.out.println("sc is null");
        try {
			ServSock = new ServerSocket(55555);
			while (true) {
				ServerThread m = new ServerThread(ServSock.accept());   //wait for accepting connection from client
				System.out.println("connection accepted");
			}
		}catch(Exception e) {
			System.out.println("Server starts:"+e);
		}
	}

}

class ServerThread implements Runnable {
	private Socket ClientSock;
	private Thread thr;
	private NetworkUtil nc;
    clientInfo c;
    //serverController sc;

	ServerThread(Socket client) {
		this.ClientSock = client;
		this.thr = new Thread(this);
		//this.sc=sc;
		thr.start();
	}


	public void run() {
		this.nc=new NetworkUtil(ClientSock);
		// now connection accepted
        c=(clientInfo) nc.read();
		System.out.println("read from the client");

        // SEEK AVAILABLE SEATS FROM THE DATABASE

	}
}

