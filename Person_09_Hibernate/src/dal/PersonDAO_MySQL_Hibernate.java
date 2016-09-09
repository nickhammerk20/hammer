package dal;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.query.Query;

import blogic.Person;

public class PersonDAO_MySQL_Hibernate implements PersonDAO 
{

	@Override
	public void create(Person p) 
	{
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public ArrayList<Person> read() 
	{
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery("FROM Person"); //HQL
		ArrayList<Person> pp = (ArrayList<Person>) query.getResultList();
		session.getTransaction().commit();
		session.close();
		return pp;
	}

	@Override
	public void update(Person p) 
	{

	}

	@Override
	public void delete(Person p) 
	{

	}

}
