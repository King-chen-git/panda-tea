package com.kingchen.springcloud.dao;

import com.kingchen.springcloud.entities.DeptDTO;

import java.util.List;

public interface DeptDao {
    public boolean add(DeptDTO dept);

    public DeptDTO get(Long id);

    public List<DeptDTO> list();
}
