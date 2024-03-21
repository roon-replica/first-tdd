from TestCase import TestCase
from first.WasRun import WasRun


class TestCaseTest(TestCase):
  def __init__(self, name):
    self.name = name

  def testTemplateMethod(self):
    test = WasRun("testTargetMethod")
    test.run()

    assert "setUp testTargetMethod tearDown " == test.log
    print("log = ", test.log)

  def testResult(self):
    test = WasRun("testTargetMethod")
    result = test.run()
    print("result.summary = ", result.summary())
    assert ("1 run, 0 failed" == result.summary())

  def testFailedResult(self):
    test = WasRun("testBrokenMethod")
    result = test.run()
    print("result.summary = ", result.summary())
    assert ("1 run, 1 failed" == result.summary())


TestCaseTest("testTemplateMethod").run()
TestCaseTest("testResult").run()
TestCaseTest("testFailedResult").run()
