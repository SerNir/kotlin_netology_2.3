fun main(){
    /*
    Если сумма покупки от 0 до 1 000 рублей, то никаких скидок нет (как в лекции).
    Если сумма покупки от 1 001 до 10 000 рублей, то стандартная скидка - 100 рублей (как в лекции).
    Если сумма покупки от 10 001 рубль и выше то % составляет 5% от суммы.
*/
    val itemPrice = 100
    val itemCount = 110
    val discount = 100
    val discountStart = 1_000
    val discountMax = 10_000
    val isRegularCustomer = true

    val totalPrice = itemPrice * itemCount
    var result = if (totalPrice > discountStart && totalPrice < discountMax){
        println("скидка 100 рублей")
        totalPrice - discount
    } else if (totalPrice > discountMax){
        println("скидка 5%")
        totalPrice * 0.95
    }else{
        println()
        totalPrice
    }

    if(isRegularCustomer){
        println("Скидка постоянного покупателя 1%")
        result = result.toInt() * 0.99
    }

    println(result)
}