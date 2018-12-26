package domain;

public class MemberBean {
	private String name,id,pass,ssn;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "MemberServiceImpl [이름=" + name + ", 아이디=" + id + ", 비밀번호=" + pass + ", 주민번호=" + ssn + "]";
	}
	
}
