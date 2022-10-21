package com.kingchen.springcloud.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "DEPT")
public class DeptDTO {
    //设置该值type= IdType.AUTO,mysql数据库主键自增, 设置该值exist = true则与MySQL数据库字段对应，false为自己定义字段。
    @TableId(value = "ID",type= IdType.AUTO)
    private int id;

    @TableField(value = "DEPT_CODE",exist = true)
    private String deptCode;

    @TableField(value = "DEPT_NAME",exist = true)
    private String deptName;
}
