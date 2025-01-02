package beginner_level.scope_functions

/* Senaryo: Mars ortamında farklı görevlerin risk durumlarını analiz eden bir sistem geliştirelim. Sistem şu
şekilde çalışır: Görevlerin kritik verileri analiz edilir (örneğin: hava durumu, kaynak tüketimi, enerji durumu).
Her görev için bir risk analizi fonksiyonu lambda olarak yazılır ve higher-order fonksiyon ile çalıştırılır. */

class MissionRiskAnalysis(
    val taskName: String,         // Görevin adı
    val energyConsumption: Int,  // Enerji tüketimi (kWh)
    val timeRequired: Int,      // Görev süresi (saat)
    val weatherRisk: Int       // Hava durumu riski (1-10 arasında)
) {
    /* Varyant 2: Parametre olarak bir lambda alan ve bu lambdayı çalıştıran
     bir üst düzey (higher-order) fonksiyon oluşturun */

    // Higher-order fonksiyon: Risk analizi (analyzeTaskRisk)
    // task: Bir MissionRiskAnalysis türünden nesne. Bu, analiz edilmek istenen görevin özelliklerini içerir.
    /* riskEvaluation: (MissionRiskAnalysis) -> String türünde bir lambda/fonksiyon. Bu, bir
    MissionRiskAnalysis nesnesini alır ve bir String döndürür. riskEvaluation, analiz mantığını dinamik
    olarak tanımlamak için kullanılan bir fonksiyondur. */
    fun analyzeTaskRisk(task: MissionRiskAnalysis, riskEvaluation: (MissionRiskAnalysis) -> String): String {
        // Lambda çalıştırılır
        return riskEvaluation(task)
    }
}



