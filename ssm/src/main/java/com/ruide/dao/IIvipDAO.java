package com.ruide.dao;

import java.util.List;

import com.ruide.po.Ivip;

public interface IIvipDAO {
	public List<Ivip> findAll();
	public int save(Ivip ivip);
}
