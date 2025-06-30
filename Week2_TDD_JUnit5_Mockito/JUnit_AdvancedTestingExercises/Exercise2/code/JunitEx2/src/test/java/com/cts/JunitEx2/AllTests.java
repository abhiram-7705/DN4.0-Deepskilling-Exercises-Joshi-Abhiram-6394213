package com.cts.JunitEx2;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({AdditionTest.class,SubtractionTest.class})
class AllTests {

}
