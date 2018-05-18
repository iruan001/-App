package com.ruide.test;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ruide.dao.IvipDAO;
import com.ruide.dao.IIvipDAO;
import com.ruide.po.Ivip;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring*.xml")
public class IvipDAOTest {
	@Resource
	private IIvipDAO ivipdao; 
	@Test
	public void findAll(){
		List<Ivip> list=ivipdao.findAll();
		System.out.println(list.size());
		//List<Ivip> list1=Ivipdao1.findAll();
		//System.out.println(list1.size());
	}
	
}
