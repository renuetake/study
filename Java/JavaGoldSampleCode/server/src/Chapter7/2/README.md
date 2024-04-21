```

(省略)/1>javac -d out/bar/ src/bar/module-info.java src/bar/ylib/YTest.java
(省略)/1>javac -d out/foo/ --module-path out/bar/ src/foo/module-info.java src/foo/x
lib/XTest.java
(省略)/1>javac -d out/client --module-path out/foo:out/bar src/client/module-info.java src/client/app/Main.java


(省略)/1>java --module-path out/bar:out/foo:out/client --module client/app.Main
```