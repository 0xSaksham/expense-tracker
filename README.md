# 📌 **Expense Tracker – Full-Stack Application**

A modern **full-stack personal finance tracker** built with:

* 🟦 **Spring Boot 4 (Java 17)**
* 🟩 **Angular 17 + Tailwind CSS**
* 🟨 **REST API (JWT planned)**
* 🟪 **H2 In-Memory DB for Dev**
* 🟫 **MySQL/Postgres planned**
* 🐳 **Docker (upcoming)**

This project demonstrates **production-style architecture, real authentication workflows, a polished UI, and scalable backend design.**

---

## 🚀 **Why I Built This**

I wanted to become a **complete Java full-stack developer**, mastering:

* Enterprise-grade Spring Boot backend patterns
* Modern Angular SPA development
* Modular monorepo folder structure
* Authentication and secure APIs
* Pagination, filtering, analytics
* Deployable full-stack architecture

This project becomes a **portfolio-ready showcase** for hiring managers.

---

## 🏗️ **Project Structure (Monorepo)**

```
expense-tracker/
│
├── expense-tracker-ui/          # Angular 17 + Tailwind Frontend
│   ├── components/
│   ├── pages/
│   ├── services/
│   └── ...
│
└── expense-tracker-backend/     # Spring Boot 4 Backend
    ├── controller/
    ├── service/
    ├── repository/
    ├── entity/
    ├── dto/
    ├── config/
    └── ...
```

This mirrors **real team development style**.

---

## 🧩 **Core Features**

### 🟢 Implemented

- ✔ Angular project structure (navbar, routing, pages)
- ✔ Spring Boot backend running on port 8080
- ✔ H2 in-memory database
- ✔ Basic REST endpoint (`/api/hello`)
- ✔ Security config allowing public APIs

### 🟡 In Progress

- ⏳ User registration API
- ⏳ CRUD APIs for expenses
- ⏳ Save users in database

### 🟣 Upcoming (Planned Enhancements)

- 🔥 JWT Authentication & Authorization
- 🔥 Expense reporting dashboards
- 🔥 Pagination + Search filtering
- 🔥 Categorization & tagging
- 🔥 Role-based UI (User/Admin)
- 🔥 Docker Compose for full-stack deployment

---

## 🛠 **Tech Stack**

### 🟦 Backend

* Java 17
* Spring Boot 4.0.0
* Spring Data JPA
* Spring Security
* H2 Database (Dev Mode)
* Lombok
* Maven

### 🟩 Frontend

* Angular 17
* Tailwind CSS
* TypeScript
* Angular Routing
* Angular Services + HttpClient (soon)

---

## 🐳 Infra (Roadmap)

* Docker
* Docker Compose for multi-service deploy
* CI/CD (GitHub Actions)

---

## 🌐 **API Endpoints (Current)**

| Method | Endpoint     | Description           |
| ------ | ------------ | --------------------- |
| GET    | `/api/hello` | Backend test endpoint |

More endpoints coming soon.

---

## 🧪 **Run Backend**

```bash
cd expense-tracker-backend
./mvnw spring-boot:run
```

App runs at:

```
http://localhost:8080
```

Test endpoint:

```
http://localhost:8080/api/hello
```

H2 console:

```
http://localhost:8080/h2-console
```

---

## 🧪 **Run Frontend**

```bash
cd expense-tracker-ui
ng serve -o
```

Runs at:

```
http://localhost:4200
```

---

## 🔐 Security Status

Spring Security added — currently configured to **allow API access in development**:

```java
csrf.disable()
permitAll()
```

JWT authentication coming next.

---

## 🧠 Learning Outcomes (So Far)

* Angular component-based architecture
* Routing with router-outlet
* Spring Boot 4 development environment setup
* In-memory DB lifecycle
* API exposure
* Spring Security configuration

Next outcomes:

* DTO converters
* BCrypt encoding
* JWT filters
* Database schema design
* Angular Reactive Forms

---

## 🗺️ Roadmap

### 📅 Phase 1 — Backend Foundation

* User Entity
* UserRepository
* Register API
* Password hashing
* Exception handling

### 📅 Phase 2 — Frontend Auth

* Register form
* Login form
* Validation
* AuthGuard
* JWT attach to HttpInterceptor

### 📅 Phase 3 — Expense Module

* Expense entity + CRUD
* Pagination
* Analytics charts

### 📅 Phase 4 — Deployment

* Dockerized backend
* Dockerized frontend
* Docker Compose orchestration

---

## 💡 Professional Impact

This project showcases:

- ✔ Full-stack delivery capability
- ✔ Enterprise-style architecture
- ✔ Secure authentication practices
- ✔ REST API design
- ✔ UI/UX with Angular
- ✔ Backend performance basics
- ✔ Database integrations

Perfect for **Java Developer, Backend Engineer, Full-Stack Developer** roles.

---

## 🤝 Contributions

Open for:

* UI enhancement PRs
* Suggestions for features
* Code reviews

---

## 📬 Contact

**Developer:** Saksham Gupta

**Working Toward:** Full-Stack Java Angular Developer

🌐 *Add your LinkedIn link here*

---

## ⭐ If you like this project

Star ⭐ the repo

Fork 🍴 it

Watch 👀 updates

Because version by version — this will evolve into a **production-quality portfolio project.** 🚀
