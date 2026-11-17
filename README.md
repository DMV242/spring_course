# Spring Boot Course

Travaux pratiques du cours Spring Boot (EPITA). Le dépôt contient trois projets Maven indépendants.

## Projets

| Dossier | Description |
|---|---|
| `coffeMachine/` | API REST de gestion de cafés : controller, service, repository, DTO, mapper et validation des entrées. |
| `demoExplicite/` | Démo d'injection de dépendances avec une configuration **explicite** (`ReportConfig`). |
| `demoimplicite/` | Même démo avec une configuration **implicite** (détection automatique des composants). |

## Prérequis

- Java 25
- Maven (le wrapper `./mvnw` est fourni dans chaque projet)

## Lancer un projet

```bash
cd coffeMachine        # ou demoExplicite / demoimplicite
./mvnw spring-boot:run
```

Lancer les tests :

```bash
./mvnw test
```

## API `coffeMachine`

L'application écoute sur `http://localhost:8080`.

| Méthode | URL | Description |
|---|---|---|
| `GET` | `/coffees` | Liste tous les cafés |
| `GET` | `/coffees/{id}` | Retourne un café, ou 404 s'il n'existe pas |
| `POST` | `/coffees` | Crée un café |

Exemple de création :

```bash
curl -X POST localhost:8080/coffees \
  -H 'Content-Type: application/json' \
  -d '{"name":"Cappuccino","price":50}'
```

Le nom ne doit pas être vide et le prix doit être strictement positif. En cas d'erreur de validation, l'API répond avec un `ProblemDetail` (JSON) listant les erreurs par champ.

## Auteur

David MVOULA
