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


TestCaseTest("testTemplateMethod").run()
