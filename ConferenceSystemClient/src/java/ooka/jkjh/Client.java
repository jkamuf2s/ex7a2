/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooka.jkjh;

import javax.ejb.EJB;
import ooka.jkjh.ejb.RegisterAtConferenceRemote;
import ooka.jkjh.ejb.Person;

/**
 *
 * @author JAYDESKTOP
 */
public class Client {

    @EJB
    private static RegisterAtConferenceRemote registerAtConference;

    public void run() {
        Person inputPerson = new Person("Jochen", "Kamuf", "Participant");
        String result = Client.registerAtConference.registerPerson(inputPerson);
        System.out.println(result);

        inputPerson = new Person("Jon", "Herrmann", "Reviewer");
        result = Client.registerAtConference.registerPerson(inputPerson);
        System.out.println(result);

        Person resultPerson = Client.registerAtConference.getPersonByID(1);
        System.out.println("Gathered Person:" + resultPerson.getFirstName() + " " + resultPerson.getLastName() + ", with the role: " + resultPerson.getRole());

        resultPerson = Client.registerAtConference.getPersonByID(2);
        System.out.println("Gathered Person:" + resultPerson.getFirstName() + " " + resultPerson.getLastName() + ", with the role: " + resultPerson.getRole());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Client client = new Client();
        client.run();

    }

}
