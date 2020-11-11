package cn.apelx.product.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品实体类
 *
 * @author apelx
 * @since 2020-10-16
 */
@Data
public class Product {
    private Long id;
    private String name;
    private BigDecimal price;
    private Date update;
}
