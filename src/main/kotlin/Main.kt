fun printSuffix( price: Int) {
    if( price % 10 == 0 || ( price % 10 >= 5 && price % 10 <= 9)) println("рублей")
    else if ( price % 10 >= 2 &&  price % 10 <= 4 ) println("рубля")
    else println("рубль")
}
fun main() {
    val price = 5000
    val regCustomer = true
    var totalPrice: Int

    print("Покупка $price ")
    printSuffix(price)

    if( price <= 1000 ) {
        totalPrice = price
        if(regCustomer)  {
            totalPrice = totalPrice*99/100
            print("После применения 1% скидки $totalPrice ")
            printSuffix(totalPrice)
        }
    }
    else if ( price > 1000 && price <= 10000) {
        totalPrice = price - 100
        print("После применения скидки 100 рублей - $totalPrice ")
        printSuffix(totalPrice)
        if(regCustomer) {
            totalPrice = totalPrice*99/100
            print("После применения 1% скидки $totalPrice ")
            printSuffix(totalPrice)
        }
    }
    else {
        totalPrice = price*95/100
        print("После применения скидки 5% - $totalPrice ")
        printSuffix(totalPrice)
        if(regCustomer) {
            totalPrice = totalPrice*99/100
            print("После применения 1% скидки $totalPrice ")
            printSuffix(totalPrice)
        }
    }
}