# tabletop-war
This is my attempt to create a program to assist with large strategic tabletop wargames, specifically the 15mm Napoleonic wars that my dad and his friends have regularly played.  The aim is to create something that removes the brain strain from large battles!

## Map Editor
The map editor needs a way to let the user define the size of the grid/map.  It also needs a way to let the user define the type of terrain for each grid location.  This can then be saved, with the user choosing a file name.  This will be able to be imported into the game when setting up a campaign.

## Army Creation
The army creation 'tool' will again require the ability to save the armies.  The game will need to be able to import multiple armies for each player of the game.

### User inputs to create an army
1. Number of Corps
2. How many Divisions of Corps are required
3. How many Brigades for Divisions are required
4. How many Battalions for each Brigade are required
5. What Nationality is the army
6. How many Companies per Battalion
7. Overall strength of the Battalion

### Unit creation
1. Unit name
2. Unit type (infantry [2 types], cavalry [4 types], artillery [2 types])
3. Firing ability / Combat ability / Officer's ability (Excellent, Good, Fair, Poor, Despicable)
4. Weapon type (probably unit type based)
5. Nation
6. Experience (Veteran, Trained, Conscript)
7. Deployment (Rapid, Moderate, Slow)
8. Armor (None, Frontal, Full)
9. No. of Elements (Infantry = no. of companies, Cavalry = no. of squadrons, Artillery = no. of cannon)
10. Total Strength
11. Morale (Graded A - F)
12. Cadre (Superior, Veteran, Trained, Untrained)

After creation of the first unit, further units should be able to be added to the army currently being built.

### Brigade Creation
1. Basic Nationality
2. Name of Brigadier
3. Rank
4. Formation Title
5. Type of Brigade:
    - Infantry
    - Light Infantry
    - Cuirassiers
    - Lancers
    - Dragoons
    - Hussars
    - Horse Artillery
    - Foot Artillery
6. How many units?
7. No. Squads/Guns per unit
8. Overall unit strength

Brigades would also be saved and added to each time one was created until the required quantity was entered by the user.

### Command Groups / Generals
Armies are organised by command groups or Generals (the players of the game)
1. Name
2. Rank
3. Formation Title
4. Nationality
5. Command Ability (Excellent, Good, Fair, Poor, Despicable)
6. Troop Loyalty (Excellent, Good, Fair, Poor, Despicable)
7. Command Level (Staff Officer, Brigade Commander, Division Commander, Corps Commander)
8. Command Group Reference (1st created would be 1, and so on)

### Organisation
- Division to Corps
- Brigades to Divisions
- Transfer, Disassociate and Allocate Units

## Game Setup
To setup a game a map will need to be imported, followed by the armies required for the game.
The game will need the ability to save progress for loading should play be interrupted.

The game will need to have turns for each command group until the win condition has been met.

