from TestCase import TestCase
from first.WasRun import WasRun


class TestCaseTest(TestCase):
  def testRunning(self):
    test = WasRun("test_method")
    assert (not test.was_run)
    test.run()
    assert (test.was_run)


TestCaseTest("testRunning").run()
