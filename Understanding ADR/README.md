# Introduction

Software design plays a crucial role in the success of a software project, especially in large teams working on big or old codebases. Software design includes making important decisions about the structure, functionality, and architecture of the software system. However, making these decisions can be challenging, especially in a collaborative environment where misunderstandings and miscommunication can occur. In this micro-byte we will understand:

- What are ADR?
- Why we need to create ADR?
- Contents in ADR.
- Activities to create ADRs.

&nbsp;

# What is ADR?

In software development, Architectural Decision Record (ADR) is a document that records a decision made about the architecture of a software system. The purpose of an ADR is to document the reasoning behind an architectural decision, as well as the alternatives that were considered and the consequences of the chosen solution. This can help developers to understand the rationale behind the design of the system and can also be used when changes need to be made to the architecture in the future.

## Why to create ADR?

By documenting design decisions, ADRs help to ensure that the design of the software system is consistent and coherent. This can improve the overall quality and effectiveness of the software system.
Also, understanding decisions made by a team makes it easier for other team members to adopt the decision and prevent other architects who weren’t involved in the decision-making process to overrule that decision in the future.

## Contents in ADR.

All the ADRs can be stored in a central repository that can be accessed by the team members. Contents of the ADR can vary based on the template the team follows, but generally, it includes title, context, options, decision, consequences, and status.

1. Title: It indicates the name of the decision or the problem that the decision is intended to address.
2. Context: Provide background information and context for the decision, including any relevant constraints, requirements, and need for this decision.
3. Options: Outline the various options or alternatives that were considered for addressing the problem.
4. Decision: Explain the decision that was made and why it was chosen over the other options.
5. Consequences: Describe the anticipated consequences of the decision, both positive and negative.

---

# Activities

## Activity 1 - Setup

For all the next activities we will use [this](code/TEMPLATE.md) template and create different ADRs.

- Go through the template once and try recalling what should we include under each topic as we saw under contents in ADR.

&nbsp;
Consider that the development team is building a to-do application. The application will have features like creating and editing tasks and marking tasks as complete. You are a part of the development team and want to document the decisions so that they can be useful to reference in the future and other members will understand the reason behind the decision.

In the next activities, we will create ADR for selecting a JavaScript framework to develop the front end of our to-do application.

---

## Activity 2 - Write Context for our ADR

In order to create the Architectural Decision Record (ADR), we will first write its context.

- What context do you think is suitable for the scenario we discussed in Activity 1?

  > Note that we are writing ADR for selecting a JavaScript framework to build the front-end of our to-do application.

  &nbsp;

  > A context should provide background information and circumstances for making the decision.
  > You can also include
  >
  > - current state of the software system
  > - specific problem or challenge that the decision is intended to address, including any requirements or user needs that the decision is intended to meet.
  > - Any constraints or limitations that were taken into consideration when making the decision, such as technical, financial, or organizational constraints
  > - Any stakeholders or decision-makers who were involved in the process, and any specific concerns or input that they provided.

  &nbsp;

   <details>
   <summary>
   Click to see the context I have written.
   </summary>

  &nbsp;

  We need to select a front-end framework to develop the to-do application. This application can be used by users to manage their tasks and activities. The app will need to be responsive and easy to use on a variety of devices, including desktop computers, tablets, and smartphones.
  We need to consider a number of factors when making this decision, including the level of expertise and experience of our development team, the resources available for building and maintaining the app, and the needs and preferences of our users.

  The context you have written can be different from the answer but it should give the reader idea of basic background information about the decision.

   </details>

&nbsp;

Great, while writing the context you might have understood the problem better and also discovered new limitations, this will be useful for taking the decision.

---

## Activity 3 - Writing available Alternatives/Options in our ADR

Now that you have completed writing the Context, let's discuss available options to make the decision and write it in our ADR.

1. What framework do you think we can use to develop our to-do application?

While considering available options keep in mind the requirements, and constraints you thought of while writing the context.

Now list out all the options you considered so that we can start the next activity.

<details>
    <summary>
    Click to see the options I considered for building the applicaion.
    </summary>

    1. Angular
    2. Vue.js
    3. ReactJS

    There are other JavaScript-based frameworks available as well, but based on previous experiences, and framework popularity I considered only these three options as these are commonly used in large production-level applications.

</details>

&nbsp;

---

## Activity 4 - Its time to make a decision

Great, you now have your options listed, you can discuss with your team on pros and cons of each option and select one.

1.  What option did you decide to go with?

    <details>
    <summary>
    Click to see which option I have selected
    </summary>
    ReactJS => This is what I have chosen and yes, there is a reason behind my choice.

    </details>

&nbsp;

