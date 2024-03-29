package com.rw.quickcare.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rw.quickcare.model.entity.Doctor;
import com.rw.quickcare.model.vo.hos.DoctorQueryVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: quickcare
 * @InterfaceName Doctor
 * @description:
 * @author: LRW
 * @create: 2024-02-27 15:33
 * @Version 1.0
 **/
@Mapper
public interface DoctorMapper extends BaseMapper<Doctor> {
    List<Doctor> selectByCondition(@Param("vo")DoctorQueryVo doctorQueryVo, @Param("hosId")Integer hosId);
}
