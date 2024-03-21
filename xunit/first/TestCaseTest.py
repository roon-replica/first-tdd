from TestCase import TestCase
from first.TestResult import TestResult
from first.TestSuite import TestSuite
from first.WasRun import WasRun


class TestCaseTest(TestCase):
  def __init__(self, name):
    self.name = name

  def testSuite(self):
    suite = TestSuite()
    suite.add(WasRun("testTargetMethod"))
    suite.add(WasRun("testBrokenMethod"))

    result = TestResult()
    suite.run(result)

    assert ("2 run, 1 failed" == result.summary())

    print(result.summary())


TestCaseTest("testSuite").testSuite()
