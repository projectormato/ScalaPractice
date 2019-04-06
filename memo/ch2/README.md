# 2章

## 型
* Any: 全ての型のスーパータイプ
* AnyVal: 値型のスーパータイプ
  * Byte: 1バイト符号付き整数
  * Shor: 2バイト符号付き整数
  * Char: UnicodeのU+0000からU+FFFF、1文字
  * Int: 4バイト符号付き整数
  * Long: 8バイト符号付き整数
  * Float: 4バイト浮動小数点数
  * Double: 8バイト浮動小数点数
  * Unit: void
* AnyRef: 参照型のスーパータイプ
  * StringやList、ユーザの定義したクラス
  * Null: すべての参照型のサブタイプ
* Nothing: 全ての型のサブタイプ、例外投げる時

AnyRefはJavaでいうjava.lang.Objectで、Anyはさらにその上なのでJavaには無いもの
```scala
var i: Int = _
```
みたいな感じに定義すると型それぞれのデフォルト値で初期化出来る！

## trait
Scalaのクラスも、三角継承等の問題があるので、複数継承することは出来ない。そのために、クラスからnewでインスタンス化する機能を省いた、トレイト(trait)という要素を定義できる。  

## 特別なメソッド名
* apply  
    オブジェクトに対する関数呼び出しのようなことをするとコンパイラではapplyメソッドを呼び出したと解釈される  
    `List(1, 2, 3)`は`List.apply(1,2,3)`と解釈される。  
    ```
    object Add {
        def apply(x: Int, y: Int): Int = x+y
    }
    ```
    みたいに定義すると`Add.apply(1,2)`でも`Add(1,2)`でも同じ
    
* unary_  
    unaryのあとに`+-!~`のどれかが付いてると特別なメソッド扱いになる
    ```
    class MyString(val content: String){
        def unary_! : String = "!" + content
    }
    ```
    みたいな定義があると
    ```
    val s = new MyString("Taro")
    !s //!Taro
    ```
    みたいな呼び出し方が出来るBooleanの`!flag`みたいなのはこういうので表現されているらしい

## ケースクラス
```scala
class Point(val x:Int, val y:Int)
```
みたいな定義では   
* Mapのキーになれない
* toStringメソッドの結果が見づらい
* 明示的にnewしないと使えない  
等の問題を
```scala
case class Point(x: Int, y: Int)
```
みたいな定義にすると解決できる、これがケースクラス。

## match式(パターンマッチ)
制御構文の1つで、パターンをマッチさせて色々できる。Javaのswitch文よりもかなり強力
todo:match式の例を書く