2.  Add your decision to the ADR.

    The decision should describe specifics and explain the reason behind the choice. Also, include how the decision was reached.

    > In this part you may also inclue :
    >
    > - A summary of the key considerations that influenced the decision, such as technical, financial, or organizational constraints.
    > - Any risks or concerns that were identified during the decision-making process, and how they were addressed or mitigated.

    &nbsp;

    <details>
    <summary>
    Click to see how decision can be written
    </summary>

    After considering a number of options, we have decided to use ReactJS as the front-end technology for the to-do app.

    ReactJS is a popular and widely-used web framework that is known for its performance, flexibility, and ease of use. It is also supported by a large and active community of developers, which makes it easy to find resources and support when needed.

    We considered a number of other options, including Angular and Vue.js. However, we ultimately determined that ReactJS was the best fit for our needs based on the following factors:

    - Our development team has extensive experience with ReactJS and is comfortable using it to build complex web applications.
    - ReactJS is well-suited to building responsive and scalable web apps, which is important given the diverse range of devices that our users will be using.
    - ReactJS has strong support for integrating with other technologies, such as APIs and databases, which will be useful as we continue to develop and expand the to-do app.

    We believe that using ReactJS as the frontend technology for the to-do app will enable us to build a high-quality, user-friendly app that meets the needs of our users.

    > Curious question: Were you able to write your decision?

    </details>

    &nbsp;

    The decision section is comparatively large as it explains the reasoning and rationale behind the decision. It also identifies some of the key factors that influenced the decision.

---

## Activity 5 - Think of the consequences and write it in ADR

    The consequences section of an architectural decision record (ADR) should describe the expected outcomes and impacts of the decision that was made. This can include both positive and negative consequences and should consider both short-term and long-term impacts.

1. What do you think are the consequences of your decision?

2. Document the consequences in the ADR

   Here is some information that you might include in the consequences section of an ADR:

   - A description of the expected benefits of the decision, such as improved performance, scalability, or user experience.
   - A description of the expected costs or challenges associated with the decision, such as additional development time or resources needed to implement the chosen option.
   - Any potential risks or drawbacks associated with the decision, and how they will be managed or mitigated.
   - Any dependencies or requirements that the decision introduces, and how they will be satisfied.

   It's important to note that the consequences section of an ADR should be based on the best available information at the time the decision was made. It should also be kept up to date as the software system evolves, and should be revised if the actual outcomes or impacts of the decision differ significantly from what was initially expected.

   In general, the consequences section of an ADR should provide enough information for readers to understand the expected outcomes and impacts of the decision, and to see how it fits into the overall development process for the software system. It should also be clear and concise and should avoid using jargon or technical terms that might be unfamiliar to non-technical readers.

    <details>
    <summary>
    Click to see what consequences I could think of for my decision
    </summary>

   By selecting ReactJS as the frontend technology for the to-do app, we expect to see a number of benefits and consequences.

   On the positive side, we expect that using React will enable us to build a high-quality, user-friendly app that meets the needs of our users. React is known for its performance, flexibility, and ease of use, and we believe that it will enable us to build an app that is responsive and scalable across a wide range of devices.

   Our development team is already familiar with ReactJS, so there will be no additional costs or challenges associated with learning and familiarizing themselves with the technology. Additionally, there are no upfront costs associated with setting up the development environment and infrastructure needed to support React.

   We believe that the expected benefits of using ReactJS as the front-end technology for the to-do app outweigh any potential costs or challenges. We will continue to monitor the impact of this decision as the app is developed and deployed, and will make adjustments as needed to ensure that it meets the needs of our users.

    </details>

---

## Activity 6 - Add a title to the ADR

Now its time to add a title to our ADR.

1. What do you think will be a suitable title for selecting a JavaScript framework to use for the front-end to develop the to-do application?

   > Note: The title of an ADR should clearly and concisely describe the decision that was made. It should be specific enough to identify the decision, but not so specific that it becomes difficult to understand without reading the entire document.

   &nbsp;

   <details>
   <summary>
   Drumrolls....... 
   Here is what I will write as a title for the ADR
   </summary>

   **Decision to Use ReactJS as a framework for UI development**

   </details>

   Congratulations!! You have successfully created your first ADR, your future self & teammates will be proud of you :-)

   You can refer to the ADR [here](code/DECISION_TO_USE_REACTJS.md).

---

# Mega Challenge

> Now we have information on how to make the ADR and we also created one ADR, try creating ADR for selecting back-end for to-do app

---

# Conclusion

Congratulations!! You made it. That was quite a daunting and amazing ride!.

---

# References

[Amazon Guide on ADR refrences](https://docs.aws.amazon.com/prescriptive-guidance/latest/architectural-decision-records/adr-process.html)

[Blog on Documenting Architecture decision](https://www.fabian-keller.de/blog/documenting-architecture-decisions/)

[Documenting Architecture Decisions](https://cognitect.com/blog/2011/11/15/documenting-architecture-decisions)
