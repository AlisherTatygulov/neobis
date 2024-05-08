CREATE DATABASE IF NOT EXISTS book_shop;


USE book_shop;

-- Create Books Table
CREATE TABLE Books (
    id INT NOT NULL,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    genre VARCHAR(100) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    quantity_available INT NOT NULL
);

-- Create Sales Table
CREATE TABLE Sales (
    id INT NOT NULL,
    date DATE NOT NULL,
    book_id INT NOT NULL,
    quantity_sold INT NOT NULL,
    total_price DECIMAL(10, 2) NOT NULL,
    customer_id INT NOT NULL
);

-- Create Customers Table
CREATE TABLE Customers (
    id INT NOT NULL,
    name VARCHAR(255) NOT NULL,
    contact_information VARCHAR(255) NOT NULL
);