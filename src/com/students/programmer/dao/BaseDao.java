package com.students.programmer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.students.programmer.util.DbUtil;

public class BaseDao {
	private DbUtil dbUtil = new DbUtil();
	
	/**
	 * 关闭数据库连接 释放资源
	 */
	public void closeCon(){
		dbUtil.closeCon();
	}
	
	/**
	 * 基础查询 多条查询
	 *
	 */
	public ResultSet query(String sql){
		try {
			PreparedStatement prepareStatement = dbUtil.getConnection().prepareStatement(sql);
			return prepareStatement.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	} 
	/**
	 *更新数据库
	 */
	public boolean update(String sql){
		try {
			return dbUtil.getConnection().prepareStatement(sql).executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public Connection getConnection(){
		return dbUtil.getConnection();
	}
}

