# ANDROID (KOTLIN) ROAD MAP

## Başlangıç Seviyesi (Beginner Level)

### Değişkenler (Variables)
#### Varyant 1:
- Farklı veri türlerinde (`String`, `Int`, `Float`) değişkenler tanımlayın, başlatın ve ardından bu değerleri yazdırın.

#### Varyant 2:
- Tam sayı (`Int`) ve ondalıklı sayı (`Float`) değişkenlerinde aritmetik işlemler gerçekleştirin ve sonuçları yazdırın.

## Senaryo
- Varyant 1 ve Varyant 2 için senaryo:
```plaintext
Bir astronot, Mars'ta bir keşif görevindedir. Görev sırasında bir "gıda çantası"
hesaplama sistemi geliştirmesi gerekiyor. Bu sistemle çantada bulunan yiyeceklerin isimlerini,
kalori değerlerini ve toplam kalori miktarını hesaplayacak. Ayrıca, uzay üssüne geri dönüş yolculuğu
için gereken ekstra kalori ihtiyacını da aritmetik işlemlerle belirleyecek.
```
## Proje Yapısı
- Varyant 1 ve Varyant 2 kodları `FoodBag.kt` dosyası içerisindedir.
```plaintext
src/
└── beginner_level/
│    └── variables/    
│        └── FoodBag.kt
└── Main.kt
```

---

# Projeyi Klonlayın ve Çalıştırın

## 1. Projeyi Klonlayın
GitHub üzerindeki projeyi yerel makinenize klonlamak için aşağıdaki komutu terminalde çalıştırın:
```bash 
  git clone https://github.com/DargaHasanBasri/android_kotlin_development_road_map.git
```
## 2. Projeyi Çalıştırın
- Öncelikle çıktısını görmek istediğiniz fonksiyonun yorum satırını kaldırmayı unutmayın!!!
  - Main.kt dosyasına gelin aşağıdaki ekran görüntüsünde `fun main()` fonksiyonunun yanında bulunan run butonu ile çalıştırabilirsiniz

![Image Failed Load](/images/project_run_one.png)

- Ya da Main.kt dosyasında ekran görüntüsünde ki gibi sağ üstte bulunan run butonu ile çalıştırabilirsiniz

![Image Failed Load](/images/project_run_two.png)

## 3. Beklenen Çıktı
```plaintext
--------------------------------------------------
FOOD BAG
Food1: Boiled Potatoes - Food2: Raisins
--------------------------------------------------
FOOD CALORIES
Food1 Cal: 183 - Food2 Cal: 290.5
--------------------------------------------------
Total Food Calories: 473.5
--------------------------------------------------
Extra Calories Required for Return: 555.6
--------------------------------------------------
Total Calories Required: 1029.1
--------------------------------------------------
```


## Varyant 3:
- Kullanıcıdan isim, yaş ve not ortalaması bilgilerini alan ve bu bilgileri ekranda gösteren bir program oluşturun.

## Senaryo
- Varyant 3 için senaryo:
```plaintext
Bir uzay mürettebatı, Mars’taki görev sırasında 3 günlük su tüketimlerini takip etmek için
bir sistem geliştiriyor. Bu sistem, her mürettebat üyesinin adını, yaşını ve 3 günlük içtiği su miktarını (litre cinsinden)
kaydedecek. Program, her gün sonunda toplam su tüketimini hesaplayacak ve mürettebat üyelerinin su tüketim ortalamasını
gösterecek.
```

## Proje Yapısı
- Varyant 3 kodları `AverageWaterConsumption.kt` dosyası içerisindedir.
```plaintext
src/
└── beginner_level/
│    └── variables/    
│        └── FoodBag.kt
│        └── AverageWaterConsumption.kt
└── Main.kt
```

## 1. Projeyi Çalıştırın
- Öncelikle çıktısını görmek istediğiniz fonksiyonun yorum satırını kaldırmayı unutmayın!!!
- Sorun yaşarasınız `Projeyi Klonlayın ve Çalıştırın` aşamasına dönün.

## 2. Beklenen Çıktı
```plaintext
--------------------------------------------------
Enter crew member name and age.
Crew Member Name: Hasan
Crew Member Age: 24
--------------------------------------------------
Enter the amount of water the crew member drank over three days. After entering the amount of water, press enter.
Crew Member First Day: 2
Crew Member Second Day: 4
Crew Member Third Day: 5
--------------------------------------------------
Name : Hasan
Age : 24
Total Water Consumption : 11.0
Average Water Consumption : 3.6666667
--------------------------------------------------
```

