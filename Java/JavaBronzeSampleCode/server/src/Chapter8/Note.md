
<!-- @import "[TOC]" {cmd="toc" depthFrom=1 depthTo=6 orderedList=false} -->

<!-- code_chunk_output -->

- [Chapter8](#chapter8)
  - [ポリモフィズムとパッケージ](#ポリモフィズムとパッケージ)
    - [抽象クラス](#抽象クラス)
    - [インターフェース](#インターフェース)
    - [基本データ型と参照型の型変換](#基本データ型と参照型の型変換)
    - [パッケージ宣言とインポート](#パッケージ宣言とインポート)

<!-- /code_chunk_output -->


# Chapter8

## ポリモフィズムとパッケージ

----

### 抽象クラス

- 処理内容を記述したメソッド(具象メソッド)を持ち、インスタンス化して使用できるクラス⇒<b>具象クラス</b>
処理内容を記述しないメソッド(抽象メソッド)を持つクラス⇒<b>抽象クラス(abstractクラス)</b>
抽象クラスには、具象メソッドと抽象メソッドを混在させることが可能

- 抽象クラスの特徴
  - 抽象クラスはクラス宣言に`abstract`修飾子を指定する
  - 具象メソッドと抽象メソッドを混在可能
  - 抽象クラス自体はnewによるインスタンス化はできないため、利用する際は抽象クラスを継承したサブクラスを作成する
  - 抽象クラスを継承したサブクラスが<b>具象クラス</b>の場合、元となる抽象クラスにある抽象メソッドのオーバーライドは<b>必須</b>
  - 抽象クラスを継承したサブクラスが<b>抽象クラス</b>の場合、元となる抽象クラスにある抽象メソッドのオーバーライドは<b>任意</b>


---
### インターフェース

- インターフェースの特徴
  - インターフェース宣言には`interface`キーワードを指定する
  - インターフェースでは、<b>public staticな定数</b>を宣言できる。定数となるため初期化しておく。
  - インターフェースでは、抽象メソッドを宣言できる
  - <b>インスタンス化はできず</b>、利用する場合は実装クラスを作成し、実装クラス側では抽象メソッドをオーバーライドして使用する
  - 実装クラスを定義するには`implements`キーワードを使用する
  - インターフェースをもとにサブインターフェースを作成する場合は、`extends`キーワードを使用する

- インターフェース内で変数を宣言すると、暗黙的に`public static final`修飾子が付与される
⇒static名定数となるため、宣言と同時に初期化が必要。

- インターフェースでの抽象メソッドは強制的に`public abstract`となる。

- 実装クラスの宣言では1つ以上のインターフェースを複数指定することができる
implementsで指定したすべてのインターフェースのメソッドをオーバーライドする必要がある。
また、オーバーライドする際には、public修飾子をつける必要がある。

- インターフェースを継承した、サブインターフェースを作成することも可能(`extends`)
サブインターフェースを実装したクラスが具象クラスの場合、スーパーインターフェース、サブインターフェースのすべてのメソッドをオーバーライドする必要がある。


---
### 基本データ型と参照型の型変換

- 基本データ型の変換ルール
  ```
  -> 暗黙の型変換 ->

  byte -> short -> int -> long -> float -> double
          char -|

  <- キャストによる型変換 <-
  ```
- 暗黙の型変換
byte値をint型の変数に代入したり、float値をdouble型の変数に代入したりできる

- キャストによる型変換
int値をbyte型の変数に代入したり、doubl値をfloat型の変数に代入したりできる


- 参照型の変換ルール
  ```
  -> 暗黙の型変換 ->

  サブクラス -> スーパークラス
  実装クラス -> インターフェース

  <- キャストによる型変換 <-
  ```
---

- 暗黙の型変換
サブクラスのオブジェクトを、スーパークラスを型として宣言した変数で扱うことが可能
実装クラスのオブジェクトを、インターフェースを型として宣言した変数で扱うことが可能
  ```java
  スーパークラス型    変数名 = サブクラスのオブジェクト;
  インターフェース型  変数名 = 実装クラスのオブジェクト;
  ```

- キャストによる型変換
あるクラスをインスタンス化 → スーパークラスやインターフェースを型とする変数に代入 → キャストにより元のクラス(型)に戻す


### パッケージ宣言とインポート