import {useState} from 'react';

import Form from './Form';
import List from './List';
import Footer from './Footer';


export default function Components() {

    const [todos, setTodos] = useState(
        JSON.parse(localStorage.getItem("todos")) || []
    );
    const [hide, setHide] = useState("All");

    return (
        <div className="todoapp">
            <Form todos={todos} setTodos={setTodos}/>{" "}
            <List todos={todos} setTodos={setTodos} hide={hide}/>{" "}
            <Footer todos={todos} setTodos={setTodos} setHide={setHide}/>{" "}
        </div>
    );
}

