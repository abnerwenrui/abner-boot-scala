package com.abner.controller

import java.util.Locale

import com.abner.domain.MetaTable
import com.abner.service.MetaTableService
import com.abner.utils.ResultVoUtils
import javax.annotation.Resource
import org.springframework.web.bind.annotation.{ModelAttribute, RequestMapping, RequestMethod, RestController}

/**
  * @author peiwenrui
  * @since 2018-12-13 18:00
  */
@RestController
@RequestMapping(Array("/meta/table"))
class MetaTableCOntroller @Resource()(metaTableService: MetaTableService) {

  @RequestMapping(value = Array("/"),method = Array(RequestMethod.POST))
  def save(@ModelAttribute metaTable: MetaTable) = {
    metaTableService.save(metaTable)
    Locale.ENGLISH
    ResultVoUtils.success()
  }

  @RequestMapping(value = Array("/query"), method = Array(RequestMethod.GET))
  def query()={
    ResultVoUtils.success(metaTableService.query())
  }
}
