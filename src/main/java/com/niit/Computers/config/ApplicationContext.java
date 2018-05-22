package com.niit.Computers.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Computers.Dao.CategoryDaoImp;
import com.niit.Computers.Dao.ProductDaoImp;
import com.niit.Computers.Dao.UserDetailsDaoImp;

@Configuration
@ComponentScan(basePackages="com.niit.Computers")
@EnableTransactionManagement
public class ApplicationContext {
	
	@Bean(name="sessionFactory")
	@Autowired
	   public LocalSessionFactoryBean sessionFactory() {
	      LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	      sessionFactory.setDataSource(dataSource());
	      sessionFactory.setPackagesToScan("com.niit.Computers.model");
	      sessionFactory.setHibernateProperties(hibernateProperties());
	 
	      return sessionFactory;
	   }
	@Transactional
	   public Properties hibernateProperties() 
	   {
		Properties properties=new Properties();
		properties.setProperty("hibernate.show_sql","true");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.setProperty("hibernate.hbm2ddl.auto","create");
		
		return properties;
	}

	@Bean(name="dataSource")
	
	   public DataSource dataSource() {
	      DriverManagerDataSource dataSource = new DriverManagerDataSource();
	      dataSource.setDriverClassName("org.h2.Driver");
	      dataSource.setUrl("jdbc:h2:~/NIITDATA");
	      dataSource.setUsername("sa");
	      dataSource.setPassword("");
	 
	      return dataSource;
	   }
	 
	   @Bean(name="transactionManager")
	   @Autowired
	   public HibernateTransactionManager transactionManager(SessionFactory sessionFactory)
	   {
	
		   HibernateTransactionManager hibernateTransactionManager= new HibernateTransactionManager();
		   hibernateTransactionManager.setSessionFactory(sessionFactory);
 
		   return hibernateTransactionManager;
	   }
	   
	   @Autowired
		@Bean(name="UserDetailsDao")
		public UserDetailsDaoImp getUserDetailsDaoImpl() {
			
		   return new UserDetailsDaoImp();
			
		}
	   @Autowired
		@Bean(name="ProductDao")
		public ProductDaoImp getProductDaoImpl() {
			
		   return new ProductDaoImp();
			
		}
	   @Autowired
		@Bean(name="CategoryDao")
		public CategoryDaoImp getCategoryDaoImpl() {
			
		   return new CategoryDaoImp();
			
		}

}
