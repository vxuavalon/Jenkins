package org.devops
//build type

def Build(buildType,buildShell){
    
    def buildTools = ["mvn":"m2","ant":"ant","gradle":"GRADLE","npm":"node"]
    
    println("current buildtype is ${buildType}")
    buildHome = tool buildTools[buildType]

    sh"${buildHome}/bin/${buildType} ${buildSHell}"
}
