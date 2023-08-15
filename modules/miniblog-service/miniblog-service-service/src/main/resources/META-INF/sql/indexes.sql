create index IX_65D6F7C8 on DG_ContactEntry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_26CAD04A on DG_ContactEntry (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_5B00F437 on DG_MiniBlogEntry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_ADD71C79 on DG_MiniBlogEntry (uuid_[$COLUMN_LENGTH:75$], groupId);