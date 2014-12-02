/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooka.jkjh;

import javax.ejb.EJB;
import ooka.jkjh.ejb.RegisterAtConferenceRemote;
import ooka.jkjh.ejb.PersonEntity;

/**
 *
 * @author JAYDESKTOP
 */
public class Client {

    @EJB
    private static RegisterAtConferenceRemote registerAtConference;

    public void run() {

        PersonEntity person = new PersonEntity("Jochen", "Kamuf", "Reviewer");
        Long personKey = Client.registerAtConference.registerPerson(person);

        person = Client.registerAtConference.getPersonByID(personKey);
        System.out.println("Gathered Person:" + person.getFirstName() + " " + person.getLastName() + ", with the role: " + person.getRole());

        person = new PersonEntity("Jon", "Herrmann", "Autor");
        personKey = Client.registerAtConference.registerPerson(person);

        person = Client.registerAtConference.getPersonByID(personKey);
        System.out.println("Gathered Person:" + person.getFirstName() + " " + person.getLastName() + ", with the role: " + person.getRole());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Client client = new Client();
        client.run();

    }

}
