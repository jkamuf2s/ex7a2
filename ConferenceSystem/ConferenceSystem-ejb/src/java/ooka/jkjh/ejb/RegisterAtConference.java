package ooka.jkjh.ejb;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author JAYDESKTOP
 */
@Stateless
public class RegisterAtConference implements RegisterAtConferenceRemote {

    @EJB
    private PersonDao personDao;

    @Override
    public String registerPerson(Person p) {

        personDao.persist(p);

        return "Person:" + p.getFirstName() + " " + p.getLastName() + " successfully registered at the conference";

    }

    @Override
    public Person getPersonByID(int id) {

        List<PersonEntity> personEntityList = personDao.getAllPersons();

        for (PersonEntity personEntity : personEntityList) {
            if (id == personEntity.getId()) {
                Person resultPerson = new Person(personEntity.getFirstName(), personEntity.getLastName(), personEntity.getRole());
                return resultPerson;
            }

        }

        throw new IllegalAccessError("Person with id: " + id + " does not exist in database");
    }

}
