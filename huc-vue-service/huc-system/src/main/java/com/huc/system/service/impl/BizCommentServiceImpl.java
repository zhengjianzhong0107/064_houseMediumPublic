package com.huc.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huc.common.core.page.TableDataInfo;
import com.huc.common.utils.PageUtils;
import com.huc.system.domain.BizComment;
import com.huc.system.domain.vo.BizCommentVo;
import com.huc.system.mapper.BizCommentMapper;
import com.huc.system.service.IBizCommentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 房屋评论Service业务层处理
 *
 * @author Tellsea
 * @date 2023-02-24
 */
@Service
public class BizCommentServiceImpl extends ServiceImpl<BizCommentMapper, BizComment> implements IBizCommentService {

    @Override
    public TableDataInfo<BizCommentVo> queryList(BizCommentVo entity) {
        return PageUtils.buildDataInfo(this.baseMapper.queryList(PageUtils.buildPage(), entity));
    }

    @Override
    public List<BizCommentVo> queryAll(BizCommentVo entity) {
        return this.baseMapper.queryList(entity);
    }

    @Override
    public BizCommentVo queryById(Long id) {
        return this.baseMapper.queryById(id);
    }
}
