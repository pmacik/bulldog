/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class io_silverspoon_bulldog_linux_jni_NativeI2c */

#ifndef _Included_io_silverspoon_bulldog_linux_jni_NativeGpio
#define _Included_io_silverspoon_bulldog_linux_jni_NativeGpio
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     io_silverspoon_bulldog_linux_jni_NativeGpio
 * Method:    readSignal
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_io_silverspoon_bulldog_linux_jni_NativeGpio_readSignal
  (JNIEnv *, jclass, jint);


/*
 * Class:     io_silverspoon_bulldog_linux_jni_NativeGpio
 * Method:    writeSignal
 * Signature: (II)V
 */
  JNIEXPORT void JNICALL Java_io_silverspoon_bulldog_linux_jni_NativeGpio_writeSignal
    (JNIEnv *, jclass, jint, jint);

#ifdef __cplusplus
}
#endif
#endif