# Project Owl 

## What is Project Owl?
Project Owl is a card based Pen and Paper Role Play Game. This Projects is used for the development of the project. 
It is used to calculate the probabilities of the different combinations of player decks and challenge decks.
This project was created from https://start.vaadin.com. It's a fully working Vaadin application.

The project is a standard Maven project, so you can import it to your IDE of choice. You'll need to have Java 8+ and Node.js 10+ installed.

To run from the command line, use `mvn` and open [http://localhost:8080](http://localhost:8080) in your browser.

## Project structure

- `MainView.java` in `src/main/java` contains the navigation setup. It uses [App Layout](https://vaadin.com/components/vaadin-app-layout).
- `views` package in `src/main/java` contains the server-side Java views of your application.
- `views` folder in `frontend/src/` contains the client-side JavaScript views of your application.
- `backend` package contains the business logic and the dataComponent which is used to persist the application state.
