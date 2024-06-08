```

#コンテナの作成/起動
docker run -d --name oracle-db　-e ORACLE_PWD=password oracle/database:23.4.0-free

#(コンテナの起動)
docker start oracle-db

# SQLPlus起動
docker exec -it oracle-db bash

sqlplus system/password@//localhost:1521/FREEPDB1


```