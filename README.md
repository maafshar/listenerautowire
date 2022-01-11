Spring-boot listener’s @autowire is not work on recent versions
---------------------------
When using 2.3.1.RELEASE of Spring-boot everything is ok.

@WebListener
public class Listener implements ServletContextListener {

 @Autowired
    private Environment env;

@Override
public void contextInitialized(ServletContextEvent sce) {

        if (env == null) // is false

---------
When using 2.6.2 of Spring-boot the env will be null

-----------------------------

change  pom.xml


      <parent>

        <groupId>org.springframework.boot</groupId>    
       
        <artifactId>spring-boot-starter-parent</artifactId>
        
        <version>2.3.1.RELEASE</version><!-- ********************* 2.3.1.RELEASE - 2.6.2 ********************* -->
       
        <relativePath/>
     </parent>
