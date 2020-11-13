package cn.apelx.feign;

import cn.apelx.feign.impl.NacosProjectFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Nacos项目Feign客户端
 *
 * @author apelx
 * @since 2020-11-13
 */
@FeignClient(value = "nacos-client-8789", fallback = NacosProjectFeignClientFallback.class)
public interface NacosProjectFeignClient {
    /**
     * nacos client 查询方法
     *
     * @return string
     */
    @GetMapping(value = "/nacos/client/find")
    String find();
}
