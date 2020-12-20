package model.bean;
public class Account {
	String id,pass,info;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}	
	public Account() {}
	public Account(String _id,String _pass, String _info)
	{
		id = _id;
		pass=_pass;
		info=_info;
	}

}
