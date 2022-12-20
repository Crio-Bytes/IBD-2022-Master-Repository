# Introduction

Software design plays crucial design for success of a software project, especially in large teams working on big or old codebase. Software design includes making important decisions about the structure, functionalty, and architeture of the software system. However, making these decisions can be challenging, especially in a collaborative environment where misunderstandings and miscommunication can occur.
In this micro-byte we will understand:

- What are ADR?
- Why we need to create ADR?
- Contents in ADR.
- Activities to create ADRs.

&nbsp;

# What is ADR?

In software development, an Architectural Decision Record (ADR) is a document that records a decision made about the architecture of a software system. The purpose of an ADR is to document the reasoning behind an architectural decision, as well as the alternatives that were considered and the consequences of the chosen solution. This can help developers to understand the rationale behind the design of the system and to make informed decisions when making changes to the architecture in the future.

## Why to create ADR?

By documenting design decisions, ADRs help to ensure that the design of the software system is consistent and coherent. This can improve the overall quality and effectiveness of the software system.
Also, understanding decisions made by a team makes it easier for other team members to adopt the decision, and prevents other architects who weren’t involved in the decision-making process to overrule that decision in the future.

## Contents in ADR.

All the ADRs can be stored in a central repository that can be accessed by the team members. Contents of the ADR can vary based on template the team follows, but generally it includes title, context, options, decision, consequences, status.

1. Title: It indicates the name of the decision or the problem that the decision is intended to address.
2. Context: Provide background information and context for the decision, including any relevant constraints, requirements and need for this decision.
3. Options: Outline the various options or alternatives that were considered for addressing the problem.
4. Decision: Explain the decision that was made and why it was chosen over the other options.
5. Consequnces: Describe the anticipated consequences of the decision, both positive and negative.

---

# Activities

For Activity number x to y, consider development team is creating a to-do application. The application will have features like creating and editing tasks, assigning due dates and priorities, and marking tasks as complete.

## Activity 1 - Setup

For all the next activites we will use [this](code/TEMPLATE.md) template and create different ADRs.

- Go through the template once and try recalling what should we include under each topic as we saw under contents in ADR.

&nbsp;
Consider the development team is building a to-do application. The application will have features like creating and editing tasks, and marking tasks as complete. You are a part of the development team and want to document the decisions so that it can be useful to reference in future and to understand the reason behind the decision.
// , assigning due dates and priorities
In next Activities we will create ADR for selecting a JavaScript framework to use for the front-end to develop the to-do application.

---

## Activity 2 - Write Context for our ADR

To start creating the ADR we first will write context for ADR.

1.  What context do you think we can give to the ADR?

    > Note that we are writing Architectural Decision Record (ADR) for selecting a JavaScript framework to build the front-end of our to-do application.

    &nbsp;

            A context should provide background information and circumstances for making the decision.
            You can also include
            - current state of the software system
            - specific problem or challenge that the decision is intended to address, including any requirements or user needs that the decision is intended to meet.
            - Any constraints or limitations that were taken into consideration when making the decision, such as technical, financial, or organizational constraints
            - Any stakeholders or decision-makers who were involved in the process, and any specific concerns or input that they provided.

    <details>
    <summary>
    Click to see the context I have written.
    </summary>

    &nbsp;

    We need to select a frontend framework to develop the to-do app. This app will be used by users to manage their tasks and activities. The app will need to be responsive and easy to use on a variety of devices, including desktop computers, tablets, and smartphones.
    We need to consider a number of factors when making this decision, including the level of expertise and experience of our development team, the resources available for building and maintaining the app, and the needs and preferences of our users.

    The context you have written can be different from the answer but it should give the reader idea about basic baground information about the decision.

    </details>

---
