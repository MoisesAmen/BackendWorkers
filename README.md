# Sistema de Gestión de Trabajadores y Fotos

Este proyecto es un backend desarrollado con Spring Boot que proporciona una API REST para gestionar trabajadores y sus fotos asociadas.

## Características

- Gestión de trabajadores (CRUD completo)
- Gestión de fotos asociadas a trabajadores
- API REST completamente documentada
- Persistencia de datos con JPA/Hibernate

## Estructura del Proyecto

```
BackendWorkers/
├── src/main/java/com/mss/BackendWorkers/
│   ├── controllers/
│   │   ├── TrabajadorController.java
│   │   └── FotoController.java
│   ├── models/
│   │   ├── Trabajador.java
│   │   └── Foto.java
│   ├── repository/
│   │   ├── TrabajadorRepository.java
│   │   └── FotoRepository.java
│   ├── service/
│   │   ├── TrabajadorService.java
│   │   ├── TrabajadorServiceImpl.java
│   │   ├── FotoService.java
│   │   └── FotoServiceImpl.java
│   └── BackendWorkersApplication.java
```

## Modelos de Datos

### Trabajador
- DNI (identificador único)
- Nombres
- Apellidos
- Lista de fotos asociadas

### Foto
- ID (autogenerado)
- Ruta de la imagen
- Fecha
- Referencia al trabajador

## Endpoints API

### Trabajadores

- `GET /api/trabajadores` - Listar todos los trabajadores
- `POST /api/trabajadores` - Crear nuevo trabajador
- `GET /api/trabajadores/{dni}` - Obtener trabajador por DNI
- `GET /api/trabajadores/existe/{dni}` - Verificar si existe trabajador
- `DELETE /api/trabajadores/{dni}` - Eliminar trabajador

### Fotos

- `GET /api/fotos` - Listar todas las fotos
- `POST /api/fotos` - Guardar nueva foto
- `GET /api/fotos/{id}` - Obtener foto por ID
- `GET /api/fotos/por-trabajador/{dni}` - Listar fotos de un trabajador
- `DELETE /api/fotos/{id}` - Eliminar foto

## Tecnologías Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Lombok
- Base de datos (configurada en application.properties)

## Requisitos

- JDK 17 o superior
- Maven
- IDE compatible con Spring Boot (recomendado: IntelliJ IDEA, Eclipse, VS Code)

## Configuración y Ejecución

1. Clonar el repositorio:
```bash
git clone [url-del-repositorio]
```

2. Navegar al directorio del proyecto:
```bash
cd BackendWorkers
```

3. Compilar el proyecto:
```bash
mvn clean install
```

4. Ejecutar la aplicación:
```bash
mvn spring-boot:run
```

La aplicación estará disponible en `http://localhost:8080`

## Relaciones entre Entidades

- Un Trabajador puede tener múltiples Fotos (relación One-to-Many)
- Cada Foto pertenece a un único Trabajador (relación Many-to-One)
- Las fotos se eliminan en cascada cuando se elimina un trabajador

## Seguridad y Validaciones

- Validación de DNI único para trabajadores
- Validaciones de campos obligatorios
- Referencias seguras entre entidades

## Contribución

Para contribuir al proyecto:

1. Fork del repositorio
2. Crear una nueva rama para características
3. Commit de cambios
4. Push a la rama
5. Crear Pull Request
