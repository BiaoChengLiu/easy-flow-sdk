package com.xioaka.easy.flow.sdk.controller;

import com.xioaka.easy.flow.sdk.entity.ProjectEntity;
import com.xioaka.easy.flow.sdk.service.IProjectService;
import com.xioaka.easy.flow.sdk.vo.ProjectVo;
import com.xioaka.easy.flow.sdk.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author liuchengbiao
 * @date 2020-05-23 20:34
 */
@RestController
@RequestMapping("/project")
public class ProjectController extends SuperController<ProjectEntity> {

    @Autowired
    private IProjectService projectService;

    @GetMapping("/{id}")
    public R save(@PathVariable("id") String id) {
        ProjectEntity projectEntity = projectService.getById(id);
        return success(projectEntity);
    }

    @GetMapping("/data/{id}")
    public R<ProjectVo> data(@PathVariable("id") String id) {
        ProjectVo projectVo = projectService.queryData(id);
        return new R<ProjectVo>().setCode(0).setData(projectVo);
    }

    /**
     * 新增
     *
     * @param project
     * @return
     */
    @PostMapping
    public R save(@RequestBody ProjectEntity project) {
        projectService.save(project);
        return success();
    }

    /**
     * 更新
     *
     * @param project
     * @return
     */
    @PutMapping
    public R update(@RequestBody ProjectEntity project) {
        projectService.updateById(project);
        return success();
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public R delete(@PathVariable("id") String id) {
        projectService.delete(id);
        return success();
    }

}
