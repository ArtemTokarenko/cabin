package email.sender.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@ComponentScan(basePackages = {"email.sender"})
@EnableWebMvc
@Import({SpringData.class, Thymeleaf.class, Security.class})
public class ApplicationContext extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String[] resourceHandler = new String[9];
        resourceHandler[0] = "/admin/js/**";
        resourceHandler[1] = "/admin/css/**";
        resourceHandler[2] = "/admin/img/**";
        resourceHandler[3] = "/admin/fonts/**";
        resourceHandler[4] = "/admin/less/**";
        resourceHandler[5] = "/js/**";
        resourceHandler[6] = "/css/**";
        resourceHandler[7] = "/img/**";
        resourceHandler[8] = "/fonts/**";

        String[] resourceLocations = new String[9];
        resourceLocations[0] = "WEB-INF/resources/admin/js/";
        resourceLocations[1] = "WEB-INF/resources/admin/css/";
        resourceLocations[2] = "WEB-INF/resources/admin/img/";
        resourceLocations[3] = "WEB-INF/resources/admin/fonts/";
        resourceLocations[4] = "WEB-INF/resources/admin/less/";
        resourceLocations[5] = "WEB-INF/resources/emailsender/js/";
        resourceLocations[6] = "WEB-INF/resources/emailsender/css/";
        resourceLocations[7] = "WEB-INF/resources/emailsender/fonts/";
        resourceLocations[8] = "WEB-INF/resources/emailsender/img/";

        registry.addResourceHandler(resourceHandler).addResourceLocations(resourceLocations);
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
