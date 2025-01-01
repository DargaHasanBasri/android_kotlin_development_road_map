package beginner_level.scope_functions

/* Senaryo: Mars'ta bir görev yönetim sistemi kuruyoruz. Görevlerin durumu, tamamlanma yüzdesine ve önceliğine göre
takip ediliyor. Görev bilgileri üzerinde işlem yapmak için let, apply ve run fonksiyonlarını kullanalım. */

class MarsTask(
    /*
    taskId: Görevin benzersiz kimliği.
    description: Görevin tanımı.
    priority: Görevin önceliği.
    completionPercentage: Görevin tamamlanma yüzdesi.
     */

    val taskId: Int,
    var description: String = "",
    var priority: String = "",
    var completionPercentage: Int = 0
) {

    // Varyant 1: Nesneler üzerinde işlemler yapmak için `let`, `apply` ve `run` fonksiyonlarını kullanın.

    /*
    apply kullanılarak görev bilgileri başlatılır.
    Bu yöntem nesneyi döndürdüğü için zincirleme işlemlerde kullanılabilir.
     */
    fun taskInitialize(description: String, priority: String, completionPercentage: Int) = apply {
        this.description = description
        this.priority = priority
        this.completionPercentage = completionPercentage
    }

    // let kullanılarak görev tamamlanma durumu kontrol edilir ve bir durum mesajı döndürülür.
    fun checkStatus(): String = let {
        if (completionPercentage >= 100) {
            "Task Completed"
        } else {
            "Task In Progress: %$completionPercentage done"
        }
    }

    // run kullanılarak görev özet bilgileri bir formatta döndürülür.
    fun generateSummary(): String = run {
        """
        Task ID: $taskId
        Description: $description
        Priority: $priority
        Completion: %$completionPercentage
        """.trimIndent()
    }
}
