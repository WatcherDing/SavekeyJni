#include <jni.h>
#include "com_example_appkey_AppKey.h"

//
// Created by 12348 on 2017/6/14.
//

extern "C"
{

/*
 * Class:     Java_com_example_appkey_AppKey
 * Method:    getKey
 */

JNIEXPORT jstring JNICALL Java_com_example_appkey_AppKey_getKey
        (JNIEnv *env, jobject obj)
{
    //保存设置的APP 令牌
    return env->NewStringUTF("123456");
}

}