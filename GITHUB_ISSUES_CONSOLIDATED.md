# GitHub Issues for Scientific Calculator Project (Consolidated)

Copy and paste each issue below into GitHub Issues. Recommended labels are provided for each.

---

## Setup & Infrastructure Issues

### Issue #1: Project Setup and Configuration
**Labels:** `setup`, `infrastructure`
**Size:** Medium

**Description:**
Set up the complete project infrastructure including repository collaboration, Maven configuration, and testing framework.

**Acceptance Criteria:**
- [ ] Repository forked to team member's account
- [ ] All team members have cloned the shared repository
- [ ] Maven project structure created (src/main/java, src/test/java)
- [ ] pom.xml configured with project metadata and JUnit 5 dependency
- [ ] Project builds successfully with `mvn clean install`
- [ ] Tests run successfully with `mvn test`
- [ ] Team coding standards and conventions documented
- [ ] Git workflow and code review process established

---

## Core Calculator Features

### Issue #2: Implement Basic Calculator Display System
**Labels:** `core-feature`, `enhancement`
**Size:** Medium

**Description:**
Implement the fundamental calculator display system including state management and basic display operations.

**Acceptance Criteria:**
- [ ] Calculator class created with display state variable (default 0)
- [ ] `getCurrentValue()` method returns current display value
- [ ] `clearDisplay()` method resets display to 0
- [ ] `updateDisplay(double value)` method changes display value
- [ ] Display state properly initialized and managed
- [ ] All methods documented with clear signatures

---

### Issue #3: Implement Basic Arithmetic Operations
**Labels:** `core-feature`, `enhancement`
**Size:** Medium

**Description:**
Implement all four basic arithmetic operations: addition, subtraction, multiplication, and division.

**Acceptance Criteria:**
- [ ] `add(double number)` method implemented
- [ ] `subtract(double number)` method implemented
- [ ] `multiply(double number)` method implemented
- [ ] `divide(double number)` method implemented
- [ ] All operations automatically update display
- [ ] Division by zero triggers error state
- [ ] Operations handle edge cases (large numbers, negatives, zero)

---

### Issue #4: Implement Advanced Mathematical Operations
**Labels:** `core-feature`, `enhancement`
**Size:** Medium

**Description:**
Implement square, square root, exponentiation, inverse, and sign switching functions.

**Acceptance Criteria:**
- [ ] `square()` calculates x² correctly
- [ ] `squareRoot()` calculates √x correctly
- [ ] `exponentiate(double y)` calculates x^y correctly
- [ ] `inverse()` calculates 1/x correctly
- [ ] `switchSign()` toggles between positive and negative
- [ ] Square root of negative triggers error
- [ ] Inverse of zero triggers error
- [ ] All operations automatically update display
- [ ] Edge cases handled (0^0, negative bases, etc.)

---

### Issue #5: Implement Error Handling System
**Labels:** `core-feature`, `bug`, `enhancement`
**Size:** Medium

**Description:**
Implement comprehensive error handling system to display "Err" and prevent operations during error states.

**Acceptance Criteria:**
- [ ] Error state mechanism implemented
- [ ] Display shows "Err" on error conditions
- [ ] Division by zero triggers error
- [ ] Square root of negative triggers error
- [ ] Inverse of zero triggers error
- [ ] Error state prevents further operations
- [ ] `clearError()` method implemented
- [ ] Clear display also clears error state
- [ ] All operations check for error state before executing

---

## Scientific Features

### Issue #6: Implement Display Mode Switching System
**Labels:** `scientific-feature`, `enhancement`
**Size:** Medium

**Description:**
Implement complete display mode switching functionality for binary, octal, decimal, and hexadecimal modes.

**Acceptance Criteria:**
- [ ] Display mode enum/constants created (BINARY, OCTAL, DECIMAL, HEXADECIMAL)
- [ ] Current display mode tracked (default: DECIMAL)
- [ ] `switchDisplayMode()` rotates through modes in order
- [ ] `switchDisplayMode(String mode)` sets specific mode directly
- [ ] Mode conversion logic implemented for all modes
- [ ] Display updates to reflect current mode
- [ ] Invalid mode strings handled appropriately
- [ ] Current mode retrievable

---

### Issue #7: Implement Memory Functions (M+, MC, MRC)
**Labels:** `scientific-feature`, `enhancement`
**Size:** Small

**Description:**
Implement complete memory functionality including add, clear, and recall operations.

**Acceptance Criteria:**
- [ ] Memory variable created and initialized to 0
- [ ] `memoryAdd()` (M+) adds current display value to memory
- [ ] `memoryClear()` (MC) resets memory to 0
- [ ] `memoryRecall()` (MRC) recalls memory value to display
- [ ] Memory persists across operations
- [ ] Memory and display values stored independently
- [ ] Multiple M+ operations accumulate correctly

---

### Issue #8: Implement Trigonometric Functions and Units Mode
**Labels:** `scientific-feature`, `enhancement`
**Size:** Large

