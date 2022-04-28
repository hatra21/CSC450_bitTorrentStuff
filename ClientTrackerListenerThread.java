import java.util.Scanner;

import Client.ClientCORE;

public class ClientTrackerListenerThread {

    private Scanner trackerInput;

    public ClientTrackerListenerThread(Scanner trackerInput) {
        this.trackerInput = trackerInput;
    }

    public void run() {
        // constantly listen for a new incoming list of connected IPs
        while (true) {
            String listOfIPs = this.trackerInput.nextLine();
            ClientCORE.updateTheConnectedClientIPs(listOfIPs);
        }
    }
}
