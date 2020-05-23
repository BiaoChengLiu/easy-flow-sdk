package com.xioaka.easy.flow.sdk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xioaka.easy.flow.sdk.entity.ProjectEntity;
import com.xioaka.easy.flow.sdk.vo.ProjectVo;

/**
 * @author liuchengbiao
 * @date 2020-05-22 21:28
 */
public interface IProjectService extends IService<ProjectEntity> {
    /**
     * 获取流程数据
     *
     * @param projectId
     * @return
     */
    ProjectVo queryData(String projectId);

    /**
     * 删除
     *
     * @param projectId
     */
    void delete(String projectId);
}
