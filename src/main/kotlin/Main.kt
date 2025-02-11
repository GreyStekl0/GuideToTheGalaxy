import com.fleeksoft.ksoup.Ksoup
import com.fleeksoft.ksoup.network.parseGetRequestBlocking

fun main() {
    val url = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
    val teg = "sc-2aegk7-2 bzpNIu"

    val document = Ksoup.parseGetRequestBlocking(url)

    val quoteElements = document.select("div[class=$teg]")

    for (element in quoteElements) {
        val quoteText = element.text()
        println("$quoteText\n")
    }
}
