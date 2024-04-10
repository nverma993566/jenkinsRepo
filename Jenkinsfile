pipeline {
    agent any
    environment {
        JAVA_HOME = 'C:\.Net & Java Software\java-11-openjdk-11.0.15.9-4.windows.redhat.x86_64\bin\java.exe'
        MAVEN_HOME = 'C:\apache-maven-3.9.6\bin\mvn'
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/nverma993566/jenkinsRepo.git'
            }
        }
        stage('Build') {
            steps {
                sh '''
                    cd C:\Users\saumyapatel\eclipse-workspace\maven
                    ${MAVEN_HOME}/bin/mvn clean package
                '''
            }
        }
        stage('Test') {
            steps {
                sh '''
                    cd C:\Users\saumyapatel\eclipse-workspace\maven
                    ${MAVEN_HOME}/bin/mvn test
                '''
            }
        }
        stage('Deploy') {
            steps {
                sh '''
                    cd C:\Users\saumyapatel\eclipse-workspace\maven
                    # Add commands to deploy your application
                '''
            }
        }
    }
}
