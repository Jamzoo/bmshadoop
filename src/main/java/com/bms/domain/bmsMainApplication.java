package com.bms.domain;




import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.apache.log4j.Logger;
import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.deploy.SecurityCollection;
import org.apache.catalina.deploy.SecurityConstraint;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
import org.springframework.web.bind.annotation.RestController;


import javax.sql.DataSource;

@Component
//@MapperScan(basePackages = {"com.bms.restful"})
@Configuration
@RestController
@EnableAutoConfiguration
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.bms.domain,com.bms.restful,com.bms.Receiver"})
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class  bmsMainApplication implements TransactionManagementConfigurer  {//,EnvironmentAware,Ordered
//public class  SpringbootApplication extends TomcatEmbeddedServletContainerFactory {
    @Autowired
    private DataSource dataSource;
	private static Logger logger = Logger.getLogger(bmsMainApplication.class);
	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		// TODO Auto-generated method stub
		 return new DataSourceTransactionManager(dataSource);
	}
	
	
	
	
	
	
	
	
	//443  SSL
	
	/*
	  @Bean
	   public EmbeddedServletContainerFactory servletContainer(){
	        TomcatEmbeddedServletContainerFactory tomcat=new TomcatEmbeddedServletContainerFactory(){
	            @Override
	            protected void postProcessContext(Context context) {
	                SecurityConstraint securityConstraint=new SecurityConstraint();
	                securityConstraint.setUserConstraint("CONFIDENTIAL");//confidential
	                SecurityCollection collection=new SecurityCollection();
	                collection.addPattern("/*");
	                securityConstraint.addCollection(collection);
	                context.addConstraint(securityConstraint);
	            }
	        };
	        tomcat.addAdditionalTomcatConnectors(httpConnector());
	        return tomcat;
	    }
	  
	  @Bean
	   public Connector httpConnector() {
	      Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
	      connector.setScheme("http");
	      //Connector监听的http的端口号
	      connector.setPort(8080);
	      connector.setSecure(false);
	      //监听到http的端口号后转向到的https的端口号
	      connector.setRedirectPort(443);
	      return connector;
	   }

*/
	  
	  
	//primary

    @Bean(name = "web_bmsDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    @Primary
    public DataSource web_testDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "web_bmsSqlSessionFactory")
    @Primary
    public SqlSessionFactory web_testSqlSessionFactory(@Qualifier("web_bmsDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/**/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "web_bmsTransactionManager")
    @Primary
    public DataSourceTransactionManager web_testTransactionManager(@Qualifier("web_bmsDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "web_sqlSessionTemplate")  
    @Primary
    public SqlSessionTemplate web_testSqlSessionTemplate(@Qualifier("web_bmsSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
    
    
    //bms-db
	  
	    @Bean(name = "bmsDataSource")
	    @ConfigurationProperties(prefix = "spring.datasource.db")
	    public DataSource testDataSource() {
	        return DataSourceBuilder.create().build();
	    }

	    @Bean(name = "bmsSqlSessionFactory")
	    public SqlSessionFactory testSqlSessionFactory(@Qualifier("bmsDataSource") DataSource dataSource) throws Exception {
	        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
	        bean.setDataSource(dataSource);
	        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/**/*.xml"));
	        return bean.getObject();
	    }

	    @Bean(name = "bmsTransactionManager")
	    public DataSourceTransactionManager testTransactionManager(@Qualifier("bmsDataSource") DataSource dataSource) {
	        return new DataSourceTransactionManager(dataSource);
	    }

	    @Bean(name = "sqlSessionTemplate")  
	    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("bmsSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
	        return new SqlSessionTemplate(sqlSessionFactory);
	    }
	    
	  //bms-rtdb  报告服务器
		  
	    @Bean(name = "bmsrtdbDataSource")
	    @ConfigurationProperties(prefix = "spring.datasource.rtdb")
	    public DataSource rtdbDataSource() {
	        return DataSourceBuilder.create().build();
	    }

	    @Bean(name = "bmsrtdbSqlSessionFactory")
	    public SqlSessionFactory rtdbSqlSessionFactory(@Qualifier("bmsrtdbDataSource") DataSource dataSource) throws Exception {
	        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
	        bean.setDataSource(dataSource);
	        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/**/*.xml"));
	        return bean.getObject();
	    }

	    @Bean(name = "bmsrtdbTransactionManager")
	    public DataSourceTransactionManager rtdbTransactionManager(@Qualifier("bmsrtdbDataSource") DataSource dataSource) {
	        return new DataSourceTransactionManager(dataSource);
	    }

	    @Bean(name = "sqlrtdbSessionTemplate")  
	    public SqlSessionTemplate rtdbSqlSessionTemplate(@Qualifier("bmsrtdbSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
	        return new SqlSessionTemplate(sqlSessionFactory);
	    }
	    
	    
/*
	    //redis
	    @Bean
	    public CacheManager cacheManager(RedisTemplate<?, ?> redisTemplate){
	        CacheManager cacheManager = new RedisCacheManager(redisTemplate);
	        return cacheManager;
	    }
	    @Bean
	    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory){
	        RedisTemplate<String, String> redisTemplate = new RedisTemplate<String,String>();
	        redisTemplate.setConnectionFactory(factory);
	        // key序列化方式;（不然会出现乱码;）,但是如果方法上有Long等非String类型的话，会报类型转换错误；
	        // 所以在没有自己定义key生成策略的时候，以下这个代码建议不要这么写，可以不配置或者自己实现ObjectRedisSerializer
	        // 或者JdkSerializationRedisSerializer序列化方式;
	        RedisSerializer<String> redisSerializer = new StringRedisSerializer();// Long类型不可以会出现异常信息;
	        redisTemplate.setKeySerializer(redisSerializer);
	        redisTemplate.setHashKeySerializer(redisSerializer);
	        return redisTemplate;
	    }
	    */
	    
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(bmsMainApplication.class, args);
		//bmcp_SysUtils.setApplicationContext(applicationContext);
		logger.info("============= SpringBoot Start Success =============");
	}
}
