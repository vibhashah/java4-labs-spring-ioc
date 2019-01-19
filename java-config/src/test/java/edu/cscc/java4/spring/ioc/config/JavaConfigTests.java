package edu.cscc.java4.spring.ioc.config;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static junit.framework.TestCase.*;

/**
 * @author Jeff Anderson
 * @since 2019-01-19
 */
public class JavaConfigTests {

  @Test
  public void beansXmlDoesntExistsInClasspathTest () {
    assertNull(Thread.currentThread().getContextClassLoader().getResource("beans.xml"));
  }

  /* --- Uncomment one test at a time changing just enough to get the test passing ---

  @Test
  public void appConfigClassExistsInClasspathTest () throws Exception {
    assertNotNull(Class.forName("edu.cscc.java4.spring.ioc.config.AppConfig").newInstance());
  }

  @Test
  public void appConfigHasConfigurationAnnotationTest () {
    AppConfig appConfig = new AppConfig();
    assertNotNull(appConfig.getClass().getAnnotation(org.springframework.context.annotation.Configuration.class));
  }

  @Test
  public void contextLoadsTest () {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
  }

  @Test
  public void accountDAOProperlyConfiguredTest () {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    Object accountDAO = context.getBean("accountDAO");
    assertNotNull(accountDAO);
    assertEquals("edu.cscc.java4.spring.ioc.config.AccountDAO",accountDAO.getClass().getName());
  }

  @Test
  public void accountServiceBeanExistsTest () {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    assertNotNull(context.getBean(AccountService.class));
  }

  @Test
  public void accountServiceBeanAliasExistsTest () {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    assertNotNull(context.getBean("accountServiceAlternateName"));
    assertEquals(context.getBean("accountService").getClass().getName(),
      context.getBean("accountServiceAlternateName").getClass().getName());
  }

  @Test
  public void accountDAOInjectedIntoServiceTest () {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    AccountService accountService = context.getBean(AccountService.class);
    assertNotNull(accountService.getAccountDAO());
  }

  @Test
  public void transactionDAOBeanProperlyDefinedTest () {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    assertNotNull(context.getBean(TransactionDAO.class));
  }

  @Test
  public void transactionServiceProperlyConfiguredTest () {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    TransactionService transactionService = context.getBean(TransactionService.class);
    assertNotNull(transactionService.getTransactionDAO());
  }

  @Test
  public void propertyOnTransctionDAOIsSetTest () {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    TransactionDAO transactionDAO = context.getBean(TransactionDAO.class);
    assertEquals("someValue",transactionDAO.getSomeProperty());
  }

  */

}
