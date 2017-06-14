LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := Key
LOCAL_SRC_FILES := Main.cpp
LOCAL_LDLIBS +=-L$(SYSROOT)/usr/lib -lm -llog
include $(BUILD_SHARED_LIBRARY)