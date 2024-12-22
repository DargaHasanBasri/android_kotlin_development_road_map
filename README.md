# ANDROID (KOTLIN) ROAD MAP

## Başlangıç Seviyesi (Beginner Level)

### Değişkenler (Variables)
#### Varyant 1:
- Farklı veri türlerinde (`String`, `Int`, `Float`) değişkenler tanımlayın, başlatın ve ardından bu değerleri yazdırın.

#### Varyant 2:
- Tam sayı (`Int`) ve ondalıklı sayı (`Float`) değişkenlerinde aritmetik işlemler gerçekleştirin ve sonuçları yazdırın.

### Senaryo
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
  - Main.kt dosyasına gelin aşağıdaki ekran görüntüsünde 3. satırda bulunan run butonu ile çalıştırabilirsiniz

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

### Senaryo
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

