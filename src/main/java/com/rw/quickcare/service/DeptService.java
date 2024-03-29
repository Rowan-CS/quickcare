package com.rw.quickcare.service;

import cn.hutool.core.lang.tree.Tree;
import com.rw.quickcare.model.entity.Dept;

import java.util.List;
import java.util.Map;

/**
 * @program: quickcare
 * @InterfaceName DeptService
 * @description:
 * @author: LRW
 * @create: 2024-02-27 14:57
 * @Version 1.0
 **/
public interface DeptService {

    //根据医院id查科室列表
    List<Dept> getByHosId(Integer hosId);

    //增加部门
    void add(Dept dept);
    //删除部门
    void delete(Integer id);
    //修改部门
    void update(Dept dept);
    //锁定部门（不可用）
    void block(Integer id);
    void unblock(Integer id);
    //根据医院编号，查询所有科室列表(树形结构）
     List<Tree<String>> getDeptTree(Integer hosId);

}
