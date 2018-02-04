package com.xuyb.practice.swagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
//http://localhost:8086/swagger-ui.html
public class Swagger2Application {

	public static void main(String[] args) {
		SpringApplication.run(Swagger2Application.class, args);
	}
	
	 /**
     * 创建API应用
     * apiInfo() 增加API相关信息
     * 通过select()函数返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现，
     * 本例采用指定扫描的包路径来定义指定要建立API的目录。
     * 
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xuyb.practice"))
                .paths(PathSelectors.any())
                .build();
    }
    
    /**
     * 创建该API的基本信息（这些基本信息会展现在文档页面中）
     * 访问地址：http://项目实际地址/swagger-ui.html
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("测试Spring Boot中使用Swagger2构建RESTful APIs")
                .description("Step1：引入springfox-swagger2 Jar和springfox-swagger-ui Jar \n    Step2：启动类上加@EnableSwagger2 \n    Step3:使用Swagger2的各个特有注解。 通过 http://localhost:8080/v2/api-docs（查看swagger产生的描述 json字符串）")
                .termsOfServiceUrl("http://www.baidu.com")
                .contact("xuyb")
                .version("1.0")
                .build();
    }
}
