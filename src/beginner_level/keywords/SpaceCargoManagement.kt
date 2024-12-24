package beginner_level.keywords

/* Astronotlar, Mars üsleri arasında taşınacak malzemeleri yönetmek için bir kargo sistemi geliştiriyor. Bu sistemde,
kargonun her bir birimi işlenirken değişmeyen bilgiler (örneğin, kargo numarası veya türü) ve değişebilen
bilgiler (örneğin, kalan ağırlık) ile çalışılıyor. Astronotlar, döngü kullanarak her bir kargo biriminin durumunu
kontrol ediyor. val anahtar kelimesi, bir döngüde sabit kalan değerleri temsil etmek için kullanılıyor, ancak değişken
değerler için var tercih ediliyor. */

fun spaceCargoManagement() {
    /* Varyant 5: Döngülerde val anahtar kelimesinin davranışını inceleyin ve
    bunun değişken yeniden atanmasını nasıl etkilediğini gösterin. */

    // Listeler-Diziler daha sonra işlenecek şimdilik birden fazla veriyi bir arada bir yerde tutma şeklinde düşünelim.
    // Kargo listesi (Kargo numarası ve ağırlık bilgisi)
    val cargoList = listOf(
        Pair("KargoID-01", 500),
        Pair("KargoID-02", 700),
        Pair("KargoID-03", 300)
    )

    /* val (immutable): Bir kez değer atandıktan sonra yeniden atanamaz. Ancak, değişken kompleks bir veri tipi
    ise (örneğin bir liste), içeriği değiştirilebilir. */

    // var (mutable): Değişkene farklı bir değer atanabilir ve bu atama döngü içinde tekrar tekrar yapılabilir.

    println("-".repeat(50))

    println("Cargo Processing Begins...")

    println("-".repeat(50))

    // Her bir kargo birimi için işlem
    for (cargo in cargoList) {
        // `cargo` sabit bir değerdir ve yeniden atanamaz.
        // val ile tanımlanan cargoId sabittir. Döngü boyunca sadece okunur ve yeniden atanamaz.
        // var ile tanımlanan weight döngü sırasında güncellenir ve her iterasyonda farklı bir değere sahip olur.

        // Kargo numarası sabit
        val cargoId = cargo.first
        // Derleme HATASI: Val cannot be reassigned
        // cargoId = "NewID"

        // Ağırlık değişebilir
        var weight = cargo.second

        println("$cargoId cargo is being processed...")

        while (weight > 0) {
            // Her adımda sabit işlenen ağırlık
            val processedWeight = 100
            // Kalan ağırlık azaltılıyor
            weight -= processedWeight
            println("  $processedWeight kg processed, remaining: $weight kg")
        }

        /* val değişkenler sabit olduğundan, döngüde işlem sırasında değiştirilemez. Bu, cargoId'nin her kargo için
        sabit kalmasını sağlar. var değişkenler esnektir ve işlem sırasında değerleri güncellenebilir. Bu, weight
        değişkeninin işleme uygun şekilde değişmesini sağlar. Eğer döngülerde bir değişkenin değerini sürekli
        değiştirmek istiyorsak, var kullanmalıyız. Eğer değişkenin sabit kalmasını istiyorsak, val tercih edilmelidir. */

        println("$cargoId completed!")

        println("-".repeat(50))
    }

    println("All shipments have been processed.")

    println("-".repeat(50))
}
