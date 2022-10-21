package com.kingchen.springcloud.controller;

import com.kingchen.springcloud.entities.DeptDTO;
import com.kingchen.springcloud.service.DeptService;
import feign.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(path = "/springcloud/provider")
@Api(tags = {"springcloud-部门Dept服务提供者相关接口"})
public class DeptController {

    @Autowired
    DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    /**
     *   @RequestBody 注解的作用
     * 后端@RequestBody注解对应的类在将HTTP的输入流(含请求体)装配到目标类(即:@RequestBody后面的类)时,
     *会根据json字符  串中的key来匹配对应实体类的属性,如果匹配一致且json中的该key对应的值符合(或可转换为)
     * 实体类的对应属性的类型要求时,会调用实体类的setter方法将值赋给该属性
     * @param dept
     * @return
     */
    @ApiOperation(value = "新增部门信息",notes = "新增部门信息",response = Response.class,httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deptName",value = "部门名称",dataType = "String",required = true,paramType = "query"),
            @ApiImplicitParam(name = "deptCode",value = "部门编码",dataType = "String",required = true,paramType = "query")
    })
    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody DeptDTO dept)
    {
        return deptService.add(dept);
    }

    /**
     * @PathVariable可以用来映射URL中的占位符到目标方法的参数中
     * @param id
     * @return
     */
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public DeptDTO get(@PathVariable("id") Long id)
    {
        return deptService.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<DeptDTO> list()
    {
        return deptService.list();
    }


    /**
    * @Author  熊猫煮茶
    * @Date   2021/8/29 9:13
    * @Description 服务的发现，对于微服务来说不是很重要，只是将该服务的基本信息展示给其他微服务。
    * @Param
    * @Return
    * @Exception
    */
    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }


}
