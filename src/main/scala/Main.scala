
import org.scalajs.dom
import org.scalajs.dom.document

object Main {
  def main(args: Array[String]): Unit = {
    println("MAIN: Scala.js berhasil dijalankan!")

    val status = document.getElementById("status")
    val button = document.getElementById("testButton")
    val clickCount = document.getElementById("clickCount")
    val message = document.getElementById("message")
    val log = document.getElementById("log")

    def addLog(text: String): Unit = {
      log.textContent = log.textContent + "\n" + text
      println(text)
    }

    if (
      status != null &&
      button != null &&
      clickCount != null &&
      message != null &&
      log != null
    ) {
      status.textContent = "Scala.js aktif ✓"
      status.classList.add("ready")
      message.textContent = "Scala.js berhasil terhubung ke HTML."
      addLog("INIT: Elemen HTML berhasil ditemukan.")

      var clicks = 0

      button.addEventListener(
        "click",
        (_: dom.MouseEvent) => {
          clicks += 1

          clickCount.textContent = clicks.toString
          message.textContent =
            s"Berhasil! Tombol diklik $clicks kali. 🎉"

          button.textContent = "Tes Berhasil ✓"
          status.textContent = "Koneksi dan event klik berhasil ✓"

          addLog(s"CLICK: Tombol diklik ke-$clicks kali.")
        }
      )
    } else {
      println("ERROR: Ada elemen HTML yang tidak ditemukan.")

      if (status != null) {
        status.textContent = "Gagal menemukan elemen HTML!"
      }
    }
  }
}
