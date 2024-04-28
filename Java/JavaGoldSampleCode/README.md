# [参考](https://qiita.com/A-Kira/items/0dda255e00771f556e2a)

# Docker起動
```
// dockerビルド
% docker-compose build

// dockerをバックグラウンドで起動
% docker-comppose up -d

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

# DB初期化
```
% docker-compose exec db bash

bash-4.2# /docker-entrypoint-initdb.d/init-database.sh
```

# DB確認
```
% docker-compose exec db bash

bash-4.2# mysql -u root -ptraining

mysql> show databases;
mysql> use golddb;
mysql> show tables;
```

# Java⇔DB接続時につまずいたとこ
- JavaコンテナとMySQLコンテナ間の通信なので、教本通りでは接続できなかった
- 以下データベースの指定の箇所をDBコンテナのIPにしたら通った
```java 
String url = "jdbc:mysql://db:3306/golddb" + // ここのdbってのがDBコンテナのホスト名
            "?verifyServerCertificate=false&" + 
            "useSSL=false&serverTimezone=Asia/Tokyo";
```

- javaコマンドたたくときは以下で.jarファイル取り込む
```
java -cp .:mysql-connetctor-java-8.0.12.jar Main
```