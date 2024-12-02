ALTER TABLE "rencar$dashboardhelper" ADD "currentvalue" INT NULL;
UPDATE "rencar$dashboardhelper"
 SET "currentvalue" = 0;
ALTER TABLE "rencar$dashboardhelper" ADD "minimumvalue" INT NULL;
UPDATE "rencar$dashboardhelper"
 SET "minimumvalue" = 0;
ALTER TABLE "rencar$dashboardhelper" ADD "maximumvalue" INT NULL;
UPDATE "rencar$dashboardhelper"
 SET "maximumvalue" = 0;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('2accc058-ec90-41d6-84be-35c3585455d9', 
'4305b0d9-bdd1-47af-b985-e4f18fd8a149', 
'CurrentValue', 
'currentvalue', 
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
 VALUES ('0d696a31-4f74-45aa-a11d-5f88e0554a3a', 
'4305b0d9-bdd1-47af-b985-e4f18fd8a149', 
'MinimumValue', 
'minimumvalue', 
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
 VALUES ('d0b9a2b4-e0cd-4b20-b5c4-5bb830c17f32', 
'4305b0d9-bdd1-47af-b985-e4f18fd8a149', 
'MaximumValue', 
'maximumvalue', 
3, 
0, 
'0', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230104 21:08:39';
