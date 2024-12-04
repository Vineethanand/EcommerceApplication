CREATE TABLE categories
(
    id    BIGINT AUTO_INCREMENT NOT NULL,
    title VARCHAR(255) NULL,
    CONSTRAINT pk_categories PRIMARY KEY (id)
);

CREATE TABLE jt_intructors
(
    id BIGINT NOT NULL,
    rating DOUBLE NULL,
    CONSTRAINT pk_jt_intructors PRIMARY KEY (id)
);

CREATE TABLE jt_mentors
(
    id      BIGINT NOT NULL,
    company VARCHAR(255) NULL,
    CONSTRAINT pk_jt_mentors PRIMARY KEY (id)
);

CREATE TABLE jt_students
(
    id    BIGINT NOT NULL,
    batch VARCHAR(255) NULL,
    psp DOUBLE NULL,
    CONSTRAINT pk_jt_students PRIMARY KEY (id)
);

CREATE TABLE jt_users
(
    id    BIGINT NOT NULL,
    name  VARCHAR(255) NULL,
    email VARCHAR(255) NULL,
    phone BIGINT NULL,
    CONSTRAINT pk_jt_users PRIMARY KEY (id)
);

CREATE TABLE ms_intructors
(
    id    BIGINT NOT NULL,
    name  VARCHAR(255) NULL,
    email VARCHAR(255) NULL,
    phone BIGINT NULL,
    rating DOUBLE NULL,
    CONSTRAINT pk_ms_intructors PRIMARY KEY (id)
);

CREATE TABLE ms_mentors
(
    id      BIGINT NOT NULL,
    name    VARCHAR(255) NULL,
    email   VARCHAR(255) NULL,
    phone   BIGINT NULL,
    company VARCHAR(255) NULL,
    CONSTRAINT pk_ms_mentors PRIMARY KEY (id)
);

CREATE TABLE ms_students
(
    id    BIGINT NOT NULL,
    name  VARCHAR(255) NULL,
    email VARCHAR(255) NULL,
    phone BIGINT NULL,
    batch VARCHAR(255) NULL,
    psp DOUBLE NULL,
    CONSTRAINT pk_ms_students PRIMARY KEY (id)
);

CREATE TABLE products
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    title         VARCHAR(255) NULL,
    name          VARCHAR(255) NULL,
    price DOUBLE NULL,
    `description` VARCHAR(255) NULL,
    category_id   BIGINT NULL,
    CONSTRAINT pk_products PRIMARY KEY (id)
);

CREATE TABLE st_users
(
    id      BIGINT NOT NULL,
    dtype   VARCHAR(31) NULL,
    name    VARCHAR(255) NULL,
    email   VARCHAR(255) NULL,
    phone   BIGINT NULL,
    company VARCHAR(255) NULL,
    batch   VARCHAR(255) NULL,
    psp DOUBLE NULL,
    rating DOUBLE NULL,
    CONSTRAINT pk_st_users PRIMARY KEY (id)
);

CREATE TABLE tpc_intructors
(
    id    BIGINT NOT NULL,
    name  VARCHAR(255) NULL,
    email VARCHAR(255) NULL,
    phone BIGINT NULL,
    rating DOUBLE NULL,
    CONSTRAINT pk_tpc_intructors PRIMARY KEY (id)
);

CREATE TABLE tpc_mentors
(
    id      BIGINT NOT NULL,
    name    VARCHAR(255) NULL,
    email   VARCHAR(255) NULL,
    phone   BIGINT NULL,
    company VARCHAR(255) NULL,
    CONSTRAINT pk_tpc_mentors PRIMARY KEY (id)
);

CREATE TABLE tpc_students
(
    id    BIGINT NOT NULL,
    name  VARCHAR(255) NULL,
    email VARCHAR(255) NULL,
    phone BIGINT NULL,
    batch VARCHAR(255) NULL,
    psp DOUBLE NULL,
    CONSTRAINT pk_tpc_students PRIMARY KEY (id)
);

CREATE TABLE tpc_users
(
    id    BIGINT NOT NULL,
    name  VARCHAR(255) NULL,
    email VARCHAR(255) NULL,
    phone BIGINT NULL,
    CONSTRAINT pk_tpc_users PRIMARY KEY (id)
);

ALTER TABLE jt_intructors
    ADD CONSTRAINT FK_JT_INTRUCTORS_ON_ID FOREIGN KEY (id) REFERENCES jt_users (id);

ALTER TABLE jt_mentors
    ADD CONSTRAINT FK_JT_MENTORS_ON_ID FOREIGN KEY (id) REFERENCES jt_users (id);

ALTER TABLE jt_students
    ADD CONSTRAINT FK_JT_STUDENTS_ON_ID FOREIGN KEY (id) REFERENCES jt_users (id);

ALTER TABLE products
    ADD CONSTRAINT FK_PRODUCTS_ON_CATEGORY FOREIGN KEY (category_id) REFERENCES categories (id);