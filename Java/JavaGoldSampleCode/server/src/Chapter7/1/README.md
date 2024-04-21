# コンパイル(fooモジュール)
```
(省略)/1>javac -d out/foo src/foo/xlib/XTest.java
(省略)/1>javac -d out/foo src/foo/ylib/YTest.java
(省略)/1>javac -d out/foo src/foo/module-info.java
```

# コンパイル(clientモジュール)
```
(省略)/1>javac -d out/client --module-path out/foo src/client/module-info.java src/client/app/Main.java
```

# 実行
```
(省略)/1>java --module-path out/foo:out/client --module client/app.Main
(省略)/1>java -p out/foo:out/client -m client/app.Main
```

# 実行(JARファイルで実行)
```
(省略)/1>jar -cvf modules/foo.jar -C out/foo .
(省略)/1>jar -cvf modules/client.jar -C out/client .

(省略)/1>java -p modules -m client/app.Main
```