pipeline {
  agent any
  stages {
    stage("Build") {
        parallel {
            stage("master") {
                when { expression { env.BRANCH_NAME == "master" } }
                steps {
                    sh "echo 'Pulling...' + env.BRANCH_NAME"
                }
            }
            stage("PRE") {
                when { env.BRANCH_NAME != "master" } }
                steps {
                    sh "Not pushed in master branch"
                    sh "echo 'Pulling...' + env.BRANCH_NAME"
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
