package beginner_level.keywords

/* Senaryo: Astronot, Mars üssünde ısı yönetimi için karmaşık bir ısı dengeleyici algoritmayı yalnızca ihtiyaç
duyulduğunda başlatmak istiyor. Bu algoritma, enerji tasarrufu amacıyla sürekli olarak çalıştırılmıyor ve
sadece sistemin ısı dengesizliği yaşadığı durumlarda devreye giriyor. */

class MarsBaseThermalManagement {
    class HeatBalancer {
        init {
            // Isı dengeleyici algoritması başlatılıyor...
            println("Initializing the heat balancer algorithm...")
        }

        fun balanceTemperature() {
            // Sıcaklık dengeleniyor...
            println("The temperature is stabilizing...")
        }
    }

    /* Varyant 4: lazy anahtar kelimesinin kullanımını araştırarak karmaşık bir nesneyi sadece
    ilk erişim sırasında başlatmayı gösterin. */

    // Lazy kullanımı: HeatBalancer ilk kez erişildiğinde başlatılacak
    private val heatBalancer: HeatBalancer by lazy {
        HeatBalancer()
    }

    fun checkTemperature(currentTemperature: Int, optimalTemperature: Int) {
        println("Current Temperature: $currentTemperature, Optimal Temperature: $optimalTemperature")
        if (currentTemperature != optimalTemperature) {
            // Sıcaklık farklılığı tespit edildi! Dengeleyici çalıştırılıyor.
            println("Temperature difference detected! The stabilizer is activated.")
            heatBalancer.balanceTemperature()
        } else {
            // Sıcaklık optimal seviyede, dengeleyiciye gerek yok.
            println("The temperature is optimal, there is no need for a stabilizer.")
        }
    }

    /* Lazy Başlatma: heatBalancer değişkeni sadece checkTemperature fonksiyonu ilk kez dengesizlik tespit
    ettiğinde başlatılır. Performans Optimizasyonu: Eğer sıcaklık optimal seviyedeyse, heatBalancer nesnesi
    hiç oluşturulmaz. Tek Seferlik Oluşturma: HeatBalancer nesnesi yalnızca bir kez başlatılır ve
    aynı nesne tekrar kullanılır. */
}
