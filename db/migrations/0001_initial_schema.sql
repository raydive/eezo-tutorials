-- eezo migration 1
-- initial_schema
-- fingerprint: afd57a88af6edda1
-- GENERATED. Do not edit; change the model and re-freeze.

create table "book" (
  "author" text not null,
  "id" uuid primary key,
  "pages" integer not null,
  "title" text not null
);

create unique index "uq_book_title" on "book" ("title");
