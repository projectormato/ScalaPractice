# 2章

## 型について
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
