package edu.cscc.java4.spring.ioc.config;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static junit.framework.TestCase.*;

/**
 * @author Jeff Anderson
 * @since 2019-01-19
 */
public class XmlConfigTests {

   /* --- Uncomment one test at a time fixing just one thing at a time ---


   // Create "beans.xml" file in the resources directory based on the example shown here:
   // https://docs.spring.io/spring/docs/5.1.4.RELEASE/spring-framework-reference/core.html#beans-factory-metadata
  @Test
  public void beansXmlExistsInClasspathTest () {
    assertNotNull(Thread.currentThread().getContextClassLoader().getResource("beans.xml"));
  }

  // Make sure the file is properly formed.  NOTE.  There should be nothing between the <beans> and </beans> tags
  // at this point:
  @Test
  public void contextLoadsTest () {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
  }

  @Test
  public void beanNamedAccountDAOExistsTest () {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    assertNotNull(context.getBean("accountDAO"));
  }

  @Test
  public void accountDAOBeanIsCorrectClassTest () {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    assertEquals("edu.cscc.java4.spring.ioc.config.AccountDAO",
      context.getBean("accountDAO").getClass().getName());
  }

  @Test
  public void accountServiceBeanExistsTest () {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    assertNotNull(context.getBean(AccountService.class));
  }

  @Test
  public void accountServiceBeanAliasExistsTest () {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    assertNotNull(context.getBean("accountServiceAlternateName"));
    assertEquals(context.getBean("accountService").getClass().getName(),
      context.getBean("accountServiceAlternateName").getClass().getName());
  }

  @Test
  public void accountDAOInjectedIntoServiceTest () {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    AccountService accountService = context.getBean(AccountService.class);
    assertNotNull(accountService.getAccountDAO());
  }

  @Test
  public void transactionDAOBeanProperlyDefinedTest () {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    assertNotNull(context.getBean(TransactionDAO.class));
  }

  @Test
  public void transactionServiceProperlyConfiguredTest () {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    TransactionService transactionService = context.getBean(TransactionService.class);
    assertNotNull(transactionService.getTransactionDAO());
  }

  @Test
  public void propertyOnTransctionDAOIsSetTest () {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    TransactionDAO transactionDAO = context.getBean(TransactionDAO.class);
    assertEquals("someValue",transactionDAO.getSomeProperty());
  }

  */

}
