## メソッドと関数の違い
Scalaの関数とは、`Function0`~`Function22`というトレイトのサブクラスをそうよんでいるだけ。
```
val sub: String => String = {x => x.substring(1)}
```
は
```
val sub: Function1[String, String] = new Function1[String, String] {
    def apply(x: String): String = x.substring(1)
}
```
と同等であるということシンタックスシュガーみたいなもの。

そしてメソッドは以下のように書く
```
def sub(x: String): String = x.substring(1)
```
これは関数とは違い、さらに細かい何かに分解されたりしない。関数のようにそのまま他の箇所に渡したりも出来ない。  
メソッドと関数の橋渡しとして`n-expansion`というのがあるものの、本来メソッドと関数は別々のものである。
