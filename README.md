# string-calculator
[String Calculator TDD Kata by Roy Osherove](http://osherove.com/tdd-kata-1/) done in Clojure.
Based on [video Test-driving Clojure in Light Table by Misophistful](https://www.youtube.com/watch?v=H_teKHH_Rk0).

## Tools
 * Editor: [LightTable](http://lighttable.com/)
 * Generating build/generate template project: [Leiningen](http://leiningen.org/)
 * Testing framework [Expectations](http://jayfields.com/expectations/)
 * Automatically re-run tests after source changed: [lein-autoexpect](https://github.com/jakemcc/lein-autoexpect)

## Kata description:
1. Create a simple String calculator with a method int Add(string numbers) The method can take 0, 1 or 2 numbers, and will return their sum.
 1. For an empty string it will return 0.
 2. For "" will return 0.
 3. For "1" will return 1
 4. For "1,2"

2. Allow the Add method to handle an unknown amount of numbers

3. Allow the Add method to handle new lines between numbers (instead of commas). The following input is ok:  "1\n2,3" (will equal 6). The following input is NOT ok:  “1,\n” (not need to prove it - just clarifying).

4. Support different delimiters to change a delimiter, the beginning of the string will contain a separate line that looks like this:   "//[delimiter]\n[numbers…]" For example "//;\n1;2" should return three where the default delimiter is ‘;’. The first line is optional.

5. Calling Add with a negative number will throw an exception "negatives not allowed" - and the negative that was passed.if there are multiple negatives, show all of them in the exception message

6. Numbers bigger than 1000 should be ignored, so adding 2 + 1001  = 2

7. Delimiters can be of any length with the following format:  "//[delimiter]\n" for example: "//[***]\n1***2***3" should return 6

8. Allow multiple delimiters like this:  "//[delim1][delim2]\n" for example "//[*][%]\n1*2%3" should return 6. Make sure you can also handle multiple delimiters with length longer than one char
