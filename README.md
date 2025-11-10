# Preferencias

## ¿Qué hace?
La aplicación solicita al usuario un nombre y una contraseña, y, al pulsar **Iniciar Sesión**, el nombre se muestra en la siguiente pestaña, es decir en Details y se guarda para recuperarlo automáticamente al reiniciar la app y para usarse en details.

## Funcionamiento
1. El usuario introduce su nombre y contraseña.
2. Al pulsar **Iniciar Sesión**, se guarda el nombre en `SharedPreferences` y se abre la pantalla `Details`.
3. En `Details` se muestra el nombre guardado y un botón **Volver**.
4. Al reabrir la app, el nombre se carga automáticamente gracias a las Preferencias.

## Archivos principales
- `Login.kt`
- `Details.kt`
- `activity_login.xml`
- `activity_details.xml`

## Notas
He usado SharedPreferences en vez de Preferences porque el editor de codigo (Android Studio) me lo ha indicado y he querido probar.
