package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Person;
import pe.com.peruInka.core.domain.TypeDocument;
import pe.com.peruInka.core.domain.UserSystem;

public interface PersonDAO {

	List<Person> findAllPerson();

	List<UserSystem> findAllUser();

	List<TypeDocument> findTypeDocument();
	
	void savePerson(Person person);
	
	Person findPersonById(Long id);
	
	void deletePerson(Person person);
	
	void saveUserSystem(UserSystem userSystem);
	
	UserSystem findUserSystemById(Long id);	
	
}
