package com.kingchen.springcloud.service;

import com.kingchen.springcloud.entities.DeptDTO;

import java.util.List;

public interface DeptService {
    public boolean add(DeptDTO dept);

    public DeptDTO get(Long id);

    public List<DeptDTO> list();
}
