# :video_game: DSList - Intensivão Java Spring

## :pushpin: About
This application is a REST API for managing a list of games. The games are organized by genre and it is possible to modify their order according to the user's needs. The system's **backend** was developed in `JAVA`, using the `Spring Framework`, and the application's package management was done with `Maven`.

## ⚙️ Features

- 🔀 Sorting of games by genre.
- 🔄 Possibility to change the order of games.

## 🛠️ Technologies Used
- ☕ Java Spring Boot
- 🗄️ Database (🐘 PostgreSQL H2 database)
  
## 🏛️ Domain Model
![image](https://github.com/user-attachments/assets/2c4260a1-d4e9-4805-9979-14e930a9f23c)


## 📌 Requirements
- ☕ Java 17+
- 🏗️Maven
- 🗄️ Database configured
- 🛠️ Postman or other tool for 🌍 API testing

## 🚀 Installation
1. 📥 Clone the repository:
   ```bash
   git clone https://github.com/devsuperior/dslist-backend.git
   ```
2. 📂 Access the project directory:
   ```bash
   cddslist
   ```
3. ⚙️ Configure the 🗄️ database in `application.properties` or `application.yml`.
4. ▶️ Compile and run the project:
   ```bash
   mvn spring-boot:run
   ```## 🚀 Installation
1. 📥 Clone the repository:
   ```bash
   git clone https://github.com/devsuperior/dslist-backend.git
   ```
2. 📂 Access the project directory:
   ```bash
   cddslist
   ```
3. ⚙️ Configure the 🗄️ database in `application.properties` or `application.yml`.
4. ▶️ Compile and run the project:
   ```bash
   mvn spring-boot:run
   ```
   
## 🔗 Main Endpoints
- `GET /games` - 📜 Returns the complete 📋 list of 🎮 games with just a few pieces of information.
- `GET /games/{id}` - 📜 Returns a game 🎮 specified by ID with complete information.
- `GET /list` - 📜 Returns the complete 📋 list of 🎮 games.
- `GET /list/{listId}/games` - 📜 Returns the 📋 list of 🎮 games ordered by the 🎭 genre chosen in the ID.
- `POST /list/{listId}/replacement` - 🔄 Changes the 📋 order of 🎮 games.

## 📜 License
This project is under the 📜 MIT license. See the `LICENSE` file for more details.

