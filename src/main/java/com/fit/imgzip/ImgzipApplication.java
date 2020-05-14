package com.fit.imgzip;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 图片上传公有插件启动入口
 */
@SpringBootApplication
@EnableSwagger2
public class ImgzipApplication {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication springApplication = new SpringApplication(ImgzipApplication.class);
        springApplication.setBannerMode(Banner.Mode.CONSOLE);
        springApplication.run(args);
    }
}
