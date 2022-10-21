package com.kingchen.springcloud.service.impl;

import com.kingchen.springcloud.dao.DeptDao;
import com.kingchen.springcloud.entities.DeptDTO;
import com.kingchen.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptDao deptDao;

    @Override
    public boolean add(DeptDTO dept) {
        return deptDao.add(dept);
    }

    @Override
    public DeptDTO get(Long id) {
        return deptDao.get(id);
    }

    @Override
    public List<DeptDTO> list() {
        return deptDao.list();
    }
}
