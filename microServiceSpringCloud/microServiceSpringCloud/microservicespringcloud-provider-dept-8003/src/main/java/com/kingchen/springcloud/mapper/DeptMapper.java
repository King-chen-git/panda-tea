package com.kingchen.springcloud.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kingchen.springcloud.entities.DeptDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptMapper extends BaseMapper<DeptDTO> {
}
