package cn.apelx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 主启动类
 *
 * @author apelx
 * @since 2020-11-04
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
@ServletComponentScan(basePackages = {"cn.apelx.filter"})
public class ConfigServer7878 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer7878.class, args);
    }
}
