package dal;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import blogic.Person;
import util.HibernateUtil;

public class PersonDAO_Hibernate_Impl implements PersonDAO_Hibernate
{
	ArrayList<Person> pp = null;

	@Override
	public void create(Person p) throws SQLException 
	{
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
//			session.save(Person p);
			session.getTransaction().commit();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
		} finally {
			if (session != null && session.isOpen()) {

				session.close();
			}
		}
	}

	@Override
	public ArrayList<Person> read() throws SQLException 
	{

		return null;
	}

	@Override
	public void update(Person p) throws SQLException 
	{

	}

	@Override
	public void delete(Person p) throws SQLException 
	{

	}


}