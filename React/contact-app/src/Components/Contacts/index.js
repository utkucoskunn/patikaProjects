import {useState, useEffect} from 'react';
import List from "./List"
import Form from "./Form";
import "./styless.css";

function Contacts() {
    const [contacts, setContacts] = useState([
        {
            full_name: "Utku",
            phone_number: 5551234567
        },
        {
            full_name: "Mahmut",
            phone_number: 5121213131231
        }
    ]);

    useEffect(() => {
        console.log(contacts);
    }, [contacts]);

    return (
        <div id="container">
            <h1>Contacts</h1>
            <List contacts={contacts}/>
            <Form addContact={setContacts} contacts={contacts}/>
        </div>
    )
}

export default Contacts;