plugins {
    java
}

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    //implementation fileTree(dir: 'lib', include: ['*.jar'])
    implementation(fileTree(mapOf("dir" to "lib", "include" to arrayOf("*.jar"))))
}
