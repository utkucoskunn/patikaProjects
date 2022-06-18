import {NavLink, Outlet} from "react-router-dom";

export default function Layout() {
    return (
        <div>
            <nav>
                <ul>
                    <li>
                        <NavLink
                            style={({isActive}) => ({color: isActive ? "red" : "pink"})}
                            to="/">Home</NavLink>
                    </li>
                    <li>
                        <NavLink
                            style={({isActive}) => ({color: isActive ? "red" : "pink"})}
                            to="/users">Users</NavLink>
                    </li>
                    <li>
                        <NavLink
                            style={({isActive}) => ({color: isActive ? "red" : "pink"})}
                            to="/about">About</NavLink>
                    </li>
                </ul>
            </nav>
            <Outlet/>
        </div>
    )
}

