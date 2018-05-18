package com.ruide.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ruide.dao.IDeptDAO;
import com.ruide.po.Dept;

@Component(value="deptbiz")
public class DeptBiz {
	@Resource
	private IDeptDAO deptdao;
	public List<Dept> findAll(){
		return deptdao.findAll();
	}
	public List<Dept> findAll1(){
		return deptdao.findAll1();
	}
	public void save(Dept d){
		deptdao.save(d);
	}
	public void delete(int deptno){
		deptdao.delete(deptno);
	}
	public Dept findById( int deptno){
		return deptdao.findById(deptno);
	}
	public void merge(Dept d){
		deptdao.merge(d);
	}
}
