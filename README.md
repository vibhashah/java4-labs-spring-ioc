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

## Prerequisites

* Create a "labs" directory if you don't already have one by opening a terminal
and typing:
``mkdir ~/labs``

## Getting Started:

1. __Fork__ this repository (__don't__ "Clone or download" directly from my repository)
1. Open a terminal and change to your labs directory:
``cd ~/labs``
1. After the repo has been forked to your GitHub account, click on "Clone or download"
1. Click on the clipboard icon in the dropdown that appears to copy the URL
1. Go back to your terminal and type: ``git clone `` (with a trailing space)
1. In the terminal window, choose "Edit" -> "Paste"
1. Press Enter

If all goes well you should see something like:
```
Cloning into 'java4-labs-spring-ioc'...
remote: Enumerating objects: 61, done.
remote: Counting objects: 100% (61/61), done.
remote: Compressing objects: 100% (24/24), done.
remote: Total 61 (delta 5), reused 61 (delta 5), pack-reused 0
Unpacking objects: 100% (61/61), done.
```

## Completing the Assignment

__Important__ You will want to create a separate IntelliJ project for each of the three subdirectories.
Also, you may not change the code in any test cases. _The only permissible difference between the base version of each JUnit test class is yours will have no tests commented out but the file is otherwise identical._

### XML-based Configuration Lab
1. Start IntelliJ and, if necessary, close the last project you had open
1. Choose "Open" from the IntelliJ IDEA welcome screen
1. From the file navigator, choose ``xml-config`` under ``labs/java4-labs-spring-ioc``
1. Press OK so the project will open and IntelliJ will import it
1. __NOTE:__ The Community edition doesn't automatically configure all Spring artifacts
If necessary, create a "resources" directory under ``src/main``
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
1. Close the Project-

### Annotation-based Configuration Lab
1. Choose "Open" from the IntelliJ IDEA welcome screen
1. From the file navigator, choose ``annotation-config`` under ``labs/java4-labs-spring-ioc``
1. Press OK so the project will open and IntelliJ will import it
1. Repeat the process you followed in the previous lab using tests defined in
``AnnotationConfigTests``
1. Commit your changes
1. Close the Project

## Submitting Your Work

1. Open a terminal
1. Change to the main directory for these labs: ``cd ~/labs/java4-labs-spring-ioc``
1. Push your changes to GitHub: ``git push origin master``
1. Navigate to your copy of the repository in GitHub
1. Click "New Pull Request"
1. From the "Comparing changes" view, click "Create pull request"
1. Enter a proper tile and comments in the "Open a pull request" view
1. Click "Create pull request"
1. Verify your pull request is pending in the [main repository pulls list](https://github.com/jeff-anderson-cscc/java4-labs-spring-ioc/pulls)

__NOTE:__ I will provide feedback via. comments in your pull request.
If you need to amend your work after you issue your initial pull request:

1. Commit your updates
1. Push your changes to gitHub
1. Verify the new commits were automatically added to your open pull request
