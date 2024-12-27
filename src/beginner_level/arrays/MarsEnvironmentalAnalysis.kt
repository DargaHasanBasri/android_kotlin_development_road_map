package beginner_level.arrays

/* Senaryo: Mars'taki kolonilerden gelen veri paketleri, görev başarı oranları ve hava basıncı ölçümlerini içermektedir.
Görev kontrol ekibi, en yüksek ve en düşük görev başarı oranlarını belirleyerek kolonilerin performansını değerlendirir.
Ayrıca, hava basıncı ölçümlerinin ortalamasını hesaplayarak kolonilerdeki atmosferik koşulların stabil olup olmadığını
analiz eder. Bu veriler, kolonilerin genel durumunu izlemek ve günlük operasyonları optimize etmek için kullanılır. */

fun marsEnvironmentalAnalysis() {
    // Varyant 4: Bir tamsayı dizisindeki en büyük ve en küçük öğeleri bulan bir program yazın.
    // Varyant 5: Ondalıklı (float) bir dizideki tüm öğelerin ortalamasını hesaplayan bir program geliştirin.

    // Görev başarı oranları (tamsayı dizisi)
    val taskSuccessRates = listOf(85, 92, 78, 88, 95, 70)

    // Hava basıncı ölçümleri (ondalıklı sayı dizisi)
    val airPressures = listOf(1012.5, 1013.2, 1011.8, 1014.0, 1012.9)

    // taskSuccessRates listesindeki '.maxOrNull()' ifadesi ile max değer bulunur eğer null ifade varsa değer 0 atanır.
    val taskSuccessMax = taskSuccessRates.maxOrNull() ?: 0

    // taskSuccessRates listesindeki 'minOrNull()' ifadesi ile min değer bulunur eğer null ifade varsa değer 0 atanır.
    val taskSuccessMin = taskSuccessRates.minOrNull() ?: 0

    // airPressures listesinin '.sum()' ile toplamı alınır ve '.size' ile eleman sayısı alınır.
    // İkisinin bölme işlemi ile ortalaması bulunur ve averageAirPressuresMethod1 değişkenine atanır.
    val averageAirPressuresMethod1 = airPressures.sum() / airPressures.size

    // airPressures listesinin '.average()' ile ortalaması bulunur ve averageAirPressuresMethod2 değişkenine atanır.
    val averageAirPressuresMethod2 = airPressures.average()

    println("-".repeat(50))

    println("Highest mission success rate: $taskSuccessMax")
    println("Lowest mission success rate: $taskSuccessMin")

    println("-".repeat(50))

    println("Average air pressure method1: %.2f".format(averageAirPressuresMethod1))
    println("Average air pressure method2: %.2f".format(averageAirPressuresMethod2))

    println("-".repeat(50))
}