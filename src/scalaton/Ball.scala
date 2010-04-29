package scalaton

import scala.math.{random, sin, cos, pow, sqrt}
import processing.core.PApplet

/**
 * A ball is a cute, moving object.
 */
class Ball {
  def myRand(min: Float = 0f, max: Float = 1f) = min + random.toFloat * (max - min)

  var x = myRand(max = 800)
  var y = myRand(max = 600)
  var size = myRand(10, 50)
  var xSeed = myRand(1, 100)
  var ySeed = myRand(1, 100)
  var sizeSeed = myRand(1, 123)
  var dx = 0f
  var dy = 0f
  var dSize = 0f
  var color = (myRand(max = 255), 255f, myRand(max = 255), myRand(max = 255))

  def update(frame: Int, mouseX: Int, mouseY: Int) {
    val dist = sqrt(pow(x-mouseX, 2) + pow(y-mouseY, 2)).toFloat
    dx = sin(frame / xSeed).toFloat * dist / 4
    dy = cos(frame / ySeed).toFloat * dist / 4
    dSize = cos(frame / sizeSeed).toFloat * 10
  }

  def draw(g: PApplet) {
    g.fill(color._1, color._2, color._3, color._4)
    g.ellipse(x + dx, y + dy, size + dSize, size + dSize)
  }

}