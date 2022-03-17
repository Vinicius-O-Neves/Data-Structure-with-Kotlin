fun main(args: Array<String>) {
    val moneyTree = TreeNode<String>("Coin")
    val dolarNode = TreeNode<String>("Dollar")
    val realNode = TreeNode<String>("Real")
    moneyTree.addChild(dolarNode)
    moneyTree.addChild(realNode)

    val oneDollar = TreeNode<String>("1 Dollar")
    val tenDollars = TreeNode<String>("10 Dollars")
    dolarNode.addChild(oneDollar)
    dolarNode.addChild(tenDollars)

    val doisReais = TreeNode<String>("2 Reais")
    val dezReais = TreeNode<String>("10 Reais")
    realNode.addChild(doisReais)
    realNode.addChild(dezReais)

    val foodTree = TreeNode<String>("Food")
    val fruitTree = TreeNode<String>("Fruit")
    val bananaTree = TreeNode<String>("Banana")
    val pearTree = TreeNode<String>("Pear")
    foodTree.addChild(fruitTree)
    fruitTree.addChild(bananaTree)
    fruitTree.addChild(pearTree)

    val list = LinkedList()
    list.add(moneyTree)
    list.add(foodTree)

//    list.remove(0)

    val text = list.get(1).toString()

    println(text.split("}")
        .get(0)
        .replace("{", "")
        .replace("[", "")
        .replace("]", ""))

    println(list.get(0))

    println(list.getAll(moneyTree.children.lastIndex))
}