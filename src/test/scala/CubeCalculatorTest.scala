import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
    test("CubeCalculatorTest.cube"){
        assert(CubeCalculator.cube(3) == 28)
    }
}
