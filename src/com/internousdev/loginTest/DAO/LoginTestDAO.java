package com.internousdev.loginTest.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.loginTest.util.LoginTestDBConnector;

public class LoginTestDAO {
	private boolean res;
	private Connection con;
	private String sql;
	private PreparedStatement ps;
	private ResultSet rs;

	public boolean select(String id, String password){

		res=false;
		try{
			con = (Connection)LoginTestDBConnector.getConnection();
			sql = "SELECT * FROM test_table WHERE";
			sql+= " id = ? AND password = ? ";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
			rs = ps.executeQuery();

			if(rs.next()){
				res = true;
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return res;
	}
}