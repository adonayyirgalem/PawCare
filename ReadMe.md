# PawCare: Animal Rescue, Shelter Management, and Adoption System

## About the Projects
Animal rescue organizations play an important role in protecting abandoned, stray, and neglected animals. However, managing rescued animals, maintaining medical records, coordinating volunteers, and processing adoption applications can become challenging when information is handled manually or through disconnected records. These challenges can result in disorganized information, delays in adoption procedures, and difficulties monitoring the health and welfare of rescued animals.

To address these challenges, our group proposes developing **PawCare**, an Animal Rescue, Shelter Management, and Adoption System. The system provides a centralized platform for animal shelters to manage rescued animals, maintain medical records, organize adoption procedures, and coordinate shelter activities. The application is developed using Java and applies object-oriented programming (OOP) principles to create a structured, maintainable, and functional system.

## Objectives
The main objective is to develop a Java-based application that simplifies the management of animal rescue and adoption activities. Specifically, the application will:
- Register and manage rescued animals.
- Maintain medical records and monitor animal health.
- Simplify adoption applications, reviews, and approvals.
- Manage adopter and volunteer information.
- Monitor shelter capacity and available resources.
- Generate reports about rescue and adoption activities.
- Apply encapsulation, inheritance, polymorphism, and abstraction.

## Proposed System
The PawCare system is structured around key workflows that streamline animal shelter management from initial rescue to adoption. Staff can register rescued animals with unique IDs, log medical treatments, and track health histories. The platform facilitates adopter registration, preference matching, and application processing, updating animal availability upon approval. 

Additionally, PawCare organizes volunteer schedules and tasks, monitors shelter capacity and inventory levels with low-stock alerts, and compiles operational metrics into comprehensive reporting dashboards.

## Key Functionalities

* **Animal Registration and Management**
  Registers rescued animals with an identification number, name, species, breed, age, gender, rescue location, and health status. Users can update, search, and manage animal records.
* **Medical Records Management**
  Stores vaccinations, diagnoses, treatments, and medical appointments for each animal.
* **Adoption Management**
  Registers applications, supports reviewing and approving or rejecting them, tracks statuses, and updates animal availability after adoption.
* **Adopter Management**
  Maintains adopter contact details and preferences and suggests animals based on suitable characteristics.
* **Volunteer Management**
  Registers volunteers, stores their skills and availability, and assigns shelter tasks.
* **Shelter and Resource Management**
  Monitors shelter capacity, available spaces, food, and medical supplies, including low-stock alerts.
* **Reports and Dashboard**
  Summarizes rescued animals, available animals, completed adoptions, pending applications, and shelter occupancy.

## Object-Oriented Programming (OOP) Concepts
The project demonstrates the use of fundamental OOP principles:
- **Encapsulation:** Private attributes and controlled access through constructors, getters, and setters protect information stored in classes.
- **Inheritance:** An abstract `Animal` class can be extended by specific animal types such as `Dog` and `Cat`.
- **Polymorphism:** Overridden methods allow different animal types to provide their own implementations.
- **Abstraction:** Abstract classes and interfaces define common structures and behaviors.
- **Association and Composition:** Animals are connected to medical records, adopters are connected to applications, and volunteers are connected to assigned tasks.

## Tools and Technologies

| Technology | Purpose |
| :--- | :--- |
| **Java** | Main programming language |
| **IntelliJ IDEA / Eclipse** | Development environment |
| **Java Swing** | Graphical user interface (GUI) |
| **ArrayList and HashMap** | Managing application records (Data Structures) |
| **File Handling** | Saving and retrieving information |
| **Git and GitHub** | Version control and team collaboration |

## Expected Outcome
At the end of the project, we expect to develop a functional animal rescue and adoption management application that simplifies shelter activities. The system will provide an organized way to manage rescued animals, track medical histories, process adoption applications, coordinate volunteers, and monitor shelter resources. The project will also provide practical experience in Java programming, OOP design, GUI development, data structures, file handling, and collaborative software development.