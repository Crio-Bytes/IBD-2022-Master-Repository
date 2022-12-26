# Introduction

A version control system is a tool that helps developers track and manage changes in their codebase.

This lets us work on our project without worrying about introducing errors to partly working code and not being able to go back. There are several different version control systems available, including Git, Mercurial, and Subversion. In this micro byte, we will understand.

1. What is git?
2. What is a branch in git?
3. How to create a branch in git?
4. Some best practices while working on branch.
5. Feature-based development.
6. Trunk-based development.

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

## Activity 1 - Branching in practice

1. create a new project called as "learning-branch" and navigate to that project.

<details>
<summary>Hint</summary>
You can use the <b>mkdir</b> command to create a new directory and <b>cd</b> to navigate to that directory.
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
   For example, login-page, authentication.

2. Keep your branches up-to-date
   Update the branch with the latest changes from the main branch.

3. Make small and frequent commits
   Commits should clearly describe the changes you are making. This makes it easier to review and merge changes and helps to keep the codebase organized.

4. Review and merge changes frequently
   Set up a process for reviewing and merging changes into the main branch. This could involve creating pull requests, conducting code reviews, or using a continuous integration system to automatically build and test changes.

5. Use feature toggle
   If a feature requires more time to develop and test, consider using a feature toggle to temporarily disable the feature in the main branch. This allows you to work on the feature in a separate branch without affecting the main branch.

## Feature-based branching

Feature-based branching is a branching strategy in which a separate branch is created for each new feature or task. This allows developers to work on a new feature without the main branch, which makes it easier to review and merge changes when they are ready.

![feature-based](/MANAGING%20BRANCHES%20IN%20GIT/Images/featureBased.png)
[Image from [optimizely](https://www.optimizely.com/optimization-glossary/trunk-based-development/)]

## Activity 2 - Trying out feature-based development

To understand feature-based development better, let us work on one example.

1. Create a new repository on the local machine.

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

> Before pushing it's always a good idea to pull & check if anyone else in the team has made any changes.

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

Once you are done making the required changes, it's time to merge the login branch with the main branch.

4. Review and merge the changes

<details>
<summary>Hint</summary>

- When the feature is complete, create a pull request to review and merge the changes into the main branch.

- Discuss the changes with other team members and make any necessary updates.

- Once the changes have been reviewed and approved, merge the pull request into the main branch.

</details>

5. Delete the feature branch

Now that you have made the changes and created a pull request too, you can delete the feature branch.

<details>
<summary>Hint</summary>

You can use git branch command followed by the -d flag and the name of the branch. For example:

                git branch -d new-feature.

</details>

Using feature-based branching can help you manage changes to your codebase more efficiently, and makes it easier to review and merge changes when they are ready.

## Trunk-based development

Trunk-based development is a branching strategy in which all development work is done in the main branch. This approach favors small, frequent commits over long-lived branches and encourages developers to merge their changes into the main branch as soon as they are ready.

Trunk-based development can help reduce the complexity of version control, as there are fewer branches to manage and merge. It also makes it easier to review and integrate changes, as they are committed to the main branch on a regular basis.

![trunk-based](/MANAGING%20BRANCHES%20IN%20GIT/Images/trunkBased.png)
[Image from [optimizely](https://www.optimizely.com/optimization-glossary/trunk-based-development/)]

## Activity 3 - Learning about a technique that is used often in trunk-based development

A team is working on a complex new feature for their software application using trunk-based development, as they prefer to make small, frequent commits rather than working on long-lived branches.

As they are working on the feature, they realize it will take longer than expected to complete. To avoid affecting the main branch while they continue to work on the feature, they need a temporary solution. What do you think they can do?

<details>
<summary>Hint</summary>

Till the feature is complete they can hide the feature from the user interface.

</details>

<details>
<summary>Solution</summary>
The team can make use of a feature toggle to temporarily disable a feature in the main branch while they continue to work on it.

Feature toggles are often used in conjunction with trunk-based development to allow teams to continue working on new features without affecting the main branch.

</details>

## Activity 4 - Making a decision

Now that you have learned about feature-based and trunk-based development. **Which approach do you think would be more suitable for your projects?**

To help you with the selection we can first understand the difference between trunk-based and feature-based development

- Feature-based development:

  - Pros: Allows developers to work on new features in isolation, which can be helpful for complex or risky features. Can also make it easier to review and test changes before they are merged into the main branch.

  - Cons: This can lead to longer development cycles, as developers may need to spend more time merging changes back into the main branch. Can also lead to conflicts and merge conflicts, as multiple developers may be working on different features at the same time and need to merge their changes together.

- Trunk-based development:

  - Pros: Emphasizes continuous integration and continuous delivery, which can lead to more efficient development cycles. Can also make it easier to review and test changes, as developers are encouraged to make small, frequent commits.

  - Cons: This may not be the best approach for large, complex features that require a lot of development and testing. Can also make it more challenging to manage changes, as developers are working directly on the main branch.

Both feature-based development and trunk-based development have their own strengths and weaknesses, the choice will depend on need and constraints of the project, including the size and complexity of the project, the level of collaboration and communication within the development team, and overall development process and workflow.

## Conclusion

In this micro byte, we learned how to create a branch in git along with some best practices. We also what feature-based and trunk-based development are and also saw the difference between the two to help you with the selection of the right branching strategy for your project.

## Resources

[branch-by-abstraction](https://paulhammant.com/blog/branch_by_abstraction.html)

[gitflow](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow)

[trunk-based-development](https://www.optimizely.com/optimization-glossary/trunk-based-development/)
