#!/bin/sh

#检查代码的正确性
gradlew install

#上传编译的文件到bintray
gradlew bintrayUpload

