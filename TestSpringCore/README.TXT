Testing Spring core framework

	-- Bean life cycle :
		init and destroy method (KO if specified and do not exist)
		default init and destroy (OK if not specified)
	-- Bean scope :
		Singleton : IoC container creates exactly one instance (when you need one and only one instance of a bean)
		Prototype :the Spring IoC container creates new bean instance of the object every time a request for that specific bean is made
	-- Bean inheritance :
		Abstract template
		Properties Inheritance
		Init & destroy methods inheritance
	-- Dependency Injection
		Inner bean : the injection can be achieved using setter or constructor 
					<property name="spellChecker">
			         <bean id="spellChecker" class="com.tutorialspoint.SpellChecker"/>
			       	</property>
		Constructor : la classe mère doit contenir un constructeur avec argument (peut etre mutliple) <constructor-arg ref="spellChecker"/>
		Setter :  la classe mère doit avoir un setter du bean attribut <property name="spellChecker" ref="spellChecker"/>	
	--Collection injection :
		<bean id="student" class="com.spring.test.Student">
			<property name="classes">
				<list>
					<ref bean="class1" />
					<value>test</value>
				</list>
			</property>
		</bean>
	-- autowiring : no (default), byname (setter), bytype, constructor 
	-- annotation based configuration :
		xml beans definition should always be there
		@required(property value should be definied in xml), autowired, qualifier
		@autowired (applied to constructor or setter, will autowire by type), no property or arg should be used in XML
		@qualifier (two beans in xml, one will be autowired) @PostConstruct and @PreDestroy
	-- Java Based Configuration
		@Configuration, @import before Class
		@Bean,@scope before the bean	
		no XML needed
	-- Events Handling
		ApplicationCOntext manages the bean's lifecycle. 
	-- Properties loading
		@Configuration
		@ComponentScan(basePackages = { "com.mkyong.*" })
		@PropertySource("classpath:config.properties")
		public class AppConfigMongoDB {
		
			//1.2.3.4
			@Value("${mongodb.url}")
			private String mongodbUrl;
		
			//hello
			@Value("${mongodb.db}")
			private String defaultDb;
		}
		 
		