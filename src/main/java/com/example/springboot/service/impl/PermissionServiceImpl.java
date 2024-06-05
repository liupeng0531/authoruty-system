package com.example.springboot.service.impl;

import com.example.springboot.entity.Permission;
import com.example.springboot.dao.PermissionMapper;
import com.example.springboot.service.PermissionService;
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
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
