package com.students.programmer.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.students.programmer.model.Admin;



public class AdminDao extends BaseDao {
	
	public Admin login(String name ,String password){
		String sql = "select * from s_admin where name = '" + name + "' and password = '" + password + "'";
		ResultSet resultSet = query(sql);
		try {
			if(resultSet.next()){
				Admin admin = new Admin();
				admin.setId(resultSet.getInt("id"));
				admin.setName(resultSet.getString("name"));
				admin.setPassword(resultSet.getString("password"));
				admin.setStatus(resultSet.getInt("status"));
				return admin;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public boolean editPassword(Admin admin,String newPassword) {
		String sql = "update s_admin set password = '"+newPassword+"' where id = " + admin.getId();
		return update(sql);
	}
}
