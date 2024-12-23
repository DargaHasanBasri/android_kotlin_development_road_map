package beginner_level.variables

/* Senaryo: Bir astronot, Mars'taki sera sisteminin sıcaklık dönüşümlerini kolaylaştırmak için bir yazılım geliştirmeye
karar veriyor. Sera sisteminde sıcaklık ölçümleri genellikle Celcius cinsinden yapılıyor. Ancak, bazı durumlarda
Fahrenheit biriminde veri sağlayan cihazlar da kullanılıyor. Astronot, sıcaklık verilerini ihtiyaç duyulan birime
dönüştürmek için bir yazılıma ihtiyaç duyuyor. Bu yazılım, kullanıcıdan alınan Celcius sıcaklık bilgisine göre
Fahrenheit'e ve ya kullanıcıdan alınan Fahrenheit sıcaklık bilgisine göre Celcius'a dönüşüm yaparak, sera sisteminin
doğru şekilde çalışmasını sağlıyor. */

fun calculateAirTemperature() {
    /* Varyant 6: Kullanıcıdan alınan sıcaklık bilgisine göre Celcius'tan Fahrenheit'e ve
    Fahrenheit'ten Celcius'a dönüşüm yapan bir program geliştirin. */

    /* Biz senaryomuzu yukarıda istenilen varyanta uyarladık elde edeceğimiz çıktılar varyantın
    bizim ulaşmamızı istediği çıktılarla uyuşucaktır. */

    println("-".repeat(50))

    // Kullanıcıdan Celsius değerini alır ve 'temperatureCelsius' değişkenine atanır.
    print("Please enter the temperature value in Celsius: ")
    val temperatureCelsius = readln().toDoubleOrNull() ?: 0.0

    println("-".repeat(50))

    // Kullanıcıdan Fahrenheit değerini alır ve 'temperatureFahrenheit' değişkenine atanır.
    print("Please enter the temperature value in Fahrenheit: ")
    val  temperatureFahrenheit = readln().toDoubleOrNull() ?: 0.0

    /* Kullanıcıdan alınan celsius değerini kullanarak fahrenheit değerine dönüştüren formül ile elde edilen
    fahrenheit değeri 'celsiusToFahrenheit' değişkenine atanır. */
    val celsiusToFahrenheit = (temperatureCelsius * 9/5) + 32

    /* Kullanıcıdan alınan fahrenheit değerini kullanarak celsius değerine dönüştüren formül ile elde edilen
    celsius değeri 'fahrenheitToCelsius' değişkenine atanır. */
    val fahrenheitToCelsius = (temperatureFahrenheit - 32) * 5/9

    println("-".repeat(50))

    // Girilen Celsius değeri ve elde edilen dönüşüm sonucunda Fahrenheit değeri terminale yazdırılır.
    println("Celsius entered: $temperatureCelsius ")
    println("Celsius to Fahrenheit: $celsiusToFahrenheit ")

    println("-".repeat(50))

    // Girilen Fahrenheit değeri ve elde edilen dönüşüm sonucunda Celsius değeri terminale yazdırılır.
    println("Fahrenheit entered: $temperatureFahrenheit")
    println("Fahrenheit to Celsius: $fahrenheitToCelsius")

    println("-".repeat(50))
}
