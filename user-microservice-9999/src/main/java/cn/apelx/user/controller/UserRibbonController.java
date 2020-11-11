package cn.apelx.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 用户Controller
 * Ribbon调用
 *
 * @author apelx
 * @since 2020-10-14
 */
@RestController
@Slf4j
public class UserRibbonController {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 用户获取商品信息
     *
     * @return String
     */
    @GetMapping(value = "/user/showProductInfo")
    public String showProductInfo() {

//        String url = "http://" + randomHost() + "/product/getInfo";
//        String response = restTemplate.getForObject(url, String.class);
//        log.info("用户接口获取商品信息: {}", response);

        /**
         * ribbon 调用方式 1.discovery client
         */
        /*
        RestTemplate restTemplate = new RestTemplate();
        List<ServiceInstance> instanceList = discoveryClient.getInstances("product-micro-service");
        log.info("{}", instanceList);
        String url = instanceList.get(new Random().nextInt(2)).getUri() + "/product/getInfo";
        String response = restTemplate.getForObject(url, String.class);*/

        /**
         *  ribbon 调用方式 2.loadBalanceClient
         */
       /* RestTemplate restTemplate = new RestTemplate();
        ServiceInstance serviceInstance = loadBalancerClient.choose("product-micro-service");
        String response = restTemplate.getForObject(serviceInstance.getUri() + "/product/getInfo", String.class);*/
        /**
         * ribbon 调用方式 3.@LocalBalance
         */
        String response = restTemplate.getForObject("http://product-micro-service/product/getInfo", String.class);
        return response;
    }

    /**
     * 用户获取所有商品
     *
     * @return String
     */
    @GetMapping(value = "/user/findAllProduct")
    public String findAllProduct() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:9998/product/findAll";
        String response = restTemplate.getForObject(url, String.class);
        log.info("用户接口获取所有商品: {}", response);
        return response;
    }

    /**
     * 随机获取商品服务地址
     * 缺点：地址还是耦合
     * 服务宕机不能实时发现剔除，不能服务注册
     *
     * @return 服务地址
     */
    private String randomHost() {
        List<String> list = new ArrayList<>();
        list.add("localhost:9997");
        list.add("localhost:9998");
        int i = new Random().nextInt(2);
        return list.get(i);
    }
}
