#include "org_jboss_hello_Hello.h"

JNIEXPORT jstring JNICALL Java_org_jboss_hello_Hello_sayHello(JNIEnv *env, jobject obj, jstring name)
{
    const char *str = (*env)->GetStringUTFChars(env, name, 0);
    // beware of overflow
    char reply[256];
    sprintf(reply, "Hello %s from v2", str);
    (*env)->ReleaseStringUTFChars(env, name, str);
    return (*env)->NewStringUTF(env, reply);
}