import unittest


class TestStudy(unittest.TestCase):
    def test_1(self):
        self.assertEqual(6, 1 + 2 + 3)
        self.assertEqual(6, 1 * 2 * 3)

    def test_2(self):
        self.assertTrue('This is a new feature')

    def test_3(self):
        self.assertTrue(True)


if __name__ == '__main__':
    unittest.main()
