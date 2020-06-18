package org.devops
//build type

def Build(buildType,buildShell){
    
    def buildTools = ["mvn":"m2","ant":"ant","gradle":"GRADLE","npm":"node"]
    
    println("current buildtype is ${buildType}")
    buildHome = tool buildTools[buildType]
    if (${buildType=="npm"}){
        sh """export NODE_HOME=${npmHome} 
        export PATH=\$NODE_HOME/bin:\$PATH 
        ${npmHome}/bin/npm -v"""
    }else{
        sh"${buildHome}/bin/${buildType} ${buildSHell}"
    }
    
}
