package com.fktecno.beanio.rid.ex;

import org.beanio.BeanReader;
import org.beanio.StreamFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NestedBeanReaderTest {

  private static Logger LOGGER = LoggerFactory.getLogger(NestedBeanReaderTest.class);

  @Test
  public void readerTest() {
    // create a StreamFactory
    StreamFactory factory = StreamFactory.newInstance();
    // load the mapping file
    factory.loadResource("mapping.xml");

    // use a StreamFactory to create a BeanReader
    BeanReader in = factory.createReader("personFile",
        getClass().getClassLoader().getResource("person.txt").getFile());
    TypedRecord record;
    while ((record = (TypedRecord) in.read()) != null) {
      LOGGER.info(record.toString());
      Assertions.assertNotNull(record.recordType);
    }
    in.close();
  }
}