package com.abner.domain

import javax.persistence.{Entity, GeneratedValue, Id, Table}

import scala.beans.BeanProperty

/**
  * @author peiwenrui
  * @since 2018-12-13 14:43
  */
@Entity
@Table
class MetaTable {
  @Id
  @GeneratedValue
  @BeanProperty
  var id: Integer = _
  @BeanProperty
  var name: String = _
  @BeanProperty
  var tableType: String = _
  @BeanProperty
  var dbId: Integer = _
}
