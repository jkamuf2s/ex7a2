/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooka.jkjh.ejb;

import javax.ejb.Remote;

/**
 *
 * @author JAYDESKTOP
 */
@Remote
public interface RegisterAtConferenceRemote {

    String registerPerson(Person p);

    Person getPersonByID(int id);

}
