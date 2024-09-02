# Proyecto de Gestión de Precios

## Descripción del Proyecto

Este proyecto es una aplicación de gestión de precios que permite consultar los precios de productos en función de diferentes criterios como el `productId`, `brandId` y una fecha específica. La aplicación está construida utilizando **Java**, **Spring Boot** y **Maven**.

## Arquitectura Hexagonal

### ¿Qué es la Arquitectura Hexagonal?

La arquitectura hexagonal, también conocida como arquitectura de puertos y adaptadores, es un patrón de diseño de software que tiene como objetivo crear aplicaciones altamente mantenibles y testeables. La idea principal es separar el núcleo de la aplicación (la lógica de negocio) de las partes externas (interfaces de usuario, bases de datos, servicios externos, etc.).

### Beneficios de la Arquitectura Hexagonal

- **Independencia de la tecnología**: Permite cambiar las tecnologías externas sin afectar la lógica de negocio.
- **Facilidad de pruebas**: Facilita la creación de pruebas unitarias y de integración.
- **Mantenibilidad**: Mejora la mantenibilidad del código al separar las preocupaciones.

### Aplicación de la Arquitectura Hexagonal en este Proyecto

En este proyecto, la arquitectura hexagonal se ha aplicado de la siguiente manera:

- **Core (Núcleo)**: Contiene la lógica de negocio y las entidades principales.
- **Adapters (Adaptadores)**: Incluyen los controladores REST, repositorios y otros componentes que interactúan con el mundo exterior.
- **Ports (Puertos)**: Interfaces que definen los contratos entre el núcleo y los adaptadores.

## Estructura del Proyecto

- `src/main/java/com/inditex/inditex_test/core`: Contiene la lógica de negocio y las entidades.
- `src/main/java/com/inditex/inditex_test/adapters`: Contiene los controladores REST y los repositorios.
- `src/main/java/com/inditex/inditex_test/ports`: Contiene las interfaces que definen los contratos.

## Ejecución de Tests

Para ejecutar los tests del proyecto, sigue los siguientes pasos:

1. **Clonar el repositorio**:
    ```sh
    git clone <URL_DEL_REPOSITORIO>
    cd <NOMBRE_DEL_PROYECTO>
    ```

2. **Ejecutar los tests con Maven**:
    ```sh
    mvn test
    ```

3. **Verificar los resultados**: Los resultados de los tests se mostrarán en la consola.

## Ejecución de Tests Específicos

Para ejecutar tests específicos, puedes utilizar las siguientes opciones de Maven:

- **Ejecutar un test específico**:
    ```sh
    mvn -Dtest=NombreDelTest test
    ```

- **Ejecutar tests con un patrón específico**:
    ```sh
    mvn -Dtest=NombreDelTest* test
    ```

## Conclusión

Este proyecto demuestra cómo aplicar la arquitectura hexagonal para crear una aplicación de gestión de precios mantenible y testeable. La separación de la lógica de negocio y las dependencias externas facilita la evolución del proyecto y la integración de nuevas tecnologías.
