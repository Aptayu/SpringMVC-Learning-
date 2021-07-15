package springmvc.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import springmvc.model.User;

public class UserDao {

	private HibernateTemplate hibernateTemplate;

	public int saveUser(User user) {

		int id = (Integer) this.hibernateTemplate.save(user);

		return 1;
	}

}
