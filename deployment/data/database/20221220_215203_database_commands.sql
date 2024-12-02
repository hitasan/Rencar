CREATE TABLE "rencar$contractsummary" (
	"id" BIGINT NOT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"superentity_id", 
"remote", 
"remote_primary_key")
 VALUES ('332efcfb-49b2-416b-8054-738eda16396c', 
'Rencar.ContractSummary', 
'rencar$contractsummary', 
'170ce49d-f29c-4fac-99a6-b55e8a3aeb39', 
false, 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20221220 21:52:03';
