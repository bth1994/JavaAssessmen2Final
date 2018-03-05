package com.zipcodewilmington.assessment2.part3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by leon on 3/1/18.
 * The purpose of this class is to test all classes within this package
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
        PaperEvaluatorTest.class,
        RockEvaluatorTest.class,
        ScissorEvaluatorTest.class,
})
public class RockPaperScissorTestSuite {
}
