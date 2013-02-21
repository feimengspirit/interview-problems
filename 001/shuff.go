// Author : wangjinlei
// Email  : sea11107@mail.ustc.edu.cn
// This is a golang implementation for problem No.1

///////////////////////////////////////////////////////
/*
 * Problem Description
 * 给出洗牌的一个算法，并将洗好的牌存储在一个整形数组里
 */
package main

import (
    "fmt"
    "math/rand"
    "sort"
    "time"
)

// fill the slice with sequence integer from zero to len(data)-1
func fill(data []int) {

    for i := 0; i < len(data); i++ {
        data[i] = i
    }
}

func swap(data []int, i, j int) {

    data[i], data[j] = data[j], data[i]
}

// generate a random num within [from, to)
func randRange(from, to int) (r int) {

    source := rand.NewSource(time.Now().UnixNano())
    rnd := rand.New(source)
    span := to - from
    rndInt = int(rnd.Int31())%span + from
    return rndInt
}

func shuffle(data []int) {

    for i := 0; i < len(data); i++ {
        r := randRange(i, len(data)) // Notice here, not range[0, n)
        swap(data, i, r)
    }
}

func main() {

    data := make([]int, 100)
    fill(data)
    shuffle(data)
    fmt.Println(data)

    sort.Ints(data)
    fmt.Println(data)
}
