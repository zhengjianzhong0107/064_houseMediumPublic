package com.huc.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huc.common.core.domain.AjaxResult;
import com.huc.common.core.domain.entity.SysUser;
import com.huc.common.core.page.TableDataInfo;
import com.huc.common.utils.PageUtils;
import com.huc.system.domain.BizHouse;
import com.huc.system.domain.vo.BizHouseVo;
import com.huc.system.mapper.BizCommentMapper;
import com.huc.system.mapper.BizHouseMapper;
import com.huc.system.mapper.SysUserMapper;
import com.huc.system.service.IBizHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * 房屋Service业务层处理
 *
 * @author Tellsea
 * @date 2023-02-22
 */
@Service
public class BizHouseServiceImpl extends ServiceImpl<BizHouseMapper, BizHouse> implements IBizHouseService {
    @Autowired
    private SysUserMapper userMapper;
    @Autowired
    private BizCommentMapper bizCommentMapper;

    @Override
    public TableDataInfo<BizHouseVo> queryList(BizHouseVo entity) {
        return PageUtils.buildDataInfo(this.baseMapper.queryList(PageUtils.buildPage(), entity));
    }

    @Override
    public List<BizHouseVo> queryAll(BizHouseVo entity) {
        return this.baseMapper.queryList(entity);
    }

    @Override
    public BizHouseVo queryById(Long id) {
        return this.baseMapper.queryById(id);
    }

    @Override
    public AjaxResult statistics() {
        // 经纪人数量
        SysUser user = new SysUser();
        List<SysUser> sysUsers = userMapper.listJingji(user);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("peoples",sysUsers.size());
        map.put("people",userMapper.listCustoms(user).size());
        map.put("house",getBaseMapper().selectCount(null));
        map.put("comments",bizCommentMapper.selectCount(null));
        return AjaxResult.success(map);
    }
}
