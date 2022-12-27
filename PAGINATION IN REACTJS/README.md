# Introduction

Pagination allows users to navigate through a large list of items by dividing them into smaller numbers of items per page. In this micro byte, we will learn how to implement pagination in React application using Material-UI.

## Prerequisite:

If you have a basic understanding of how to create a web application using ReactJS.

## Understanding the task

We have to fetch the posts data from `https://jsonplaceholder.typicode.com/posts` API and display the title as a list. We will also add pagination so that users will be able to see only 10 posts per page.

## Introduction to Material-UI Pagination component

Pagination is a common feature that helps to improve the user experience by making it easier to find and view specific items. It can also help us to improve performance by loading items only when required, but in this micro byte, we are going to focus on implementing pagination on the frontend side and load all the data at once.

To implement pagination in a React application, we can use the Pagination component provided by Material-UI.
To use it we need to import it in our JSX component and call it like:

        <Pagination count={10} page={1} onChange={handleChange}/>

![basic-pagination](/PAGINATION%20IN%20REACTJS/Images/basicPagination.png)

It will render the Pagination component similar to this image.

Different props we used in the above snippet are:

- count: It accepts an integer value and denotes the total number of pages.
- page: It accepts integer value and denotes the current page.
- onChange: This accepts a function which is called when pagination is changed.

This will render a pagination component with 10 pages and the current page will be **1**. The handleChange function will be called and we can use this function to update the current page in our component's state.

## Activity 1 - Trying out different props of the Pagination Component

