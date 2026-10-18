-- eezo migration 2
-- add_notes
-- fingerprint: c997cd02b5395c97
-- GENERATED. Do not edit; change the model and re-freeze.

alter table "book" add column "notes" text;
