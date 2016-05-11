# Introduction

The goal of this programming challenge is to make the acceptance tests pass. This is important, so I'll say it again.

_The goal of this programming challenge is to make the acceptance tests pass._ 

It's not about building a system that uses quantum computing to evaluate all possible outcomes simultaneously to determine the optimal roshambo strategy, nor is it about building a distributed p2p arena mode roshambo server, cool as both of those options are. It's simply about making the acceptance tests pass in the simplest and most straightforward way possible. Features that are implemented that are not covered by an acceptance test are the Wrong Thing.

That said, the code is evaluated on three axes: correctness, clarity, and conciseness. Most importantly, the code should be correct. The best way of guaranteeing correctness is to have a full suite of unit tests. [JUnit], [AssertJ], and [Mockito] are all included in the maven `pom.xml`. It's not required that mockito and AssertJ be used, but unit tests are a requirement and the tests should be clear and obviously correct.

After correctness, the code should be clear. Classes, variables, and methods should all be named appropriately. Logic should be simple and standard java idioms should be used as much as possible. Following good OO principles like the [Single Responsibility Principle] and the [Interface Segregation Principle] will help keep the code clear.

Finally, the code should be as concise as possible without sacrificing correctness or clarity. A good way of keeping the code concise is to reuse code in the JDK and other standard libraries as much as possible. Google [guava] and [commons-lang] are included on the maven classpath for your use.

This programming challenge is achievable by using classes in `java.util`, `java.lang`, and perhaps `java.text`. It doesn't require specialized knowledge of any frameworks, JEE, XML, or anything enterprisey. It's not designed to measure how well someone can design and implement large systems, but to provide some insight into how well someone has mastered the fundamentals of good Java/OO programming. I've included Spring and set up a trivial `application-context.xml` in case you want to use Spring for dependency injection, but this isn't required, either. 

The API for the roshambo boundary classes has been provided. They are:

* `Roshambo` - the interface to the game itself
* `Results` - an interface to the scoring mechanism for the game
* `TooEvenlyMatchedException` - thrown in the event of a tie.
* `Player` - the (trivial) interface for the Player implementations. 

Finally, this is meant to be an individual challenge and should be done without assistance. Good luck!

-- Alex Garrett

[JUnit]: http://junit.org
[AssertJ]: http://joel-costigliola.github.io/assertj/
[Mockito]: http://mockito.org/
[Single Responsibility Principle]: https://en.wikipedia.org/wiki/Single_responsibility_principle
[Interface Segregation Principle]: https://en.wikipedia.org/wiki/Interface_segregation_principle
[guava]: https://github.com/google/guava
[commons-lang]: https://commons.apache.org/proper/commons-lang/
