pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh "echo 'Development branch created'"
        echo 'Pulling...' + env.BRANCH_NAME

        script {
            if (env.BRANCH_NAME == 'master') {
                sh 'echo "Building project"'
                emailext(subject: 'Build Status', body: 'This is build status of thecurrent project', attachLog: true, from: 'reganshakya@gmail.com', to: 'regan@moco.com.np')
            }
            if (env.BRANCH_NAME != 'master') {
                sh 'echo "Not pushed to master."'
                echo 'Pulling...' + env.BRANCH_NAME
                sh 'mvn clean install'
                sh 'cd target'
                sh 'java -jar my-app-1.0-SNAPSHOT.jar'
            }
        }
      }
    }

    stage('Test') {
      steps {
        sh 'echo "This is updated test again"'
	sh 'echo "Test is completed"'
      }
    }

    stage('Deploy') {
      steps {
        sh 'echo "Deploying"'
        sh 'echo "Deployment is complete"'
      }
    }

  }
}
