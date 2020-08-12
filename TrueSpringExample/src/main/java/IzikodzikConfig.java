import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({ "controllers" })
public class IzikodzikConfig {

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver ivr = new InternalResourceViewResolver();
        ivr.setPrefix("/views/");
        ivr.setSuffix(".jsp");

        return ivr;
    }

}
