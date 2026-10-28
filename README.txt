NEXUS TECNOLOGIA - PROYECTO ANDROID

Paquete: com.example.tecnologia
Lenguaje: Java
Plantilla: Android Views (XML)
Min SDK: 23
Compile SDK: 35
Gradle esperado: 8.13
Android Gradle Plugin: 8.13.2
JDK recomendado: JBR/JDK 21

CREDENCIALES DE PRUEBA
Usuario: Alejandro
Contraseña: 12345678

FUNCIONALIDADES
- Login con validación de campos vacíos y credenciales.
- Navegación inferior: Inicio y Configuración.
- Tarjetas de tecnología con imágenes circulares.
- Picasso para cargar imágenes desde internet.
- CircleImageView para imágenes redondas.
- Configuración muestra el usuario autenticado.
- Cerrar sesión vuelve al login y limpia la pila de navegación.

DEPENDENCIAS PEDIDAS
com.squareup.picasso:picasso:2.5.2
de.hdodenhof:circleimageview:3.1.0

CÓMO ABRIR
1. Extrae TecnologíaApp.zip en una carpeta.
2. Abre Android Studio.
3. Selecciona Open y elige la carpeta TecnologíaApp (la que contiene settings.gradle.kts).
4. Usa JBR/JDK 21 como Gradle JDK.
5. Espera a que Gradle sincronice y descargue dependencias.
6. Ejecuta en un emulador o dispositivo Android.

IMPORTANTE
- Se necesita internet para descargar las dependencias la primera vez y para que Picasso cargue las fotos remotas.
- Las imágenes tienen placeholder si no cargan.
- El proyecto usa compileSdk 35; instala Android SDK Platform 35 desde SDK Manager si no está instalado.
- La contraseña está fijada para fines académicos y no debe usarse como autenticación real en producción.
- Este ZIP contiene el proyecto fuente completo; la primera sincronización depende de que Android Studio pueda descargar los componentes requeridos.
