package com.ruide.test;

import java.io.InputStream;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestSession {
	public static void main(String[] args) throws SQLException {
		//Configuration->SessionFactory->Session
		//读取到了主配置文件信息
		InputStream in=
				TestSession.class.getClassLoader().getResourceAsStream("mybatis.xml");
		//获取到了sqlsessionfactory的编辑器
		SqlSessionFactoryBuilder bu=new SqlSessionFactoryBuilder();
		//通过编辑器创建了sqlsessionfactory
		SqlSessionFactory sessionFactory = bu.build(in);
		//创建sqlsession
		SqlSession session=sessionFactory.openSession();
		//测试session是否可以链接到数据库 false开启着
		boolean iden=session.getConnection().isClosed();
		System.out.println(iden);
		
	}
}
