package beginner_level.keywords

/* Senaryo: Bir astronot, Mars üssünde bulunan malzemelerin envanterini yönetmek için bir yazılım geliştirmek istiyor.
Yazılım, farklı türdeki malzemelerin miktarlarını takip edecek. Malzemelerin bazıları sürekli olarak değiştirilebilir
(örneğin, yiyecek stoğu), bazıları ise sabit bir kez tanımlanıp değiştirilemez (örneğin, modül sayısı). Ayrıca, bazı
bilgiler (örneğin, kritik yedek parça listesi) hemen tanımlanmaz, ancak programın ilerleyen bölümlerinde atanır. */

class MarsBaseInventory {
    // 'var': Değiştirilebilir foodStock değer
    var foodStock = 100

    // 'val': Sabit ve değiştirilemez moduleCount değer
    val moduleCount = 5

    // lateinit ile nullable değişken daha sonra atanacak
    lateinit var criticalParts: String

    fun checkBaseInventory() {
        /* Varyant 2: val ve var anahtar kelimeleri arasındaki değiştirilebilirlik (mutability) ve
        başlangıç değeri gerekliliği (initialization) farklarını keşfedin. */

        println("-".repeat(50))

        val newStock = 10
        // foodStock değerine yeni değer olarak newStock atadık. foodStock 'var' olduğu için yeni atamayı yapabildik.
        foodStock = newStock
        println("Food stock updated: $foodStock")

        // moduleCount değerine yeni değer olarak newModuleCount atamaya çalıştık atadık fakat
        // moduleCount 'val' olduğu için yeni atamayı yapabildik.
        // Yorum satırlarını kaldırırsak hata aldığımızı görürüz.
        // val newModuleCount = 3
        // moduleCount = newModuleCount

        /* Varyant 3: lateinit anahtar kelimesini kullanarak bir nullable değişken tanımlayın ve kodun ilerleyen
        bir bölümünde bu değişkeni başlatmayı deneyin. */

        println("-".repeat(50))

        val parts = "Front Engines"
        // criticalParts değerine ilk atama değeri olarak parts atadık.
        criticalParts = parts

        if (::criticalParts.isInitialized) {
            println("Critical spare parts identified: $criticalParts")
        } else {
            println("Critical Parts has not been initialized yet.")
        }

        println("-".repeat(50))

        println("Mars Base Inventory:")
        println("Number of Modules: $moduleCount")
        println("Food Stock: $foodStock")

        println("-".repeat(50))
    }
}