## Varyant 4:
- Farklı veri türlerinde (örneğin, int ve float) iki değişkenin değerlerini takas eden bir program oluşturun.

## Varyant 5:
- Uzunluk ve genişlik bilgilerini kullanıcıdan alarak bir dikdörtgenin alanını hesaplayan bir program yazın.

## Senaryo
- Varyant 4 ve 5 için senaryo:
```plaintext
Bir astronot, Mars’ta bitki yetiştirmek için bir sera sistemi geliştiriyor. Sera, farklı bitkilerin
büyümesini sağlamak için belirli sıcaklık ve nem koşullarını korumak zorunda. Astronot, sistemin çalışmasını optimize
etmek için sıcaklık ve nem verilerini analiz eden bir yazılım geliştiriyor. Sera içinde sıcaklık ve nem sensörleri var.
Bazen bu sensörlerden biri bozulduğunda, yedek sensör devreye giriyor. Ancak yedek sensörün ölçtüğü sıcaklık (float)
veya nem (int) farklı veri türünde olabiliyor. Bu yüzden iki sensör arasındaki veri takas ediliyor ve değerler uyumlu
hale getiriliyor. Ayrıca astronot, sera içindeki toprağın uzunluk ve genişlik ölçülerini girerek ekim yapılacak
alanı hesaplıyor.
```

## Proje Yapısı
- Varyant 4 ve 5 kodları `GreenhouseArea.kt` dosyası içerisindedir.
```plaintext
src/
└── beginner_level/
│    └── variables/    
│        └── FoodBag.kt
│        └── AverageWaterConsumption.kt
│        └── GreenhouseArea.kt
└── Main.kt
```

## 1. Projeyi Çalıştırın
- Öncelikle çıktısını görmek istediğiniz fonksiyonun yorum satırını kaldırmayı unutmayın!!!
- Sorun yaşarasınız `Projeyi Klonlayın ve Çalıştırın` aşamasına dönün.

## 2. Beklenen Çıktı
```plaintext
--------------------------------------------------
Starting values:
Temperature: 23.4, Humidity: 45
--------------------------------------------------
Post-Exchange Values:
Temperature: 45.0, Humidity: 45
--------------------------------------------------
Enter the greenhouse length (meters): 10
Enter greenhouse width (meters): 8
--------------------------------------------------
Greenhouse area length: 10.0 meters
Greenhouse area width: 8.0 meters
Greenhouse area: 80.0 square meters
--------------------------------------------------
```

## Varyant 6:
- Kullanıcıdan alınan sıcaklık bilgisine göre Celcius'tan Fahrenheit'e ve Fahrenheit'ten Celcius'a dönüşüm yapan bir program geliştirin.

## Senaryo
- Varyant 6 için senaryo:
```plaintext
Bir astronot, Mars'taki sera sisteminin sıcaklık dönüşümlerini kolaylaştırmak için bir yazılım geliştirmeye
karar veriyor. Sera sisteminde sıcaklık ölçümleri genellikle Celcius cinsinden yapılıyor. Ancak, bazı durumlarda
Fahrenheit biriminde veri sağlayan cihazlar da kullanılıyor. Astronot, sıcaklık verilerini ihtiyaç duyulan birime
dönüştürmek için bir yazılıma ihtiyaç duyuyor. Bu yazılım, kullanıcıdan alınan Celcius sıcaklık bilgisine göre
Fahrenheit'e ve ya kullanıcıdan alınan Fahrenheit sıcaklık bilgisine göre Celcius'a dönüşüm yaparak, sera sisteminin
doğru şekilde çalışmasını sağlıyor.
```

## Proje Yapısı
- Varyant 6 kodları `AirTemperature.kt` dosyası içerisindedir.
```plaintext
src/
└── beginner_level/
│    └── variables/    
│        └── FoodBag.kt
│        └── AverageWaterConsumption.kt
│        └── GreenhouseArea.kt
│        └── AirTemperature.kt
└── Main.kt
```

## 1. Projeyi Çalıştırın
- Öncelikle çıktısını görmek istediğiniz fonksiyonun yorum satırını kaldırmayı unutmayın!!!
- Sorun yaşarasınız `Projeyi Klonlayın ve Çalıştırın` aşamasına dönün.

## 2. Beklenen Çıktı
```plaintext
--------------------------------------------------
Please enter the temperature value in Celsius: 20
--------------------------------------------------
Please enter the temperature value in Fahrenheit: 5
--------------------------------------------------
Celsius entered: 20.0 
Celsius to Fahrenheit: 68.0 
--------------------------------------------------
Fahrenheit entered: 5.0
Fahrenheit to Celsius: -15.0
--------------------------------------------------
```

