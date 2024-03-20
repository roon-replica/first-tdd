from TestCase import TestCase


class WasRun(TestCase):
  def __init__(self, name):
    TestCase.__init__(self, name)

  def setUp(self):
    self.wasRun = None
    self.log = "setUp "

  def testTargetMethod(self):
    self.log = self.log + "testTargetMethod "

  def tearDown(self):
    self.log = self.log + "tearDown "