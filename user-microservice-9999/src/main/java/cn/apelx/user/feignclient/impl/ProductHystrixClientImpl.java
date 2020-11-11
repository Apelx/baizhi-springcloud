package cn.apelx.user.feignclient.impl;

import cn.apelx.user.feignclient.ProductHystrixClient;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品 Hystrix服务降级客户端实现类
 *
 * @author apelx
 * @since 2020-10-27
 */
@Service
public class ProductHystrixClientImpl implements ProductHystrixClient {
    /**
     * 根据ID获取商品
     *
     * @param id 商品id
     * @return 商品信息
     */
    @Override
    public Map<String, Object> getById(Integer id) {
        Map<String, Object> map = new HashMap<>(16);
        map.put("status", "301");
        map.put("msg", "客户端服务降级了!!!");
        return map;
    }
}
