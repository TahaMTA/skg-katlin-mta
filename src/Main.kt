
import kotlin.random.Random

fun main() {
    val choices = listOf("سنگ", "کاغذ", "قیچی")
    var userScore = 0
    var computerScore = 0

    println("=== بازی سنگ، کاغذ، قیچی ===")

    while (true) {
        println("\nانتخاب کن:")
        println("1. سنگ")
        println("2. کاغذ")
        println("3. قیچی")
        println("0. خروج")

        print("انتخاب شما: ")
        val input = readlnOrNull()?.trim()

        if (input == "0") {
            println("بازی تمام شد!")
            println("امتیاز شما: $userScore")
            println("امتیاز کامپیوتر: $computerScore")
            break
        }

        val userChoice = when (input) {
            "1" -> "سنگ"
            "2" -> "کاغذ"
            "3" -> "قیچی"
            else -> {
                println("انتخاب نامعتبر است!")
                continue
            }
        }

        val computerChoice = choices[Random.nextInt(choices.size)]

        println("انتخاب شما: $userChoice")
        println("انتخاب کامپیوتر: $computerChoice")

        when {
            userChoice == computerChoice -> {
                println("مساوی شدید!")
            }

            (userChoice == "سنگ" && computerChoice == "قیچی") ||
            (userChoice == "کاغذ" && computerChoice == "سنگ") ||
            (userChoice == "قیچی" && computerChoice == "کاغذ") -> {
                println("آفرین! شما برنده شدید.")
                userScore++
            }

            else -> {
                println("کامپیوتر برنده شد!")
                computerScore++
            }
        }

        println("امتیاز شما: $userScore | امتیاز کامپیوتر: $computerScore")
    }
}
