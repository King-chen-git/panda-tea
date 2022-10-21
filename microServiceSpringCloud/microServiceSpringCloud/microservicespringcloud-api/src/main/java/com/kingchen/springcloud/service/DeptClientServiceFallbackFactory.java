package com.kingchen.springcloud.service;

import com.kingchen.springcloud.entities.DeptDTO;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
@Component // 不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable cause) {

        return new DeptClientService() {
            @Override
            public DeptDTO get(long id) {
                DeptDTO deptDTO = new DeptDTO();
//                deptDTO.setId(Math.toIntExact(id));
//                deptDTO.setDeptName("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand");
                return deptDTO;
            }

            @Override
            public List<DeptDTO> list() {
                return null;
            }

            @Override
            public boolean add(DeptDTO dept) {
                return false;
            }
        };
    }
}
