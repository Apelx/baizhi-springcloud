package cn.apelx.feign.impl;

import cn.apelx.feign.NacosProjectFeignClient;
import org.springframework.stereotype.Service;

/**
 * Nacos项目Feign客户端降级实现
 *
 * @author apelx
 * @since 2020-11-13
 */
@Service
public class NacosProjectFeignClientFallback implements NacosProjectFeignClient {

    /**
     * nacos client 查询方法
     *
     * @return string
     */
    @Override
    public String find() {
        return "sentinel getProdInfo 降级触发!";
    }
}
