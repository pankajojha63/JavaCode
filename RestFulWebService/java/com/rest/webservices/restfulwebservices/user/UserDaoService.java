package com.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> userList = new ArrayList<User>();
	private static int usercount = 5;

	static {
		userList.add(new User("Pankaj1", 1, new Date()));
		userList.add(new User("Pankaj2", 2, new Date()));
		userList.add(new User("Pankaj3", 3, new Date()));
		userList.add(new User("Pankaj4", 4, new Date()));
		userList.add(new User("Pankaj5", 5, new Date()));
	}

	public List<User> findAll() {
		return userList;
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++usercount);

		}
		userList.add(user);
		return user;
	}

	public User findOne(int id) {
		for (User user : userList) {
			if (user.getId() == id)
				return user;
		}
		return null;
	}

	public User deleteById(int id) {
		Iterator<User> itr = userList.iterator() ;
		while (itr.hasNext()){
			User user = itr.next();
			if (user.getId() == id){
				itr.remove();
				return user;
			}
		}
		return null;
	}

	public void updateUser(int id, User user) {
		Iterator<User> itr = userList.iterator();
		while (itr.hasNext()) {
			User dummyUser = itr.next();
			if (user.getId() == id) {
				dummyUser.setbDate(user.getbDate());
				dummyUser.setName(user.getName());
			}
		}
	}
}
