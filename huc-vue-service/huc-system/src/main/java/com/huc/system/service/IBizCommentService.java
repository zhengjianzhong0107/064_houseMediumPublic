package com.huc.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huc.common.core.page.TableDataInfo;
import com.huc.system.domain.BizComment;
import com.huc.system.domain.vo.BizCommentVo;

import java.util.List;

/**
 * 房屋评论Service接口
 *
 * @author Tellsea
 * @date 2023-02-24
 */
public interface IBizCommentService extends IService<BizComment> {

    /**
     * 分页查询
     *
     * @param entity
     * @return
     */
    TableDataInfo<BizCommentVo> queryList(BizCommentVo entity);

    /**
     * 查询全部
     *
     * @param entity
     * @return
     */
    List<BizCommentVo> queryAll(BizCommentVo entity);

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    BizCommentVo queryById(Long id);
}
