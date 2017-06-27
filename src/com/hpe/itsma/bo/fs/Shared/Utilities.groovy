package com.hpe.itsma.bo.fs.Shared
class Utilities {
    def static testStatic(String msg){
        echo "${msg}"
    }
    def testInstance(msg){
        echo "${msg}"
    }
}
