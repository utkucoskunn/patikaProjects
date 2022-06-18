import {NavLink, Outlet, BrowserRouter, Routes, Route, useMatch, useParams} from "react-router-dom";
import {useEffect, useState} from "react";
import axios from 'axios';
import User from "./User";


export default function Users() {
    const [users, setUsers] = useState([]);
    const [loading, setLoading] = useState(true);


    useEffect(() => {
        axios('https://jsonplaceholder.typicode.com/users')
            .then(res => setUsers(res.data))
            .finally(() => setLoading(false));
    }, [])
    return (
        <div>
            <nav>
                <h2>Users</h2>
                {loading && <div>Loading...</div>}
                <ul>
                    {
                        users.map((user) => <NavLink
                            style={({isActive}) => {
                                return {
                                    display: "block",
                                    margin: "1rem 0",
                                    color: isActive ? "red" : ""
                                };
                            }}
                            key={user.id}
                            to={`/users/${user.id}`}>{user.name}
                        </NavLink>)}

                </ul>
            </nav>
            <Outlet/>

            <Routes>
                    <Route path="/:id" element={<User/>}/>
            </Routes>
        </div>
    )
        ;
}