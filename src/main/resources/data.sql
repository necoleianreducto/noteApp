DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS note;
DROP TABLE IF EXISTS label;
DROP TABLE IF EXISTS noteLabel;
DROP TABLE IF EXISTS usersNotes;

CREATE TABLE users (
  userId INT PRIMARY KEY,
  name VARCHAR(32) NOT NULL,
  surname VARCHAR(32) NOT NULL
);

CREATE TABLE note (
  noteId INT PRIMARY KEY,
  title VARCHAR(32) NOT NULL,
  content VARCHAR(300) NOT NULL
);

CREATE TABLE label (
  labelId INT PRIMARY KEY,
  name VARCHAR(32) NOT NULL
);

CREATE TABLE noteLabel (
  noteId INT NOT NULL,
  labelId INT NOT NULL,
  FOREIGN KEY (noteId) REFERENCES note(noteId),
  FOREIGN KEY (labelId) REFERENCES label(labelId)
);

CREATE TABLE usersNotes (
    noteId INT NOT NULL,
    userId INT NOT NULL,
    FOREIGN KEY (noteId) REFERENCES note (noteId),
    FOREIGN KEY (userId) REFERENCES users (userId)
)

INSERT INTO users (id, name, surname) VALUES
  (1, 'first', 'last 1'),
  (2, 'first', 'last 2'),
  (3, 'first', 'last 3');