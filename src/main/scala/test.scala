
import stainless.lang._

object test {

  def abc = {
    val a = 42
    assert(true)
  }

  def ghi = {
    assert(false)
  }

  def jkl(x: Int) = {
    assert(x == 0)
  }

  def hello(abc: Int) = {
    abc > 0
  }.holds

}
