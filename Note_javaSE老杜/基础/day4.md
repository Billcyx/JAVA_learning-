A.class (A是类名)

java 后面跟的是 类名

java World 这个在terminal执行后，发生了什么？
1. 启动JVM
2. JVM调动 classloader（类加载器）
3. 本质上，类加载器负责去硬盘上找 类 对应的 字节码文件（World.class, for example）
4. classloader 找到 字节码后， 交给JVM 
5. JVM 将 字节码 翻译成 二进制

classpath：classpath环境变量 是给 classloader（类加载器） 指路的； 这个环境变量不像path属于windows，是属于java的





