# Introduction

Software is made up of different features. We often need to make changes to software that involves adding or modifying features. While making these changes there is always a risk of bugs or unintended consequences that can affect the stability of an application. One way to mitigate this risk is to use different environments for development and production, such as a staging or testing environment. This allows developers to test new code before it is deployed to production, and ensure that it is working as intended.

However, even with these safeguards in place, it can still be challenging to manage the lifecycle of features and remove them when they are no longer needed. A technique like a feature toggle can help to simplify this process by allowing developers to enable or disable specific features in an application without requiring a full deploy. This can be useful for a variety of purposes, such as rolling out new features to a subset of users or disabling features that are no longer needed.
In this micro byte, we will explore

1. What is a feature toggle?
2. Applications of feature toggle.
3. Different ways to implement feature toggle.

# What is a feature toggle?

Feature toggle is often referred to as a feature flag or feature switch. With help of a feature toggle, we can enable or disable certain features in an application without requiring a full deploy. Feature toggle makes it easier to manage the lifecycle of features. Feature toggle is typically implemented with help of a flag, when the flag is enabled, the feature is available to users. When the flag is disabled, the feature is not available to users. This allows developers to quickly and easily enable or disable features without requiring a full deploy.

## Applications of feature toggle

Consider a scenario where you are working on a feature that takes almost a month to get complete, your team follows trunk-based development so other members of the team are also working on the same branch as you are working on. Now, when new changes are pushed to production the feature you are working on will also get deployed even though it is not complete yet. You can avoid this by adding a feature toggle to your component and disabling the flag whenever you are deploying the code. So with the help of a feature toggle, the incomplete feature won't be accessible to users.

![feature-toggle](/UNDERSTANDING%20FEATURE%20TOGGLE/Images/FEATURE_TOGGLE.png)

Apart from the above scenario there are many potential applications for feature toggle in software development. A few of them are:

1. Controlling the rollout of new features: We can use a feature toggle to gradually release new features. The team can release a new product feature to a subset of users to gather feedback. If the new feature proves to be a hit, the development team can then roll out the feature to a larger user base. If the new feature turns out to be a flop, the development team can easily disable the feature toggle and later remove the feature from the codebase.

2. Allowing certain features for specific users: A feature toggle can be used to enable or disable features for a specific group of users based on certain criteria such as their account type or location. Let's take an example of notes taking app that allows only users with a premium plan to add images to their notes. We can make use of a feature toggle where we will set the flag enabled to users with premium plans.

3. Testing different versions of a feature: A feature toggle can be used to enable different versions of a feature for different users or groups of users. This can be useful for A/B testing or for gathering feedback on different versions of a feature. This helps in testing things like the design of a user interface or the effectiveness of different marketing messages.

## Different ways to implement feature toggle.

As you might have guessed by now feature toggles are basically conditional statements, enabling the block inside the conditional statement to be ‘toggled’ on or off depending on the flag. To implement a feature toggle you need a place where you can create and store the value of these variables. There are different ways in which this can be done.

> Can you think of different ways we can store the value of the flag?

&nbsp;

1. Variable in the same file: The most basic way would be to create a variable with a feature name in the same file. But it isn't used as it has various drawbacks like:

- all the toggles aren't stored in one place.
- They are only accessible in the same file.
- The code needs to be deployed again for changes to get reflected.

```
// AdvertismentToggle component

const AdvertismentToggle = () => {
  const advertisment= "on";
  if (advertisment === 'on') {
    return <Advertisment />;
  }
  return null;
}

```

2. Configuration file: We can specify which features are enabled or disabled in a configuration file. This file can be stored locally or can be accessed using a remote server.

Let's look at how we can implement a feature toggle in Reactjs using a configuration file.

```
// config.json
{
  "features": {
    "advertisment": "on",
    "darkMode": "off"
  }
}

// AdvertismentToggle component
import config from './config.json';

const AdvertismentToggle = () => {
  if (config.features.advertisment === 'on') {
    return <Advertisment />;
  }
  return null;
}

```

In the above example, we have a config.json file where we have added a list of toggleable features and their current state. In the AdvertismentToggle component, we are returning advertisment if the feature is "on".

3. Database: We can store the feature toggles in the database by either creating a new table contaning the keys or if the app is using microservice architecture you can store the toggles in a separate service that manages the toggles.

   | Feature name | Feature value |
   | ------------ | ------------- |
   | advertisment | on            |
   | dark mode    | of            |

We can access feature flag value from the database, if we need feature flag flag value in frontend we can create a REST API to access the value.

4. Using Graphical User Interface: You can create a simple UI interface by yourself or use any feature toggle management tool available.

