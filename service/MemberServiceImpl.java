package service;

import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	private MemberBean[] members;
	private int count;

	public MemberServiceImpl() {
		members = new MemberBean[10];
		count = 0;

	}

	@Override
	public void join(String name, String id, String pass, String ssn) {
		MemberBean member = new MemberBean();
		member.setName(name);
		member.setId(id);
		member.setPass(pass);
		member.setSsn(ssn);
		members[count] = member;
		count++;

	}

	@Override
	public MemberBean[] findAll() {

		return members;
	}

	@Override
	public int findSomeCount(String name) {
		int a = 0;
		for(int i =0;i<count;i++) {
			if(members[i].getName().equals(name)) { //메소드로 넣으면 더 빠를까?
				a++;
			}
		}
		return a;
	}
	@Override
	public MemberBean[] findSomeByName(String name) {

		/*int a = 0;
		for(int i =0;i<count;i++) {
			if(members[i].getName().equals(name)) {
				a++;
			}
		}
		 */
		MemberBean[] members1 = new MemberBean[findSomeCount(name)];
		System.out.println("메소드 배열길이증가보기"+findSomeCount(name));
		int j = 0;
		for(int i =0;i<count;i++) {
			if(members[i].getName().equals(name)) {
				members1[j] = members[i];
				j++;
			}
		}

		return members1;
	}

	@Override
	public MemberBean findOneById(String id) {
		MemberBean member = new MemberBean();
		for(int i=0;i<count;i++) {
			if(members[i].getId().equals(id)) {
				member = members[i];
			}
		}
		return member;
	}

	@Override
	public boolean existByIdPass(String id,String pass) {
		boolean ok = false;
		for(int i=0;i<count;i++) {
			if(members[i].getId().equals(id) && members[i].getPass().equals(pass)) {
				ok = true;
			}
		}
		return ok;
	}

	@Override
	public int countMember() {

		return count;
	}

	@Override
	public void updatePass(String id, String pass, String newpass) {
		for(int i =0;i<count;i++) {
			if(existByIdPass(id, pass)) {
				members[i].setPass(newpass);
			}
		}

	}

	@Override
	public void deleteId(String id, String pass) {
		for(int i =0;i<count;i++) {
			if(existByIdPass(id, pass)) {
				members[i] = members[count-1];
				System.out.println(members[i]);
				System.out.println(members[count-1]);
				members[count-1] = null;
				count--;
			}
		}

	}


}
