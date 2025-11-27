# 🌱 AgroPrecisionApp  
**Plataforma de Agricultura Inteligente para Pequeños Productores**

AgroPrecisionApp es una aplicación desarrollada para apoyar a pequeños agricultores mediante el monitoreo de cultivos con sensores, análisis inteligente de datos y generación de recomendaciones automáticas. Este proyecto integra IoT, modelos de predicción y gestión avanzada de parcelas, brindando una herramienta accesible para mejorar la productividad agrícola.

---

## 🚀 Características principales

### 🔹 Monitoreo en tiempo real
- Lectura de sensores de **humedad**, **temperatura**, **luminosidad**, **pH**, entre otros parámetros.
- Visualización clara de información relevante para el agricultor.

### 🔹 Gestión de información agrícola
- Módulos para administrar **parcelas**, **cultivos**, **agricultores**, **sensores** y **registros de lecturas**.
- Interfaz basada en formularios Java Swing organizada mediante el patrón **MVC**.

### 🔹 Inteligencia Artificial básica
- Módulo **PredicciónIA** para análisis inicial de condiciones críticas según lecturas.
- Módulo **Recomendación** que genera sugerencias automáticas orientadas al manejo del cultivo.

### 🔹 Seguridad y respaldo de datos
- Base de datos SQL Server con respaldo `.bak` incluido.
- Arquitectura orientada a capas: modelo, vista, controlador, recursos.

---

## 🧱 Arquitectura del proyecto

El proyecto adopta el patrón **Modelo–Vista–Controlador (MVC)** y estructura modular organizada en paquetes.

### 📂 Estructura principal


Archivos y carpetas generadas por NetBeans:


---

## 🗄 Base de Datos (SQL Server)

El repositorio incluye un respaldo preparado para restauración:

📁 **database/backup/AgroDB_Simple.bak**

Este backup contiene las tablas esenciales:

- Agricultor  
- Sensor  
- LecturaSensor  
- Cultivo  
- Parcela  
- Recomendaciones  
- Usuario  

### 🔧 Restauración del backup

1. Abrir **SQL Server Management Studio**.
2. Clic derecho en **Databases** → **Restore Database**.
3. Seleccionar **Device** → Buscar archivo `.bak`.
4. Confirmar y restaurar.

---

## 🖥 Tecnologías utilizadas

- **Java (NetBeans)**
- **Swing** para interfaz gráfica
- **SQL Server 2019/2022**
- **JDBC** para conexión con BD
- **Git & GitHub**
- Arquitectura **MVC**
- Algoritmos básicos de IA para predicción y recomendaciones

---

## 📦 Instalación y ejecución

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/GianKJ/AgroPrecisionApp.git