## Anahtar Kelimeler (Keywords)

### Varyant 1:
- `var`, `val`, `lateinit` ve `lazy` anahtar kelimeleri kullanılarak değişkenler tanımlayın ve davranışlarını gözlemleyin.

## Senaryo
- Varyant 1 için senaryo:
```plaintext
Mars’taki bir robotik keşif aracı, gece ve gündüz sıcaklıklarını ölçmekte ve bir rapor oluşturmakta.
Gündüz sıcaklığı sürekli değiştiği için 'var' ile tanımlanır. Gece sıcaklığı genelde sabit bir değerdedir, bu nedenle
'val' kullanılır. Ayrıca aracın enerji kaynağı durumu, ilerleyen süreçte güncelleneceği için lateinit ile tanımlanır.
Rapor oluşturma işlemi sık kullanılmadığı için, rapor verileri lazy ile gecikmeli olarak yüklenir.
```

## Proje Yapısı
- Varyant 1 kodları `NightDaytimeReport.kt` dosyası içerisindedir.
```plaintext
src/
└── beginner_level/
│    └── keywords/    
│    │    └── NightDaytimeReport.kt
│    │    
│    │    
│    │     
│    └── variables/    
│    │    └── FoodBag.kt
│    │    └── AverageWaterConsumption.kt
│    │    └── GreenhouseArea.kt
│    │    └── AirTemperature.kt
└── Main.kt
```

## 1. Projeyi Çalıştırın
- Öncelikle çıktısını görmek istediğiniz fonksiyonun yorum satırını kaldırmayı unutmayın!!!
- Sorun yaşarasınız `Projeyi Klonlayın ve Çalıştırın` aşamasına dönün.

## 2. Beklenen Çıktı
```plaintext
--------------------------------------------------
Energy source has not been initialized yet.
Energy Source: Solar Panels
--------------------------------------------------
Daytime temperature: 20.5 °C
Updated daytime temperature: 25.0 °C
--------------------------------------------------
Night temperature: -65.0 °C
--------------------------------------------------
report lazy block Called for the first time
The report is being prepared...
Daytime temperature: 25.0, Night temperature: -65.0
--------------------------------------------------
report lazy block Called for the second time
Daytime temperature: 25.0, Night temperature: -65.0
--------------------------------------------------
```

## Varyant 2:
- `val` ve `var` anahtar kelimeleri arasındaki değiştirilebilirlik (mutability) ve başlangıç değeri gerekliliği (initialization) farklarını keşfedin.

## Varyant 3:
- `lateinit` anahtar kelimesini kullanarak bir nullable değişken tanımlayın ve kodun ilerleyen bir bölümünde bu değişkeni başlatmayı deneyin.

## Senaryo
- Varyant 2 ve 3 için senaryo:
```plaintext
Bir astronot, Mars üssünde bulunan malzemelerin envanterini yönetmek için bir yazılım geliştirmek istiyor.
Yazılım, farklı türdeki malzemelerin miktarlarını takip edecek. Malzemelerin bazıları sürekli olarak değiştirilebilir
(örneğin, yiyecek stoğu), bazıları ise sabit bir kez tanımlanıp değiştirilemez (örneğin, modül sayısı). Ayrıca, bazı
bilgiler (örneğin, kritik yedek parça listesi) hemen tanımlanmaz, ancak programın ilerleyen bölümlerinde atanır.
```

## Proje Yapısı
- Varyant 2 ve 3 kodları `MarsBaseInventory.kt` dosyası içerisindedir.
```plaintext
src/
└── beginner_level/
│    └── keywords/    
│    │    └── NightDaytimeReport.kt
│    │    └── MarsBaseInventory.kt
│    │    
│    │     
│    └── variables/    
│    │    └── FoodBag.kt
│    │    └── AverageWaterConsumption.kt
│    │    └── GreenhouseArea.kt
│    │    └── AirTemperature.kt
└── Main.kt
```

## 1. Projeyi Çalıştırın
- Öncelikle çıktısını görmek istediğiniz fonksiyonun yorum satırını kaldırmayı unutmayın!!!
- Sorun yaşarasınız `Projeyi Klonlayın ve Çalıştırın` aşamasına dönün.

## 2. Beklenen Çıktı
```plaintext
--------------------------------------------------
Food stock updated: 10
--------------------------------------------------
Critical spare parts identified: Front Engines
--------------------------------------------------
Mars Base Inventory:
Number of Modules: 5
Food Stock: 10
--------------------------------------------------
```

