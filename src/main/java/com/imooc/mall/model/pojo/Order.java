package com.imooc.mall.model.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class Order {
    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "订单号（非主键id）")
    private String orderNo;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "订单总价格")
    private Integer totalPrice;

    @ApiModelProperty(value = "收货人姓名快照")
    private String receiverName;

    @ApiModelProperty(value = "收货人手机号快照")
    private String receiverMobile;

    @ApiModelProperty(value = "收货地址快照")
    private String receiverAddress;

    @ApiModelProperty(value = "订单状态: 0用户已取消，10未付款（初始状态），20已付款，30已发货，40交易完成")
    private Integer orderStatus;

    @ApiModelProperty(value = "运费，默认为0")
    private Integer postage;

    @ApiModelProperty(value = "支付类型,1-在线支付")
    private Integer paymentType;

    @ApiModelProperty(value = "发货时间")
    private Date deliveryTime;

    @ApiModelProperty(value = "支付时间")
    private Date payTime;

    @ApiModelProperty(value = "交易完成时间")
    private Date endTime;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}