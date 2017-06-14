# SavekeyJni
![](https://img.shields.io/badge/license-Apachhe2.0-red.svg)
![](https://img.shields.io/badge/language-android-orange.svg)

android app 令牌使用jni存储，安全级别提升
 

#使用方法
-  在你项目中引用`appkey` Module .
- 修改 `appkey/src/main/jni/main.cpp`
```c++
    JNIEXPORT jstring JNICALL Java_com_example_appkey_AppKey_getKey
            (JNIEnv *env, jobject obj)
    {
        //保存设置的APP令牌 123456修改成自己的令牌  
        return env->NewStringUTF("123456");
    }
```

- 打开终端（mac）或 cmd命令行（win）,进入到jni目录下执行命令
```
    ndk-build
```

- 在主项目中 使用
```java
    //获取jni c++ 代码中我们定义的key
    String key= AppKey.getAppKey();
```


###感谢
受到启发：[[译]再谈如何安全地在 Android 中存储令牌](https://juejin.im/post/5938f81e5c497d006b6187ea) 

学习地址：[android NDK JNI so文件的制作和使用](http://blog.csdn.net/u012005313/article/details/52005958) 