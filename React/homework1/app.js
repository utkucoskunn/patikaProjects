import axios from "axios";


const getData = async (user_id) => {
    const {data: user} = await axios("https://jsonplaceholder.typicode.com/users/" + user_id); // get user data
    const {data: post} = await axios("https://jsonplaceholder.typicode.com/posts?userId=" + user_id); // get post data

    return {user,post};
};

export default getData;

