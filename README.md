# Java IV Spring IoC Labs

Spring Inversion of Control (IoC) configuration labs

## Objective

This repository has three labs:
1. Configuring Spring with XML located in the [xml-config](xml-config) directory
1. Configuring Spring with Java located in the [java-config](java-config) directory
1. Configuring Spring with annotations located in the [annotation-config](annotation-config) directory

For each of the three labs:
* Find the JUnit Test provided which is located under ``src/test/java/edu/cscc/java4/spring/ioc/config/``
* One by one, uncomment each test, changing just enough code or configuration to
make the test pass

## Getting Started:

1. Copy the starter code from here into a new, private repository in your personal GitHub account using [these instructions](https://github.com/jeff-anderson-cscc/submitting-assignments-lab#copy-the-starter-code-into-a-new-private-repository-in-your-personal-github-account) substituting this repository URL ``https://github.com/jeff-anderson-cscc/java4-labs-spring-ioc.git`` for the one referenced in that document
2. Create a new branch for your code changes as described in [these instructions](https://github.com/jeff-anderson-cscc/submitting-assignments-lab#before-you-start-coding)

## Completing the Assignment

__Important__ You will want to create a separate IntelliJ project for each of the three subdirectories.
Also, you may not change the code in any test cases. _The only permissible difference between the base version of each JUnit test class and yours is yours will have no tests commented out and the file is otherwise identical._

### XML-based Configuration Lab
1. Start IntelliJ and, if necessary, close the last project you had open
1. Choose "Open" from the IntelliJ IDEA welcome screen
1. From the file navigator, choose ``xml-config`` under ``labs/java4-labs-spring-ioc``
1. Press OK so the project will open and IntelliJ will import it
1. __NOTE:__ The Community edition doesn't automatically configure all Spring artifacts so, if necessary, create a "resources" directory under ``src/main``
1. Open ``XmlConfigTests`` in the editor
1. Move the /* -- top block comment line to below the first Test
1. Right click in the editor window and choose "Run XmlConfigTests"
1. Change just enough code / configuration to make that test pass
1. Repeat the last 3 steps until every test method runs without error

Once you are done, commit your changes using "VCS" -> "Commit":
* Make sure the commit includes any new files you created
* Enter a proper comment
* Uncheck "Perform code analysis"

Finally, Choose "File" -> "Close Project" before starting on the next lab

### Java-based Configuration Lab
1. Choose "Open" from the IntelliJ IDEA welcome screen
1. From the file navigator, choose ``java-config`` under ``labs/java4-labs-spring-ioc``
1. Press OK so the project will open and IntelliJ will import it
1. Repeat the process you followed in the previous lab using tests defined in
``JavaConfigTests``
1. Commit your changes
1. Close the Project

### Annotation-based Configuration Lab
1. Choose "Open" from the IntelliJ IDEA welcome screen
1. From the file navigator, choose ``annotation-config`` under ``labs/java4-labs-spring-ioc``
1. Press OK so the project will open and IntelliJ will import it
1. Repeat the process you followed in the previous lab using tests defined in
``AnnotationConfigTests``
1. Commit your changes
1. Close the Project

## Submitting Your Work

1. Create a pull request for your branch using [these instructions](https://github.com/jeff-anderson-cscc/submitting-assignments-lab#once-you-are-ready-to-submit-your-work-for-grading)
1. Submit the assignment in Blackboard as described in [these instructions](https://github.com/jeff-anderson-cscc/submitting-assignments-lab#once-your-pull-request-is-created-and-i-am-added-as-a-reviewer)

__NOTE: I will provide feedback via. comments in your pull request.__
If you need to amend your work after you issue your initial pull request:

1. Commit your updates
1. Push your changes to gitHub
1. Verify the new commits were automatically added to your open pull request
