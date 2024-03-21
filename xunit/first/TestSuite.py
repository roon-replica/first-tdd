from TestCase import TestCase


class TestSuite(TestCase):
  def __init__(self):
    self.testcases = []

  def add(self, test):
    self.testcases.append(test)

  def run(self, result):
    print('testcases= ', self.testcases)

    for testcase in self.testcases:
      testcase.run(result)