## Varyant 4:
- `lazy` anahtar kelimesinin kullanımını araştırarak karmaşık bir nesneyi sadece ilk erişim sırasında başlatmayı gösterin.

### Araştırma Sonucu:
- `lazy` anahtar kelimesi, bir değişkenin ilk erişim sırasında başlatılmasını (initialize) sağlar. 
lazy kullanımı, özellikle bir değişkenin başlatılmasının zaman alıcı bir işlem olduğu durumlarda, performans iyileştirmesi yapmak için idealdir. 
Bu, nesneyi sadece ihtiyaç duyulduğunda oluşturur ve sonraki erişimlerde aynı değeri döner (yani, lazy değişkenler thread-safe olarak çalışır).
- `Lazy` Nasıl Çalışır?
  - lazy ile tanımlanan bir değişken, yalnızca ilk erişildiğinde başlatılır.
  - İlk başlatmadan sonra, aynı nesne tekrar kullanılmaya devam eder (tek bir kez başlatılır).
  - lazy anahtar kelimesi bir lambda ifadesi alır ve bu ifade, değişkenin değerini hesaplar.

### Temel Yapı:
```plaintext
val variableName: variableType by lazy {
    // The value is returned here
}
```

### `Lazy` Kullanımının Faydaları:
- `Performans`&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: Karmaşık veya büyük bir nesneyi ihtiyaç duyulmadıkça oluşturmaz, belleği ve işlem gücünü optimize eder.
- `Thread-Safety`&nbsp;: Varsayılan olarak thread-safe çalışır, ancak thread-safety gerekmezse lazy(LazyThreadSafetyMode.NONE) ile performans artırılabilir.
- `Geç Başlatma`&nbsp;&nbsp; : Değişkenin program başında değil, sadece ihtiyaç duyulduğunda oluşturulmasını sağlar.


## Senaryo
- Varyant 4 için senaryo:
```plaintext
Astronot, Mars üssünde ısı yönetimi için karmaşık bir ısı dengeleyici algoritmayı yalnızca ihtiyaç
duyulduğunda başlatmak istiyor. Bu algoritma, enerji tasarrufu amacıyla sürekli olarak çalıştırılmıyor ve
sadece sistemin ısı dengesizliği yaşadığı durumlarda devreye giriyor.
```

## Proje Yapısı
- Varyant 4 kodları `MarsBaseThermalManagement.kt` dosyası içerisindedir.
```plaintext
src/
└── beginner_level/
│    └── keywords/    
│    │    └── NightDaytimeReport.kt
│    │    └── MarsBaseInventory.kt
│    │    └── MarsBaseThermalManagement.kt
│    │    
│    │     
│    └── variables/    
│    │    └── FoodBag.kt
│    │    └── AverageWaterConsumption.kt
│    │    └── GreenhouseArea.kt
│    │    └── AirTemperature.kt
└── Main.kt
```

## 1. Projeyi Çalıştırın
- Öncelikle çıktısını görmek istediğiniz fonksiyonun yorum satırını kaldırmayı unutmayın!!!
- Sorun yaşarasınız `Projeyi Klonlayın ve Çalıştırın` aşamasına dönün.

## 2. Beklenen Çıktı
```plaintext
--------------------------------------------------
Current Temperature: 25, Optimal Temperature: 25
The temperature is optimal, there is no need for a stabilizer.
--------------------------------------------------
Current Temperature: 30, Optimal Temperature: 25
Temperature difference detected! The stabilizer is activated.
Initializing the heat balancer algorithm...
The temperature is stabilizing...
--------------------------------------------------
Current Temperature: 35, Optimal Temperature: 25
Temperature difference detected! The stabilizer is activated.
The temperature is stabilizing...
---------------------------------------------------
```

## Varyant 5:
- Döngülerde `val` anahtar kelimesinin davranışını inceleyin ve bunun değişken yeniden atanmasını nasıl etkilediğini gösterin.

## Senaryo
- Varyant 5 için senaryo:
```plaintext
Astronotlar, Mars üsleri arasında taşınacak malzemeleri yönetmek için bir kargo sistemi geliştiriyor. Bu sistemde,
kargonun her bir birimi işlenirken değişmeyen bilgiler (örneğin, kargo numarası veya türü) ve değişebilen
bilgiler (örneğin, kalan ağırlık) ile çalışılıyor. Astronotlar, döngü kullanarak her bir kargo biriminin durumunu
kontrol ediyor. val anahtar kelimesi, bir döngüde sabit kalan değerleri temsil etmek için kullanılıyor, ancak değişken
değerler için var tercih ediliyor.
```

