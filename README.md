Spring-boot listener’s @autowire is not work on recent versions
---------------------------
When using 2.3.1.RELASE of Spring-boot every thing is ok. 
@WebListener
public class Listener implements ServletContextListener {
    @Autowired
    private Environment env;

@Override
public void contextInitialized(ServletContextEvent sce) {
    try {
        if (env == null) // is false

-----------------------------
When using 2.6.2 of Spring-boot the env will be null
