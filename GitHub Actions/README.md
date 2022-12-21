## INTRODUCTION
GitHub Actions helps developers to automate the software development workflows from within GitHub. One can deploy workflows in the same place where you store code and collaborate on pull requests and issues.

## TABLE OF CONTENT
* [What is CI/CD?](#cicd)
* [The need of CI/CD](#the-need-of-cicd)
* [GitHub Actions](#github-actions)
    * [Workflow in GitHub Actions](#github-actions-workflow)
    * [YAML](#yaml)
    * [Types of GitHub Actions](#types-of-github-actions)
* [Creating a simple Workflow](#creating-a-simple-workflow)
  * [Initialising a workflow](#initialising-a-workflow)
  * [Defining workflow triggerers](#define-when-the-workflow-will-be-triggered)
  * [Defining Jobs in the workflow](#defining-jobs-in-the-workflow)
* [Activities](#activities)
  * [Activity 1](#activity-1)
  * [Activity 2](#activity-2)
  * [Activity 3](#activity-3)
  * [Activity 4](#activity-4)
* [References](#references)

## CI/CD
CI/CD is a method to **rapidly** deliver services to customers by introducing **automation** into the stages of app development. 
CI stands for Continuous Integration and CD stands for Continuous deivery or Continuous Deployment.
CI/CD is a solution to the problems integrating new code can cause for development and operations teams.

## The need of CI/CD
* Ensure superior code quality
* Deliver faster with an accelerated release rate
* CI/CD pipelines: Automation reduces the cost
* Fault isolation
* Simplified rollback
* Continuous feedback
* Optimum transparency and accountability
* Improved monitoring of data
* Reduction of non-critical defects in backlog

## GitHub Actions 
GitHub Actions are **packaged scripts** to automate tasks in a software development **workflow** in GitHub.

The processes (or **GitHub Events**) like the creation of a *pull request, committing your code, pushing into the production/ any branch*, etc can be monitored by GitHub actions, and hence when an event occurs the workflow is triggered.

### Github Actions Workflow
A GitHub Actions Workflow is a process that you set up in your repository to automate software development life cycle tasks. It is a configurable automated process made up of one or more jobs.

One must create a YAML file to define the workflow configuration.

### YAML
YAML stands for **Yet Another Markup Language** or **YAML ain’t markup language"**. It is a serialization language (like XML , JSON , etc) that has steadily increased in popularity over the last few years. ​
It is a superset of JSON and it uses Python-style indentation to indicate nesting.​ There are no usual format symbols, such as *braces, square brackets, closing tags, or quotation marks​* used in YAML , instead the structure of YAML file is a map or a list.

Below is a sample YAML file : (YAML uses .yml or .yaml extensions)
```
---
 doe: "a deer, a female deer"
 ray: "a drop of golden sun"
 pi: 3.14159
 xmas: true
 french-hens: 3
 calling-birds:
   - huey
   - dewey
   - louie
   - fred
 xmas-fifth-day:
   calling-birds: four
   french-hens: 3
   golden-rings: 5
   partridges:
     count: 1
     location: "a pear tree"
   turtle-doves: two
```
For detailed information on YAML refer to the following YAML documentation : 
* https://learnxinyminutes.com/docs/yaml/
* https://docs.ansible.com/ansible/latest/reference_appendices/YAMLSyntax.html

### Types of GitHub Actions
GitHub actions are categorized as **Container actions and JavaScript actions**.

#### Container Actions
* As the name suggests in container actions, the environment is part of the action’s code. 
* These actions can only be executed in Linux-based runners that GitHub hosts. Or if one wants to create a Self -hosted runner [read about runners](https://docs.github.com/en/actions/using-github-hosted-runners/about-github-hosted-runners) make sure it uses Linux OS and has Docker installed. Container actions support many different languages for execution.

#### JavaScript Actions
* These actions do not include the environment in the code. This means that one has to specify the environment to execute these actions.
* They can run in a VM in the cloud or on-premises. 
* They not only support **Linux but macOS and Windows environments also.**

## Creating a simple Workflow
### Initialising a workflow
<ol>
<li>Create a new repository in GitHub </li>
  <ol type="a">
  <li>Go to the <b>Repositories</b> tab on your GitHub profile and hit the <b>New</b> button to create a repository.</li>

  ![New Repository](/assets/images/repo-creation.png)    

  <li>Fill in all the necessary details and create the repository. </li>

  ![details](/assets/images/details-new-repo.png)
</ol>
<li>Create a <b>.github</b> folder. </li>
<li>Within the .github folder create a folder named <b>workflows</b>. </li>
<li>Now create a workflow (lets name the workflow as action.yml) in the workflows folder so the final path of your workflow will be like <b>.github/workflows/action.yml.</b></li>
</ol>

![actions-file](/assets/images/actions-file.png)

### Define when the workflow will be triggered
1. Now, our first job is to add the `on` and `name` attributes to our workflow.

> **name** : this attribute defines the name of your workflow. It is an optional attribute.

> **on** : this attribute defines the event (that is a GitHub event like push , pull_request , scheduled trigger of the workflow etc) on which the workflow has to be triggered.

There are plenty of Github events that trigger any workflow [(read about GitHub events that trigger workflows)](https://docs.github.com/en/actions/reference/events-that-trigger-workflows)

To trigger the workflow by a `push` event :
```
name: My Workflow
on: 
  push:
    branches:
      - master
```

### Defining Jobs in the workflow
1. Next essential requirement of a workflow is the job that it has to do whenever it is triggered (a workflow has to have a minimum of **one** job!) \
There are many attributes that a particular job can have , some of them are : 

> **name** : defines the name of that particular job in a workflow.

> **runs-on** : defines the runner of that job. (runner can be a Github Hosted Runner or a self-hosted Runner)

> **steps** : defines the steps to be taken in that job.

Each step in  job to have two important attributes : 
> **name** : defines the name of the step 

> **run** : defines the function that the step will do

For example in YAML code below we have defines a job named **Custom-1** and it has two steps namely **Step-1** and **Step-2**.
* **Step-1** : defines the requirements to run the job. Here we used `uses` attribute that is defining the **actions/checkout@v2** repository that hosted by gitHub.
* **Step-2** : defines a `run` attribute which as a task to alphabetically print the environment variables.

```
name: My Workflow
on: 
  push:
    branches:
      - master
jobs: 
  job1:
    name: Custom-1
    runs-on: ubuntu-latest 
    steps:
      - name: Step-1
        uses: actions/checkout@v2 
      - name: Step-2
        run: env | sort 
```
2. Commit and push the code into your repository , 
open the **Actions tab** in your repository and see your actions running!

![Actions-Tab](/assets/images/action-tab.png)   

See the actions running! : 

![Actions-Running](/assets/images/actions-running.png)    

## Activities
### Activity 1
* Create a workflow that will be triggered whenever a pull request is generated on the `master` branch and it has to have a job that runs on a windows-based runner and squentially prints "Hello world!" and the current date on the shell.

#### Hint

* To trigger the workflow when a PR is generated we can use `pull_request` attribute. Within the `pull_request` attribute we can define the `branches` on which whenever the PR is made the workflow will get triggered. \
**If we do not define the branch , then  PR on any branch will trigger the workflow.**
* In order to define multiple commands one has to use the `|` (pipe character) in the `run` attribute.


Output of the job should be: 
![Run](/assets/images/pr_output.png) 

### Activity 2
* Create a workflow that prints "Hello world!" every 15 minutes.

#### Hint
* To schedule a workflow the `schedule` attribute is used.
* The `schedule` attribute uses `cron` attribute to schedule the cron jobs which are written in the [cron syntax](https://docs.oracle.com/cd/E12058_01/doc/doc.1014/e12030/cron_expressions.htm). \
The shortest cron job that can be scheduled in a free-tier GitHub account is **every 5 minutes.** 

Scheduled Jobs in GitHub Actions looks like : 
![Cron-Job](/assets/images/scheduled-job.png) 

## Activity 3
* Create a workflow that will be triggered manually by workflow_dispatch event. 
* Take a custom input message by the user and print it on the shell of the runner.

#### Hint
* We have to use `workflow_dispatch` attribte for configuring the workflow dispatch event.
* In the `workflow_dispatch` attribute we have to define the `inputs` key which basically takes the input provided by the user.
* Use of github environment variable like github.event can be used.

* **Step-1** : This step is printing the input message that we will provide through the `workflow_dispatch` event.

After adding the **workflow_dispatch** event one can see the below form created on the **Actions** tab: 
![Run](/assets/images/workflow_dispatch.png)  

Type in any message you want ( here the default message is used ):
![Run](/assets/images/workflow_dispatch_run.png)  

Output of the Job named **Custom-1** :
![Run](/assets/images/workflow_dispatch_output.png)  

### Activity 4
* Create a workflow that is triggered whenever a `push` event occurs on the master branch .
* This worksflow will have a nested job .

#### Hint
* A nested job in GitHub actions is a job that is executed only when the parent jobs are successfully executed.
* In order to define a nested job we have used `needs` attribute so as to define the parent jobs.

The nested job can be defined as : 
```
  job3:
    name: Custom-3
    runs-on: ubuntu-latest
    needs: [job1, job2]
    steps:
      - name: Step-1
        run: |
          echo "Hello Actions!"
```
* In the above workflow job named **Custom-3** requires successfull execution of jobs `job1` and `job2`.

See the Dependency graph that GitHub provides :
![Run](/assets/images/nested-jobs.png)  


## References
- https://www.redhat.com/en/topics/devops/what-is-ci-cd
- https://docs.github.com/en/actions
- https://learnxinyminutes.com/docs/yaml/
- https://docs.ansible.com/ansible/latest/reference_appendices/YAMLSyntax.html
- https://about.gitlab.com/blog/2022/02/15/ten-reasons-why-your-business-needs-ci-cd/
- https://learn.microsoft.com/en-us/azure/developer/github/github-actions



