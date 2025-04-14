
# 🛰️ Randy-API

**Randy-API** is a lightweight REST API written in Kotlin that exposes player status information (e.g., whether a player is in a match or in the lobby). It enables other services, such as Lobby and Match plugins, to communicate efficiently through HTTP.

> ✅ Runs as a standalone application — no Bukkit dependency required.

---

## 📦 Features

- 🔌 Lightweight REST server using Spark
- 🔐 Secured with authorization token
- 📡 Player information exposed via JSON
- ☕ Built for Java 11+

---

## 🚀 How to Build

### 📥 Clone the repository

```bash
git clone https://github.com/y4irr/Randy-API.git
cd Randy-API
```
## 🛠 Requirements
- Java 11 or later (Corretto, OpenJDK, etc.)

- Gradle (or use the built-in wrapper: ./gradlew)

## 🧱 Build the project
```bash
./gradlew build
```

### To run it directly:

```bash
./gradlew run
```

-----

## 🔐 Token-based Authentication

All endpoints require an ```Authorization``` header.

### Default token:
```java
Authorization: Bearer sexo-token-123
```
> You can change this value in RandyAPI.kt

```kotlin
val authToken = "sexo-token-123"
```
-----
## 🧪 Example Request
```bash
curl -H "Authorization: Bearer super-secret-token" http://localhost:4567/status/YairSoto
```
### Successful Response:
```json
{
  "uuid": "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
}
```