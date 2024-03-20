from TestCase import TestCase
from first.WasRun import WasRun


class TestCaseTest(TestCase):
  def __init__(self, name):
    self.test = WasRun("setUp")
    self.name = name

  def testSetUp(self):
    self.test.run()
    assert self.test.was_setup


TestCaseTest("testSetUp").run()
