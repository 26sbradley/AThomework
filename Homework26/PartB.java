// The output would be 3
//Even though the try block returns 1, the finally block always executes, and:

//If finally contains a return statement, it OVERRIDES any previous return.
// So:
// First: try executes → attempts to return 1
// Second: finally executes → returns 3
// Third: 3 replaces 1
// Therefore: the outcome is 3