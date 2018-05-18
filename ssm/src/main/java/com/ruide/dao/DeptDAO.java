package com.ruide.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import com.ruide.po.Dept;
@Component(value="deptdao1")
public class DeptDAO implements IDeptDAO{
	@Resource
	private SqlSessionTemplate session;
	public List<Dept> findAll() {
		List<Dept> list=session.selectList("com.ruide.dao.IDeptDAO.findAll");
		return list;
	}
	public List<Dept> findAll1() {
		List<Dept> list=session.selectList("com.ruide.dao.IDeptDAO.findAll1");
		return list;
	}
	public int save(Dept d) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int merge(Dept d) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Dept findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
