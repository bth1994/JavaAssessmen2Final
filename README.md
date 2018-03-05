# Java Assessment 2 - Submission Branch

This is the branch you will submit your project into! 

Follow these steps to submit. 

* Merge part 1 into this branch
* Merge part 2 into this branch
* Merge part 3 into this branch
* Merge part 4 into this branch
* Merge part 5 into this branch
* Merge part 6 into this branch
* Merge part 7 into this branch

Each time you merge you may have a conflict with ProjectTestSuite file since you may have modified that file to run the tests. If this is the case, you can resolve these conflicts by editting the file to look like this

```
package com.zipcodewilmington.assessment2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by leon on 3/1/18.
 * The purpose of this class is to test all methods in this project
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
})
public class ProjectTestSuite {
}
```

Each time you get this merge conflict, simply copy and paste the contents above into the ProjectTestSuite file

Once you have done that, push your submission branch to your repository

From there, make a pull request from your repository/submission branch to Zipcoder/submission

The travis build should start up and your tests will run. 

#### Note: 
While part 2 was not required, it will still run. If you were able to get any of that part running, it will benefit you but any failed tests will not affect your overall grade. as a result you may see a red x even though you may still get a perfect score.