**Description:**
Implement all trigonometric functions (sine, cosine, tangent and their inverses) along with units mode switching (degrees/radians).

**Acceptance Criteria:**
- [ ] Units mode enum created (DEGREES, RADIANS)
- [ ] `switchUnitsMode()` rotates between degrees and radians
- [ ] `switchUnitsMode(String mode)` sets specific units mode
- [ ] `sine()` calculates sin(x) respecting current units mode
- [ ] `cosine()` calculates cos(x) respecting current units mode
- [ ] `tangent()` calculates tan(x) respecting current units mode
- [ ] `inverseSine()` calculates sin⁻¹(x) in current units mode
- [ ] `inverseCosine()` calculates cos⁻¹(x) in current units mode
- [ ] `inverseTangent()` calculates tan⁻¹(x) in current units mode
- [ ] Tangent handles undefined values (e.g., tan(90°))
- [ ] Inverse functions handle domain restrictions (|x| ≤ 1 for sin⁻¹ and cos⁻¹)
- [ ] All functions automatically update display
- [ ] Invalid mode strings handled appropriately

---

### Issue #9: Implement Logarithmic Functions
**Labels:** `scientific-feature`, `enhancement`
**Size:** Medium

**Description:**
Implement all logarithmic functions: log base 10, antilog (10^x), natural log, and exponential (e^x).

**Acceptance Criteria:**
- [ ] `log()` calculates log₁₀(x) correctly
- [ ] `antilog()` calculates 10^x correctly
- [ ] `ln()` calculates natural logarithm correctly
- [ ] `exp()` calculates e^x correctly
- [ ] Domain restrictions enforced (x > 0 for log and ln)
- [ ] Large exponents handled appropriately
- [ ] Error states triggered for invalid inputs
- [ ] All functions automatically update display

---

### Issue #10: Implement Factorial Function
**Labels:** `scientific-feature`, `enhancement`
**Size:** Medium

**Description:**
Implement factorial function (x!) with appropriate error handling.

**Acceptance Criteria:**
- [ ] `factorial()` calculates x! correctly for integers
- [ ] Non-integer inputs handled appropriately
- [ ] Negative numbers trigger error state
- [ ] Large factorials handled (overflow consideration)
- [ ] Zero factorial returns 1 (0! = 1)
- [ ] Display automatically updates

---

## Custom Features

### Issue #11: Design Custom Calculator Features
**Labels:** `custom-feature`, `discussion`, `enhancement`
**Size:** Small

**Description:**
Team discussion and design for two custom calculator features beyond core and scientific requirements.

**Acceptance Criteria:**
- [ ] Two custom feature ideas proposed and discussed
- [ ] Features are not already covered by requirements
- [ ] Feature requirements documented for both features
- [ ] Feature designs approved by team
- [ ] Implementation plans created

---

### Issue #12: Implement Custom Features
**Labels:** `custom-feature`, `enhancement`
**Size:** Medium

**Description:**
Implement both custom calculator features as designed in Issue #11.

**Acceptance Criteria:**
- [ ] Custom feature #1 implemented according to design
- [ ] Custom feature #2 implemented according to design
- [ ] Both features properly integrated with calculator
- [ ] Display updates automatically for both features
- [ ] Error handling implemented where appropriate
- [ ] Features documented

---

## Testing Issues

### Issue #13: Write Tests for Core Calculator Features
**Labels:** `testing`
**Size:** Large

**Description:**
Create comprehensive test suite for all core calculator functionality including display management, arithmetic operations, advanced operations, and error handling.

**Acceptance Criteria:**
- [ ] Test class created with descriptive name
- [ ] Tests for display state initialization (default 0)
- [ ] Tests for getCurrentValue(), updateDisplay(), clearDisplay()
- [ ] Tests for add, subtract, multiply, divide (normal and edge cases)
- [ ] Tests for division by zero error
- [ ] Tests for square, squareRoot, exponentiate, inverse, switchSign
- [ ] Tests for square root of negative (error case)
- [ ] Tests for inverse of zero (error case)
- [ ] Tests for error state mechanism
- [ ] Tests for error display showing "Err"
- [ ] Tests for operations blocked during error state
- [ ] Tests for error clearing mechanism
- [ ] All tests have descriptive names
- [ ] All tests are independent
- [ ] Tests pass successfully

---

### Issue #14: Write Tests for Scientific Features
**Labels:** `testing`
**Size:** Large

**Description:**
Create comprehensive test suite for all scientific calculator features including display modes, memory functions, trigonometric functions, logarithmic functions, and factorial.

**Acceptance Criteria:**
- [ ] Tests for display mode switching (all modes)
- [ ] Tests for display mode rotation and direct setting
- [ ] Tests for memory functions (M+, MC, MRC)
- [ ] Tests for memory persistence
- [ ] Tests for all trig functions in both degrees and radians
- [ ] Tests for trig inverse functions with domain restrictions
- [ ] Tests for units mode switching
- [ ] Tests for tangent undefined values
- [ ] Tests for all logarithmic functions
- [ ] Tests for log/ln domain restrictions (x > 0)
- [ ] Tests for factorial with various inputs
- [ ] Tests for factorial edge cases (0!, negative, non-integer)
- [ ] All tests have descriptive names
- [ ] All tests are independent
- [ ] Tests pass successfully

