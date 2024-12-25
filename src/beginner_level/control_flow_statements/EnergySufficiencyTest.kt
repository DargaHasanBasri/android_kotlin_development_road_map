package beginner_level.control_flow_statements

/* Senaryo: Mars'taki koloni, enerji kaynaklarını etkili bir şekilde yönetebilmek için belirli testler yapmaktadır.
Bu testlerde enerji kaynaklarının performans puanları hesaplanır ve bu puanlara göre kaynakların durumu
değerlendirilir. Performans puanı 100 üzerinden değerlendirilir ve her kaynak bir yeterlilik derecesi alır.
Enerji kaynaklarının yeterlilik durumlarını belirlemek ve hangi kaynağın geliştirilmesi gerektiğini analiz etmek.
Bu dereceler, enerji kaynağı için belirli aksiyonların alınmasını sağlar.
Yeterlilik Dereceleri:
90 ve üzeri: A (Mükemmel Verimlilik)
80-89: B (Yüksek Verimlilik)
70-79: C (Orta Verimlilik)
60-69: D (Düşük Verimlilik)
60'ın altı: F (Yetersiz Verimlilik) */

fun calculateEfficiencyPerformance() {
    /* Varyant 3: Sınav puanına göre bir öğrencinin notunu belirleyen bir programı
    iç içe geçmiş if-else ifadeleri kullanarak yazın. */

    println("-".repeat(50))

    println("Evaluating Energy Source Performance...")

    println("-".repeat(50))


    print("Enter today's performance metric: ")
    // Kullanıcıdan performans metriğini alır. readln() metodu, bir satır girişini alır ve toDoubleOrNull() ile bir
    // Double değere dönüştürülür. Eğer dönüşüm başarısız olursa (null dönerse),
    // ?: operatörü devreye girer ve varsayılan değer olarak 0.0 atanır.
    val performanceMetric = readln().toDoubleOrNull() ?: 0.0

    // lateinit anahtar kelimesi, değişkenlerin başlatılmadan önce tanımlanmasını sağlar.
    // Bu sayede programın ilerleyen kısmında bu değişkenlere değer atanır.
    lateinit var grade: String
    lateinit var message: String

    // if-else yapısı kullanılarak performans metriğine göre derecelendirme yapılır
    // İlk koşul performanceMetric > 100 ile, yanlış bir değer girilmesi durumunda hata mesajı gösterilir.
    // Diğer durumlarda, aralığa uygun dereceler (A, B, C, D, F) ve açıklama mesajları atanır.
    if (performanceMetric > 100) {
        grade = "There is no such metric range."
        message = "You entered the wrong value! Max. You can enter the value 100."
    } else if (performanceMetric >= 90) {
        grade = "A"
        message = "Excellent Efficiency! This energy source is optimal for long-term use."
    } else if (performanceMetric >= 80) {
        grade = "B"
        message = "High Efficiency. Suitable for most operations."
    } else if (performanceMetric >= 70) {
        grade = "C"
        message = "Moderate Efficiency. Needs some improvements."
    } else if (performanceMetric >= 60) {
        grade = "D"
        message = "Low Efficiency. Consider upgrading or replacing."
    } else  {
        grade = "F"
        message = "Insufficient Efficiency. Not suitable for current needs."
    }

    println("-".repeat(50))

    println("Energy Source Score: $performanceMetric -> Grade: $grade")
    println("Feedback: $message")

    println("-".repeat(50))
}
