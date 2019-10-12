package com.zhangzhengju.serviceB;


import com.zhangzhengju.api.ServiceAInterface;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("ServiceA")
public interface ServiceAClient extends ServiceAInterface {

}
