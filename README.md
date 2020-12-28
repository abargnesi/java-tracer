# java-tracer
Java agent for method call tracing (Java 11+).

## ideas

Script argument (JSR223) that
  1. Filters classes/methods
  2. Maps runtime match
  3. Executes action

Maybe bundle Groovy JSR223 with agent?

Provide a CLI to write out Groovy script template.

Log agent filter, map, action with different levels for debugging script.

Glossary

* Filter
  * Define types and methods to trace.

* Map
  * Define which part of the match to yield.

* Action
  * Define what to do with Trace Execution Data.
  * Examples:
    * log to slf4j, out/err, or file
  
* Trace Execution Data
  * Data for a runtime trace that results from the Map.