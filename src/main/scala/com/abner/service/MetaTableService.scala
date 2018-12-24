package com.abner.service

import com.abner.domain.MetaTable
import com.abner.repository.MetaTableRepository
import javax.annotation.Resource
import javax.transaction.Transactional
import org.springframework.stereotype.Service

/**
  * @author peiwenrui
  * @since 2018-12-13 17:55
  */
@Service
class MetaTableService @Resource()(metaTableRepository: MetaTableRepository) {

  @Transactional
  def save(metaTable: MetaTable) = {
    metaTableRepository.save(metaTable)
  }

  def query()={
    metaTableRepository.findAll()
  }
}
