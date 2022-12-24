# Introduction

A version conrol system is a tool helps developers track and manage changes in their codebase.

This lets us work on our project without worrying about introducing errors to partly working code and not beign able to go back. There are several different version control systems available, including Git, Mercurial, and Subversion. In this micro byte we will undestand

1. What is git?
2. What is branch in git?
3. How to create a branch in git?
4. Some best practices while working on branch.
5. Feature based development.
6. Trunk based development.

## What is git?

Git is a version control system that is widely used by developers to track and manage changes to their codebase.

Some key features of Git are:

- Branching: Git allows developers to create branches, which are separate lines of development. This allows them to work on new features or make changes to the code without affecting the main branch.

- Merging: Git allows developers to merge changes from different branches into the main branch when they are ready.

- Collaboration: Git makes it easy for developers to collaborate on projects, as it allows them to track and merge changes made by different team members.

![vs-code](/MANAGING%20BRANCHES%20IN%20GIT/Images/vsCode.jpeg)
Photo by <a href="https://unsplash.com/@yancymin?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">Yancy Min</a> on <a href="https://unsplash.com/photos/842ofHC6MaI?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">Unsplash</a>

## What is a branch in git?

A branch is a separate line of development. When you create a new branch, you are creating a copy of the code at that point in time, which you can then modify independently of the main branch.

## Activity 1: Branching in practice

1. create a new project called as branching basics and navigate to that project.

<details>
<summary>Hint</summary>
You can use <b>mkdir</b> command to create a new directory and <b>cd</b> to navigate to that directory.
</details>

<details>
<summary>Click here to see the answer</summary>

        # Create a new directory
        mkdir learning-branch

        # Navigate into the new directory
        cd learning-branch

</details>

2. Initialize a new git repository and create a new branch called **new-feature**

<details>
<summary>Hint</summary>
You can create a new branch using
        git branch branch-name

</details>

<details>
<summary>Solution</summary>
        # Initialize a new Git repository
        git init

        # Create a new branch called 'new-feature'
        git branch new-feature

</details>

3. Switch to **new-feature** branch and commit some changes

<details>
<summary>Hint</summary>
You can switch to a new branch using
        git checkout branch-name

</details>

<details>
<summary>Solution</summary>
        # Switch to the 'new-feature' branch
        git checkout new-feature

        # Make some changes to the repository (eg. create a new file)
        git add .
        git commit -m "Update new feature"

</details>

&nbsp;

## Few best practices for branching in Git

1. Use descriptive names for branches
   Branch name should clearly describe the purpose of the branch.
   For example, login-page, authenticaion.

2. Keep your branches up-to-date
   Update branch with latest changes from main branch.

3. Make small and frequent commits
   Commits should clearly describe changes you are making. This makes it easier to review and merge changes, and helps to keep the codebase organized.

4. Review and merge changes frequently
   Set up a process for reviewing and merging changes into the main branch. This could involve creating pull requests, conducting code reviews, or using a continuous integration system to automatically build and test changes.

5. Use feature toggle
   If a feature requires more time to develop and test, consider using a feature toggle to temporarily disable the feature in the main branch. This allows you to work on the feature in a separate branch without affecting the main branch.

## Feature-based branching

Feature-based branching is a branching strategy in which a separate branch is created for each new feature or task. This allows developers to work on new feature without the main branch, this makes it easier to review and merge changes when they are ready.

![feature-based](/MANAGING%20BRANCHES%20IN%20GIT/Images/featureBased.png)
[Image from [optimizely](https://www.optimizely.com/optimization-glossary/trunk-based-development/)]

## Activity 2:

To understand feature-based development better, let us work on one example.

1. Create new repository on local machine.

<details>
<summary>Solution</summary>

      # create a new repository on your local machine

      git init to-do

      cd to-do

</details>

2. Create a new branch for login

<details>
<summary>Hint</summary>

- Open a terminal window and navigate to your project's directory.

- Run the git branch command followed by the name of the new branch.

</details>

<details>
<summary>Solution</summary>  
         
      # create a new branch called "login" and switch to that branch

      git branch login

      git checkout login

</details>

3. Make changes and push the branch

> Before pushing its always a good idea to pull & check if anyone else in the team has made any changes.

<details>
<summary>Hint</summary>

- Make the necessary changes to your code on the active branch.

- Use the git add command to stage your changes.

- Use the git commit command to commit your changes.

</details>

<details>
<summary>Solution</summary>  
         
      # add a new file called "login.txt" to the repository and commit the changes

        touch login.txt

        git add login.txt

        git commit -m "Added login.txt"

        # pull from the remote "login" branch

        git pull origin login

        # push the "login" branch to the remote repository

        git push origin login

</details>

Once you are dome making required changes, its time to merege login branch with main.

4. Review and merge the changes

<details>
<summary>Hint</summary>

- When the feature is complete, create a pull request to review and merge the changes into the main branch.

- Discuss the changes with other team members and make any necessary updates.

- Once the changes have been reviewed and approved, merge the pull request into the main branch.

</details>

5. Delete the feature branch

Now that you have made the changes and created pull request too, you can delete the feature branch.

<details>
<summary>Hint</summary>

You can use git branch command followed by the -d flag and the name of the branch. For example: git branch -d new-feature.

</details>

Using feature-based branching can help you manage changes to your codebase more efficiently, and makes it easier to review and merge changes when they are ready.

## Trunk-based development

Trunk-based development is a branching strategy in which all development work is done in the main branch, also known as the "trunk." This approach favors small, frequent commits over long-lived branches and encourages developers to merge their changes into the main branch as soon as they are ready.

Trunk-based development can help reduce the complexity of version control, as there are fewer branches to manage and merge. It also makes it easier to review and integrate changes, as they are committed to the main branch on a regular basis.

![trunk-based](/MANAGING%20BRANCHES%20IN%20GIT/Images/trunkBased.png)
[Image from [optimizely](https://www.optimizely.com/optimization-glossary/trunk-based-development/)]

## Activity 3:

## Resources

[branch-by-abstraction](https://paulhammant.com/blog/branch_by_abstraction.html)

[gitflow](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow)
