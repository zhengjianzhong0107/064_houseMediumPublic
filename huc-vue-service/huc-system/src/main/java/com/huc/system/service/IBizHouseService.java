package com.huc.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huc.common.core.domain.AjaxResult;
import com.huc.common.core.page.TableDataInfo;
import com.huc.system.domain.BizHouse;
import com.huc.system.domain.vo.BizHouseVo;

import java.util.List;

/**
 * 房屋Service接口
 *
 * @author Tellsea
 * @date 2023-02-22
 */
public interface IBizHouseService extends IService<BizHouse> {

    /**
     * 分页查询
     *
     * @param entity
     * @return
     */
    TableDataInfo<BizHouseVo> queryList(BizHouseVo entity);

    /**
     * 查询全部
     *
     * @param entity
     * @return
     */
    List<BizHouseVo> queryAll(BizHouseVo entity);

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    BizHouseVo queryById(Long id);

    AjaxResult statistics();
}
