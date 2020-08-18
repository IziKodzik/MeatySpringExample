package web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan({"controllers","services"})
public class IziConfig
    implements WebMvcConfigurer {

    @Bean
    public InternalResourceViewResolver viewResolver(){

       InternalResourceViewResolver bean  = new InternalResourceViewResolver();
       bean.setViewClass(JstlView.class);
       bean.setPrefix("/WEB-INF/views/");
       bean.setSuffix(".jsp");
       return bean;
    }

    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("resources/**/").addResourceLocations("/resources/");
    }

}
