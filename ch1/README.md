# 1章

## Scalaでの一般的な命名規則
```scala
//変数名は大文字によって区切るキャメルケース
lazy val lazyDate = new java.util.Date

//パッケージ名は.区切りで階層表現する
package jp.co.example.something_important

//クラス、オブジェクト、トレイトは大文字始まりのキャメルケース
class Myclass(val myNumber: String) {
  //インデントは半角スペース2つ

  //定数は大文字始まりのキャメルケース(クラスとかと同じ)
  val DefaultNumber = 42

  //メソッドは小文字始まりのキャメルケース(変数と同じ)
  def printSomething(): Unit = println("something.")
}
```

## Scaladoc
https://www.scala-lang.org/files/archive/api/current/  
から検索等していく
