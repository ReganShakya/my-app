pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'echo "Building project"'
        //emailext(subject: 'Build Status', body: 'This is build status of thecurrent project', attachLog: true, from: 'reganshakya@gmail.com', to: 'regan@moco.com.np')
      }
    }

    stage('Test') {
      steps {
        sh 'echo "This is test"'
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
