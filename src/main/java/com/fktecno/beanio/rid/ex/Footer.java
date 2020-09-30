package com.fktecno.beanio.rid.ex;

public class Footer extends TypedRecord {
  private Integer numberOfLines;

  @Override
  public String toString() {
    return "Footer{" +
        "numberOfLines=" + numberOfLines +
        ", recordType=" + recordType +
        '}';
  }
}
