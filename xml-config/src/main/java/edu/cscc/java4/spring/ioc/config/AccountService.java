package edu.cscc.java4.spring.ioc.config;

/**
 * @author Jeff Anderson
 * @since 2019-01-19
 */
public class AccountService {

  AccountDAO accountDAO;


  public AccountDAO getAccountDAO () {

    return accountDAO;
  }


  public void setAccountDAO (AccountDAO accountDAO) {

    this.accountDAO = accountDAO;
  }

}
