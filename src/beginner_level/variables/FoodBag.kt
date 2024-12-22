package beginner_level.variables

/* Senaryo: Bir astronot, Mars'ta bir keşif görevindedir. Görev sırasında bir "gıda çantası"
hesaplama sistemi geliştirmesi gerekiyor. Bu sistemle çantada bulunan yiyeceklerin isimlerini,
kalori değerlerini ve toplam kalori miktarını hesaplayacak. Ayrıca, uzay üssüne geri dönüş yolculuğu
için gereken ekstra kalori ihtiyacını da aritmetik işlemlerle belirleyecek. */

fun calculateFoodBag() {
    /* Varyant 1: Farklı veri türlerinde (String, Int, Float) değişkenler tanımlayın ve
    başlatın, ardından bu değerleri yazdırın. */

    // Her şeyden önce değişkenlerin başında bulunan (val) ifadesini başka bir başlık altında işlenecek.
    // Şuan için değerin karşılığının daha sonra değiştirilemeyeceği anlamı kattığını bilelim yeterli.

    // String ifadeler mainTitle FOOD BAG, subTitle FOOD CALORIES, food1 Haşlanmış Patates, food2 Kuru Üzüm
    val mainTitle = "FOOD BAG"
    val subTitle = "FOOD CALORIES"
    val food1 = "Boiled Potatoes"
    val food2 = "Raisins"

    // Int, Float ifadeler yiyeceklerin kalori miktarları Int ifadesi food1Calories, Float ifadesi food2Calories
    val food1Calories = 183
    val food2Calories = 290.5

    // Değişkenlerin değerlerini yazdırma
    // Eğer tırnak işareti içerisindeyken değişkenin değeri yazdırılacaksa '$' dolar işaretini kullanılır
    // Değişkenin değerini direkt olarak yazdırmak isteniliyorsa değişken adının yazılması yeterli
    /* println("-".repeat(50)) ifadesi terminal çıktılarının daha okunaklı olması için
    yazdırdığım yerde 50 adet - işareti yazdırır */
    println("-".repeat(50))
    println(mainTitle)
    println("Food1: $food1 - Food2: $food2")
    println("-".repeat(50))
    println(subTitle)
    println("Food1 Cal: $food1Calories - Food2 Cal: $food2Calories")
    println("-".repeat(50))

    /* Varyant 2: Tam sayı (integer) ve ondalıklı sayı (float) değişkenlerinde
    aritmetik işlemler gerçekleştirin ve sonuçları yazdırın. */

    val totalFoodCalories = food1Calories + food2Calories
    val extraCaloriesNeeded = 555.6
    val totalCalories = totalFoodCalories + extraCaloriesNeeded

    println("Total Food Calories: $totalFoodCalories")
    println("-".repeat(50))
    println("Extra Calories Required for Return: $extraCaloriesNeeded")
    println("-".repeat(50))
    println("Total Calories Required: $totalCalories")
    println("-".repeat(50))
}
