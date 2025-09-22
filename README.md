🛒 ECommerceApp - Integración de Métodos de Pago

Este proyecto demuestra cómo integrar múltiples métodos de pago (Tarjeta de crédito, PayPal y Criptomonedas) en una aplicación de comercio electrónico utilizando el Patrón de Diseño Estructural Adapter.

El objetivo es unificar diferentes interfaces de servicios externos de pago dentro de una sola interfaz común (PaymentProcessor), de manera que el sistema pueda usarlos de forma consistente sin modificar el código original de cada servicio.


📌 Patrón aplicado: Adapter

Problema: Cada método de pago (CreditCardService, PayPalService, CryptoService) tiene su propia interfaz distinta.

Solución: Crear adaptadores (CreditCardAdapter, PayPalAdapter, CryptoAdapter) que implementen la interfaz común PaymentProcessor.

Beneficio: La aplicación (ECommerceApp) puede procesar pagos de cualquier tipo sin preocuparse de las diferencias entre servicios.


▶️ Ejecución

Clonar el repositorio.

Abrir en IntelliJ IDEA (o cualquier IDE con soporte Maven/Java).

Ejecutar la clase Main.java.

Usar el menú en consola:


📖 Conclusión

Este proyecto demuestra cómo el Patrón Adapter permite integrar sistemas externos con diferentes interfaces de manera uniforme, facilitando la escalabilidad y el mantenimiento del código.
