package service;

import domain.MemberBean;

public interface MemberService {

	public void join(String name,String id,String pass,String ssn);
	
	public MemberBean[] findAll();
	public MemberBean[]	findSomeByName(String name);
	public MemberBean findOneById(String id);
	public boolean existByIdPass(String id,String pass);
	public int countMember();
	public int findSomeCount(String name);
	
	public void updatePass(String id,String pass,String newpass);
	
	public void deleteId(String id,String pass);
}
