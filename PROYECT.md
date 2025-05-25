# Espacio Creativo - Art Gallery Management System

## Introduction

Espacio Creativo is a desktop application designed to manage an art gallery, streamlining operations for the owner and providing a seamless experience for customers. The system allows the gallery owner to manage artworks, artists, exhibitions, and sales, while customers can browse the gallery's collection, make purchases online, and request space rentals. This project is developed as part of the Software Analysis & Design course at Pontificia Universidad Javeriana, Bogotá.

The application is built using **JavaFX** for the graphical user interface and follows the **Model-View-Controller (MVC)** design pattern to ensure a separation of concerns between the business logic, data presentation, and data persistence.

---
## Architecture

The system is designed based on the **Model-View-Controller (MVC)** architectural pattern:

* **Model**: Represents the core data and business logic of the application. It includes classes for managing entities such as:
    * `Artista` (Artist): Manages artist information like name, biography, and their associated artworks and exhibitions. (e.g., `artista.java`)
    * `Obra` (Artwork): Handles details for different types of artworks including paintings, sculptures, and installations, each with specific attributes like price, creation date, dimensions, materials, images, and videos.
    * `Exposicion` (Exhibition): Manages exhibition details such as name, dates, description, and the list of artworks displayed.
    * `Comprador` (Buyer/Customer): Stores customer information required for purchases.
    * `Noticia` (News): Stores cultural news items related to the gallery.
    * `Banco` (Bank): Represents the banking system interaction for online payments. (e.g., `banco.java`)
    * Persistence is handled separately, currently suggested through text files (e.g., `ListaArtistas.txt`, `ListaObras.txt`, `compras.txt`) as seen in the project structure.

* **View**: Comprises the graphical user interface (GUI) built with **JavaFX**. It is responsible for displaying information to the user and capturing user input. Examples include:
    * `PantallaCrearExposicion.java`: UI for creating new exhibitions.
    * `PantallaCrearInforme.java`: UI for generating reports.
    * The application's visual theme adheres to the gallery's colors (blue/purple with light lilac) and aims for mobile device compatibility.

* **Controller**: Acts as the intermediary between the Model and the View. It processes user actions, updates the Model accordingly, and selects the appropriate View to display. Examples include:
    * `ControlEventosPrincipal.java`: Handles main application events and CRUD operations for artworks, artists, and exhibitions.
    * `controlEventosReserva.java`: Manages events related to space rental requests.

The project structure follows this pattern, with distinct packages for `model`, `view`, and `controlador` within the `src` directory.

---
## Features

The Espacio Creativo system offers a range of features for both the gallery owner and its customers:

### Owner Features:
* **Artwork Management**:
    * Add, view, modify, and delete artworks (Paintings, Sculptures, Installations) with detailed information.
    * Paintings: Store image, dimensions, technique, theme, classification.
    * Sculptures: Store video, material, weight, size.
    * Installations: Store list of materials and description.
* **Artist Management**: Add, view, modify, and delete artist profiles including biography and their works/exhibitions at the gallery.
* **Exhibition Management**: Create and manage exhibitions, specifying name, type, dates, description, and artworks (minimum 10 works required). (e.g., `PantallaCrearExposicion.java`)
* **Space Rental Management**:
    * Receive and review requests from artists/companies to rent gallery space.
    * Approve or deny rental requests, notifying the applicant via email.
* **News Management**: Post and display cultural news on the application's main window, including visual support like images and videos.
* **Sales Monitoring**:
    * Receive notifications when an artwork is purchased.
    * View reports on best-selling artists, sales summaries (filterable by month/year), and a list of works sold within a specific period. (e.g., `PantallaCrearInforme.java`)

### Customer Features:
* **Browse & Search**:
    * View detailed information about artists, artworks, and exhibitions.
    * Search for specific artists, artworks, or exhibitions based on criteria.
* **Artwork Purchase**:
    * Purchase artworks directly through the application.
    * Requires customer registration with details like name, email, phone, and address.
    * Dynamic pricing based on a monthly "fashion coefficient".
    * Secure online payment mechanism with bank integration.
    * Choose between home delivery or gallery pickup for purchased artworks.
    * Receive an email confirmation upon successful purchase.
* **Space Rental**: Submit requests to rent gallery space for exhibitions, providing details like date, duration, and purpose.

---
## Installation

To set up and run the Espacio Creativo project:

