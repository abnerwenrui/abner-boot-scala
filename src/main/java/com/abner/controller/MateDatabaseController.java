package com.abner.controller;

import com.abner.domain.MetaDatabase;
import com.abner.service.MetaDatabaseService;
import com.abner.utils.ResultVo;
import com.abner.utils.ResultVoUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author peiwenrui
 * @since 2018-12-13 13:46
 */

@RestController
@RequestMapping("/meta/database")
public class MateDatabaseController {

    @Resource(name = "metaDatabaseService")
    private MetaDatabaseService metaDatabaseService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResultVo save(@ModelAttribute MetaDatabase metaDatabase) {
        metaDatabaseService.save(metaDatabase);
        return ResultVoUtils.success();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResultVo query() {
        return ResultVoUtils.success(metaDatabaseService.query());
    }

}
