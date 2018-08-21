package com.dity.mybatisplus;

import com.dity.mybatisplus.entity.User;
import com.dity.mybatisplus.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisPlusApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
		User user = new User();
		user.setName("李四");
		user.setAge(18);
		user.setSalary(3000d);
		user.setBirth(new Date());
		Integer insert = userMapper.insert(user);
		System.out.println("插入了：" + insert + "条数据");
		System.out.println("插入的id是:" + user.getId());

	}

	@Test
	public void testQuery(){
		User user = new User();
		user.setName("张三");
		user=userMapper.selectOne(user);
		System.out.println(user);
	}
}
