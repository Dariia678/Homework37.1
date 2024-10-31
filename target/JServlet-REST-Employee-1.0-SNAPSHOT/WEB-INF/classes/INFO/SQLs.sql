-- SQL statements for Employee project
CREATE TABLE Employee (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255),
    position VARCHAR(255),
    phone VARCHAR(20)
);

-- Sample data
INSERT INTO Employee (id, name, position, phone) VALUES (1, 'John Doe', 'Manager', '123-456-7890');
SELECT * FROM Employee;
UPDATE Employee SET name = 'Jane Doe' WHERE id = 1;
DELETE FROM Employee WHERE id = 1;
