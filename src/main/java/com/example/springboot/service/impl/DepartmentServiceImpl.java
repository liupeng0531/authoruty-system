package com.example.springboot.service.impl;

import com.example.springboot.entity.Department;
import com.example.springboot.dao.DepartmentMapper;
import com.example.springboot.service.DepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LP
 * @since 2024-05-30
 */
@Service
@Transactional
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

}
