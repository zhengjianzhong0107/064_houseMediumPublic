package com.huc.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huc.common.core.page.TableDataInfo;
import com.huc.common.utils.PageUtils;
import com.huc.system.domain.BizMessage;
import com.huc.system.domain.vo.BizMessageVo;
import com.huc.system.mapper.BizMessageMapper;
import com.huc.system.service.IBizMessageService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 留言Service业务层处理
 *
 * @author Tellsea
 * @date 2023-02-24
 */
@Service
public class BizMessageServiceImpl extends ServiceImpl<BizMessageMapper, BizMessage> implements IBizMessageService {

    @Override
    public TableDataInfo<BizMessageVo> queryList(BizMessageVo entity) {
        return PageUtils.buildDataInfo(this.baseMapper.queryList(PageUtils.buildPage(), entity));
    }

    @Override
    public List<BizMessageVo> queryAll(BizMessageVo entity) {
        return this.baseMapper.queryList(entity);
    }

    @Override
    public BizMessageVo queryById(Long id) {
        return this.baseMapper.queryById(id);
    }
}
