# Introduction

Code analysis is a process of analyzing source code in order to detect potential issues, defects or areas of improvement in source code. Code analysis is used to identify a wide range of issues, including syntax errors, bugs, security analysis and style violation.

Code analysis can be classified into two main categories: static code analysis and dynamic code analysis. In this micro byte you will understand what is static code analysis, we will learn how to use SonarCloud to improve quality, security and maintainability of your code.

# What is Static code analysis?

Static code analysis is process of analyzing code without actually executing it. Static code analysis is important for improving quality, security and efficiency of software development. There are different tools available for performing static code analysis. There tools typically parse the source code, perform various checks, analyze the code and repote any issues that they find. In this micro byte we will be using SonarCloud for performing static code analysis.

## Why is static code analysis important?

Static code analysis is an important part of the software development process as it helps to identify and fix problems before they become more difficult and costly to address. There are various benefits of static code analysis, a few of them are:

- Identifying and fixing errors and defects in the code.
- Improving the maintainability and readability of the code.
- Ensuring that the code adheres to certain coding standards and best practices.
- Detecting and mitigating security vulnerabilities in the code.
- Improving the performance of the code.

### Activity 1: Let's recap the basics.

1. How does static code analysis find potential issues in code?

   - [ ] By executing the code and observing the results
   - [ ] By comparing the code to a set of predefined rules or best practices.
   - [ ] By analyzing the code's runtime performance
   - [ ] By analyzing the code's memory usage

    <details>
    <summary>Click to see hint</summary>
    Static code analysis analyze the code without actually executing it.
    </details>

    <details>
    <summary>Click to see answer</summary>

   - [ ] By executing the code and observing the results
   - [x] By comparing the code to a set of predefined rules or best practices.
   - [ ] By analyzing the code's runtime performance
   - [ ] By analyzing the code's memory usage

   Static code analysis tools scan the source code and identify any issues that violate predefined rules.
    </details>

2. Which of the following cannot be identified by using static code analysis?

   - [ ] Programming errors
   - [ ] How function will execute.
   - [ ] Coding standard violations.
   - [ ] Security weaknesses.

    <details>
    <summary>Click to see hint</summary>
    Static code analysis analyze does not execute the code.
    </details>

    <details>
    <summary>Click to see answer</summary>

   - [ ] Programming errors
   - [x] How function will execute.
   - [ ] Coding standard violations.
   - [ ] Security weaknesses.

   Static code analysis can't detect whether software requirement have been fulfilled or how function will execute. You will need dynamic analysis for that.
    </details>

## What is SonarCloud?

SonarCloud is a cloud-based static code analysis tool that enables developers to analyze their code for quality, security and maintainability issues. Sonar cloud helps in early detection of problem which ensures that fewer issues get through to the later stages of the process and ultimately helps to increase the overall quality of your code.

SonarCloud provides variety of features such as:

- Automated code reviews: It can provide feedback and suggestions for improving your code for a wide range of issues, including syntax errors, bugs, security vulnerabilities, and style violations

- Customizable rules: SonarCloud allows developers to configure the analysis to check for specific types of issues, and to set their own rules and standards for code quality.

- Integration with popular development tools: SonarCloud can be integrated into popular development tools, such as GitHub, Azure DevOps, and Jenkins, to provide continuous analysis and feedback as code is being developed.

- Collaboration and reporting: SonarCloud provides features for collaborating with team members and sharing analysis results, as well as generating reports and charts to help visualize code quality trends over time.

## Understanding SonarCloud quality gate

![quality-gate](/STATIC%20CODE%20ANALYSIS/Images/sonarCloudMainBranch.png)

A "quality gate" is a set of predefined rules or conditions that must be satisfied in order for a codebase to be considered of high quality.

Quality gates are used to ensure that code meets certain standards and follows best practices, and can be customized to suit the needs of your team and project.

When a codebase is analyzed by SonarCloud, the results are compared to the quality gate to determine whether the code meets the specified standards. If the code meets the standards, the analysis is considered a "success" and the codebase is considered of high quality.
![qg-passed](/STATIC%20CODE%20ANALYSIS/Images/qg-passed.png)
(img referred from SonarCloud docs.)

If the code does not meet the standards, the analysis is considered a "failure" and the codebase is considered of low quality.
![qg-failed](/STATIC%20CODE%20ANALYSIS/Images/qg-failed.png)
(img referred from SonarCloud docs.)

