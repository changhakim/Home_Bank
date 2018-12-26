package controller;

import javax.swing.JOptionPane;

import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;

public class BankController {
	public  void start() {
		MemberBean member = null;
		MemberBean[] members = null;
		MemberService memberservice = new MemberServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("[은행서비스 메뉴]\n"
					+ "0.정지\n"
					+ "1.회원가입\n"
					+ "2.회원리스트\n"
					+ "3.회원정보찾기\n"
					+ "4.동일정보회원찾기\n"
					+ "5.비밀번호변경\n"
					+ "6.회원정보삭제")) {
			case "0" : JOptionPane.showMessageDialog(null,"정지");return;
			case "1" :
				
			memberservice.join(JOptionPane.showInputDialog("이름을 입력하세요"),
						JOptionPane.showInputDialog("아이디를 입력하세요"),
						JOptionPane.showInputDialog("비밀번호를 입력하세요"),
						JOptionPane.showInputDialog("주민등록번호를 입력하세요"));
			break;
			case "2" :
				
				JOptionPane.showMessageDialog(null,memberservice.findAll());
				break;
			case "3" :	
				JOptionPane.showMessageDialog(null,memberservice.findOneById(JOptionPane.showInputDialog("아이디를 입력하세요")));
			
			break;
			
			case "4" :
				JOptionPane.showMessageDialog(null,memberservice.findSomeByName(JOptionPane.showInputDialog("이름을 입력하세요")));
				break;
			case "5" :
				memberservice.updatePass(JOptionPane.showInputDialog("아이디를 입력하세요"), 
						JOptionPane.showInputDialog("비밀번호를 입력하세요"), 
						JOptionPane.showInputDialog("변경하실 비밀번호를 입력하세요"));
				break;
			case "6" :
				memberservice.deleteId(JOptionPane.showInputDialog("아이디를 입력하세요"),
						JOptionPane.showInputDialog("비밀번호를 입력하세요"));
			}
		}
	}
}
