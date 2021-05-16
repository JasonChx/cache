CREATE SEQUENCE hibernate_sequence;

CREATE TABLE question
  (
     id         INT8 NOT NULL,
     content    VARCHAR(255),
     PRIMARY KEY (id)
  );

CREATE TABLE option
(
   id         INT8 NOT NULL,
   content    VARCHAR(255),
   PRIMARY KEY (id)
);

CREATE TABLE question_options
(
   question_id  INT8 NOT NULL,
   options_id   INT8 NOT NULL
);

CREATE TABLE answer
(
   id           INT8 NOT NULL,
   date         timestamp NOT NULL,
   question_id  INT8 NOT NULL,
   option_id   INT8 NOT NULL,
   PRIMARY KEY (id)
);

INSERT INTO question(id, content)
VALUES
( 1, 'Which of the following words would you use to describe our product?'),
( 2, 'How well does our product meet your needs?');

INSERT INTO option(id, content)
VALUES
( 1, 'Buggy'),
( 2, 'Fine, but there are some issues'),
( 3, 'Great'),
( 4, 'Life-saving'),
( 5, 'Badly'),
( 6, 'Fine'),
( 7, 'Well'),
( 8, 'Very well');

INSERT INTO question_options
VALUES
( 1, 1),
( 1, 2),
( 1, 3),
( 1, 4),
( 2, 1),
( 2, 2),
( 2, 3),
( 2, 4);