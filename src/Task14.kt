fun main(args: Array<String>) {
    checkPersonInfo("Аркадий Аркадьевич Акардионов", "Менеджер")
    checkPersonInfo("Аркадий Аркадьевич Акардионов", 25, "Менеджер")
    checkPersonInfo("Аркадий Аркадьевич Акардионов", "женат","Менеджер")
    checkPersonInfo("Аркадий Аркадьевич Акардионов", 25, "женат","Менеджер")

}

fun checkPersonInfo(name: String, position: String) = println("""Имя сотружника: $name
                                                            |Должность: $position""".trimMargin())

fun checkPersonInfo(name: String, age: Int, position: String) = println("""Имя сотружника: $name
                                                                        |Возраст: $age
                                                                        |Должность: $position""".trimMargin())

fun checkPersonInfo(name: String, maritalStatus: String, position: String) = println("""Имя сотружника: $name
                                                                                        |Сеейное положение: $maritalStatus
                                                                                        |Должность: $position""".trimMargin())

fun checkPersonInfo(name: String, age: Int, maritalStatus: String, position: String) = println("""Имя сотружника: $name
                                                                                                |Возраст: $age
                                                                                                |Сеейное положение: $maritalStatus
                                                                                                |Должность: $position""".trimMargin())