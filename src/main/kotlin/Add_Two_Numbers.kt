fun main(args: Array<String>) {

    val list1 = ListNode(1)
    list1.next = ListNode(2)
    list1.next?.next = ListNode(3)

    // İkinci bağlı liste örneği
    val list2 = ListNode(4)
    list2.next = ListNode(5)
    list2.next?.next = ListNode(6)

    // İlk bağlı listeyi yazdır
    print("List 1: ")
    println(list1.toString())

    // İkinci bağlı listeyi yazdır
    print("List 2: ")
    println(list2.)
}


fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}