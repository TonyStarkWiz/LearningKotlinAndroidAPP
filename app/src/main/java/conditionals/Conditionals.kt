package conditionals

fun main(args: Array<String>){
  /* val array = arrayOf("Texas", "Iowa", "California")
   val list = listOf("Orange", "Apple", "Bananas")
   val arrayList = arrayListOf("Patrick", "Michael", "Sarah")
   arrayList.add("Sandra")

    val mixed = arrayOf("Kotlin", 17, 3.0, false)
    val numbers = intArrayOf(1,2,3,4,5)
    println(mixed[0])
    mixed[2] = 3.1415
    println(mixed[2])
    val str = "Udemy"
    println(str[0])

    val states = arrayOf("Nevada", "Florida")
    val allStates = array + states

    println(allStates.size)

    val empty: Boolean = numbers.isEmpty()

    if (states.contains("Kentucky")){
        println("It contains Kentucky")
    } else {
        print("It does not")
    }*/

    // Lists
    val arrayList = arrayListOf("Patrick", "Michael", "Sarah")
    val list = arrayListOf("Peter")
    println(arrayList[0])
    println(arrayList + list)
    println(arrayList.size)
    println(arrayList.isEmpty())
    println(arrayList.contains("Sarah"))

    arrayList.add("Josh")
    val changed = arrayList.add(1, "Jack")
    println(arrayList)

   // val removed = arrayList.remove("Michael")
    println(arrayList)
    //println(removed)

    val sublist = arrayList.subList(0,4)
    println(sublist)





}