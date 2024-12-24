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
- var, val, lateinit ve lazy anahtar kelimeleri kullanılarak değişkenler tanımlayın ve davranışlarını gözlemleyin.

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
- val ve var anahtar kelimeleri arasındaki değiştirilebilirlik (mutability) ve başlangıç değeri gerekliliği (initialization) farklarını keşfedin.

## Varyant 3:
- lateinit anahtar kelimesini kullanarak bir nullable değişken tanımlayın ve kodun ilerleyen bir bölümünde bu değişkeni başlatmayı deneyin.

## Senaryo
- Varyant 2 ve 3 için senaryo:
```plaintext
Bir astronot, Mars üssünde bulunan malzemelerin envanterini yönetmek için bir yazılım geliştirmek istiyor.
Yazılım, farklı türdeki malzemelerin miktarlarını takip edecek. Malzemelerin bazıları sürekli olarak değiştirilebilir
(örneğin, yiyecek stoğu), bazıları ise sabit bir kez tanımlanıp değiştirilemez (örneğin, modül sayısı). Ayrıca, bazı
bilgiler (örneğin, kritik yedek parça listesi) hemen tanımlanmaz, ancak programın ilerleyen bölümlerinde atanır.
```

## Proje Yapısı
- Varyant 2 ve 3 kodları `MarsBasrInventory.kt` dosyası içerisindedir.
```plaintext
src/
└── beginner_level/
│    └── keywords/    
│    │    └── NightDaytimeReport.kt
│    │    └── MarsBasrInventory.kt
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

