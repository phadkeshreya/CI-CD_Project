# Use OpenJDK base image
FROM openjdk:17

# Set working directory inside container
WORKDIR /app

# Copy source code
COPY src/ ./src/

# Compile Java code
RUN javac src/com/taskmanager/model/Task.java \
            src/com/taskmanager/service/TaskService.java \
            src/com/taskmanager/controller/TaskController.java \
            src/com/taskmanager/Main.java

# Set entry point
CMD ["java", "-cp", "src", "com.taskmanager.Main"]
