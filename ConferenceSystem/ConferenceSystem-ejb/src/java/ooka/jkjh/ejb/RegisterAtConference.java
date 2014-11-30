package ooka.jkjh.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author JAYDESKTOP
 */
@Stateless
public class RegisterAtConference implements RegisterAtConferenceRemote {

    @Override
    public String registerPerson(Person p) {
        return "Person successfully registered at the conference";
    }

}
