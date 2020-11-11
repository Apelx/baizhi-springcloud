package cn.apelx.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 主启动类
 *
 * @author apelx
 * @since 2020-10-28
 */
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboard9990 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9990.class);
    }
}
