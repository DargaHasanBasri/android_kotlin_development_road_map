package beginner_level.variables

/* Senaryo: Bir uzay mürettebatı, Mars’taki görev sırasında 3 günlük su tüketimlerini takip etmek için
bir sistem geliştiriyor. Bu sistem, her mürettebat üyesinin adını, yaşını ve 3 günlük içtiği su miktarını (litre cinsinden)
kaydedecek. Program, her gün sonunda toplam su tüketimini hesaplayacak ve mürettebat üyelerinin su tüketim ortalamasını
gösterecek. */

fun calculateAverageWaterConsumption() {
    /* Varyant 3: Kullanıcıdan isim, yaş ve not ortalaması bilgilerini alan ve
    bu bilgileri ekranda gösteren bir program oluşturun. */

    /* Biz senaryomuzu yukarıda istenilen varyanta uyarladık elde edeceğimiz çıktılar varyantın
    bizim ulaşmamızı istediği çıktılarla uyuşucaktır. */

    /* Öncelikle kullanıcıdan istenilen verileri hatasız girdiği düşünülerek işlemler kodlanmıştır.
    Amaç işlemlerin temel düzeyde nasıl yapıldığını kavramaktır. Daha sonra kontrol işlemleri için
    gerekli terimleri de öğrendiğimizde işlemler geliştirilebilir. */

    println("-".repeat(50))

    println("Enter crew member name and age.")
    // readln() fonksiyonu, kullanıcıdan bir giriş alır. Kullanıcının girdiği adı memberName değişkenine atanır.
    print("Crew Member Name: ")
    val memberName = readln()

    // readln() fonksiyonu, kullanıcıdan bir giriş alır. Kullanıcının girdiği yaşı memberAge değişkenine atanır.
    print("Crew Member Age: ")
    val memberAge = readln()

    println("-".repeat(50))

    // Kullanıcıdan gün gün  içtiği su miktarını alınır. Ayrı ayrı firstDay, secondDay, thirdDay değişkenlerine atanır.
    println("Enter the amount of water the crew member drank over three days. " +
            "After entering the amount of water, press enter.")

    // readln() fonksiyonu, kullanıcıdan bir giriş alır. Alınan girişi '.toFloat()' float'a çevirir ve değişkene atanır.
    print("Crew Member First Day: ")
    val firstDay = readln().toFloat()
    print("Crew Member Second Day: ")
    val secondDay = readln().toFloat()
    print("Crew Member Third Day: ")
    val thirdDay = readln().toFloat()

    println("-".repeat(50))

    // Girilen su miktarları toplanır ve 'totalWaterConsumption' değişkenine atanır.
    val totalWaterConsumption = firstDay + secondDay + thirdDay

    // 3 günlük toplam su miktarının ortalaması alınır ve 'averageWaterConsumption' atanır.
    val averageWaterConsumption = totalWaterConsumption / 3

    // Son olarak alınan girişler terminalde topluca gösterilir.
    println("Name : $memberName")
    println("Age : $memberAge")
    println("Total Water Consumption : $totalWaterConsumption")
    println("Average Water Consumption : $averageWaterConsumption")
    println("-".repeat(50))
}