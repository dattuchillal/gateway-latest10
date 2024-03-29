package com.cg.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@EnableZuulProxy
@EnableAutoConfiguration
@ComponentScan("com.cg.gateway")
@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
// 	  @Bean
// 	   public WebMvcConfigurer corsConfigurer() {
// 	      return new WebMvcConfigurerAdapter() {
// 	         @Override
// 	         public void addCorsMappings(CorsRegistry registry) {
// 	            registry.addMapping("/**").allowedMethods("*").allowedOrigins("*");
//          }
// 	      };
// 	   }



}
