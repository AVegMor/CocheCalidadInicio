# CocheCalidad · Proyecto de inicio

Proyecto de partida para practicar el **análisis de calidad del código con SonarQube**.

El código funciona, pero tiene problemas deliberados: casi no tiene tests, hay código duplicado, nombres poco claros y lógica difícil de seguir. Tu trabajo es:

1. **Configurar el proyecto** para que mida la cobertura de los tests (JaCoCo) y envíe el análisis a SonarQube.
2. **Analizar** el proyecto y entender lo que SonarQube detecta.
3. **Mejorar** el código y los tests hasta superar el Quality Gate con buena cobertura.

Sigue la guía paso a paso que te ha dado tu profesor.

## Requisitos

- JDK 21 o superior
- Git
- Visual Studio Code con *Extension Pack for Java* y *Gradle for Java*
- SonarQube en marcha en <http://localhost:9000> (con el `docker-compose.yml` del profesor)

## Comandos útiles

```bash
./gradlew test        # compila y pasa los tests
./gradlew sonar       # analiza el proyecto (cuando lo hayas configurado)
```

En Windows (PowerShell) también puedes usar `.\gradlew.bat test`.

> ⚠️ El token de SonarQube va en `gradle.properties`, que está en `.gitignore`. **Nunca** lo escribas en `build.gradle.kts` ni lo subas a GitHub.
