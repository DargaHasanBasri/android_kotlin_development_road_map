package beginner_level.arrays

/* Senaryo: Mars'ta bulunan koloniler ve araştırma bölgelerinin isimleri bir dizide tutulmaktadır. Görev kontrol ekibi,
bir astronotun belirttiği koloni bölgesini arayarak o bölgenin durumunu sorgulamak istemektedir. Eğer belirtilen bölge
dizide mevcutsa, ekibin kontrol sistemine "Koloni bölgesi aktif ve incelenebilir." mesajı gönderilir. Eğer belirtilen
bölge mevcut değilse, "Koloni bölgesi bulunamadı. Haritayı kontrol edin." mesajı ile astronota bilgi verilir. */

fun searchMarsColony() {
    // Varyant 3: Şehir isimlerini içeren bir string dizisi oluşturun ve kullanıcıdan alınan bir şehri dizide arayın.

    println("-".repeat(50))

    // Mars'taki koloni bölgelerinin isimlerini içeren bir string dizisi
    val marsColonyNames = listOf("Olympus Base", "Valles Research Zone", "Gale Crater", "Hellas Station", "Elysium Hub")

    print("Enter the name of the colony zone you are searching for: ")
    val userInput = readlnOrNull()?.trim()

    println("-".repeat(50))

    // Kullanıcıdan alınan koloni adı dizide '.contains(userInput)' ile aranıyor eğer girdi
    // dizide varsa true yoksa false döndürülür.
    if (userInput != null && marsColonyNames.contains(userInput)) {
        println("Mars Colony: $userInput")
        println("Status: Colony zone is active and ready for exploration.")
    } else {
        println("Mars Colony: $userInput")
        println("Status: Colony zone not found. Check the map for accurate location.")
    }

    println("-".repeat(50))
}