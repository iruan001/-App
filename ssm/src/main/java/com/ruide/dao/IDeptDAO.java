package com.ruide.dao;

import java.util.List;

import com.ruide.po.Dept;

public interface IDeptDAO {
	public List<Dept> findAll();
	public List<Dept> findAll1();
	public int save(Dept d);
	public int delete(int id);
	public int merge(Dept d);
	public Dept findById(int id);
}
