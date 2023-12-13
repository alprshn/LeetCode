fun main(args: Array<String>) {
    // Örnek kullanım
    val l1 = ListNode(2)
    l1.next = ListNode(4)
    l1.next!!.next = ListNode(3)

    val l2 = ListNode(5)
    l2.next = ListNode(6)
    l2.next!!.next = ListNode(4)

    val solution = Solution()
    val result = solution.addTwoNumbers(l1, l2)

    // Sonucu yazdırma
    var current = result
    while (current != null) {
        print("${current.`val`} ")
        current = current.next
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {//l1: val =2,  l2: val =5
        var carry = 0
        var dummy = ListNode(0) // dummy: val = 0 next = null
        var current = dummy// current: val = 0 next = null
        var p = l1 //l1: val =2 next = null
        var q = l2 //l2: val =5 next = null

        while (p != null || q != null) {
            val x = p?.`val` ?: 0 // x = 2
            val y = q?.`val` ?: 0 // y = 5

            val sum = x + y + carry// sum = 7
            carry = sum / 10 // carry = 7/10

            current.next = ListNode(sum % 10) // current: val = 0 next = ListNode(sum % 10)
            current = current.next!!// current: val = 0 next = null

            if (p != null) p = p.next
            if (q != null) q = q.next
        }

        if (carry > 0) {
            current.next = ListNode(carry)
        }

        return dummy.next
    }
}