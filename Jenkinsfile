pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        GIT_BRANCH_LOCAL = sh (
            script: "echo $Branch | sed -e 's|origin/||g'",
            returnStdout: true
        ).trim()
        echo "Git branch: ${GIT_BRANCH_LOCAL}"
        sh 'echo "Pulling..." + GIT_BRANCH_LOCAL 
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
