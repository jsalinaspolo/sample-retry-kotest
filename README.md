## Sample Retry kotest

* We have module [kotest-5_5_5](kotest-5_5_5) with a failing test that will be retried once
* We have module [kotest-5_6_0](kotest-5_6_0) with a failing test that will **fail** to retry

### Steps to reproduce 

```shell
$ ./gradlew clean check
```

The output will have an error when trying to retry the failing test in [kotest-5_6_0](kotest-5_6_0) 

```shell
Execution failed for task ':kotest-5_6_0:test'.
> The following test methods could not be retried, which is unexpected. Please file a bug report at https://github.com/gradle/test-retry-gradle-plugin/issues
     learning.kotlin.RetryShould#retry with kotest 5.6.0
```
