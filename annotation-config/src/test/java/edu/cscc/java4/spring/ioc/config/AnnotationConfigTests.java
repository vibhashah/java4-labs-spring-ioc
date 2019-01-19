package edu.cscc.java4.spring.ioc.config;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertThat;

/**
 * @author Jeff Anderson
 * @since 2019-01-19
 */
public class AnnotationConfigTests {

  @Test
  public void beansXmlDoesntExistsInClasspathTest () {
    assertNull(Thread.currentThread().getContextClassLoader().getResource("beans.xml"));
  }

  /*  -- Uncomment one method at a time adding in just enough code to make the test pass --

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
  public void appConfigHasComponentScanAnnotationTest () {
    AppConfig appConfig = new AppConfig();
    Annotation annotation = appConfig.getClass().getAnnotation(org.springframework.context.annotation.ComponentScan.class);
    assertNotNull(annotation);
    assertThat(annotation.toString(), CoreMatchers.containsString("basePackages=[edu.cscc.java4.spring.ioc.config]"));
  }

  @Test
  public void contextLoadsTest () {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
  }

  @Test
  public void accountDAOIsProperlyConfiguredTest () {
    assertNotNull(new AccountDAO().getClass().getAnnotation(org.springframework.stereotype.Component.class));
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    Object accountDAO = context.getBean("accountDAO");
    assertNotNull(accountDAO);
    assertEquals("edu.cscc.java4.spring.ioc.config.AccountDAO",accountDAO.getClass().getName());
    assertEquals(0,new AppConfig().getClass().getDeclaredMethods().length);
  }

  @Test
  public void accountServiceIsProperlyConfiguredTest () {
    assertNotNull(new AccountService().getClass().getAnnotation(org.springframework.stereotype.Service.class));
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    Object accountService = context.getBean("accountService");
    assertNotNull(accountService);
    assertEquals("edu.cscc.java4.spring.ioc.config.AccountService",accountService.getClass().getName());
    assertEquals(0,new AppConfig().getClass().getDeclaredMethods().length);
  }

  @Test
  public void accountDAOInjectedIntoServiceTest () throws Exception {
    Class[] paramList = { AccountDAO.class };
    assertNotNull(new AccountService().getClass().getMethod("setAccountDAO", paramList).getAnnotation(org.springframework.beans.factory.annotation.Autowired.class));

    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    AccountService accountService = context.getBean(AccountService.class);
    assertNotNull(accountService.getAccountDAO());
  }

  @Test
  public void transactionDAOBeanProperlyDefinedTest () {
    assertNotNull(new TransactionDAO().getClass().getAnnotation(org.springframework.stereotype.Component.class));
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    Object transactionDAO = context.getBean("transactionDAO");
    assertNotNull(transactionDAO);
    assertEquals("edu.cscc.java4.spring.ioc.config.TransactionDAO",transactionDAO.getClass().getName());
    assertEquals(0,new AppConfig().getClass().getDeclaredMethods().length);

  }

  @Test
  public void transactionServiceProperlyConfiguredTest () {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    Object transactionService = context.getBean(TransactionService.class);
    assertNotNull(transactionService);
    assertNotNull(transactionService.getClass().getAnnotation(org.springframework.stereotype.Service.class));
    assertEquals("edu.cscc.java4.spring.ioc.config.TransactionService",transactionService.getClass().getName());
    assertEquals(0,new AppConfig().getClass().getDeclaredMethods().length);
  }

  */

}
