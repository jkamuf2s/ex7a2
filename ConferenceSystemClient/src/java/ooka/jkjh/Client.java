/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooka.jkjh;

import javax.ejb.EJB;
import ooka.jkjh.ejb.RegisterAtConferenceRemote;

/**
 *
 * @author JAYDESKTOP
 */
public class Client {

    @EJB
    private static RegisterAtConferenceRemote registerAtConference;

    public void run() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Client client = new Client();
        client.run();

    }

}
