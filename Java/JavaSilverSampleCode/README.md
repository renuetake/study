# [参考](https://qiita.com/A-Kira/items/0dda255e00771f556e2a)

# Docker起動
```
// dockerビルド
% docker-compose build

// dockerをバックグラウンドで起動
% docker-compose up -d

// 確認
% docker-compose ps
```

# コンパイルと実行
```
% docker-compose exec java bash

// コンパイル
root@**:/usr/src# javac Main.java

// 実行
root@**:/usr/src# java Main
Hello World!
```
