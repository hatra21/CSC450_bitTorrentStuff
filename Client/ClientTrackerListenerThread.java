package Client;

import java.util.Scanner;

import Client.ClientCORE;

public class ClientTrackerListenerThread extends Thread {

    private Scanner trackerInput;

    public ClientTrackerListenerThread(Scanner trackerInput) {
        this.trackerInput = trackerInput;
    }

    public void run() {
        // constantly listen for a new incoming list of connected IPs
        while (true) {
            String listOfIPs = this.trackerInput.nextLine();
            System.out.println(listOfIPs);
            ClientCORE.updateTheConnectedClientIPs(listOfIPs);
        }
    }

}
