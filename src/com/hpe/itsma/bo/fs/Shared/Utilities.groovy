package com.hpe.itsma.bo.fs.Shared
class Utilities {
    def static testStatic(script,msg){
        script.echo "${msg}"
    }
    def testInstance(script,msg){
        script.echo "${msg}"
    }
}
