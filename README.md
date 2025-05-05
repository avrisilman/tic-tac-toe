# Tic Tac Toe Java Web Game

A configurable Tic-Tac-Toe game built with **Java Spring Boot** and **Thymeleaf**, using **OOP principles** and **clean code architecture**.

---

## 🚀 How to Run This App with IntelliJ IDEA

### ✅ Requirements

- Java JDK 11 or later
- IntelliJ IDEA (Community Edition is fine)
- Maven (or use IntelliJ’s built-in Maven support)

---

### 🛠️ Steps to Open and Run

#### 1. Open the Project
- Open IntelliJ IDEA
- Choose `File` → `Open...`
- Select the root folder where `pom.xml` is located

#### 2. Import Dependencies
- IntelliJ will automatically detect the Maven project
- If not: right-click `pom.xml` → `Add as Maven Project`
- Wait until indexing and build are complete

#### 3. Run the App
- Navigate to: `src/main/java/com/example/tictactoe/TicTacToeApplication.java`
- Right-click the file → `Run 'TicTacToeApplication.main()'`

#### 4. Access in Browser
Open your browser and go to:
```
http://localhost:8080
```

You’ll see the Tic Tac Toe start page.

---

## 🖥️ Run via Terminal / Console

Jika kamu tidak menggunakan IntelliJ, kamu bisa juga menjalankan aplikasi lewat terminal:

#### 1. Buka terminal di root folder proyek (yang berisi `pom.xml`)

#### 2. Compile dan Run menggunakan Maven
```bash
mvn spring-boot:run
```

#### 3. Akses di browser
```
http://localhost:8080
```

---

### 📂 Project Structure (Overview)

```
src/
├── main/
│   ├── java/com/example/tictactoe/
│   │   ├── TicTacToeApplication.java       # Main Spring Boot App
│   │   ├── controller/GameController.java  # Handles web requests
│   │   ├── service/GameService.java        # Game logic
│   │   └── model/Board.java                # Game board state
│   └── resources/
│       ├── templates/
│       │   ├── index.html                  # Start form
│       │   └── game.html                   # Game board UI
│       └── application.properties          # (Optional) Config file
```

---

### 🧪 Optional Configuration

**Change Port (default: 8080)**

Edit or create `src/main/resources/application.properties`:
```properties
server.port=8081
```

---

Created by (Afris Ilman Ilman Nafian) with 💡 using Spring Boot.