1.  **Prerequisites**:
    * Java Development Kit (JDK) 8 or higher.
    * Apache NetBeans IDE (the project appears to be structured for NetBeans).
    * JavaFX SDK (ensure it's configured in NetBeans if not using a JDK with JavaFX bundled).
2.  **Clone the Repository**:
    ```bash
    # Replace with your actual repository URL
    git clone [https://github.com/yourusername/espacio-creativo.git](https://github.com/yourusername/espacio-creativo.git)
    cd espacio-creativo
    ```
3.  **Open in NetBeans**:
    * Launch Apache NetBeans.
    * Go to `File > Open Project...` and navigate to the cloned project directory.
4.  **Build Project**:
    * Right-click on the project in the "Projects" pane.
    * Select "Clean and Build".
5.  **Run Project**:
    * Once the build is successful, right-click on the project again.
    * Select "Run".

---
## Usage

After successful installation and launching the application:

* The main window will appear, potentially displaying cultural news.
* **Gallery Owner**: Navigate through menus or sections to manage artists, artworks, exhibitions, review rental requests, and generate reports. Specific forms like "Crear Exposición" will allow data entry.
* **Customer**: Browse available artworks and exhibitions. Use search functionalities to find specific items. Registered users can proceed with purchasing artworks or submitting space rental requests.

---
## Configuration

* **Persistence**: The application currently appears to use text files for data persistence (e.g., `ListaArtistas.txt`, `ListaObras.txt`, `compras.txt`, `Noticias.txt`, `Solicitudes.txt`). These files are expected to be in the root directory of the project or a specific data directory.
* **Rental Tariffs**: The gallery owner can pre-set rental tariffs for gallery spaces. This might be configurable within the application or through a configuration file.
* **Fashion Coefficient**: Information for the monthly fashion coefficient, which affects artwork prices, can be consulted online and presumably updated in the system.
* **Email Notifications**: For email confirmations (sales, rental request status), email server settings (SMTP server, credentials) would need to be configured if this feature is fully implemented.
* **Bank Integration**: For online payments, details for connecting to the bank's system would be required and configured securely.

---
## Dependencies

* **Java Development Kit (JDK)**: Version 8 or higher.
* **JavaFX**: For the graphical user interface.
* _(Potentially)_ Libraries for:
    * Email (e.g., JavaMail API) for sending notifications.
    * Database connectivity (e.g., JDBC) if text file persistence is replaced.
    * Secure API communication for bank integration.

---
## Examples

The project includes various classes demonstrating the MVC pattern:

* **Model Example (`artista.java`)**:
    ```java
    package model;

    import java.util.ArrayList;
    import java.util.Date;

    public class artista {
        private String nombre;
        private String apellido;
        private Date fechaNacimiento;
        private String biografia;
        private ArrayList<obra> obras;
        private ArrayList<exposicion> exposiciones;

        // Constructor, getters, and setters...
        public artista(String nombre, String apellido, Date fechaNacimiento, String biografia) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaNacimiento = fechaNacimiento;
            this.biografia = biografia;
            obras = new ArrayList<>();
            exposiciones = new ArrayList<>();
        }
        // ...
    }
    ```

* **View Example (Snippet from `PantallaCrearExposicion.java`)**:
    ```java
    package view;
    // ... imports ...
    public class PantallaCrearExposicion extends javax.swing.JFrame {
        // ...initComponents(); ...
        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
            try {
                ControlEventosPrincipal c = new ControlEventosPrincipal();
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaInicio = formatoFecha.parse(jTextField4.getText());
                Date fechaFin = formatoFecha.parse(jTextField5.getText());
                String[] splitArray = jTextField6.getText().split("\\s*,\\s*");
                ArrayList<String> obrasElegidas = new ArrayList<>(Arrays.asList(splitArray));
                c.CrearExposicion(jTextField1.getText(), jTextField2.getText(), jTextField3.getText(), fechaInicio, fechaFin, jTextField7.getText(), obrasElegidas);
                JOptionPane.showMessageDialog(this, "!Exposicion Creada!", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            } catch (ParseException ex) {
                // ... logging ...
            }
        }
        // ...
    }
    ```

* **Controller Example (`ControlEventosPrincipal.java`)**:
    ```java
    package controlador;
    // ... imports ...
    public class ControlEventosPrincipal {
       private controlObrasArtistasExposicion co = new controlObrasArtistasExposicion();
       // ... other control instances ...

       public void CrearExposicion(String nombre, String tipo, String descripcion, Date fechaInicio, Date fechaFin, String horario, ArrayList<String> obras){
           co.llenarListas(); // Assumed to load data
           co.crearExposicion(nombre, tipo, descripcion, fechaInicio, fechaFin, horario, obras);
       }
       // ... other methods for CRUD operations and event handling ...
    }
    ```

---
## Troubleshooting

* **JavaFX Not Found**: Ensure your JDK includes JavaFX, or that the JavaFX SDK is correctly configured as a library in your Apache NetBeans project settings.
* **File Not Found Errors**: If using text file persistence, ensure the data files (e.g., `ListaObras.txt`) are present in the expected location and the application has read/write permissions.
* **Date Parsing Issues**: Dates entered in the UI must match the expected format (e.g., "dd/MM/yyyy" as seen in `PantallaCrearExposicion.java`).
* **Build Failures**: Check the NetBeans output window for specific error messages. Common issues include missing dependencies or syntax errors.

---
## Contributors

* Maria Paula Rodríguez Ruiz
* Daniel Felipe Castro Moreno
* Juan Enrique Rozo Tarache
* Gabriel Anibal Riaño

Pontificia Universidad Javeriana – Department of Systems Engineering
---
## License

This project is developed for educational purposes as part of the Software Analysis & Design course. No commercial license is granted.
