pipeline {
    agent any
    stages {
        stage('---clean---') {
            steps {
                sh "mvn clean"
                emailext(subject: 'Clean Statis", body: 'This is the clean status of the current project', attachlog: true, from:'reganshakya@gmail.com', to:'regan@moco.com.np')
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
            }
        }
    }
}
