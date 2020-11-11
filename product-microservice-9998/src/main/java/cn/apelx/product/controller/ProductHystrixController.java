package cn.apelx.product.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品 Hystrix服务熔断 controller
 *
 * @author apelx
 * @since 2020-10-27
 */
@RestController
@Slf4j
public class ProductHystrixController {

    @Value("${server.port}")
    private Integer port;

    /**
     * 根据ID获取商品
     *
     * @param id 商品id
     * @return 商品信息
     */
    @GetMapping("/product/getById")
    @HystrixCommand(fallbackMethod = "getByIdFallback")
//    @HystrixCommand(defaultFallback = "commonFallback")
    public Map<String, Object> getById(Integer id) {
        if (id < 0) {
            throw new RuntimeException("id exception. its can not less than 0.");
        }
        Map<String, Object> map = new HashMap<>(16);
        map.put("status", "200");
        map.put("msg", "获取到的商品信息端口" + port + "; id: " + id);
        return map;
    }

    /**
     * 根据ID获取商品 服务熔断方法
     *
     * @param id 商品id
     * @return 熔断后返回信息
     */
    public  Map<String, Object> getByIdFallback(Integer id) {
        Map<String, Object> map = new HashMap<>(16);
        map.put("status", "501");
        map.put("msg","服务端获取商品信息降级了!! id不能小于0");
        return map;
    }


    public Map<String, Object> commonFallback() {
        Map<String, Object> map = new HashMap<>(16);
        map.put("status", "502");
        map.put("msg", "商品服务器繁忙, 请稍后再试");
        return map;
    }

}
