# Groovy 'each' Loop Unexpected Exit

This repository demonstrates a common error in Groovy's `each` method: the unintended early exit of a method when using `return` within a loop. The example shows how a seemingly straightforward loop behaves differently than expected and offers a solution.

## Bug Description

The Groovy `each` method iterates over a collection. It's important to know that a `return` statement inside the `each` closure does not only exit the current iteration; it will exit the entire method. This often results in unexpected behavior.

## Solution

The provided solution uses the `eachWithIndex` method and a `break` statement to achieve a controlled loop termination without exiting the entire method.

## How to Use

1. Clone the repository.
2. Run `bug.groovy` to see the unexpected behavior.
3. Run `bugSolution.groovy` to observe the correct behavior with the corrected loop.