## Activity 2

Understanding different issues SonarCloud detects and solving them.

1.  Code Smell: These are indicators of deeper problems that can affect the maintainability of the code. Identifying these issues early can help to reduce technical debt in the application.

    Some common ways to address code smells include refactoring the code to make it more readable and maintainable, or redesigning part of the code to make it more efficient or scalable.

    This is a code smell that I found in my code. How do you think we can solve this?
    ![code-smell](/STATIC%20CODE%20ANALYSIS/Images/codeSmell.png)

     <details>
     <summary>Solution</summary>
     Its simple, as the message suggest, we just need to remove the unused import.

    Notice how the tags are added to the issue, here it is

    - Code Smell - the type of issue,
    - Minor - the severity
    - Closed - status

    Also the ideal time required to solve the issue is also added.

    </details>

2.  Vulnerabilities: Vulnerabilities are issues in code that can be exploited by attackor to compromise the security of the application.

    SonarCloud helps to detect different vulnerabilities including SQL injection, Cross-site scripting, Cross-side request forgery (CSRF). By identifying and addressomg these vulnerabilities early, it can ensure the security of your application and protect it from potential attacks.

    This is a Vulnerability that I found in my code. How do you think we can solve this?

    > Note: this is written in Nodejs, if you aren't familiar with Nodejs you can read about bugs.

    ![vulnerability](/STATIC%20CODE%20ANALYSIS/Images/vulnerability.png)

    <details>
    <summary>Solution</summary>
    SonarCloud gave error as Change this code to not reflect user-controlled data, because it can potentially allow an attacker to inject malicious code into your application.

    For example, if an attacker were to send a request to the endpoint with a name parameter that contained code that was intended to be executed by the server, the code could potentially be executed and compromise the security of the server.

    To avoid this issue, it is important to sanitize user-controlled data before using it in your code. This can be done by applying appropriate input validation and escaping techniques to ensure that the data is safe to use.

    So we will create a sanitize function

         function sanitize(data) {
         // Strip out any potentially malicious characters
         data = data.replace(/[^\w\s]/gi, '');

         // Encode the data to ensure it is safe to use
         data = encodeURIComponent(data);

         return data;
         }

    Now, for name variable use sanitize function

        name = sanitize(req.body.name);

    Congratulations!! You just now learned to solve a Vulnerability which was tagged as Blocker and requires 30 min of effort.

    </details>

3.  Bug: A bug is an error in the code that can cause it to behave unexpectedly or produce incorrect results. A bug can be caused by a variety of factors, such as syntax error, logical error, or incorrect assumptions.

    A bug can be caused by variety of factors, such as synax errors, logical errors, or incorrect assumptions about the input or environemnt.

    ![bug](/STATIC%20CODE%20ANALYSIS/Images/bug.png)
    A sample bug shown by SonarCloud, [here](https://sonarsource.com/knowledge/languages/js/)

## Activity 3

Prerequisite: You should have atleast one project on Github which we can use for static code analysis using SonarCloud.

1. Create a account on SonarCloud using your github.
   Navigate to [this](https://www.sonarsource.com/products/sonarcloud/) link and click on Sign up.

2. Click on Sign up using Github, Enter the credentials and click on Sign in button.
   ![sign-up](/STATIC%20CODE%20ANALYSIS/Images/signUp.png)

3. After login is successful you need to import an organization from Github.
   ![import-org](/STATIC%20CODE%20ANALYSIS/Images/afterLogin.png)

4. Import repository on which you want to perform static code analysis.
   ![import-repo](/STATIC%20CODE%20ANALYSIS/Images/importRepo.png)

5. Open the project in SonarCloud -> The quality gate might show as not computed -> click on set new code defination

![quality-gate](/STATIC%20CODE%20ANALYSIS/Images/quality-gate.png)

6. Select the option for which code will be considered new.
   ![new-code](/STATIC%20CODE%20ANALYSIS/Images/new-code.png)

Congratulations!! Whenever you make some changes and push the code it will be analyzed by SonarCloud and quality gate will let you know if your code is good enough to be pushed.

## Conclusion

In this micro byte we learned about static code analysis which will help you in writing high-quality, reliable and secure code.

## Refrences

[Sonar Cloud Docs](https://docs.sonarcloud.io/)
