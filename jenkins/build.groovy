pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building ...'
                withMaven(maven: 'maven-3') {
                    sh "mvn clean"
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing ...'
                withMaven(maven: 'maven-3') {
                     'mvn test'
                }
            }
        }
        stage('Reporting') {
            steps {
                echo 'Reporting ...'
            }
        }
    }
}
