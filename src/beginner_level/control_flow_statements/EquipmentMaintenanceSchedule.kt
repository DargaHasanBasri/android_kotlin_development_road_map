package beginner_level.control_flow_statements

/* Senaryo: Mars üssündeki astronot mürettebatı, enerji üretim ekipmanlarının bakımını belirli yıllarda
gerçekleştiriyor. Ancak bakım planları, Mars yılı takvimine bağlı olarak değişiyor. Mars yılı takvimi Dünya'nın
artık yıl hesaplama sistemi ile paralel bir mantık izler:
Artık yıllarda bakım yapılmaz çünkü bu yıllar enerji üretiminin zirve yaptığı yıllardır.
Artık yıl olmayan yıllarda bakım gereklidir çünkü bu yıllar boyunca enerji üretim kapasitesini en üst düzeyde tutmak
için düzenli kontrol yapılması gerekir.
Astronotlar, ekipman bakım döngülerini optimize ederek kritik görevlerde daha fazla zaman kazanmayı hedefliyor. */

fun calculateMaintenanceCalendar() {
    // Varyant 4: if-else deyimini kullanarak bir yılın artık yıl olup olmadığını kontrol eden bir program oluşturun.

    println("-".repeat(50))

    println("Welcome to the Maintenance Year Check...")

    println("-".repeat(50))

    print("Enter the Mars year to check maintenance schedule: ")
    // readln() ile kullanıcıdan alınan girdi bir String olarak okunur.
    // .toIntOrNull() fonksiyonu, bu girdiyi bir tamsayıya (Int) dönüştürmeye çalışır. Eğer girdi sayı değilse, null döndürür.
    // ?: (Elvis operatörü) ile, eğer değer null ise, marsYear değişkenine varsayılan olarak 0 atanır.
    val marsYear = readln().toIntOrNull() ?: 0

    // marsYear % 4 == 0 ifadesi, girilen yılın 4'e tam bölünüp bölünmediğini kontrol eder.
    val maintenanceMessage = if (marsYear % 4 == 0) {
        // Eğer yıl 4'e tam bölünüyorsa, bu bir "Leap Year" (Artık Yıl) kabul edilir ve "No maintenance required" mesajı atanır.
        "Leap Year on Mars No maintenance required. Systems are operating at peak efficiency."
    } else {
        // Aksi takdirde, yıl bir "Regular Year" (Normal Yıl) kabul edilir ve "Maintenance required" mesajı atanır.
        "Regular Year on Mars Maintenance required to ensure optimal performance."
    }
    // Bu mesaj, maintenanceMessage değişkeninde saklanır.

    println("-".repeat(50))

    // Girilen yıl (marsYear) ekrana yazdırılır.
    // Yılın bakım durumu mesajı (maintenanceMessage) ekrana yazdırılır.
    println("Mars Year: $marsYear")
    println("Maintenance Status Message: $maintenanceMessage")

    println("-".repeat(50))
}