package cn.apelx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * NacosClientController
 *
 * @author apelx
 * @since 2020-11-12
 */
@RestController
@RefreshScope
public class NacosClientController {

    @Value("${customer.text}")
    private String customerText;

    @GetMapping(value = "/nacos/client/find")
    public String find() {
        return "获取到的配置：" + customerText;
    }
}
