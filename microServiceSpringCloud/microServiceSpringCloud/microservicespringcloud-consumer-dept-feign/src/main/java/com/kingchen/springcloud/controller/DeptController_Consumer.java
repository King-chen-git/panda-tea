package com.kingchen.springcloud.controller;

import com.kingchen.springcloud.entities.DeptDTO;
import com.kingchen.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public DeptDTO get(@PathVariable("id") Long id)
    {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<DeptDTO> list()
    {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(DeptDTO dept)
    {
        return this.service.add(dept);
    }

//    private static final String REST_URL_PREFIX = "http://localhost:8001/springcloud/provider/dept8001";

//    private static final String REST_URL_PREFIX = "http://MICROSERVICESPRINGCLOUD-DEPT/springcloud/provider";
//    /**
//     * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
//     * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
//     */
//    @Autowired
//    RestTemplate restTemplate;
//
//    @RequestMapping(value = "/consumer/dept/add")
//    public boolean add(DeptDTO dept)
//    {
//        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
//    }
//
//    @RequestMapping(value = "/consumer/dept/get/{id}")
//    public DeptDTO get(@PathVariable("id") Long id)
//    {
//        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, DeptDTO.class);
//    }
//
//    @SuppressWarnings("unchecked")
//    @RequestMapping(value = "/consumer/dept/list")
//    public List<DeptDTO> list()
//    {
//        List<DeptDTO> deptDTOList = restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
//        return deptDTOList;
//    }
//
//
//    // 测试@EnableDiscoveryClient,消费端可以调用服务发现
//    @RequestMapping(value = "/consumer/dept/discovery")
//    public Object discovery()
//    {
//        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
//    }


}
