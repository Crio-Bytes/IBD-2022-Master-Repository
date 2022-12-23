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

## What is branch in git?

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
