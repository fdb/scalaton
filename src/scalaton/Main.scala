package scalaton

import java.util.Properties
import java.io._
import processing.core._
import PConstants._

/**
 * Main application object.
 */
object Main extends PApplet {
  val versionProperties = new Properties
  versionProperties.load(new FileInputStream("version.properties"))
  val version = versionProperties.getProperty("app.version")
  val appName = versionProperties.getProperty("app.name")

  var currentFrame = 0
  val balls = List.fill(100) {new Ball}


  override def setup {
    size(800, 600, JAVA2D)
    smooth
    val pFont = createFont("Dialog", 11)
    textFont(pFont)
  }

  override def draw {
    currentFrame += 1
    background(255)
    noStroke
    balls.foreach(b => b.update(currentFrame, mouseX, mouseY))
    balls.foreach(b => b.draw(this))
    drawVersionNumber
  }

  def drawVersionNumber {
    noStroke
    fill(160)
    val footerHeight = 20
    val y = height - footerHeight
    rect(0, y, width, footerHeight)
    fill(200)
    text(version, 5, y + 14)
    fill(40)
    text(version, 5, y + 13)
  }

  def main(args: Array[String]): Unit = {
    var frame = new javax.swing.JFrame(appName)
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE)
    frame.getContentPane().add(Main)
    frame.setSize(800, 600)
    frame.setLocationRelativeTo(null)
    Main.init
    frame.setVisible(true)
  }
}