![launch-darkly](/UNDERSTANDING%20FEATURE%20TOGGLE/Images/LaunchDarkly.png)
[img: LaunchDarkly toggle’s interface]

# Activity

## Activity 1: Basics of Feature Toggle

1. What will be the value of the flag if you want to display feature1?

- [ ] true
- [ ] false

```
const FeatureToggle = () => {
  if (config.features.feature1) {
    return <Feature />;
  }
  return null;
}
```

<details>
<summary>Click here to see the answer</summary>
The value of the flag should be <b>true</b>
According to the given code, if the flag value is true then it will return the Feature component.

Generally, for the feature to be displayed flag needs to be enabled.

</details>

2. Where should we add the feature toggle?

- [ ] Frontend
- [ ] Backend
- [ ] Both Frontend and Backend
- [ ] Depends on use case

> Hint: To find the answer take different examples and think about where should we add the feature toggle

<details>
<summary>Click here to see the answer</summary>
It depends on use case, feature toggles can be implemented in frontend or backend or both. Consider a feature that involves interaction between frontend and backend, then in this case we will need to add feature toggle both to the frontend and backend.

Consider you need to disable button from UI, in this case we will add feature toggle only in the frontend.

</details>

3. Should we keep the feature toggle in our code indefinitely?

- [ ] Yes
- [ ] No
      &nbsp;

![stack](/UNDERSTANDING%20FEATURE%20TOGGLE/Images/STACK.jpeg)
Photo by <a href="https://unsplash.com/@dimhou?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">Dim Hou</a> on <a href="https://unsplash.com/photos/PfNzKoA5R4E?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">Unsplash</a>

<details>
<summary>Click here to see the answer</summary>
No, it is generally not recommended to keep feature toggles in the code indefinetly. One feature toggle are no longer needed we need to remove them from our code.
</details>

&nbsp;

## Activity 2: Understanding feature toggle from real-world use cases.

> Did you know: Netflix and Spotify also use feature toggle? Try solving these to understand the benefits of the feature toggle.

1. A team is working on a new feature for an e-commerce website that involves adding a new payment method. To minimize the risk of introducing bugs or breaking the application, the team decides to use a feature toggle to gradually roll out the new payment method to a subset of users. Which of the following is NOT a potential benefit of using a feature toggle in this situation?

- [ ] The team can gather feedback and monitor the impact of the new payment method before making it available to all users.
- [ ] The team can quickly revert to the previous version of the application if there are any issues with the new payment method.
- [ ] The team can reduce the complexity of the codebase by removing the feature toggle once the new payment method is stable.
- [ ] The team can improve the performance of the application by using a feature toggle to optimize the code.

<details>
<summary>Click here to see the answer</summary>
In this situation adding feature toggle won't have any effect on performance. So the answer is last option: The team can improve the performance of the application by using a feature toggle to optimize the code.
</details>

2. A team is working on a new feature for a social media app that allows users to see posts from their favorite celebrities. The feature is still in development and the team is concerned about introducing bugs or negatively impacting the user experience. To minimize the risk of these issues, the team decides to use a feature toggle to gradually roll out the new feature to a subset of users. Which of the following is NOT a potential benefit of using a feature toggle in this situation?

- [ ] The team can gather feedback and monitor the impact of the new feature before making it available to all users.
- [ ] The team can quickly revert to the previous version of the application if there are any issues with the new feature.
- [ ] The team can reduce the complexity of the codebase by removing the feature toggle once the new feature is stable.
- [ ] The team can improve the security of the application by using a feature toggle to isolate the new feature from the rest of the codebase.
- [ ] The team can make the new feature available to a subset of users who are more likely to use it.

<details>
<summary>Click here to see the answer</summary>
While feature toggles can have a number of potential benefits, such as allowing developers to gradually roll out new features and test changes to the application without affecting the production environment, they do not typically result in significant improvements to the security of the application.

So the answer is: The team can improve the security of the application by using a feature toggle to isolate the new feature from the rest of the codebase.

</details>

## Conclusion

In this micro byte we learned what feature toggles are and different ways we can implement feature toggles.

## References

[Netflix skip intro button](https://about.netflix.com/en/news/looking-back-on-the-origin-of-skip-intro-five-years-later)

[Blog on Martin Fowler's site](https://martinfowler.com/articles/feature-toggles.html)

[Blog by Atlassian](https://www.atlassian.com/continuous-delivery/principles/feature-flags)

[Feature Flags: Smaller, Faster, Better Software Development](https://medium.com/@dehora/feature-flags-smaller-better-faster-software-development-f2eab58df0f9)

[Spotify feature toggle video](https://www.youtube.com/watch?time_continue=3&v=4GK1NDTWbkY&feature=emb_logo)
