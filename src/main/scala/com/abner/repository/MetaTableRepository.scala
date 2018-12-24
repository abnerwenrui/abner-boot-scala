package com.abner.repository

import com.abner.domain.MetaTable
import org.springframework.data.repository.CrudRepository

/**
  * @author peiwenrui
  * @since 2018-12-13 14:48
  */
trait MetaTableRepository extends CrudRepository[MetaTable, Integer]{

}
