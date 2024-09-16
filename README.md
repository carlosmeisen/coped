# Coped

Coped is a Kotlin Multiplatform application for organizing and managing group events. The initial MVP release will focus on sports events, but the app is designed to be scalable and accommodate various types of events in the future. Coped allows users to create, join, and participate in events across multiple platforms, including Android, iOS, and web.

## Features

- Create and manage groups for various types of events
- View and join upcoming events within each group
- User profiles with customizable preferences (e.g., preferred roles in events)
- Cross-platform compatibility (Android, iOS, web)
- Local data storage using Room database

## Getting Started

### Prerequisites

- Android Studio
- Kotlin Multiplatform plugin
- Compose Multiplatform dependencies

### Installation

1. Clone the repository:

   ```
   git clone https://github.com/carlosmeisen/coped.git
   ```

2. Open the project in Android Studio.

3. Set up the required dependencies for Kotlin Multiplatform, Compose Multiplatform, and Room database.

4. Build and run the project on your desired target platform.

## Architecture

Coped follows an MVVM (Model-View-ViewModel) architecture pattern, leveraging Kotlin Multiplatform and Compose Multiplatform for shared code and UI across platforms.

- Shared module: Contains common business logic, data models, and network calls.
- Platform-specific modules: Implement platform-specific functionality using expect/actual declarations.
- Koin: Used for dependency injection.
- Coroutines: Used for asynchronous programming and handling concurrency.
- Room: Used for local data storage on Android.

## Roadmap

- [ ] MVP release with core functionality for sports events on Android, iOS, and web
- [ ] Expand to support various types of events beyond sports
- [ ] Integration with payment methods (e.g., MBWay) for event payments
- [ ] Geolocation-based event recommendations
- [ ] Wearable device support for receiving alerts and notifications

## License

Copyright (c) 2024 Carlos Meisen. All rights reserved.

No license is granted for this project. The source code is provided for viewing purposes only. You are not permitted to use, modify, distribute, sublicense, or sell the software in any way without explicit permission from the author.

Please note that this project is currently not open to outside contributions. Pull requests and merge requests will not be accepted.

## Contact

For any questions or inquiries, please contact the project maintainer:

Carlos Meisen
carlosmeisen@hotmail.com
