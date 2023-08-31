package com.huc.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huc.common.core.page.TableDataInfo;
import com.huc.system.domain.BizMessage;
import com.huc.system.domain.vo.BizMessageVo;

import java.util.List;

/**
 * 留言Service接口
 *
 * @author Tellsea
 * @date 2023-02-24
 */
public interface IBizMessageService extends IService<BizMessage> {

    /**
     * 分页查询
     *
     * @param entity
     * @return
     */
    TableDataInfo<BizMessageVo> queryList(BizMessageVo entity);

    /**
     * 查询全部
     *
     * @param entity
     * @return
     */
    List<BizMessageVo> queryAll(BizMessageVo entity);

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    BizMessageVo queryById(Long id);
}
