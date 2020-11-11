package cn.apelx.user.feignclient;

import cn.apelx.user.feignclient.impl.ProductHystrixClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 商品 Hystrix 服务降级客户端
 *
 * @author apelx
 * @since 2020-10-27
 */
@Service
@FeignClient(value = "product-micro-service", fallback = ProductHystrixClientImpl.class)
public interface ProductHystrixClient {
    /**
     * 根据ID获取商品
     *
     * @param id 商品id 注意：这里一定要加@requestParam注解，否则feign将识别到请求体自动将get请求方式转为post
     * @return 商品信息
     */
    @GetMapping("/product/getById")
    Map<String, Object> getById(@RequestParam("id") Integer id);
}
