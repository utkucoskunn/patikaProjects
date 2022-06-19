import React from "react";
import {useFormik} from 'formik';
import '../App.css';
import validation from "../validation";

export default function Signup() {
    const {handleSubmit, values, handleChange} = useFormik({
            initialValues: {
                email: '',
                password: "",
                passwordConfirm: "",
                /*firstName: '',
                lastName: '',
                gender: 'male',
                hobies: '[]',
                country: "",*/
            },
            onSubmit: values => {
                console.log(values);
            },
        validationSchema:validation,
        })
    ;
    return (
        <div className="App">
            <form onSubmit={handleSubmit}>
                <label>Email</label>
                <input name="email" value={values.email} placeholder="utkucoskun@windowslive.com"
                       onChange={handleChange}/>

                <br/><br/>

                <label>Password</label>
                <input name="password" value={values.password} placeholder="Password"
                       onChange={handleChange}/>

                <br/><br/>

                <label>Password Confirm</label>
                <input name="passwordConfirm" value={values.passwordConfirm} placeholder="Confirm Password"
                       onChange={handleChange}/>

                <br/><br/>
                {/* <label htmlFor="firstName">First Name</label>
                <input name="firstName" value={values.firstName} onChange={handleChange}/>

                <label htmlFor="lastName">Last Name</label>
                <input name="lastName" value={values.lastName} onChange={handleChange}/>



                <label htmlFor="gender">Gender</label>
                <span>Male</span>
                <input
                    value={values.gender}
                    name="gender"
                    type="radio"
                    value="male"
                    onChange={handleChange}
                    checked={values.gender === 'male'}
                />
                <span>Female</span>
                <input
                    value={values.gender}
                    name="gender"
                    type="radio"
                    value="female"
                    onChange={handleChange}/>
                <br/><br/>
                <div>
                    <h6 style={{display: "inline-block"}}>Football</h6>
                    <input type="checkbox" name="hobies" value="Football" onChange={handleChange}/>
                </div>
                <div>
                    <h6 style={{display: "inline-block"}}>Cinema</h6>
                    <input type="checkbox" name="hobies" value="cinema" onChange={handleChange}/>
                </div>
                <div>
                    <h6 style={{display: "inline-block"}}>Photography</h6>
                    <input type="checkbox" name="hobies" value="photography" onChange={handleChange}/>
                </div>
                <br/><br/>

                <select name="country" value={values.country} onChange={handleChange}>
                    <option value="tr">Turkey</option>
                    <option value="en">England</option>
                    <option value="usa">USA</option>
                </select>

                <br/><br/>


                <br/><br/>
                */}
                <button type="submit">Submit</button>
                <br/><br/>
                <code>{JSON.stringify(values)}</code>
            </form>
            )}
        </div>
    )
}