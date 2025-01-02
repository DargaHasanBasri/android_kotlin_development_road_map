import beginner_level.variables.calculateAverageWaterConsumption
import beginner_level.variables.calculateFoodBag
import beginner_level.variables.calculateGreenhouseArea
import beginner_level.variables.calculateAirTemperature
import beginner_level.keywords.NightDaytimeReport
import beginner_level.keywords.MarsBaseInventory
import beginner_level.keywords.MarsBaseThermalManagement
import beginner_level.keywords.spaceCargoManagement
import beginner_level.control_flow_statements.calculateColonyEnergy
import beginner_level.control_flow_statements.baseEnergyCalculator
import beginner_level.control_flow_statements.calculateEfficiencyPerformance
import beginner_level.control_flow_statements.calculateMaintenanceCalendar
import beginner_level.control_flow_statements.MarsTrafficManagement
import beginner_level.arrays.dailyDataCapacity
import beginner_level.arrays.searchMarsColony
import beginner_level.arrays.marsEnvironmentalAnalysis
import beginner_level.scope_functions.MarsTask
import beginner_level.scope_functions.MissionRiskAnalysis

fun main() {
    // println("Variables Content:")
    // calculateFoodBag()
    // calculateAverageWaterConsumption()
    // calculateGreenhouseArea()
    // calculateAirTemperature()

    // println("Keywords Content: var,val,lazy,lateinit")
    // NightDaytimeReport().createNightDaytimeReport()
    // MarsBaseInventory().checkBaseInventory()

    // println("Keywords Content: Lazy")
    /*
    val marsHeatSystem = MarsBaseThermalManagement()
    println("-".repeat(50))
    // İlk kontrol: Optimal sıcaklık.
    marsHeatSystem.checkTemperature(currentTemperature = 25, optimalTemperature = 25)
    println("-".repeat(50))
    // İkinci kontrol: Dengeleyiciye ihtiyaç var.
    // Dengeleyici ilk kez kullanılıyor ve ilk kez oluşturuluyor.
    marsHeatSystem.checkTemperature(currentTemperature = 30, optimalTemperature = 25)
    println("-".repeat(50))
    // Üçüncü kontrol: Dengeleyici tekrar kullanılıyor, ancak yeniden başlatılmıyor.
    // Dengeleyici ikinci kez kullanılıyor ve dengeleyici tekrardan oluşturulmuyor ilk oluşturulan kullanılıyor.
    marsHeatSystem.checkTemperature(currentTemperature = 35, optimalTemperature = 25)
    println("-".repeat(50))
   */

    // spaceCargoManagement()

    // println("Control Flow Statements Content:")
    // calculateColonyEnergy()
    // baseEnergyCalculator()
    // calculateEfficiencyPerformance()
    // calculateMaintenanceCalendar()
    // MarsTrafficManagement().marsTrafficLightSimulation()

    // println("Arrays Content:")
    // dailyDataCapacity()
    // searchMarsColony()
    // marsEnvironmentalAnalysis()

    // println("Scope Functions Content:")
    /*
    val task = MarsTask(taskId = 100).taskInitialize(
        description = "Collect rock samples from Olympus Mons",
        priority = "High",
        completionPercentage = 75,
    )

    println("-".repeat(50))

    val statusMessage = task.checkStatus()
    println("Check Status\n$statusMessage")

    println("-".repeat(50))

    val taskSummary = task.generateSummary()
    println("Task Summary\n$taskSummary")

    println("-".repeat(50))
     */

    // Örnek görevler
    val task1 = MissionRiskAnalysis("Collect Rock Samples", 120, 6, 3)
    val task2 = MissionRiskAnalysis("Deploy Weather Station", 300, 12, 7)
    val task3 = MissionRiskAnalysis("Repair Solar Panels", 200, 8, 5)

    // 1. Enerji analizi
    /* MissionRiskAnalysis içerisindeki analyzeTaskRisk fonksiyonu, riskEvaluation lambda fonksiyonunu çağırır.
    Lambda fonksiyonunun döndürdüğü String sonucu energyAnalysis değişkenine atanır. Lambda, bir MissionRiskAnalysis
    nesnesi alır. if kontrolünde ise energyConsumption değerine göre gerekli mesaj verilir. */
    val energyAnalysis = task1.analyzeTaskRisk(task1) { task ->
        if (task.energyConsumption > 150) {
            "Task '${task.taskName}' is High Energy. Consider alternative power sources."
        } else {
            "Task '${task.taskName}' is Low Energy. Safe to proceed."
        }
    }

    // 2. Zaman analizi
    /* MissionRiskAnalysis içerisindeki analyzeTaskRisk fonksiyonu, riskEvaluation lambda fonksiyonunu çağırır.
    Lambda fonksiyonunun döndürdüğü String sonucu timeAnalysis değişkenine atanır. Lambda, bir MissionRiskAnalysis
    nesnesi alır. if kontrolünde ise timeRequired değerine göre gerekli mesaj verilir. */
    val timeAnalysis = task2.analyzeTaskRisk(task2) { task ->
        if (task.timeRequired > 10) {
            "Task '${task.taskName}' requires extended time. Monitor closely."
        } else {
            "Task '${task.taskName}' fits within the normal time frame."
        }
    }

    // 3. Hava durumu riski analizi
    /* MissionRiskAnalysis içerisindeki analyzeTaskRisk fonksiyonu, riskEvaluation lambda fonksiyonunu çağırır.
    Lambda fonksiyonunun döndürdüğü String sonucu weatherRiskAnalysis değişkenine atanır. Lambda, bir MissionRiskAnalysis
    nesnesi alır. if kontrolünde ise weatherRisk değerine göre gerekli mesaj verilir. */
    val weatherRiskAnalysis = task3.analyzeTaskRisk(task3) { task ->
        if (task.weatherRisk > 6) {
            "Task '${task.taskName}' has a High Weather Risk. Postpone if possible."
        } else {
            "Task '${task.taskName}' has an Acceptable Weather Risk."
        }
    }

    // Elde edilen sonuçlar yazdırılır.
    println("-".repeat(50))
    println(energyAnalysis)
    println("-".repeat(50))
    println(timeAnalysis)
    println("-".repeat(50))
    println(weatherRiskAnalysis)
    println("-".repeat(50))
}