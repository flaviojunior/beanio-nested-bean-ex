package com.fktecno.beanio.rid.ex;

public class NaturalPerson extends Person {

  private PersonTypeEnum personType;

  private String name;

  private Integer age;

  @Override
  public String toString() {
    return "NaturalPerson{" +
        "personType=" + personType +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", title='" + title + '\'' +
        ", salary=" + salary +
        ", hireDate=" + hireDate +
        ", recordType=" + recordType +
        '}';
  }
}
