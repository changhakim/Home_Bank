package service;

import domain.AccountBean;

public interface AccountService {
	public void createAccount(int money);
	
	public AccountBean[] findAll();
	public AccountBean findByAccountNum(String accountNum);
	public int countAccount();
	public boolean existAccount(String accountNum);
	
	public void depositMoney(int money);
	public void withdrawMoney(int money);
	
	public void deleteAccountNum(String accountNum);;
}

