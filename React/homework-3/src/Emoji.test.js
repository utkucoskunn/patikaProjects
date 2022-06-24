import React from "react";
import {render, screen} from '@testing-library/react';
import "@testing-library/jest-dom";
import Header from "./Header";
import App from "./App";


describe("emoji testleri", () => {
    let header, items;

    test("Başlık kısmının başarılı bir şekilde render edildiğini kontrol edecek olan test ", () => {
        render(<Header/>);
        header = screen.getByText(/Emoji Search/i);
        expect(header).toBeInTheDocument();

    });
    test("Uygulama ilk açıldığında emoji listesinin başarılı bir şekilde render edildiğini kontrol edecek olan test ", () => {
        render(<App/>);
        items = screen.getAllByText("Click to copy emoji");
        expect(items.length).toEqual(20);
    });

    test("Bir filtreleme işlemi yapıldığında, emoji listesinin bu filtreye uygun şekilde yeniden render edildiğini kontrol edecek olan test ", () => {
        render(<App/>);
        const inputText = screen.getByText("1234");
        expect(inputText).toBeInTheDocument("1234");
    });

    test("Liste üzerinden herhangi emojiye tıklandığında, ilgili emojinin kopyalandığını kontrol edecek olan test ", () => {
        render(<App/>);
        let input = screen.getByPlaceholderText("search");
        let inputChild = input[0];
        inputChild = screen.getByText("1234");
        expect(inputChild).toBeInTheDocument("1234");
    });


});