## Proje Yapısı
- Varyant 5 kodları `SpaceCargoManagement.kt` dosyası içerisindedir.
```plaintext
src/
└── beginner_level/
│    └── keywords/    
│    │    └── NightDaytimeReport.kt
│    │    └── MarsBaseInventory.kt
│    │    └── MarsBaseThermalManagement.kt
│    │    └── SpaceCargoManagement.kt    
│    └── variables/    
│    │    └── FoodBag.kt
│    │    └── AverageWaterConsumption.kt
│    │    └── GreenhouseArea.kt
│    │    └── AirTemperature.kt
└── Main.kt
```

## 1. Projeyi Çalıştırın
- Öncelikle çıktısını görmek istediğiniz fonksiyonun yorum satırını kaldırmayı unutmayın!!!
- Sorun yaşarasınız `Projeyi Klonlayın ve Çalıştırın` aşamasına dönün.

## 2. Beklenen Çıktı
```plaintext
--------------------------------------------------
Cargo Processing Begins...
--------------------------------------------------
KargoID-01 cargo is being processed...
  100 kg processed, remaining: 400 kg
  100 kg processed, remaining: 300 kg
  100 kg processed, remaining: 200 kg
  100 kg processed, remaining: 100 kg
  100 kg processed, remaining: 0 kg
KargoID-01 completed!
--------------------------------------------------
KargoID-02 cargo is being processed...
  100 kg processed, remaining: 600 kg
  100 kg processed, remaining: 500 kg
  100 kg processed, remaining: 400 kg
  100 kg processed, remaining: 300 kg
  100 kg processed, remaining: 200 kg
  100 kg processed, remaining: 100 kg
  100 kg processed, remaining: 0 kg
KargoID-02 completed!
--------------------------------------------------
KargoID-03 cargo is being processed...
  100 kg processed, remaining: 200 kg
  100 kg processed, remaining: 100 kg
  100 kg processed, remaining: 0 kg
KargoID-03 completed!
--------------------------------------------------
All shipments have been processed.
--------------------------------------------------
```

## Kontrol Akışı İfadeleri (Control Flow Statements)

### Varyant 1:
- `if` deyimini kullanarak bir sayının çift mi yoksa tek mi olduğunu kontrol eden bir program yazın.

## Senaryo
- Varyant 1 için senaryo:
```plaintext
Mars kolonisine enerji sağlayan bir güneş paneli sistemi bulunmaktadır. Bu sistem, her bir güneş panelinin
ürettiği enerji birimlerini takip eder. Astronotlar, enerji üretim raporlarını düzenlerken, çift enerji birimlerinin
daha istikrarlı enerji üretimini temsil ettiğini fark eder. Bu nedenle, her bir güneş panelinden alınan enerji
birimlerinin çift mi yoksa tek mi olduğunu kontrol etmek ve raporlamak için bir yazılım geliştirirler.
```

## Proje Yapısı
- Varyant 1 kodları `ColonyEnergyManagement.kt` dosyası içerisindedir.
```plaintext
src/
└── beginner_level/
│    └── control_flow_statements/    
│    │    └── ColonyEnergyManagement.kt
│    │         
│    └── keywords/    
│    │    └── NightDaytimeReport.kt
│    │    └── MarsBaseInventory.kt
│    │    └── MarsBaseThermalManagement.kt
│    │    └── SpaceCargoManagement.kt    
│    └── variables/    
│    │    └── FoodBag.kt
│    │    └── AverageWaterConsumption.kt
│    │    └── GreenhouseArea.kt
│    │    └── AirTemperature.kt
└── Main.kt
```

## 1. Projeyi Çalıştırın
- Öncelikle çıktısını görmek istediğiniz fonksiyonun yorum satırını kaldırmayı unutmayın!!!
- Sorun yaşarasınız `Projeyi Klonlayın ve Çalıştırın` aşamasına dönün.

## 2. Beklenen Çıktı
```plaintext
--------------------------------------------------
Mars Colony Energy Production Report:
--------------------------------------------------
Energy Unit: 120 -> Even (Balanced production)
Energy Unit: 75 -> Odd (Requires attention)
Energy Unit: 200 -> Even (Balanced production)
Energy Unit: 45 -> Odd (Requires attention)
Energy Unit: 130 -> Even (Balanced production)
--------------------------------------------------
Energy report completed.
--------------------------------------------------
```

