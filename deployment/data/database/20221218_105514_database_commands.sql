ALTER TABLE "masterdata$state" ADD "uf" VARCHAR_IGNORECASE(2) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('e068824f-992d-44a3-8319-b91d66d99e46', 
'cb4a5941-31da-4eab-bf57-de7e8d36518b', 
'UF', 
'uf', 
30, 
2, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20221218 10:55:14';
