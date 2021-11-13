package br.mso.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
class MvcConfig implements WebMvcConfigurer {
  
  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/403").setViewName("403");
  }
  
}

