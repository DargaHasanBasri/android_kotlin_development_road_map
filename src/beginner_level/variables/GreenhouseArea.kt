package beginner_level.variables

/* Senaryo: Bir astronot, Mars’ta bitki yetiştirmek için bir sera sistemi geliştiriyor. Sera, farklı bitkilerin
büyümesini sağlamak için belirli sıcaklık ve nem koşullarını korumak zorunda. Astronot, sistemin çalışmasını optimize
etmek için sıcaklık ve nem verilerini analiz eden bir yazılım geliştiriyor. Sera içinde sıcaklık ve nem sensörleri var.
Bazen bu sensörlerden biri bozulduğunda, yedek sensör devreye giriyor. Ancak yedek sensörün ölçtüğü sıcaklık (float)
veya nem (int) farklı veri türünde olabiliyor. Bu yüzden iki sensör arasındaki veri takas ediliyor ve değerler uyumlu
hale getiriliyor. Ayrıca astronot, sera içindeki toprağın uzunluk ve genişlik ölçülerini girerek ekim yapılacak
alanı hesaplıyor. */

fun calculateGreenhouseArea() {
    /* Varyant 4: Farklı veri türlerinde (örneğin, int ve float) iki değişkenin
    değerlerini takas eden bir program oluşturun. */

    /* Neden (val) değil de (var) ifadesi ile değikenleri tanımladık? Kısaca bu değişkenlerin daha sonra
    değerlerinin değişeceği için (var) kullandık. Çünkü (val) ifadesi o değişkenin değerinin değişmeyeceğini bildirir.
    Bu ifadeleri daha detaylı başka bir başlık altında işlenecek. */

    // Float değişken temperature, Int değişken humidity ilk değerleri atandı,
    var temperature = 23.4f
    var humidity = 45

    println("-".repeat(50))

    // İlk değerler terminale yazıldı.
    println("Starting values:")
    println("Temperature: $temperature, Humidity: $humidity")

    /* Float tipinde olan temperature değişkenine, Int tipinde olan humidity atayabilmemiz için
    Int tipini Float tipine çevirmemiz gerekli. Bu işlem için bir Int değer Float değere '.toFloat()'
    kullanılarak dönüştürülür. */
    temperature = humidity.toFloat()

    /* Int tipinde olan humidity değişkenine,  Float tipinde olan temperature atayabilmemiz için
    Float tipini Int tipine çevirmemiz gerekli. Float tipini Int tipine çevirme işlemini  '.toInt()'
    kullanılarak dönüştürülür. */
    humidity = temperature.toInt()

    println("-".repeat(50))

    // Takas edilen değerler sonucunda oluşan yeni değerler terminale yazıldı.
    println("Post-Exchange Values:")
    println("Temperature: $temperature, Humidity: $humidity")

    println("-".repeat(50))

    /* Varyant 5: Uzunluk ve genişlik bilgilerini kullanıcıdan alarak bir dikdörtgenin
    alanını hesaplayan bir program yazın. */

    /* Kullanıcıdan sera uzunluğu alınır. Girilen değerin sayısal değer dışında bir şey olduğunda hata almamak için
    '.toDoubleOrNull() ?: 0.0' ifadesi ile '0.0' olarak alınır. */
    print("Enter the greenhouse length (meters): ")
    val length = readln().toDoubleOrNull() ?: 0.0

    /* Kullanıcıdan sera genişliği alınır. Girilen değerin sayısal değer dışında bir şey olduğunda hata almamak için
   '.toDoubleOrNull() ?: 0.0' ifadesi ile '0.0' olarak alınır. */
    print("Enter greenhouse width (meters): ")
    val width = readln().toDoubleOrNull() ?: 0.0

    // Alınan uzunluk ve genişlik değeri çarpılarak toprak alanı hesaplanır. 'soilArea' değişkenine atanır.
    val soilArea = length * width

    println("-".repeat(50))

    // Kullanıcıdan alınan değerler terminale yazdırılır.
    println("Greenhouse area length: $length meters")
    println("Greenhouse area width: $width meters")
    // Elde edilen alan terminale yazdırılır.
    println("Greenhouse area: $soilArea square meters")
    println("-".repeat(50))
}