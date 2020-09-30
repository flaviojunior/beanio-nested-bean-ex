package com.fktecno.beanio.rid.ex;

public class JuridicalPerson extends Person {

  private PersonTypeEnum personType;

  private String companyName;

  private Integer numberOfEmployees;

  @Override
  public String toString() {
    return "JuridicalPerson{" +
        "personType=" + personType +
        ", companyName='" + companyName + '\'' +
        ", numberOfEmployees=" + numberOfEmployees +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", title='" + title + '\'' +
        ", salary=" + salary +
        ", hireDate=" + hireDate +
        ", recordType=" + recordType +
        '}';
  }
}
