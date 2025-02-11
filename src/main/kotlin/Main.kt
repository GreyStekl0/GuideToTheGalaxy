import org.jsoup.Jsoup

fun main() {
    val url = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
    val teg = "sc-2aegk7-2 bzpNIu"

    val document = Jsoup.connect(url).get()

    val quoteElements = document.select("div[class=$teg]")

    for (element in quoteElements) {
        val quoteText = element.text()
        println("$quoteText\n")
    }
}
