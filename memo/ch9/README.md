## 式指向のスタイル

テーマ：「与えられた値を始めと終わりとする、連続した整数の和を求めて、標準出力するプログラム」

### 最初のプログラム
```
def sumUpAndShow(start: Int, end: Int): Unit = {
    var current = start
    var total = 0
    while (current <= end) {
        total += start
        current += 1
    }
    println(total)
}
```
問題点
* 戻り値が無いので、テストが難しい
* varが使われていて、バグが出た時疑う箇所が多い

### テストしやすくする
```
def sumUp(start: Int, end: Int): Int = {
    var current = start
    var total = 0
    while (current <= end) {
        total += start
        current += 1
    }
    total
}

def show(result: Int): Unit = println(result)
```
こんな感じで戻り値を返すようにすると
```
assert(sumUp(1, 10) == 55)
```
みたいなテストが出来るようになるね

### 可変な変数を取り除く

```
import scala.annotation.tailrec

def sumUp(start: Int, end: Int): Int = {
    @tailrec
    def doSumUp(current: Int, subtotal: Int): Int =
        if (current > end)
            subtotal
        else
            doSumUp(crrent + 1, subtotal + current)
            
    doSumUp(start, 0)
}
```
末尾最適化できてる再起関数使うと可変な変数が取り除ける

### より高次の関数で簡素に書き換える
```
def sumUp(start: Int, end: Int): Int = (start to end).sum
```
簡素で、かつ合成可能性やテスト可能性の高いコードになりました！
