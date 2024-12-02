ALTER TABLE "masterdata$vehicle" ADD "submetaobjectname" VARCHAR_IGNORECASE(255) NULL;
UPDATE "masterdata$vehicle"
 SET "submetaobjectname" = 'MasterData.Vehicle';
CREATE INDEX "idx_masterdata$vehicle_submetaobjectname_asc" ON "masterdata$vehicle" ("submetaobjectname" ASC,"id" ASC);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('7b0e835d-3079-3d8e-a3a9-5cbeeb107376', 
'0f48a1fb-e726-4aad-a7cd-ea76fd931f69', 
'submetaobjectname', 
'submetaobjectname', 
30, 
255, 
'MasterData.Vehicle', 
false);
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('9f0c3845-89fa-34dc-b811-47fe19d032ed', 
'0f48a1fb-e726-4aad-a7cd-ea76fd931f69', 
'idx_masterdata$vehicle_submetaobjectname_asc');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('9f0c3845-89fa-34dc-b811-47fe19d032ed', 
'7b0e835d-3079-3d8e-a3a9-5cbeeb107376', 
false, 
0);
CREATE TABLE "masterdata$motorcycle" (
	"id" BIGINT NOT NULL,
	"displacement" INT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"superentity_id", 
"remote", 
"remote_primary_key")
 VALUES ('2ed27bc2-4db9-499c-ac1c-356158c251ed', 
'MasterData.Motorcycle', 
'masterdata$motorcycle', 
'0f48a1fb-e726-4aad-a7cd-ea76fd931f69', 
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
 VALUES ('d702a039-71f6-486a-9c08-c6ed53bf5013', 
'2ed27bc2-4db9-499c-ac1c-356158c251ed', 
'Displacement', 
'displacement', 
3, 
0, 
'0', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230104 23:03:46';
