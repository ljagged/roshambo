# INSTALL

## Requirements
* Maven 3.0 or greater
* Internet connection (to pull dependencies down from maven repo)
* Some kind of IDE

## Instructions

1. Get the code from the git repository.
2. Run `mvn clean install` in the project root. You should see something like:



    Results :
    
    Tests in error:
      shouldRequireMoreRoundsThanZero_negative(com.trufl.roshambo.acceptance.RoshamboAcceptanceTest): Unexpected exception, expected<java.lang.IllegalArgumentException> but was<java.lang.UnsupportedOperationException>
      shouldRequirePlayerOne(com.trufl.roshambo.acceptance.RoshamboAcceptanceTest): Unexpected exception, expected<java.lang.IllegalArgumentException> but was<java.lang.UnsupportedOperationException>
      shouldRequirePlayerTwo(com.trufl.roshambo.acceptance.RoshamboAcceptanceTest): Unexpected exception, expected<java.lang.IllegalArgumentException> but was<java.lang.UnsupportedOperationException>
      shouldRequireMoreRoundsThanZero_0(com.trufl.roshambo.acceptance.RoshamboAcceptanceTest): Unexpected exception, expected<java.lang.IllegalArgumentException> but was<java.lang.UnsupportedOperationException>
      shouldThrowExceptionOnTie(com.trufl.roshambo.acceptance.RoshamboAcceptanceTest): Unexpected exception, expected<com.trufl.roshambo.TooEvenlyMatchedException> but was<java.lang.UnsupportedOperationException>
      shouldRequireOddRounds(com.trufl.roshambo.acceptance.RoshamboAcceptanceTest): Unexpected exception, expected<java.lang.IllegalArgumentException> but was<java.lang.UnsupportedOperationException>
      shouldProvideScore(com.trufl.roshambo.acceptance.RoshamboAcceptanceTest): Implement me!
      shouldProvideWinner(com.trufl.roshambo.acceptance.RoshamboAcceptanceTest): Implement me!
    
    Tests run: 8, Failures: 0, Errors: 8, Skipped: 0
    
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD FAILURE
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 3.745 s
    [INFO] Finished at: 2016-05-11T10:21:51-05:00
    [INFO] Final Memory: 18M/167M
    [INFO] ------------------------------------------------------------------------

If you see a build failure with `UnsupportedOperationExceptions`, that mean that it's building correctly. The next step is to make those tests pass!