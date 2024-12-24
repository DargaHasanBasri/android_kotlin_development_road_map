package beginner_level.keywords

/* Senaryo: Mars’taki bir robotik keşif aracı, gece ve gündüz sıcaklıklarını ölçmekte ve bir rapor oluşturmakta.
Gündüz sıcaklığı sürekli değiştiği için 'var' ile tanımlanır. Gece sıcaklığı genelde sabit bir değerdedir, bu nedenle
'val' kullanılır. Ayrıca aracın enerji kaynağı durumu, ilerleyen süreçte güncelleneceği için lateinit ile tanımlanır.
Rapor oluşturma işlemi sık kullanılmadığı için, rapor verileri lazy ile gecikmeli olarak yüklenir. */

class NightDaytimeReport {
    lateinit var energySource: String

    fun createNightDaytimeReport() {
        /* Varyant 1: var, val, lateinit ve lazy anahtar kelimeleri kullanılarak
        değişkenler tanımlayın ve davranışlarını gözlemleyin. */

        println("-".repeat(50))

        /* 'lateinit': Başlangıçta tanımlanmayan bir değişken. Sonradan bir değer atanabilir ama kullanılmadan
        önce atanması gerekir. Eğer atama olmadıysa hata ile karşılaşırız. Hata almamak için henüz değer
        atanmadığına dair terminale bir mesaj yazdırabiliriz. Bir değişkenin henüz ilk değeri atanıp atanmadığını
        kontrol edebilmek için '.isInitialized' ifadesi kullanılır. Bu bize sonuç olarak eğer bir değere sahipse true,
        eğer bir değere sahip değilse false ifadesini verir. Bu değere göre işlemlerle yapabilmemiz için 'if-else'
        kontrol yapısını kullanacağız. Adı üstünde kontrol yani true ise görmemizi istediğimizi yazdıracağız,
        false ise neden false olduğunu bildiren bir mesaj yazdıracağız. İlerleyen aşamalarda daha detaylı göreceğiz.*/


        // Değer atanıp atanmadığını kontrol etmeden kullanmak hata oluşturur.
        // energySource.isInitialized true dönerse 'println("Energy Source: $energySource")' kısmına girer.
        // energySource.isInitialized false dönerse 'println("Energy source has not been initialized yet.")' kısmına girer.
        // Burada false dönecek çünkü henüz değer ataması yapılmadı.
        if (::energySource.isInitialized) {
            println("Energy Source: $energySource")
        } else {
            println("Energy source has not been initialized yet.")
        }

        // Değer atanıyor
        energySource = "Solar Panels"

        // energySource.isInitialized true dönerse 'println("Energy Source: $energySource")' kısmına girer.
        // energySource.isInitialized false dönerse 'println("Energy source has not been initialized yet.")' kısmına girer.
        // Burada true dönecek çünkü yukarıda atama yapıldı.
        if (::energySource.isInitialized) {
            println("Energy Source: $energySource")
        } else {
            println("Energy source has not been initialized yet.")
        }

        println("-".repeat(50))

        // 'var': Değiştirilebilir bir değişken, başlangıç değeri atanabilir ve sonradan değiştirilebilir.
        var daytimeTemperature = 20.5
        println("Daytime temperature: $daytimeTemperature °C")
        // Değer değiştirildi.
        daytimeTemperature = 25.0
        println("Updated daytime temperature: $daytimeTemperature °C")

        println("-".repeat(50))

        // 'val': Sabit bir değişken, başlangıç değeri atanmalı ve bir kez tanımlandıktan sonra değiştirilemez.
        val nightTemperature = -65.0
        println("Night temperature: $nightTemperature °C")
        // Aşağıdaki satır hata verecektir çünkü 'val' değiştirilemez. Yorum satırını kaldırıldığında hata görülecektir.
        // nightTemperature = -60.0

        println("-".repeat(50))

        // lazy: İlk erişildiğinde hesaplanan bir değişken. Hesaplama geciktirilir, böylece kaynak tasarrufu sağlanır.
        val report by lazy {
            println("The report is being prepared...")
            "Daytime temperature: $daytimeTemperature, Night temperature: $nightTemperature"
        }

        println("report lazy block Called for the first time")
        // Lazy bloğu burada çalışır ve hesaplama yapılır
        println(report)

        println("-".repeat(50))

        println("report lazy block Called for the second time")
        // Daha sonra tekrar çalıştırılmaz, önceki sonucu döner
        println(report)

        println("-".repeat(50))
    }
}