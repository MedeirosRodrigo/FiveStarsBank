package br.com.fivestarsbank.BlueBank.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	//Docket objeto que configura o swagger
	
		@Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	          .apiInfo(apiInfo())
	          .select()
	          .apis(RequestHandlerSelectors.basePackage("br.com.fivestarsbank.BlueBank.controllers"))
	          .paths(PathSelectors.any())
	          .build()
	          .useDefaultResponseMessages(false);
	    }

		private ApiInfo apiInfo() {
			return new ApiInfoBuilder()
					.title("Five Stars Bank")
					.description("Sistema de cadastro de clientes e transações entre contas bancárias")
					.version("1.0.0")
					.build();
		}
		
		
}
