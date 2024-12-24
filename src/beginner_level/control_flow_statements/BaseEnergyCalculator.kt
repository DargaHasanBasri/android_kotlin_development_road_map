package beginner_level.control_flow_statements

/* Senaryo: Mars keşif ekibi, üslerinde enerji tüketimini ve üretimini optimize etmek için bir hesap makinesi
kullanmaya karar verdi. Bu hesap makinesi, keşif araçlarının enerji tüketimi, üslerin enerji üretimi, enerji
aktarımı ve enerji kayıpları gibi temel işlemleri hesaplayabiliyor. Basit aritmetik işlemleri gerçekleştiren
bu hesaplayıcıyı geliştirin. */

fun baseEnergyCalculator() {
    /* Varyant 2: Aritmetik işlemleri gerçekleştiren basit bir hesap makinesi programını Kotlin'in when (switch'e eşdeğer)
    ifadesini kullanarak oluşturun. */

    println("-".repeat(50))

    println("Welcome to the Mars Energy Calculator!")

    println("-".repeat(50))

    print("Enter the first energy value: ")
    val firstEnergy = readln().toDoubleOrNull() ?: 0.0

    print("Enter the second energy value: ")
    val secondEnergy = readln().toDoubleOrNull() ?: 0.0

    println("-".repeat(50))

    print("Enter the transaction operator (+, -, *, /): ")
    val transactionOperator = readln()

    val resultEnergy = when(transactionOperator) {
        "+" -> firstEnergy + secondEnergy
        "-" -> firstEnergy - secondEnergy
        "*" -> firstEnergy * secondEnergy
        "/" -> {
            if (secondEnergy != 0.0) {
                firstEnergy / secondEnergy
            } else {
                println("Error: Division by zero is not allowed.")
                null
            }
        }
        else -> {
            println("Invalid operation: Please enter one of +, -, *, /")
            null
        }
    }

    // 'when' ifadesini belirli bir duruma bağlı olarak kod parçalarını çalıştırır.
    // when Birden fazla durumu kontrol etmek veya bir değişkenin değerine bağlı işlem yapmak için kullanılır.

    // '->' Operatörü, when içinde bir duruma karşılık gelen kodu tanımlamak için kullanılır. Sol tarafta kontrol
    // edilen değer, sağ tarafta ise bu değerle eşleştiğinde yapılacak işlem bulunur.

    // 'if' ve 'else'
    // Belirli bir koşulu kontrol eder ve bu koşula bağlı olarak işlem gerçekleştirir. else kısmı, hiçbir koşul
    // sağlanmazsa çalışır. when içinde daha detaylı kontrol yapmanız gerektiğinde kullanılır.

    // 'null' Boş değeri ifade eder. Kotlin'de bir değişkenin değeri olmayabileceğini belirtmek için kullanılır.
    // Hatalı bir durum veya geçersiz işlemle karşılaşıldığında null döndürmek, hatalı sonuç yerine işlemin başarısız olduğunu belirtir.

    if (resultEnergy != null) {
        println("-".repeat(50))
        println("Result of $firstEnergy $transactionOperator $secondEnergy = $resultEnergy")
        println("-".repeat(50))
    } else {
        println("Calculation could not be completed due to invalid input.")
        println("-".repeat(50))
    }
}