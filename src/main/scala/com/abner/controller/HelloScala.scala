package com.abner.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}


/**
  * @author
  * @since 2018-11-27 17:21
  */
@RestController
class HelloScala{

  @RequestMapping(value = Array("/helloScala"), method = Array(RequestMethod.GET))
  def helloScala(): String = {
    "hello..scala......"
  }

}
