package com.huc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author huc
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HucApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(HucApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  房产中介楼盘信息管理系统启动成功   ლ(´ڡ`ლ)ﾞ ");
    }
}
