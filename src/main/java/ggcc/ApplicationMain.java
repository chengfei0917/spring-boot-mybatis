package ggcc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class ApplicationMain extends SpringBootServletInitializer {

    /**
     * Configure the application. Normally all you would need to do it add sources (e.g.
     * config classes) because other settings have sensible defaults. You might choose
     * (for instance) to add default command line arguments, or set an active Spring
     * profile.
     *
     * @param builder a builder for the application context
     * @return the application builder
     * @see SpringApplicationBuilder
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources("classpath:spring/*.xml");
        builder.sources("classpath:mapper/*.xml");
        return super.configure(builder);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(ApplicationMain.class, "classpath*:/spring/*.xml",
                "classpath:mapper/*.xml",
                "classpath:spring/*.xml");
        application.run(args);
    }
}
