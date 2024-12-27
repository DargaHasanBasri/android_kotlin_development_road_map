package beginner_level.arrays

/* Mars üssünde yer alan bilimsel araçlar, günlük olarak belirli miktarda veri topluyor. Bu araçların her birinin
topladığı verileri bir dizi kullanarak temsil ediyoruz. Program, her bir aracın topladığı veriyi yazdıracak ve tüm
araçların toplam günlük veri kapasitesini hesaplayarak Mars üssünün günlük veri depolama limitini aşıp aşmadığını
kontrol edecek. */

fun dailyDataCapacity() {
    // Varyant 1: Bir tamsayı dizisi tanımlayın, değerlerle başlatın ve her bir öğeyi yazdırın.
    // Varyant 2: Bir dizideki tüm öğelerin toplamını bulan bir program yazın.

    // Mars'taki bilimsel araçların günlük veri toplama kapasitesi
    val dataCollected = arrayOf(300, 450, 250, 400, 320)

    println("-".repeat(50))

    println("Mars Daily Data Collection:")

    println("-".repeat(50))

    // Dizideki her bir öğeye erişmek için `withIndex()` kullanılıyor.
    // `index` o anki elemanın numarası ve 0'dan başlar, `data` ise dataCollected listesinin
    // içindeki her bir  veriyi temsil eder. Index'in 1'den başlaması için  (index + 1) ifadesini kullandık.
    for ((index, data) in dataCollected.withIndex()) {
        // Her bir aracın topladığı veriyi yazdırma
        println("Daily Data ${index + 1}: $data MB")
    }

    println("-".repeat(50))

    // '.sum()' ifadesi bir dizinin değerlerinin toplamını verir.
    val totalDataCollected = dataCollected.sum()

    println("Total Data Collected: $totalDataCollected MB")

    // Mars üssünün günlük veri depolama limiti
    val dailyDataStorageLimit = 1600

    // Eğer toplanan veri toplamı depolama limitini aşıp aşmadığının kontrolü sağlanır.
    // Duruma göre bir mesaj yazdırılır.
    val messageStatus = if (totalDataCollected > dailyDataStorageLimit) {
        "Data collection is within the storage limit."
    } else {
        "Storage capacity exceeded! Optimize data collection."
    }

    println("-".repeat(50))

    println("Data Storage Limit Status: $messageStatus")

    println("-".repeat(50))
}
