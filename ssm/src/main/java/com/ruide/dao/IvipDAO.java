package com.ruide.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;

import com.ruide.po.Ivip;

public class IvipDAO {
	@Resource
	private SqlSessionTemplate session;
	public List<Ivip> findAll() {
		List<Ivip> list=session.selectList("com.ruide.dao.IIvip.findAll");
		return list;
	}
}
