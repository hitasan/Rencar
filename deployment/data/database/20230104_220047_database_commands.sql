CREATE TABLE "rencar$series" (
	"id" BIGINT NOT NULL,
	"name" VARCHAR_IGNORECASE(200) NULL,
	"color" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('001f86aa-8e8d-49a0-83d0-c8c086d8c33d', 
'Rencar.Series', 
'rencar$series', 
false, 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('a8d0f048-b39a-4977-9d61-4ff5f34dd0f7', 
'001f86aa-8e8d-49a0-83d0-c8c086d8c33d', 
'Name', 
'name', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('c07fbc71-d6da-437a-bac0-71db1315de8b', 
'001f86aa-8e8d-49a0-83d0-c8c086d8c33d', 
'Color', 
'color', 
30, 
200, 
'', 
false);
CREATE TABLE "rencar$value" (
	"id" BIGINT NOT NULL,
	"xvalue" VARCHAR_IGNORECASE(200) NULL,
	"yvalue" INT NULL,
	"bubblesize" INT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('853bdb8f-c492-48ee-b1ff-b676809a9f41', 
'Rencar.Value', 
'rencar$value', 
false, 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('931dd979-1a43-4be7-a337-d0f6e238d33d', 
'853bdb8f-c492-48ee-b1ff-b676809a9f41', 
'xValue', 
'xvalue', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('1a7365bb-4b2e-49de-9a75-6b701e0a38b7', 
'853bdb8f-c492-48ee-b1ff-b676809a9f41', 
'yValue', 
'yvalue', 
3, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('2d532ce5-2d7a-4898-9f38-2718f46c8e79', 
'853bdb8f-c492-48ee-b1ff-b676809a9f41', 
'BubbleSize', 
'bubblesize', 
3, 
0, 
'0', 
false);
CREATE TABLE "rencar$value_series" (
	"rencar$valueid" BIGINT NOT NULL,
	"rencar$seriesid" BIGINT NOT NULL,
	PRIMARY KEY("rencar$valueid","rencar$seriesid"),
	CONSTRAINT "uniq_rencar$value_series_rencar$valueid" UNIQUE ("rencar$valueid"));
CREATE INDEX "idx_rencar$value_series_rencar$series_rencar$value" ON "rencar$value_series" ("rencar$seriesid" ASC,"rencar$valueid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('87c481da-78ad-4116-b5a3-cb861437f812', 
'Rencar.Value_Series', 
'rencar$value_series', 
'853bdb8f-c492-48ee-b1ff-b676809a9f41', 
'001f86aa-8e8d-49a0-83d0-c8c086d8c33d', 
'rencar$valueid', 
'rencar$seriesid', 
'idx_rencar$value_series_rencar$series_rencar$value');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_rencar$value_series_rencar$valueid', 
'87c481da-78ad-4116-b5a3-cb861437f812', 
'2852069f-eead-366d-8a6d-2271134a6bf7');
CREATE TABLE "rencar$value_dashboardhelper" (
	"rencar$valueid" BIGINT NOT NULL,
	"rencar$dashboardhelperid" BIGINT NOT NULL,
	PRIMARY KEY("rencar$valueid","rencar$dashboardhelperid"),
	CONSTRAINT "uniq_rencar$value_dashboardhelper_rencar$valueid" UNIQUE ("rencar$valueid"));
CREATE INDEX "idx_rencar$value_dashboardhelper_rencar$dashboardhelper_rencar$value" ON "rencar$value_dashboardhelper" ("rencar$dashboardhelperid" ASC,"rencar$valueid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('46bb6ab3-4cdb-4d35-8ea3-ed0467733366', 
'Rencar.Value_DashboardHelper', 
'rencar$value_dashboardhelper', 
'853bdb8f-c492-48ee-b1ff-b676809a9f41', 
'4305b0d9-bdd1-47af-b985-e4f18fd8a149', 
'rencar$valueid', 
'rencar$dashboardhelperid', 
'idx_rencar$value_dashboardhelper_rencar$dashboardhelper_rencar$value');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_rencar$value_dashboardhelper_rencar$valueid', 
'46bb6ab3-4cdb-4d35-8ea3-ed0467733366', 
'f791be5f-22c1-38c0-92af-607ddad82766');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230104 22:00:47';
