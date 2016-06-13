package pe.com.peruInka.core.dao;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.peruInka.core.domain.Person;
import pe.com.peruInka.core.domain.StatusPerson;
import pe.com.peruInka.core.domain.StatusUser;
import pe.com.peruInka.core.domain.UserSystem;
import pe.com.peruInka.service.services.PeruInkaService;

public class PersonDAOImpTest extends AbstractUnitTest {

	@Autowired
	protected PersonDAO personDAO;
	// PersonDAO personDAO = new PersonDAO();

	
	@Autowired
	protected PeruInkaService peruInkaService;
	
	public void test() {
		System.out.println(peruInkaService);
	}
	
	
	public void testFindAllPerson() {
		System.out.println("===" + personDAO.findAllPerson());
	}

	public void testFindAllUser() {
		System.out.println("::::" + personDAO.findAllUser());

	}

	public void testFindTypeDocument() {
		System.out.println("::::" + personDAO.findTypeDocument().size());
	}

	public void testSavePerson() {
		testFindAllPerson();
		
		Person person = new Person();
		person.setAddress("Jr: Puno 212121");
		person.setName("Juan");
		person.setLastNameF("Perez");
		person.setLastNameM("Perez");

		StatusPerson statusPerson = new StatusPerson();
		statusPerson.setTypeCode(StatusPerson.Status.PERSON_ACT.toString());
		
		person.setStatusPerson(statusPerson);
		
		personDAO.savePerson(person);
		testFindAllPerson();
		setComplete();
		
	}

	public void testFindPersonById(){
		
		System.out.println("::: "+personDAO.findPersonById(5L));
		Person person = personDAO.findPersonById(5L);
		
		System.out.println("Name: "+person.getName());
		System.out.println("Address: "+person.getAddress());
		
	}
	

	public void testDeletePerson(){
		Person person = personDAO.findPersonById(4L);
		personDAO.deletePerson(person);
		setComplete();
	}
	
	
	public void testSaveUserSystem(){
		
		UserSystem userSystem = new UserSystem();
		userSystem.setUserName("rodrigo");
		userSystem.setUserPassword("3455");
		userSystem.setDateEnd(new Date());
		userSystem.setDateEnd(new Date());
		
		StatusUser statusUser = new StatusUser();
		statusUser.setTypeCode(statusUser.USER_ACT);
		
		userSystem.setStatusUser(statusUser);
		
		Person person = personDAO.findPersonById(3L); 
		
		userSystem.setPerson(person);
		
		personDAO.saveUserSystem(userSystem);
		setComplete();
		
	}
	
	
	
	public void testFindUserSystem(){
		UserSystem userSystem = personDAO.findUserSystemById(3L);
		
		
		System.out.println(userSystem);
		
		
	}

	
	
	
	
}
