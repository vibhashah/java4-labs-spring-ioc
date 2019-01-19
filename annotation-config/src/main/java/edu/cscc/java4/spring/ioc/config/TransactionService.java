package edu.cscc.java4.spring.ioc.config;

/**
 * @author Jeff Anderson
 * @since 2019-01-19
 */
public class TransactionService {

  TransactionDAO transactionDAO;

  public TransactionService (TransactionDAO transactionDAO) {

    this.transactionDAO = transactionDAO;
  }


  public TransactionDAO getTransactionDAO () {

    return transactionDAO;
  }

}
