# Introduction

Pagination allows users to navigate through a large list of items by dividing it into smaller number of items per page. In this micro byte we will learn how to implement pagination in React application using Material-UI.

## Prerequisite:

If you have basic understanding on how to create web application using ReactJS.

## Understanding the task

We have get the posts data from `https://jsonplaceholder.typicode.com/posts` API and display the title as a list. We will also add pagination so that user will be able to see only 10 posts per page.

## Intoduction to Material-UI Pagination component

Pagination is a common feature that helps to improve the user experience by making it easier to find and view specific items. It can also help us to imrpove performance by loading items only when required, but in this micro byte we are going to focus on implementing pagination on frontend side and load all the data at once.

To implement pagination in a React application, we can use Pagination component provided by Material-UI.
We can use Pagination component by importing it in our JSX component and call it like:

        <Pagination count={10} page={1} onChange={handleChange}/>

![basic-pagination](/PAGINATION%20IN%20REACTJS/Images/basicPagination.png)

It will render the Pagination component similar to this image.

Different props we used in above snippet are:

- count: It accepts integer value and denotes total number of pages.
- page: It accepts integer value and denotes current page.
- onChange: This accepts function which is called when pagination is changed.

This will render a pagination component with 10 pages and current page will be **1**. The handleChange function will be called and we can use this function to update the current page in our component's state.

## Activity 1 - Trying out different props of Pagination Component

Apart from count, page & onChange, Pagination component provides various props which you can find [here](https://mui.com/material-ui/api/pagination/). With help of this props we can customize appearance of Pagination component.

For example, we can use the color props to change the color of the page number background color, and the theme.

        <Pagination color="primary" count={10} page={1} onChange={handleChange}/>

![primary-pagination](/PAGINATION%20IN%20REACTJS/Images/primaryPagination.png)

1. Try changing color of the Pagination component to **secondary**.

![secondary-pagnation](/PAGINATION%20IN%20REACTJS/Images/secondaryPagination.png)

<details>
    <summary>Solution
    </summary>

        <Pagination color="secondary" count={10} page={1} onChange={handleChange}/>

Here, the color props are assigned value of secondary, so we achive desired result.

</details>

2. Now, try adding **variant** props which will change the appearnace of the page number, and add border to the numbers as shown in the image below

![outlined-pagination](/PAGINATION%20IN%20REACTJS/Images/outlinedPagination.png)

<details>
    <summary>Solution
    </summary>

        <Pagination color="primary" variant="outlined" count={10} page={1} onChange={handleChange}/>

Pagination component has a props called as variant which accepts string value, here we assigned it value as "outlined".

</details>

3. In the above two questions we saw how to change background color and add outline to page numbers, In this question try increasing size of the page numbers with help of the **size** props provided in Pagination component.

<details>
    <summary>Solution
    </summary>

        <Pagination color="primary" size="large" count={10} page={1} onChange={handleChange}/>

Pagination component has a props called as size which accepts string value, here we assigned it value as "large". We can also assign it as "small" or "medium".

</details>

## Activity 2 - Setting up simple React application

In this activity you need to create a React app called as `react-pagination`. We will use this as base code to work on the Pagination.

Hint:

- You can use of **create-react-app** command to set up basic react application.

<details>
</summary>Solution
</summary>

Open the terminal at directory you want to create the React app. Run the following command to configure basic setup.

        create-react-app react-pagination

This will create a new directory called as react-pagination with basic structure of React application. We will add new files in the <b>src/</b> directory. The <b>src/</b> directory contains source code of the application. It includes the index.js file, which is entry point of the application and App.js file which contains root component of the application.

</details>

Once you have created the React app navigate to that directory to start the development server.

Hint:

- You can use `cd app-name` command to navigate to the newly created React project
- You can then start the development server with help of `npm start`

This will start the development server and open the application in the browser. The development server will automatically reload the application whenever we make changes to the source code, so we can see our changes in real-time as we work on the application.

## Reference

[MUI pagination](https://mui.com/material-ui/react-pagination/)
[MUI pagination API](https://mui.com/material-ui/api/pagination/)
