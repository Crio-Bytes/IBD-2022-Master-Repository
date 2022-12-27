import axios from "axios";
import { useEffect, useState } from "react";
import Pagination from "@mui/material/Pagination";

const POST_PER_PAGE = 10;
const Post = () => {
  const [allPost, setAllPost] = useState(null);
  const [currentPage, setCurrentPage] = useState(1);
  const [numberOfPages, setNumberOfPages] = useState(0);

  const getAllPost = async () => {
    try {
      let response = await axios.get(
        "https://jsonplaceholder.typicode.com/posts"
      );
      setAllPost(response.data);
      setNumberOfPages(response.data.length / POST_PER_PAGE);
    } catch (error) {
      console.log(error);
    }
  };

  useEffect(() => {
    getAllPost();
  }, []);

  const handleChange = (event, value) => {
    setCurrentPage(value);
  };

  const getPostData = () => {
    const indexOfFirstPost = (currentPage - 1) * POST_PER_PAGE;
    const indexOfLastPost = indexOfFirstPost + POST_PER_PAGE;
    let posts = allPost.slice(indexOfFirstPost, indexOfLastPost);

    return posts;
  };

  return (
    <div>
      {allPost === null ? (
        <p>I am loading</p>
      ) : (
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
      )}
    </div>
  );
};

export default Post;
