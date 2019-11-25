pipeline {
	agent any

	stages {
		stage("Compile") {
			steps {
				sh "./calculator/gradlew compileJava"
			}
		}
		stage("Unit test") {
			steps {
				sh "./calculator/gradlew test"
			}
		}
	}
}