## Varyant 2:
- Aritmetik işlemleri gerçekleştiren basit bir hesap makinesi programını Kotlin'in `when` (switch'e eşdeğer) ifadesini kullanarak oluşturun.

### Araştırma Sonucu:
1. `when` İfadesi:
   - Anlamı: `switch-case` ifadesine benzer şekilde çalışır ve belirli bir duruma bağlı olarak kod parçalarını çalıştırır. Farkı, daha esnek ve güçlü olmasıdır.
   - Kullanım: Birden fazla durumu kontrol etmek veya bir değişkenin değerine bağlı işlem yapmak için kullanılır.

2. `->` Operatörü İfadesi:
   - Anlamı: `when` içinde bir duruma karşılık gelen kodu tanımlamak için kullanılır. Sol tarafta kontrol edilen değer, sağ tarafta ise bu değerle eşleştiğinde yapılacak işlem bulunur.
   - Kullanım: `when` ifadelerinde durum eşleştirme yaparken sonuç veya işlem belirtmek için kullanılır.
   
3. `if` ve `else` İfadesi:
   - Anlamı: Belirli bir koşulu kontrol eder ve bu koşula bağlı olarak işlem gerçekleştirir. `else` kısmı, hiçbir koşul sağlanmazsa çalışır.
   - Kullanım: `when` içinde daha detaylı kontrol yapmanız gerektiğinde kullanılır.
 
4. `null` İfadesi:
   - Anlamı: Boş değeri ifade eder. Kotlin'de bir değişkenin değeri olmayabileceğini belirtmek için kullanılır.
   - Kullanım: Hatalı bir durum veya geçersiz işlemle karşılaşıldığında `null` döndürmek, hatalı sonuç yerine işlemin başarısız olduğunu belirtir.  

### Temel Yapı:
1. `when`:
    ```plaintext
    val result = when (value) {
        "A" -> "Case A"       // Eğer value "A" ise, bu çalışır.
        "B" -> "Case B"      // Eğer value "B" ise, bu çalışır.
        else -> "Unknown"   // Eğer hiçbir durum eşleşmezse, bu çalışır.
    }
    ```
2. `->`:
   ```plaintext
   val result = when (number) {
       1 -> "One"          // Eğer number 1 ise, "One" döner.
       2 -> "Two"         // Eğer number 2 ise, "Two" döner.
       else -> "Other"   // Diğer durumlarda "Other" döner.
   }
   ```
3. `if` ve `else`:
   ```plaintext
    val result = when {
        value > 10 -> "Greater than 10"  // Eğer value 10'dan büyükse, bu çalışır.
        value < 10 -> "Less than 10"    // Eğer value 10'dan küçükse, bu çalışır.
        else -> "Equal to 10"          // Diğer durumlarda bu çalışır.
    }
   ```

4. `null`:
   ```plaintext
    else -> { 
        println("Invalid operation: Please enter one of +, -, *, /") 
        null // Tanınmayan işlem, null döner.
    }
   ```


## Senaryo
- Varyant 2 için senaryo:
```plaintext
Mars keşif ekibi, üslerinde enerji tüketimini ve üretimini optimize etmek için bir hesap makinesi
kullanmaya karar verdi. Bu hesap makinesi, keşif araçlarının enerji tüketimi, üslerin enerji üretimi, enerji
aktarımı ve enerji kayıpları gibi temel işlemleri hesaplayabiliyor. Basit aritmetik işlemleri gerçekleştiren
bu hesaplayıcıyı geliştirin.
```

## Proje Yapısı
- Varyant 2 kodları `BaseEnergyCalculator.kt` dosyası içerisindedir.
```plaintext
src/
└── beginner_level/
│    └── control_flow_statements/    
│    │    └── ColonyEnergyManagement.kt
│    │    └── BaseEnergyCalculator.kt
│    │         
│    └── keywords/    
│    │    └── NightDaytimeReport.kt
│    │    └── MarsBaseInventory.kt
│    │    └── MarsBaseThermalManagement.kt
│    │    └── SpaceCargoManagement.kt    
│    └── variables/    
│    │    └── FoodBag.kt
│    │    └── AverageWaterConsumption.kt
│    │    └── GreenhouseArea.kt
│    │    └── AirTemperature.kt
└── Main.kt
```

## 1. Projeyi Çalıştırın
- Öncelikle çıktısını görmek istediğiniz fonksiyonun yorum satırını kaldırmayı unutmayın!!!
- Sorun yaşarasınız `Projeyi Klonlayın ve Çalıştırın` aşamasına dönün.

