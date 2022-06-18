import {useParams, Link, Outlet, BrowserRouter, Route, Routes} from "react-router-dom";
import {useState, useEffect} from "react";
import axios from "axios";

export default function User() {
    const [loading, setLoading] = useState(true);
    const {id} = useParams();
    const [user, setUser] = useState();

    useEffect(() => {
        axios(`https://jsonplaceholder.typicode.com/users/${id}`)
            .then((res) => setUser(res.data))
            .finally(() => setLoading(false));
    }, [id]);
    return (
        <div>

            <h1>User Detail</h1>
            {loading && <div>Loading...</div>}
            {!loading && <code>{JSON.stringify(user)}</code>}

            <br/><br/>

            <Link to={`/users/${parseInt(id) + 1}`}>Next User</Link>

        </div>
    )
}