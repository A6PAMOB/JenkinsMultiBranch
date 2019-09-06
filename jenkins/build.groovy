pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                withMaven "mvn clean"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                withMaven 'mvn test'
            }
        }
        stage('Reporting') {
            steps {

            }
        }
    }
}
