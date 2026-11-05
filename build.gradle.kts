plugins {
    id("java")
    // TODO (guía, paso 5): añade aquí el plugin de cobertura (jacoco) y el de SonarQube (org.sonarqube)
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("commons-collections:commons-collections:3.2.1")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
    // TODO (guía, paso 6): genera el informe de cobertura al terminar los tests
}

// TODO (guía, paso 6): configura el informe de JaCoCo (XML para SonarQube y HTML para ti)

// TODO (guía, paso 7): configura el bloque sonar { properties { ... } }

// TODO (guía, paso 8): haz que la tarea sonar espere al informe de cobertura

// ¡OJO! La URL de SonarQube y el token NUNCA van en este fichero: van en gradle.properties (guía, paso 4).
