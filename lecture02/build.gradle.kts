plugins {
    base
    java
    checkstyle
}

repositories {
    mavenCentral()
}

dependencies {
    testCompileOnly("org.junit.jupiter:junit-jupiter-api:5.1.0")
//    testCompileOnly("junit:junit:4.4")
}

checkstyle {
    toolVersion = "7.5"
    configFile = File("../config/caheckstyle/checkstyle.xml")
}

val jar by tasks.getting(Jar::class) {
    archiveName = "fook.jar"
    into("META-INF") {
        from("bar")
    }
//    from(configurations.runtime.map { if (it.isDirectory) it else zipTree(it) })
    manifest {
        attributes(mapOf("Main-Class" to "ru.atom.makejar.HelloWorld"))
    }
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform()
}

//val test : Test by tasks
//test.testLogging.showExceptions = true

task("greeting") {
    doLast { println("Hello world!!!") }
}

//tasks {
//    test {
//        testLogging.showExceptions = true
//    }
//}
