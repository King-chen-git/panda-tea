package com.kingchen.springcloud.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kingchen.springcloud.dao.DeptDao;
import com.kingchen.springcloud.entities.DeptDTO;
import com.kingchen.springcloud.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DeptDaoImpl implements DeptDao {

    @Autowired
    DeptMapper deptMapper;

    @Override
    public boolean add(DeptDTO dept) {
        boolean result = false;
        int resultnum = deptMapper.insert(dept);
        if (resultnum > 0){
            result = true;
        }
        return result;
    }

    @Override
    public DeptDTO get(Long id) {
        return deptMapper.selectById(id);
    }

    @Override
    public List<DeptDTO> list() {
        QueryWrapper<DeptDTO> wrapper = new QueryWrapper<>();
        return deptMapper.selectList(wrapper);
    }
}
