class TestCase:
  def __init__(self, name):
    self.name = name

  def setup(self):
    pass

  def run(self):
    method = getattr(self, self.name)
    print('running method:', method)
    method()
