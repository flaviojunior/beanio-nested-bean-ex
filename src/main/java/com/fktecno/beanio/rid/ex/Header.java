package com.fktecno.beanio.rid.ex;

import java.util.Date;

public class Header extends TypedRecord {

  private Date date;

  @Override
  public String toString() {
    return "Header{" +
        "date=" + date +
        ", recordType=" + recordType +
        '}';
  }
}