---

### Issue #15: Write Tests for Custom Features
**Labels:** `testing`, `custom-feature`
**Size:** Medium

**Description:**
Create comprehensive test suite for both custom calculator features.

**Acceptance Criteria:**
- [ ] Test class created for custom features
- [ ] Tests for custom feature #1 (normal behavior)
- [ ] Tests for custom feature #1 (error cases)
- [ ] Tests for custom feature #2 (normal behavior)
- [ ] Tests for custom feature #2 (error cases)
- [ ] All tests have descriptive names
- [ ] All tests are independent
- [ ] Tests pass successfully

---

### Issue #16: Verify Test Suite Quality and Coverage
**Labels:** `testing`, `quality-assurance`
**Size:** Small

**Description:**
Review entire test suite to ensure independence, descriptive naming, and adequate coverage.

**Acceptance Criteria:**
- [ ] All test names are descriptive and follow conventions
- [ ] Tests can run in any order
- [ ] No test depends on another test's execution
- [ ] Test setup/teardown properly implemented
- [ ] Test coverage reviewed and adequate
- [ ] All tests pass independently
- [ ] Running or not running one test doesn't influence others

---

## Documentation Issues

### Issue #17: Create Complete UML Class Diagrams
**Labels:** `documentation`
**Size:** Large

**Description:**
Create comprehensive UML class diagrams for the entire calculator system including all classes (excluding test classes).

**Acceptance Criteria:**
- [ ] UML box for main Calculator class created
- [ ] All instance variables listed with data types
- [ ] All core methods listed with signatures
- [ ] Scientific feature classes included
- [ ] Custom feature classes included
- [ ] All relationships shown (inheritance, composition, etc.)
- [ ] Visibility modifiers indicated (+, -, #)
- [ ] All classes (excluding tests) included
- [ ] Diagram is clear and readable
- [ ] Diagram format finalized (image/PDF)
- [ ] Documentation reviewed and approved by team

---

## Final Integration and Delivery

### Issue #18: Code Quality Review and Refactoring
**Labels:** `quality-assurance`, `refactoring`
**Size:** Large

**Description:**
Comprehensive code review, refactoring, and quality assurance for the entire project.

**Acceptance Criteria:**
- [ ] All code reviewed by at least one other team member
- [ ] Code follows team coding standards
- [ ] No code duplication
- [ ] Proper naming conventions used throughout
- [ ] Comments added where necessary
- [ ] All operations automatically update display (verified)
- [ ] No regression issues found
- [ ] Refactoring completed where needed

---

### Issue #19: Final Integration Testing and Delivery
**Labels:** `testing`, `quality-assurance`, `deployment`
**Size:** Medium

**Description:**
Perform final integration testing and create pull request for submission.

**Acceptance Criteria:**
- [ ] All features work together correctly
- [ ] End-to-end testing completed
- [ ] Edge cases tested across features
- [ ] Error handling verified across all features
- [ ] All unit tests pass
- [ ] Integration tests pass
- [ ] All code committed to team repository
- [ ] UML diagrams included in repository
- [ ] README updated if necessary
- [ ] Pull request created with proper description
- [ ] Team members listed in PR
- [ ] PR submitted successfully to original repository

---

## Summary

**Total Issues:** 19 (reduced from 66)

**Issue Breakdown:**
- Setup & Infrastructure: 1 issue
- Core Features: 4 issues
- Scientific Features: 5 issues
- Custom Features: 2 issues
- Testing: 4 issues
- Documentation: 1 issue
- Final Delivery: 2 issues

**Label Categories:**
- `setup` - Initial project setup
- `core-feature` - Core calculator features
- `scientific-feature` - Scientific calculator features
- `custom-feature` - Custom features designed by team
- `testing` - Test-related tasks
- `documentation` - UML and documentation
- `quality-assurance` - Code review and QA
- `bug` - Bug fixes and error handling
- `enhancement` - New features
- `refactoring` - Code improvements
- `deployment` - Final delivery
- `discussion` - Team planning and decision-making

**Size Estimates:**
- Small: 1-3 hours
- Medium: 4-8 hours
- Large: 8-16 hours

**Recommended Sprint Structure:**
- **Sprint 1** (Setup + Core): Issues #1-5
- **Sprint 2** (Scientific Features): Issues #6-10
- **Sprint 3** (Custom Features + Core Testing): Issues #11-13
- **Sprint 4** (Scientific Testing + Documentation): Issues #14-17
- **Sprint 5** (Final Review + Delivery): Issues #18-19

**Notes:**
- Each consolidated issue includes detailed sub-tasks in the acceptance criteria
- The checklist format allows teams to track progress within each issue
- Issues can still be broken down further if a team prefers more granular tracking
- All original requirements from the README are preserved
