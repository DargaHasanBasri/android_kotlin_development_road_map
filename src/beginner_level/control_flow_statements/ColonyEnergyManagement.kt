package beginner_level.control_flow_statements

/* Senaryo: Mars kolonisine enerji sağlayan bir güneş paneli sistemi bulunmaktadır. Bu sistem, her bir güneş panelinin
ürettiği enerji birimlerini takip eder. Astronotlar, enerji üretim raporlarını düzenlerken, çift enerji birimlerinin
daha istikrarlı enerji üretimini temsil ettiğini fark eder. Bu nedenle, her bir güneş panelinden alınan enerji
birimlerinin çift mi yoksa tek mi olduğunu kontrol etmek ve raporlamak için bir yazılım geliştirirler. */

fun calculateColonyEnergy()  {
    // Varyant 1: if deyimini kullanarak bir sayının çift mi yoksa tek mi olduğunu kontrol eden bir program yazın.

    // Güneş panellerinden alınan enerji birimleri
    val energyUnits = listOf(120, 75, 200, 45, 130)

    println("-".repeat(50))

    println("Mars Colony Energy Production Report:")

    println("-".repeat(50))

    for (unit in energyUnits) {
        // in Anahtar Kelimesi: Koleksiyon üzerinde iterasyon yapmayı sağlar.
        // Her döngüde 'unit' değişkeni, sıradaki enerji birimini temsil eder.
        // Çift mi, tek mi kontrolü
        if (unit % 2 == 0) {
            println("Energy Unit: $unit -> Even (Balanced production)")
        } else {
            println("Energy Unit: $unit -> Odd (Requires attention)")
        }
    }

    /*
     for Döngüsünün Çalışma Süreci:
     Başlangıç: energyUnits adlı bir liste tanımlanır: [120, 75, 200, 45, 130].
     for döngüsü başlatılır ve liste üzerinde iterasyon yapar.

     Her Döngü Adımında:
     unit değişkeni, sırasıyla listedeki her elemanın değerini alır:
     İlk adımda: unit = 120
     İkinci adımda: unit = 75
     Üçüncü adımda: unit = 200
     Bu işlem, tüm elemanlar işlenene kadar devam eder.

     Şart Kontrolü:
     if (unit % 2 == 0) ifadesi çalışır:
     unit % 2 == 0 ifadesi '%' mod alır yani o anki unit'in 2 ye böleninden kalan 0'a eşit mi kontrolü sağlanıyor.
     Eğer unit çift bir sayıysa, println ile "Even" mesajı basılır.
     Değilse, "Odd" mesajı basılır.

     Döngü Sırasında Bellekte Neler Olur?
     unit değişkeni her adımda yeni bir değer alır, yani bellekte tek bir değişken sürekli olarak güncellenir.
     for döngüsü, bellekte gereksiz yere yeni değişkenler oluşturmaz; bu nedenle performanslıdır.
  */

    println("-".repeat(50))

    println("Energy report completed.")

    println("-".repeat(50))
}