## 2. Beklenen Çıktı
```plaintext
--------------------------------------------------
Welcome to the Mars Energy Calculator!
--------------------------------------------------
Enter the first energy value: 10
Enter the second energy value: 14
--------------------------------------------------
Enter the transaction operator (+, -, *, /): +
--------------------------------------------------
Result of 10.0 + 14.0 = 24.0
--------------------------------------------------
```

## Varyant 3:
- Sınav puanına göre bir öğrencinin notunu belirleyen bir programı iç içe geçmiş `if-else` ifadeleri kullanarak yazın.

### Araştırma Sonucu:
1. `if - else if - else` İfadesi:
    - Anlamı: `if - else if - else`, belirli bir koşulun doğru olup olmadığını kontrol ederek buna bağlı olarak farklı kod bloklarını çalıştırmayı sağlar.
   
### Temel Yapı:
- `if - else if - else`:
```plaintext
if (condition1) {

        // Koşul doğruysa bu blok çalışır
   
    } else if (condition2) {
   
        // Koşul doğruysa bu blok çalışır
   
    } else {
   
        // Koşul yanlışsa bu blok çalışır
   
    }  
```

## Senaryo
- Varyant 3 için senaryo:
```plaintext
Mars'taki koloni, enerji kaynaklarını etkili bir şekilde yönetebilmek için belirli testler yapmaktadır.
Bu testlerde enerji kaynaklarının performans puanları hesaplanır ve bu puanlara göre kaynakların durumu
değerlendirilir. Performans puanı 100 üzerinden değerlendirilir ve her kaynak bir yeterlilik derecesi alır.
Enerji kaynaklarının yeterlilik durumlarını belirlemek ve hangi kaynağın geliştirilmesi gerektiğini analiz etmek.
Bu dereceler, enerji kaynağı için belirli aksiyonların alınmasını sağlar.
Yeterlilik Dereceleri:
90 ve üzeri: A (Mükemmel Verimlilik)
80-89: B (Yüksek Verimlilik)
70-79: C (Orta Verimlilik)
60-69: D (Düşük Verimlilik)
60'ın altı: F (Yetersiz Verimlilik)
```

## Proje Yapısı
- Varyant 3 kodları `EnergySufficiencyTest.kt` dosyası içerisindedir.
```plaintext
src/
└── beginner_level/
│    └── control_flow_statements/    
│    │    └── ColonyEnergyManagement.kt
│    │    └── BaseEnergyCalculator.kt
│    │    └── EnergySufficiencyTest.kt
│    │         
│    └── keywords/    
│    │    └── NightDaytimeReport.kt
│    │    └── MarsBaseInventory.kt
│    │    └── MarsBaseThermalManagement.kt
│    │    └── SpaceCargoManagement.kt    
│    └── variables/    
│    │    └── FoodBag.kt
│    │    └── AverageWaterConsumption.kt
│    │    └── GreenhouseArea.kt
│    │    └── AirTemperature.kt
└── Main.kt
```

## 1. Projeyi Çalıştırın
- Öncelikle çıktısını görmek istediğiniz fonksiyonun yorum satırını kaldırmayı unutmayın!!!
- Sorun yaşarasınız `Projeyi Klonlayın ve Çalıştırın` aşamasına dönün.

## 2. Beklenen Çıktı
```plaintext
--------------------------------------------------
Evaluating Energy Source Performance...
--------------------------------------------------
Enter today's performance metric: 80
--------------------------------------------------
Energy Source Score: 80.0 -> Grade: B
Feedback: High Efficiency. Suitable for most operations.
--------------------------------------------------
```

## Varyant 4:
-  `if-else` deyimini kullanarak bir yılın artık yıl olup olmadığını kontrol eden bir program oluşturun.

## Senaryo
- Varyant 4 için senaryo:
```plaintext
Mars üssündeki astronot mürettebatı, enerji üretim ekipmanlarının bakımını belirli yıllarda
gerçekleştiriyor. Ancak bakım planları, Mars yılı takvimine bağlı olarak değişiyor. Mars yılı takvimi Dünya'nın
artık yıl hesaplama sistemi ile paralel bir mantık izler:
Artık yıllarda bakım yapılmaz çünkü bu yıllar enerji üretiminin zirve yaptığı yıllardır.
Artık yıl olmayan yıllarda bakım gereklidir çünkü bu yıllar boyunca enerji üretim kapasitesini en üst düzeyde tutmak
için düzenli kontrol yapılması gerekir.
Astronotlar, ekipman bakım döngülerini optimize ederek kritik görevlerde daha fazla zaman kazanmayı hedefliyor.
```

