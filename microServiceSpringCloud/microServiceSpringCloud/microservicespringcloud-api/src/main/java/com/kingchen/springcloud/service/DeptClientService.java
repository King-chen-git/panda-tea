package com.kingchen.springcloud.service;

import com.kingchen.springcloud.entities.DeptDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 *  @author: 熊猫煮茶
 *  @Date: 2021/9/9 21:49
 *  @Description:修改microservicespringcloud-api工程，根据已经有的DeptClientService接口新建
 * 一个实现了FallbackFactory接口的类DeptClientServiceFallbackFactory
 */
//@FeignClient(value = "MICROSERVICESPRINGCLOUD-DEPT")
@FeignClient(value = "MICROSERVICESPRINGCLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)

public interface DeptClientService {
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public DeptDTO get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<DeptDTO> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(DeptDTO dept);
}
