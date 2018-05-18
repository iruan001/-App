package com.ruide.test;


import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ruide.dao.DeptDAO;
import com.ruide.dao.IDeptDAO;
import com.ruide.po.Dept;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring*.xml")
public class SSMTest {
	@Resource
	private IDeptDAO deptdao;
	@Resource
	private DeptDAO deptdao1; 
	@Test
	public void findAll(){
		List<Dept> list=deptdao.findAll();
		System.out.println(list.size());
		//List<Dept> list1=deptdao1.findAll();
		//System.out.println(list1.size());
	}
}