## Proje Yapısı
- Varyant 4 kodları `EquipmentMaintenanceSchedule.kt` dosyası içerisindedir.
```plaintext
src/
└── beginner_level/
│    └── control_flow_statements/    
│    │    └── ColonyEnergyManagement.kt
│    │    └── BaseEnergyCalculator.kt
│    │    └── EnergySufficiencyTest.kt
│    │    └── EquipmentMaintenanceSchedule.kt
│    │         
│    └── keywords/    
│    │    └── NightDaytimeReport.kt
│    │    └── MarsBaseInventory.kt
│    │    └── MarsBaseThermalManagement.kt
│    │    └── SpaceCargoManagement.kt    
│    └── variables/    
│    │    └── FoodBag.kt
│    │    └── AverageWaterConsumption.kt
│    │    └── GreenhouseArea.kt
│    │    └── AirTemperature.kt
└── Main.kt
```

## 1. Projeyi Çalıştırın
- Öncelikle çıktısını görmek istediğiniz fonksiyonun yorum satırını kaldırmayı unutmayın!!!
- Sorun yaşarasınız `Projeyi Klonlayın ve Çalıştırın` aşamasına dönün.

## 2. Beklenen Çıktı
```plaintext
--------------------------------------------------
Welcome to the Maintenance Year Check...
--------------------------------------------------
Enter the Mars year to check maintenance schedule: 2026
--------------------------------------------------
Mars Year: 2026
Maintenance Status Message: Regular Year on Mars Maintenance required to ensure optimal performance.
--------------------------------------------------

OR

--------------------------------------------------
Welcome to the Maintenance Year Check...
--------------------------------------------------
Enter the Mars year to check maintenance schedule: 2032
--------------------------------------------------
Mars Year: 2032
Maintenance Status Message: Leap Year on Mars No maintenance required. Systems are operating at peak efficiency.
--------------------------------------------------
```

## Varyant 5:
-  `when` ifadesini kullanarak basit bir trafik ışığı sistemi simüle eden bir program geliştirin.

## Senaryo
- Varyant 5 için senaryo:
```plaintext
Mars kolonisindeki astronotlar, yer altı tünelleri ve yüzey araçlarını güvenle koordine etmek için
bir trafik ışığı sistemi geliştirmiştir. Bu sistem, ışık renklerine göre astronotların ne yapması gerektiğini
belirler. When ifadesi kullanılarak bu ışık sistemi simüle edilecektir.
Trafik ışığı kuralları:
Yeşil ışık: Araçlar serbestçe hareket edebilir.
Sarı ışık: Araçlar dikkatli olmalı ve güvenli alandan uzaklaşmamalı.
Kırmızı ışık: Araçlar güvenli alanda toplanmalı.
Bilinmeyen ışık: Arızalı sistem, yardım talep edilecektir.
```

## Proje Yapısı
- Varyant 5 kodları `MarsTrafficManagement.kt` dosyası içerisindedir.
```plaintext
src/
└── beginner_level/
│    └── control_flow_statements/    
│    │    └── ColonyEnergyManagement.kt
│    │    └── BaseEnergyCalculator.kt
│    │    └── EnergySufficiencyTest.kt
│    │    └── EquipmentMaintenanceSchedule.kt
│    │    └── MarsTrafficManagement.kt
│    │         
│    └── keywords/    
│    │    └── NightDaytimeReport.kt
│    │    └── MarsBaseInventory.kt
│    │    └── MarsBaseThermalManagement.kt
│    │    └── SpaceCargoManagement.kt    
│    └── variables/    
│    │    └── FoodBag.kt
│    │    └── AverageWaterConsumption.kt
│    │    └── GreenhouseArea.kt
│    │    └── AirTemperature.kt
└── Main.kt
```

## 1. Projeyi Çalıştırın
- Öncelikle çıktısını görmek istediğiniz fonksiyonun yorum satırını kaldırmayı unutmayın!!!
- Sorun yaşarasınız `Projeyi Klonlayın ve Çalıştırın` aşamasına dönün.

## 2. Beklenen Çıktı
```plaintext
--------------------------------------------------
Mars Traffic Signal: Green
Action: Alert faulty system, request assistance
--------------------------------------------------
--------------------------------------------------
Mars Traffic Signal: Yellow
Action: Alert faulty system, request assistance
--------------------------------------------------
--------------------------------------------------
Mars Traffic Signal: Red
Action: Alert faulty system, request assistance
--------------------------------------------------
--------------------------------------------------
Mars Traffic Signal: Blue
Action: Alert faulty system, request assistance
--------------------------------------------------
```