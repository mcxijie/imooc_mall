package com.imooc.mall.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateOrderReq {

    @ApiModelProperty(value = "收货人姓名快照")
    @NotNull
    private String receiverName;

    @ApiModelProperty(value = "收货人手机号快照")
    @NotNull
    private String receiverMobile;

    @ApiModelProperty(value = "收货地址快照")
    @NotNull
    private String receiverAddress;

    @ApiModelProperty(value = "运费，默认为0")
    private Integer postage = 0;

    @ApiModelProperty(value = "支付类型,1-在线支付")
    private Integer paymentType = 1;


}