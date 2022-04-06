const post = [
    {author: "Utku", postId: 1},
    {author: "Merve", postId: 2},
    {author: "Işıl", postId: 3},
    {author: "Mert", postId: 4}
];

const addPost = (newPost) => {
    return new Promise((resolve, reject) => {
        post.push(newPost);
        resolve('New post added!')
        reject('Could not add new post!')
    })
}

const orderPost = () => {
    return new Promise((resolve, reject) => {
        if (post.length > 0) {
            post.map(post => {
                console.log(post);
                resolve("Post listed...");
            })
        } else {
            reject("Posts didnt list!")
        }
    })
}

async function showPosts() {
const newPost={author: "Mahmut", postId: 4};
    try {
        await addPost(newPost);
        await orderPost();
    } catch (error) {
        console.log(error);
    }
}

showPosts();