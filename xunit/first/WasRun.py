from TestCase import TestCase


class WasRun(TestCase):
  def __init__(self, name):
    TestCase.__init__(self, name)

  def testTargetMethod(self):
    self.log += "testTargetMethod "

  def testBrokenMethod(self):
    self.log += "testBrokenMethod "
    raise Exception

  def setUp(self):
    self.wasRun = None
    self.log = "setUp "

  def tearDown(self):
    self.log = self.log + "tearDown "
    print("log = ", self.log)
