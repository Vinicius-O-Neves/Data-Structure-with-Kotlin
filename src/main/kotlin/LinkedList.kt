class LinkedList {
    private var first: Node? = null

    private val lastNode: Node
        get() {
            var currentNode = first
            while (currentNode!!.next != null) {
                currentNode = currentNode.next
            }
            return currentNode
        }

    fun add(data: TreeNode<String>) {
        val newNode = Node(data, null)

        if (first == null) first = newNode else lastNode.next = newNode
    }

    fun get(index: Int): TreeNode<String> {
        var currentNode = first
        repeat(index) {
            currentNode = currentNode!!.next
        }
        return currentNode!!.data
    }

    fun getAll(size: Int): List<TreeNode<String>> {
        val list: MutableList<TreeNode<String>> = mutableListOf()
        (0..size).forEach {
          if (it == 0) list.add(first!!.data) else list.add(first!!.next!!.data)
        }
        return list
    }

    fun remove(index: Int) {
        if (index == 0 ) {
            first = first!!.next
            return
        }

        var before = first
        repeat(index - 1) {
            before = before!!.next
        }
        before!!.next = before!!.next!!.next
    }

}

class Node(val data: TreeNode<String>, var next: Node?)

