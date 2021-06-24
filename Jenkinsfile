pipeline {
    agent any
    environment {
    	NEW_VERSION = '1.0.0'
    	SERVER_CREDENTIALS = credentials('server-credentials')
    }
    stages {
        stage('---clean---') {
            steps {
                sh "mvn clean"
                echo 'Bleaning version ${NEW_VERSION}
            }
        }
        stage('---Test---') {
            steps {
                sh "mvn test"
            }
        }
        stage('---package---') {
            steps {
                sh "mvn package"
                echo "Packaging with ${SERVER_CREDENTIALS}"
                sh "${SERVER_CREDENTIALS}"            }
        }
    }
}
