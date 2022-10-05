# Learning Junit 5


You would use  `assume`  if you have circumstances under which some tests should not run at all. "Not run" means that it cannot fail, because, well, it did not run.

You would use  `assert`  to fail a test if something goes wrong.

So, in a hypothetical scenario where:

-   you have different builds for different customers, and
-   you have some resource which is only applicable to a particular client, and
-   there is something testable about that resource, then

you would write a test which:

-   assumes that the resource is present, (so the test will not run on customers that do not have that resource,) and then
-   asserts that everything about the resource is okay (so on the customer that does actually have the resource, the test makes sure that the resource is as it should be.)

The most easiest difference between Assert and Assume is :

**Assume**  will only run when the assumption is true. Will be skipped if it false.

```java
assumeTrue(boolean assumption, String message)

```

**Assert**  will run normally if true. In case of false assert, it gives predefined error message.

```java
assertTrue(boolean condition, String message)
```

Why not just assert them? The difference is if the assertion fails the test will fail but if the assumption fails the test will be ignored. Although in many tests they are asserted, that's not the way it should be. We do not want to test the functionalities of other methods, but we want to be sure that they are working properly.

If the tests are well written for all the parts of code, the part which makes the assumption fail would have proper tests that would fail.