import {BrowserRouter, Route, Routes, Link, NavLink} from "react-router-dom";

import Home from "./Components/Home";
import Users from "./Components/Users";
import User from "./Components/User";
import About from "./Components/About";
import Layout from "./Components/Layout";


function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/*" element={<Layout/>}>
                    <Route path="" element={<Home/>}/>
                    <Route path="users/*" element={<Users/>}/>
                    <Route path="about" element={<About/>}/>
                </Route>
            </Routes>
        </BrowserRouter>
    )
}

export default App;
