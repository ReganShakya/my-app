pipeline {
  environment {
     BRANCH_NAME = "${GIT_BRANCH.split("/")[1]}"
  }
  agent any
  stages {
    stage('build') {
      steps {
        sh 'echo "Pulling..." + env.BRANCH_NAME
        sh 'echo "Building project"'
        emailext(subject: 'Build Status', body: 'This is build status of thecurrent project', attachLog: true, from: 'reganshakya@gmail.com', to: 'regan@moco.com.np')
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