Apart from count, page & onChange, the Pagination component provides various props which you can find [here](https://mui.com/material-ui/api/pagination/). With help of these props, we can customize the appearance of the Pagination component.

For example, we can use the color props to change the color of the page number background color, and the theme.

        <Pagination color="primary" count={10} page={1} onChange={handleChange}/>

![primary-pagination](/PAGINATION%20IN%20REACTJS/Images/primaryPagination.png)

1. Try changing the color of the Pagination component to **secondary**.

![secondary-pagnation](/PAGINATION%20IN%20REACTJS/Images/secondaryPagination.png)

<details>
    <summary>Solution
    </summary>

        <Pagination color="secondary" count={10} page={1} onChange={handleChange}/>

Here, the color props are assigned value of secondary, so we achive desired result.

</details>

2. Now, try adding **variant** props which will change the appearance of the page number, and add a border to the numbers as shown in the image below

![outlined-pagination](/PAGINATION%20IN%20REACTJS/Images/outlinedPagination.png)

<details>
    <summary>Solution
    </summary>

        <Pagination color="primary" variant="outlined" count={10} page={1} onChange={handleChange}/>

Pagination component has a props called as variant which accepts string value, here we assigned it value as "outlined".

</details>

3. In the above two questions we saw how to change the background color and add an outline to page numbers, In this question try increasing the size of the page numbers with help of the **size** props provided in the Pagination component.

<details>
    <summary>Solution
    </summary>

        <Pagination color="primary" size="large" count={10} page={1} onChange={handleChange}/>

Pagination component has a props called as size which accepts string value, here we assigned it value as "large". We can also assign it as "small" or "medium".

</details>

## Activity 2 - Setting up a simple React application

In this activity, you need to create a React app called `react-pagination`. We will use this as a base code to work on the Pagination.

Hint:

- You can use of **create-react-app** command to set up a basic react application.

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

This will start the development server and open the application in the browser. The development server will automatically reload the application whenever we make changes to the source code, so we can see our changes in real time as we work on the application.

We can now start building our pagination feature, to do that we will fetch the list of posts from the API and store the result in the state. After that, we will add the Pagination component provided by Material-UI and customize it as per our requirements.

## Activity 3 - Fetching list of posts from the API

In this activity, we will learn how to fetch data from `https://jsonplaceholder.typicode.com/posts` API using axios.

1.  Install axios

        npm install axios

Once axios is installed we will import it into our React component and use it to make an HTTP request.

2. Create a function called `getAllPost` to fetch the data from posts API using axios.

Hint:

- We can send get request from axios using **axios.get** method and pass the API as a parameter to this method.

<details>
<summary>Solution</summary>

        const getAllPost = async () => {
            let response = await axios.get(
                "https://jsonplaceholder.typicode.com/posts"
            );
        };

</details>

The API contains a list of posts with "userId", "id", "title" & "body".

You can refer sample post below:

> {
>
> "userId": 1,
>
> "id": 1,
>
> "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
>
> "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
>
> }

3. Call the `getAllPost` method we created and store the result in a state called as **allPost**

Hint:

- You can create a component called `Post.js`.
- Call the `allPost` method in useEffect of that component.
- create the state with help of **useState** hook.

<details>
<summary>Solution</summary>

        import axios from "axios";
        import { useEffect, useState } from "react";

        const Post = () => {
            const [allPost, setAllPost] = useState(null);

            const getAllPost = async () => {
                let response = await axios.get(
                    "https://jsonplaceholder.typicode.com/posts"
                );

                setAllPost(response.data)
            };

            useEffect(() => {
                getAllPost();
            }, []);

            return(
                <div>
                    {/*
                        Add code to display all the titles
                     */}
                </div>
            )
        }

</details>

4. Display all the posts on a single page.

Hint:

- We can use the **map** to iterate over the elements
- Display the "title" of each post in the UI

## Activity 4 - Working on the logic

After we fetch the API we get around 100 posts. We now need to work on login so that we will have only 10 posts at a time.

1. Use a JavaScript method to get only the first 10 posts at a time.

You can try using your own logic to get post number 1-10 from the result.

Hint:

- You can create a custom method or make use of inbuilt methods such as filter, reduce, and slice to get 10 posts at a time.

<details>
<summary>Solution</summary>
 
        allPost.slice(0,10)

Slice method returns a new array that includes the elements from the original array starting at specified index till end index.

Therefore, the above code snippet will give us a new array containg 10 elements from index 0-9.

</details>

In the next question, we will convert this logic to a generic one so that you can get posts based on the page number.

2. Convert the logic you created in the above question so that we can get 10 posts based on the given page number.
   For example, if the page number is 3 we will get posts 21-30.

Hint:

- make use of the slice method, just update the starting and end index.
- For the calculation of the start and end index use some logic instead of directly specifying a number.

<details>
<summary>Solution</summary>

If the page number is given as 2 we need to return posts 11-20, so the start index will be 10 and end index will be 20.

- Let's say the page number is stored in variable called currentPage, we need to use currentPage to get start index.

        (currentPage-1) * 10

here 10 denotes post per page

- We can create a variable called as indexOfFirstPost which will store the start index.

- We can get end index by making use of indexOfFirstPost variable we just created. We can simple add post per page to it to get end index.

        const indexOfFirstPost = (currentPage - 1) * POST_PER_PAGE;
        const indexOfLastPost = indexOfFirstPost + POST_PER_PAGE;

- We can now use slice method to get 10 post at a time

        allPost.slice(indexOfFirstPost, indexOfLastPost);

</details>

We now have our logic ready, we can make use of this logic to display 10 posts at a time and navigate to different page numbers with help of the Pagination component.

## Activity 5 - Putting it all together

We learned about all the required things in the above activities now it's time to put it all together so that we have a working Pagination feature.

1. Make use of the concepts you learned above to create a Pagination component and map only 10 posta at a time based on the page number you received in the handleChange method.

<details>
<summary>Solution</summary>

    import axios from "axios";
    import { useEffect, useState } from "react";
    import Pagination from "@mui/material/Pagination";

    const POST_PER_PAGE = 10;
    const Post = () => {
    const [allPost, setAllPost] = useState(null);
    const [currentPage, setCurrentPage] = useState(1);
    const [numberOfPages, setNumberOfPages] = useState(0);

    // add getAllPost method we created in activity 3

    useEffect(() => {
        getAllPost();
    }, []);

    const handleChange = (event, value) => {
        setCurrentPage(value);
    };

    const getPostData = () => {
       // add the logic we learned in activity 4 and assign result of splice to a variable called posts
        return posts;
    };

    return (
        <div>
            <div>
                {getPostData().map((item) => (
                <p key={item.id}>Title: {item.title}</p>
                ))}
            </div>
            <Pagination
                count={numberOfPages}
                page={currentPage}
                onChange={handleChange}
            />
        </div>
    };

    export default Post;

</details>

![result](/PAGINATION%20IN%20REACTJS/Images/result.png)

> The code for the above UI is available in codes folder.

Congratulations!! We now have a working Pagination feature, you can customize the UI as per your choice.

## Conclusion

We successfully implemented the pagination feature with help of the Material-UI Pagination component.

## Reference

[MUI pagination](https://mui.com/material-ui/react-pagination/)
[MUI pagination API](https://mui.com/material-ui/api/pagination/)
