package jbr.abstractfactory;

import org.junit.Before;
import org.junit.Test;

import jbr.abstractfactory.IndiaFactory;
import jbr.abstractfactory.IndiaFactoryProducer;
import junit.framework.Assert;

public class AbstractFactoryTest {
  private IndiaFactory southIndiaFactory;
  private IndiaFactory northIndiaFactory;

  @Before
  public void init() throws Exception {
    southIndiaFactory = IndiaFactoryProducer.getDivision("south");
    northIndiaFactory = IndiaFactoryProducer.getDivision("north");
  }

  @Test
  public void test() {
    Assert.assertEquals("Tamil", southIndiaFactory.getState("tamilnadu").getLanguage());
    Assert.assertEquals("Hindi", northIndiaFactory.getState("delhi").getLanguage());
  }

}
