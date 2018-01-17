package test;

import java.util.ArrayList;

import pojo.User;

public class ArrayListTest {

	public static void main(String[] args) {
		User[] user = new User[3];
		user[0] = new User("zhangsan", 10);
		user[1] = new User("lisi", 11);
		user[2] = new User("wangwu", 12);
		
		User[] newUser = new User[5];
		System.arraycopy(user, 0, newUser, 0, 3);
		for (int i = 0; i < newUser.length; i++) {
			System.out.println(newUser[i]);
		}
		
		//这里是arraylist的源码，底层的实现跟上面说法大致一样，本质是通过System.arraycopy（）方法实现的
		ArrayList<User> arrayList = new ArrayList<User>();
	}
}
