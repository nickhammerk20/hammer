package dal;

import java.sql.SQLException;
import java.util.ArrayList;

import blogic.Person;

public interface PersonDAO_Hibernate 
{
	void create(Person p) throws SQLException;
	ArrayList<Person> read() throws SQLException;
	void update (Person p) throws SQLException;
	void delete (Person p) throws SQLException;
}
