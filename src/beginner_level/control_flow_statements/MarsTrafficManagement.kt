package beginner_level.control_flow_statements

/* Senaryo: Mars kolonisindeki astronotlar, yer altı tünelleri ve yüzey araçlarını güvenle koordine etmek için
bir trafik ışığı sistemi geliştirmiştir. Bu sistem, ışık renklerine göre astronotların ne yapması gerektiğini
belirler. When ifadesi kullanılarak bu ışık sistemi simüle edilecektir.
Trafik ışığı kuralları:
Yeşil ışık: Araçlar serbestçe hareket edebilir.
Sarı ışık: Araçlar dikkatli olmalı ve güvenli alandan uzaklaşmamalı.
Kırmızı ışık: Araçlar güvenli alanda toplanmalı.
Bilinmeyen ışık: Arızalı sistem, yardım talep edilecektir. */

class MarsTrafficManagement {
    fun marsTrafficLightSystem(signalType: String) {
        // Varyant 5: when ifadesini kullanarak basit bir trafik ışığı sistemi simüle eden bir program geliştirin.

        // Farklı sinyal türlerini kontrol eder ve her biri için uygun mesaj döndürür.
        val signalMessage = when(signalType) {
            "green" -> "Proceed, vehicles may move freely."
            "yellow" -> "Caution, vehicles should be careful and move away from safe areas"
            "red" -> "Warning vehicles should be collected in a safe area"
            else -> "Alert faulty system, request assistance"
        }

        println("-".repeat(50))

        // signalType ve ilgili signalMessage konsola yazdırır.
        println("Mars Traffic Signal: $signalType")
        println("Action: $signalMessage")

        println("-".repeat(50))
    }

    fun marsTrafficLightSimulation()  {
        // Bir dizi sinyal üzerinden trafik ışığı sistemini test eder.
        val signals = listOf("Green", "Yellow", "Red", "Blue")

        // Dizi üzerinde elemanları tek tek 'signal' gezer ve marsTrafficLightSystem sırayla değerleri verir
        for (signal in signals) {
            marsTrafficLightSystem(signalType = signal)
        }
    }
}