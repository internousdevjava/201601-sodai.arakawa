package com.internousdev.loginTest.Action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.loginTest.DAO.LoginTestDAO;
import com.internousdev.loginTest.DTO.LoginTestDTO;
import com.opensymphony.xwork2.ActionSupport;





public class LoginTestAction extends ActionSupport implements SessionAware{
	private String id;
	private String password;
	private String message;
	private Map<String,Object>session;

	public String execute(){

		LoginTestDAO dao = new LoginTestDAO();
		boolean res = dao.select(id,password);

		if(!res){
			setMessage("IDもしくはパスワードが間違っています");

			return ERROR;
		}

		LoginTestDTO dto = new LoginTestDTO(id, password);
		session.put("id", dto.getId());

		return SUCCESS;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id = id;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}