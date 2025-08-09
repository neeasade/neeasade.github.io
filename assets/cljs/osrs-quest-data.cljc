(ns osrs.data)
(def quest-data
  '({:title "The Restless Ghost", :quests (), :skills {}, :extra ()}
    {:title "The Knight's Sword",
     :quests (),
     :skills {:Mining 10},
     :extra
     ("The ability to run from level 57 ice warriors and level 53 ice giants could help.")}
    {:title "The Corsair Curse", :quests (), :skills {}, :extra ()}
    {:title "Cook's Assistant", :quests (), :skills {}, :extra ()}
    {:title "Sheep Shearer", :quests (), :skills {}, :extra ()}
    {:title "Below Ice Mountain",
     :quests (),
     :skills {:questpoints 16},
     :extra ()}
    {:title "X Marks the Spot", :quests (), :skills {}, :extra ()}
    {:title "Misthalin Mystery", :quests (), :skills {}, :extra ()}
    {:title "Rune Mysteries", :quests (), :skills {}, :extra ()}
    {:title "Dragon Slayer I",
     :quests (),
     :skills {},
     :extra ("The ability to defeat a level 83 dragon")}
    {:title "Pirate's Treasure", :quests (), :skills {}, :extra ()}
    {:title "Goblin Diplomacy", :quests (), :skills {}, :extra ()}
    {:title "Witch's Potion", :quests (), :skills {}, :extra ()}
    {:title "Black Knights' Fortress",
     :quests (),
     :skills {},
     :extra ("The ability to evade level 33 Black Knights")}
    {:title "Doric's Quest", :quests (), :skills {}, :extra ()}
    {:title "Prince Ali Rescue", :quests (), :skills {}, :extra ()}
    {:title "Imp Catcher", :quests (), :skills {}, :extra ()}
    {:title "Vampyre Slayer", :quests (), :skills {}, :extra ()}
    {:title "Ernest the Chicken",
     :quests (),
     :skills {},
     :extra ("The ability to defend from a level 22 Skeleton .")}
    {:title "Shield of Arrav", :quests (), :skills {}, :extra ()}
    {:title "Demon Slayer", :quests (), :skills {}, :extra ()}
    {:title "Romeo & Juliet", :quests (), :skills {}, :extra ()}
    {:title "Druidic Ritual", :quests (), :skills {}, :extra ()}
    {:title "Lost City",
     :quests (),
     :skills {:Crafting 31, :Woodcutting 36},
     :extra
     ("Ability to kill a level 101 Tree spirit with limited armour and weapons .")}
    {:title "Witch's House",
     :quests (),
     :skills {},
     :extra
     ("The ability to defeat 4 monsters from level 19 to 53 without a break.")}
    {:title "Merlin's Crystal", :quests (), :skills {}, :extra ()}
    {:title "Heroes' Quest",
     :quests
     ("Shield of Arrav"
      "Lost City"
      "Merlin's Crystal"
      "Dragon Slayer I"
      "Shield of Arrav"
      "Lost City"
      "Merlin's Crystal"
      "Dragon Slayer I"),
     :skills
     {:questpoints 55,
      :Cooking 53,
      :Fishing 53,
      :Herblore 25,
      :Mining 50},
     :extra ("A partner")}
    {:title "Scorpion Catcher",
     :quests ("Alfred Grimhand's Barcrawl"),
     :skills {:Prayer 31},
     :extra
     ("Completion of Alfred Grimhand's Barcrawl"
      "The ability to run past level 172 black demons and level 64 poison spiders")}
    {:title "Family Crest",
     :quests (),
     :skills {:Mining 40, :Smithing 40, :Magic 59, :Crafting 40},
     :extra
     ("The ability to defeat a level 170 demon (can be safespotted )")}
    {:title "Fishing Contest",
     :quests (),
     :skills {:Fishing 10},
     :extra ()}
    {:title "Tribal Totem", :quests (), :skills {:Thieving 21}, :extra ()}
    {:title "Monk's Friend", :quests (), :skills {}, :extra ()}
    {:title "Temple of Ikov",
     :quests (),
     :skills {:Thieving 42, :Ranged 40},
     :extra ("The ability to defeat a level 84 enemy with Ranged")}
    {:title "Clock Tower", :quests (), :skills {}, :extra ()}
    {:title "Holy Grail",
     :quests ("Merlin's Crystal" "Merlin's Crystal"),
     :skills {:Attack 20},
     :extra
     ("Must be able to defeat a level 120 Black Knight Titan (can be safespotted or flinched )")}
    {:title "Tree Gnome Village",
     :quests (),
     :skills {},
     :extra ("The ability to defeat a level 112 Khazard warlord")}
    {:title "Fight Arena",
     :quests (),
     :skills {},
     :extra
     ("The ability to defeat level 44, 63 and 137 enemies (all can be safespotted )")}
    {:title "Hazeel Cult", :quests (), :skills {}, :extra ()}
    {:title "Sheep Herder", :quests (), :skills {}, :extra ()}
    {:title "Plague City", :quests (), :skills {}, :extra ()}
    {:title "Sea Slug", :quests (), :skills {:Firemaking 30}, :extra ()}
    {:title "Waterfall Quest",
     :quests (),
     :skills {},
     :extra
     ("The ability to withstand and evade attacks from level 86 Fire Giants and level 84 Moss Guardian without any equipment.")}
    {:title "Jungle Potion",
     :quests ("Druidic Ritual"),
     :skills {:Herblore 3},
     :extra
     ("Completion of Druidic Ritual"
      "The ability to defend against level 53 Jogres and level 46 Harpie Bug Swarms .")}
    {:title "The Grand Tree",
     :quests (),
     :skills {:Agility 25},
     :extra
     ("The ability to defeat a level 172 Black demon (safespottable for Ranged and Magic or melee using a halberd ).")}
    {:title "Underground Pass",
     :quests ("Biohazard" "Plague City" "Biohazard" "Plague City"),
     :skills {:Ranged 25},
     :extra ()}
    {:title "Observatory Quest", :quests (), :skills {}, :extra ()}
    {:title "The Tourist Trap",
     :quests (),
     :skills {:Fletching 10, :Smithing 20},
     :extra ("The ability to defeat a level 47 enemy")}
    {:title "Watchtower",
     :quests (),
     :skills
     {:Magic 14, :Thieving 15, :Agility 25, :Herblore 14, :Mining 40},
     :extra
     ("The ability to defeat a level 68 Ogre and run past level 111 Blue dragons")}
    {:title "Dwarf Cannon", :quests (), :skills {}, :extra ()}
    {:title "Murder Mystery", :quests (), :skills {}, :extra ()}
    {:title "The Dig Site",
     :quests (),
     :skills {:Agility 10, :Herblore 10, :Thieving 25},
     :extra ()}
    {:title "Gertrude's Cat", :quests (), :skills {}, :extra ()}
    {:title "Legends' Quest",
     :quests
     ("Family Crest"
      "Heroes' Quest"
      "Shield of Arrav"
      "Lost City"
      "Merlin's Crystal"
      "Dragon Slayer I"
      "Shilo Village"
      "Jungle Potion"
      "Druidic Ritual"
      "Underground Pass"
      "Biohazard"
      "Plague City"
      "Waterfall Quest"
      "Family Crest"
      "Heroes' Quest"
      "Shield of Arrav"
      "Lost City"
      "Merlin's Crystal"
      "Dragon Slayer I"
      "Shilo Village"
      "Jungle Potion"
      "Druidic Ritual"
      "Underground Pass"
      "Biohazard"
      "Plague City"
      "Waterfall Quest"),
     :skills
     {:Crafting 50,
      :Herblore 45,
      :Magic 56,
      :Thieving 50,
      :Strength 50,
      :Smithing 50,
      :Prayer 42,
      :Mining 52,
      :Woodcutting 50,
      :questpoints 107,
      :Agility 50},
     :extra ("The ability to defeat a level 187 demon")}
    {:title "Death Plateau", :quests (), :skills {}, :extra ()}
    {:title "Eadgar's Ruse",
     :quests
     ("Druidic Ritual"
      "Troll Stronghold"
      "Death Plateau"
      "Druidic Ritual"
      "Troll Stronghold"
      "Death Plateau"),
     :skills {:Herblore 31},
     :extra ()}
    {:title "Big Chompy Bird Hunting",
     :quests (),
     :skills {:Fletching 5, :Cooking 30, :Ranged 30},
     :extra
     ("The ability to defend against level 64 wolves and level 53 ogres")}
    {:title "Elemental Workshop I",
     :quests (),
     :skills {:Mining 20, :Smithing 20, :Crafting 20},
     :extra ()}
    {:title "Nature Spirit",
     :quests ("Priest in Peril" "The Restless Ghost"),
     :skills {},
     :extra
     ("Completion of Priest in Peril" "Completion of The Restless Ghost")}
    {:title "Priest in Peril", :quests (), :skills {}, :extra ()}
    {:title "Regicide",
     :quests
     ("Underground Pass"
      "Biohazard"
      "Plague City"
      "Underground Pass"
      "Biohazard"
      "Plague City"),
     :skills {:Crafting 10, :Agility 56},
     :extra
     ("The ability to defeat a level 110 Tyras guard (can be safespotted )")}
    {:title "Tai Bwo Wannai Trio",
     :quests
     ("Jungle Potion" "Druidic Ritual" "Jungle Potion" "Druidic Ritual"),
     :skills {:Agility 15, :Cooking 30, :Fishing 5},
     :extra ()}
    {:title "Troll Stronghold",
     :quests ("Death Plateau"),
     :skills {:Agility 15},
     :extra
     ("Completion of Death Plateau"
      "The ability to defeat a level 113 Troll General (can be safespotted )")}
    {:title "Shades of Mort'ton",
     :quests ("Priest in Peril" "Priest in Peril"),
     :skills {:Crafting 20, :Herblore 15, :Firemaking 5},
     :extra
     ("Must be able to defeat 5 level-40 Loar Shades ."
      "Must be able to survive an onslaught when rebuilding the Temple (Being surrounded by many players makes this much easier)."
      "Access to Mort'ton")}
    {:title "The Fremennik Trials",
     :quests (),
     :skills {:Fletching 25, :Woodcutting 40, :Crafting 40},
     :extra
     ("OR Players can kill Lanzig , Borrokar , Lensa , or Freidir to obtain the lyre (1/17 chance)"
      "Ability to defeat a level-69 Draugen"
      "Ability to defeat a fairly strong warrior without armour , weapons , or spells")}
    {:title "Horror from the Deep",
     :quests ("Alfred Grimhand's Barcrawl"),
     :skills {:Agility 35},
     :extra ("Completion of Alfred Grimhand's Barcrawl")}
    {:title "Throne of Miscellania",
     :quests
     ("Heroes' Quest"
      "Shield of Arrav"
      "Lost City"
      "Merlin's Crystal"
      "Dragon Slayer I"
      "The Fremennik Trials"
      "Heroes' Quest"
      "Shield of Arrav"
      "Lost City"
      "Merlin's Crystal"
      "Dragon Slayer I"
      "The Fremennik Trials"),
     :skills {},
     :extra ()}
    {:title "Monkey Madness I",
     :quests
     ("The Grand Tree"
      "Tree Gnome Village"
      "The Grand Tree"
      "Tree Gnome Village"),
     :skills {},
     :extra ("The ability to defeat a level 195 Jungle Demon")}
    {:title "Haunted Mine",
     :quests
     ("Priest in Peril"
      "Nature Spirit"
      "Druid pouch"
      "Fire pit"
      "Priest in Peril"),
     :skills {:Crafting 35},
     :extra
     ("The ability to defeat a level 95 enemy"
      "Access to Abandoned Mine")}
    {:title "Troll Romance",
     :quests
     ("Troll Stronghold"
      "Death Plateau"
      "Troll Stronghold"
      "Death Plateau"),
     :skills {:Agility 28},
     :extra ("The ability to defeat a level 113 troll")}
    {:title "In Search of the Myreque",
     :quests
     ("Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"),
     :skills {:Agility 25},
     :extra ("The ability to defeat a level 97 foe ( safespottable )")}
    {:title "Creature of Fenkenstrain",
     :quests ("Priest in Peril" "The Restless Ghost"),
     :skills {:Crafting 20, :Thieving 25},
     :extra
     ("Completion of Priest in Peril"
      "Completion of The Restless Ghost"
      "Able to defeat a level 51 monster and run past level 72 monsters")}
    {:title "Roving Elves",
     :quests
     ("Regicide"
      "Underground Pass"
      "Biohazard"
      "Plague City"
      "Waterfall Quest"
      "Sheep Herder"
      "Big Chompy Bird Hunting"
      "Regicide"
      "Underground Pass"
      "Biohazard"
      "Plague City"
      "Waterfall Quest"),
     :skills {:Agility 56},
     :extra
     ("The ability to defeat a level 84 enemy unarmed, with heavy restrictions")}
    {:title "Ghosts Ahoy",
     :quests (),
     :skills {:Agility 25, :Cooking 20},
     :extra ("Completed Priest in Peril" "Completed The Restless Ghost")}
    {:title "One Small Favour",
     :quests
     ("Rune Mysteries"
      "Shilo Village"
      "Jungle Potion"
      "Druidic Ritual"
      "Rune Mysteries"
      "Shilo Village"
      "Jungle Potion"
      "Druidic Ritual"),
     :skills {:Agility 36, :Crafting 25, :Herblore 18, :Smithing 30},
     :extra ()}
    {:title "Mountain Daughter",
     :quests (),
     :skills {:Agility 20},
     :extra
     ("The ability to defeat a level 70 monster (can be safespotted )")}
    {:title "Between a Rock...",
     :quests
     ("Dwarf Cannon" "Fishing Contest" "Dwarf Cannon" "Fishing Contest"),
     :skills {:Defence 30, :Mining 40, :Smithing 50},
     :extra
     ("The ability to defeat a level 75-125 enemy (depends on how much gold you mine)")}
    {:title "The Feud",
     :quests (),
     :skills {:Thieving 30},
     :extra
     ("The ability to kill a level 70 bandit and a level 75 Menaphite (both can be safespotted).")}
    {:title "The Golem",
     :quests (),
     :skills {:Crafting 20, :Thieving 25},
     :extra ()}
    {:title "Desert Treasure I",
     :quests
     ("The Dig Site"
      "Temple of Ikov"
      "The Tourist Trap"
      "Troll Stronghold"
      "Death Plateau"
      "Priest in Peril"
      "Waterfall Quest"
      "The Dig Site"
      "Temple of Ikov"
      "The Tourist Trap"
      "Troll Stronghold"
      "Death Plateau"
      "Priest in Peril"
      "Waterfall Quest"),
     :skills {:Thieving 53, :Magic 50, :Firemaking 50, :Slayer 10},
     :extra ("Access to Morytania Graveyard")}
    {:title "Icthlarin's Little Helper",
     :quests ("Gertrude's Cat"),
     :skills {},
     :extra
     ("Completion of Gertrude's Cat"
      "The ability to defeat a level 91 monster.")}
    {:title "Tears of Guthix",
     :quests (),
     :skills {:questpoints 43, :Firemaking 49, :Crafting 20, :Mining 20},
     :extra ()}
    {:title "The Lost Tribe",
     :quests
     ("Goblin Diplomacy"
      "Rune Mysteries"
      "Goblin Diplomacy"
      "Rune Mysteries"),
     :skills {:Agility 13, :Thieving 13, :Mining 17},
     :extra ()}
    {:title "The Giant Dwarf",
     :quests (),
     :skills {:Crafting 12, :Firemaking 16, :Magic 33, :Thieving 14},
     :extra ()}
    {:title "Recruitment Drive",
     :quests
     ("Black Knights' Fortress"
      "Druidic Ritual"
      "Black Knights' Fortress"
      "Druidic Ritual"),
     :skills {},
     :extra ()}
    {:title "Mourning's End Part I",
     :quests
     ("Roving Elves"
      "Regicide"
      "Underground Pass"
      "Biohazard"
      "Plague City"
      "Waterfall Quest"
      "Big Chompy Bird Hunting"
      "Sheep Herder"
      "Roving Elves"
      "Regicide"
      "Underground Pass"
      "Biohazard"
      "Plague City"
      "Waterfall Quest"
      "Big Chompy Bird Hunting"
      "Sheep Herder"),
     :skills {:Ranged 60, :Thieving 50},
     :extra
     ("The ability to defeat a level 11 enemy with your combat stats set to 20 each.")}
    {:title "Forgettable Tale...",
     :quests
     ("The Giant Dwarf"
      "Fishing Contest"
      "The Giant Dwarf"
      "Fishing Contest"),
     :skills {:Cooking 22, :Farming 17},
     :extra ()}
    {:title "Garden of Tranquillity",
     :quests
     ("Creature of Fenkenstrain"
      "Priest in Peril"
      "The Restless Ghost"
      "Creature of Fenkenstrain"
      "Priest in Peril"
      "The Restless Ghost"),
     :skills {:Farming 25},
     :extra ()}
    {:title "A Tail of Two Cats",
     :quests
     ("Icthlarin's Little Helper"
      "Gertrude's Cat"
      "Icthlarin's Little Helper"
      "Gertrude's Cat"),
     :skills {},
     :extra ()}
    {:title "Wanted!",
     :quests
     ("Recruitment Drive"
      "Black Knights' Fortress"
      "Druidic Ritual"
      "The Lost Tribe"
      "Rune Mysteries"
      "Goblin Diplomacy"
      "Priest in Peril"
      "Enter the Abyss"
      "Recruitment Drive"
      "Black Knights' Fortress"
      "Druidic Ritual"
      "The Lost Tribe"
      "Rune Mysteries"
      "Goblin Diplomacy"
      "Priest in Peril"
      "Enter the Abyss"),
     :skills {:questpoints 32},
     :extra ("The ability to defeat a level 32 Black Knight .")}
    {:title "Mourning's End Part II",
     :quests
     ("Mourning's End Part I"
      "Roving Elves"
      "Regicide"
      "Underground Pass"
      "Biohazard"
      "Plague City"
      "Waterfall Quest"
      "Big Chompy Bird Hunting"
      "Sheep Herder"
      "Mourning's End Part I"
      "Roving Elves"
      "Regicide"
      "Underground Pass"
      "Biohazard"
      "Plague City"
      "Waterfall Quest"
      "Big Chompy Bird Hunting"
      "Sheep Herder"),
     :skills {},
     :extra ()}
    {:title "Rum Deal",
     :quests
     ("Zogre Flesh Eaters"
      "Big Chompy Bird Hunting"
      "Jungle Potion"
      "Druidic Ritual"
      "Priest in Peril"
      "Zogre Flesh Eaters"
      "Big Chompy Bird Hunting"
      "Jungle Potion"
      "Druidic Ritual"
      "Priest in Peril"),
     :skills
     {:Crafting 42, :Fishing 50, :Farming 40, :Prayer 47, :Slayer 42},
     :extra
     ("The ability to kill a combat level 150 monster (can be safespotted )")}
    {:title "Shadow of the Storm",
     :quests ("The Golem" "Demon Slayer" "The Golem" "Demon Slayer"),
     :skills {:Crafting 30},
     :extra ("The ability to defeat a level 100 demon")}
    {:title "Making History",
     :quests
     ("Priest in Peril"
      "The Restless Ghost"
      "Ghosts Ahoy"
      "Priest in Peril"
      "The Restless Ghost"),
     :skills {},
     :extra ()}
    {:title "Ratcatchers",
     :quests
     ("Icthlarin's Little Helper"
      "Gertrude's Cat"
      "Icthlarin's Little Helper"
      "Gertrude's Cat"),
     :skills {},
     :extra ("Access to Keldagrim The Giant Dwarf started")}
    {:title "Spirits of the Elid",
     :quests (),
     :skills {:Magic 33, :Ranged 37, :Mining 37, :Thieving 37},
     :extra ("Ability to defeat three level 75 golems")}
    {:title "Devious Minds",
     :quests
     ("Wanted!"
      "Recruitment Drive"
      "Black Knights' Fortress"
      "Druidic Ritual"
      "The Lost Tribe"
      "Goblin Diplomacy"
      "Rune Mysteries"
      "Priest in Peril"
      "Troll Stronghold"
      "Death Plateau"
      "Doric's Quest"
      "Enter the Abyss"
      "Wanted!"
      "Recruitment Drive"
      "Black Knights' Fortress"
      "Druidic Ritual"
      "The Lost Tribe"
      "Goblin Diplomacy"
      "Rune Mysteries"
      "Priest in Peril"
      "Troll Stronghold"
      "Death Plateau"
      "Doric's Quest"
      "Enter the Abyss"),
     :skills {:Smithing 65, :Runecraft 50, :Fletching 50},
     :extra ()}
    {:title "The Hand in the Sand",
     :quests (),
     :skills {:Thieving 17, :Crafting 49},
     :extra ()}
    {:title "Enakhra's Lament",
     :quests (),
     :skills {:Crafting 50, :Firemaking 45, :Prayer 43, :Magic 39},
     :extra ("Must be on the standard spellbook")}
    {:title "Cabin Fever",
     :quests
     ("Pirate's Treasure"
      "Rum Deal"
      "Zogre Flesh Eaters"
      "Big Chompy Bird Hunting"
      "Jungle Potion"
      "Druidic Ritual"
      "Priest in Peril"
      "Pirate's Treasure"
      "Rum Deal"
      "Zogre Flesh Eaters"
      "Big Chompy Bird Hunting"
      "Jungle Potion"
      "Druidic Ritual"
      "Priest in Peril"),
     :skills {:Agility 42, :Crafting 45, :Smithing 50, :Ranged 40},
     :extra ()}
    {:title "Fairytale I - Growing Pains",
     :quests
     ("Lost City"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"
      "Jungle Potion"
      "Proboscis"
      "Lost City"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"),
     :skills {},
     :extra
     ("The ability to defeat a level 111 Tanglefoot with limited weaponry")}
    {:title "Recipe for Disaster",
     :quests
     ("Cook's Assistant"
      "Big Chompy Bird Hunting"
      "Biohazard"
      "Plague City"
      "Demon Slayer"
      "Murder Mystery"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"
      "Witch's House"
      "Gertrude's Cat"
      "Shadow of the Storm"
      "Demon Slayer"
      "The Golem"
      "Family Crest"
      "Heroes' Quest"
      "Shield of Arrav"
      "Lost City"
      "Merlin's Crystal"
      "Dragon Slayer I"
      "Shilo Village"
      "Jungle Potion"
      "Underground Pass"
      "Biohazard"
      "Plague City"
      "Waterfall Quest"
      "Monkey Madness I"
      "The Grand Tree"
      "Tree Gnome Village"
      "Desert Treasure I"
      "The Dig Site"
      "Temple of Ikov"
      "The Tourist Trap"
      "Troll Stronghold"
      "Death Plateau"
      "Priest in Peril"
      "Waterfall Quest"
      "Horror from the Deep"
      "Alfred Grimhand's Barcrawl"),
     :skills
     {:Crafting 40,
      :Herblore 25,
      :Magic 59,
      :Ranged 40,
      :Firemaking 50,
      :Thieving 53,
      :Smithing 40,
      :Fletching 10,
      :Mining 50,
      :Woodcutting 36,
      :Cooking 70,
      :questpoints 175,
      :Fishing 53,
      :Agility 48},
     :extra
     ("Completion of Cook's Assistant"
      "All prerequisite quest requirements"
      "The ability to defeat high leveled monsters, several of which have to be defeated without using Prayer"
      "Completion (or partial completion where stated) of the following quests: Fishing Contest"
      "Goblin Diplomacy"
      "Big Chompy Bird Hunting"
      "Murder Mystery"
      "Nature Spirit Priest in Peril"
      "The Restless Ghost"
      "Witch's House"
      "Gertrude's Cat"
      "Shadow of the Storm Demon Slayer"
      "The Golem"
      "Started Legends' Quest up until gaining access to the Kharazi Jungle Family Crest"
      "Heroes' Quest Shield of Arrav"
      "Lost City"
      "Merlin's Crystal"
      "Dragon Slayer I"
      "Shilo Village Jungle Potion Druidic Ritual"
      "Underground Pass Biohazard Plague City"
      "Monkey Madness I The Grand Tree"
      "Tree Gnome Village"
      "Desert Treasure I The Dig Site"
      "The Tourist Trap"
      "Temple of Ikov"
      "Waterfall Quest"
      "Troll Stronghold Death Plateau"
      "Horror from the Deep Alfred Grimhand's Barcrawl")}
    {:title "In Aid of the Myreque",
     :quests
     ("In Search of the Myreque"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"
      "Shades of Mort'ton"
      "Shades of Mort'ton (minigame)"
      "In Search of the Myreque"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"),
     :skills {:Agility 25, :Crafting 25, :Mining 15, :Magic 7},
     :extra ()}
    {:title "A Soul's Bane", :quests (), :skills {}, :extra ()}
    {:title "Rag and Bone Man I", :quests (), :skills {}, :extra ()}
    {:title "Swan Song",
     :quests
     ("One Small Favour"
      "Rune Mysteries"
      "Shilo Village"
      "Jungle Potion"
      "Druidic Ritual"
      "Garden of Tranquillity"
      "Creature of Fenkenstrain"
      "Priest in Peril"
      "The Restless Ghost"
      "One Small Favour"
      "Rune Mysteries"
      "Shilo Village"
      "Jungle Potion"
      "Druidic Ritual"
      "Garden of Tranquillity"
      "Creature of Fenkenstrain"
      "Priest in Peril"
      "The Restless Ghost"),
     :skills
     {:questpoints 100,
      :Magic 66,
      :Cooking 62,
      :Fishing 62,
      :Smithing 45,
      :Firemaking 42,
      :Crafting 40},
     :extra
     ("The ability to defeat a combat level 170 monster, which is able to use Magic , Melee and can drain Prayer .")}
    {:title "Royal Trouble",
     :quests
     ("Throne of Miscellania"
      "Heroes' Quest"
      "Shield of Arrav"
      "Lost City"
      "Merlin's Crystal"
      "Dragon Slayer I"
      "The Fremennik Trials"
      "Throne of Miscellania"
      "Heroes' Quest"
      "Shield of Arrav"
      "Lost City"
      "Merlin's Crystal"
      "Dragon Slayer I"
      "The Fremennik Trials"),
     :skills {:Agility 40, :Slayer 40},
     :extra ()}
    {:title "Death to the Dorgeshuun",
     :quests
     ("The Lost Tribe"
      "Goblin Diplomacy"
      "Rune Mysteries"
      "The Lost Tribe"
      "Goblin Diplomacy"
      "Rune Mysteries"),
     :skills {:Agility 23, :Thieving 23},
     :extra
     ("The ability to defeat a level 50 enemy with Melee or Magic")}
    {:title "Fairytale II - Cure a Queen",
     :quests
     ("Fairytale I - Growing Pains"
      "Lost City"
      "Nature Spirit"
      "The Restless Ghost"
      "Priest in Peril"
      "Fairytale I - Growing Pains"
      "Lost City"
      "Nature Spirit"
      "The Restless Ghost"
      "Priest in Peril"),
     :skills {:Thieving 40, :Farming 49, :Herblore 57},
     :extra ()}
    {:title "Lunar Diplomacy",
     :quests
     ("The Fremennik Trials"
      "Lost City"
      "Rune Mysteries"
      "Shilo Village"
      "Jungle Potion"
      "Druidic Ritual"
      "The Fremennik Trials"
      "Lost City"
      "Rune Mysteries"
      "Shilo Village"
      "Jungle Potion"
      "Druidic Ritual"),
     :skills
     {:Herblore 5,
      :Crafting 61,
      :Defence 40,
      :Firemaking 49,
      :Magic 65,
      :Mining 60,
      :Woodcutting 55},
     :extra
     ("The ability to kill multiple level 111 monsters."
      "Access to each of the elemental runic altars ( Air , Fire , Water , Earth )")}
    {:title "The Eyes of Glouphrie",
     :quests (),
     :skills {:Construction 5, :Magic 46},
     :extra ("Completed The Grand Tree quest")}
    {:title "Darkness of Hallowvale",
     :quests
     ("In Aid of the Myreque"
      "In Search of the Myreque"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"
      "In Aid of the Myreque"
      "In Search of the Myreque"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"),
     :skills
     {:Construction 5,
      :Mining 20,
      :Thieving 22,
      :Agility 26,
      :Crafting 32,
      :Magic 33,
      :Strength 40},
     :extra
     ("The ability to withstand several melee attacks from a level 169 enemy.")}
    {:title "The Slug Menace",
     :quests
     ("Wanted!"
      "Recruitment Drive"
      "Black Knights' Fortress"
      "Druidic Ritual"
      "The Lost Tribe"
      "Rune Mysteries"
      "Goblin Diplomacy"
      "Enter the Abyss"
      "Priest in Peril"
      "Sea Slug"
      "Wanted!"
      "Recruitment Drive"
      "Black Knights' Fortress"
      "Druidic Ritual"
      "The Lost Tribe"
      "Rune Mysteries"
      "Goblin Diplomacy"
      "Enter the Abyss"
      "Priest in Peril"
      "Sea Slug"),
     :skills {:Crafting 30, :Runecraft 30, :Slayer 30, :Thieving 30},
     :extra
     ("The ability to defeat a level 62 enemy with Melee ."
      "You must have the Commorb in your inventory to start the quest.")}
    {:title "Elemental Workshop II",
     :quests ("Elemental Workshop I"),
     :skills {:Magic 20, :Smithing 30},
     :extra ("Completion of Elemental Workshop I")}
    {:title "My Arm's Big Adventure",
     :quests
     ("Eadgar's Ruse"
      "Druidic Ritual"
      "Troll Stronghold"
      "Death Plateau"
      "The Feud"
      "Jungle Potion"
      "Eadgar's Ruse"
      "Druidic Ritual"
      "Troll Stronghold"
      "Death Plateau"
      "The Feud"
      "Jungle Potion"),
     :skills {:Farming 29, :Woodcutting 10},
     :extra
     ("At least 60% favour in the Tai Bwo Wannai Cleanup minigame before starting this quest - this will be subtracted from the total favour Acquiring 100% Tai Bwo Favour rating is a requirement for the Medium Karamja Diary . If completion of the medium diary is desired, it is recommended to get 100% prior to starting this quest")}
    {:title "Enlightened Journey",
     :quests (),
     :skills {:questpoints 20, :Firemaking 20, :Farming 30, :Crafting 36},
     :extra ()}
    {:title "Eagles' Peak", :quests (), :skills {:Hunter 27}, :extra ()}
    {:title "Animal Magnetism",
     :quests
     ("The Restless Ghost"
      "Ernest the Chicken"
      "Priest in Peril"
      "The Restless Ghost"
      "Ernest the Chicken"
      "Priest in Peril"),
     :skills {:Slayer 18, :Crafting 19, :Ranged 30, :Woodcutting 35},
     :extra ()}
    {:title "Contact!",
     :quests
     ("Prince Ali Rescue"
      "Icthlarin's Little Helper"
      "Gertrude's Cat"
      "Prince Ali Rescue"
      "Icthlarin's Little Helper"
      "Gertrude's Cat"),
     :skills {},
     :extra ()}
    {:title "Cold War",
     :quests (),
     :skills
     {:Hunter 10,
      :Agility 30,
      :Crafting 30,
      :Construction 34,
      :Thieving 15},
     :extra ("Access to a crafting table 3")}
    {:title "The Fremennik Isles",
     :quests ("The Fremennik Trials"),
     :skills {:Construction 20},
     :extra
     ("Completion of The Fremennik Trials"
      "The ability to kill a level 122 Troll King (Damage can be reduced) and, separately, 10 rock throwing ice trolls in a multicombat area .")}
    {:title "The Great Brain Robbery",
     :quests (),
     :skills {:Crafting 16, :Construction 30, :Prayer 50},
     :extra
     ("Must have completed the following quests: Creature of Fenkenstrain"
      "Cabin Fever Pirate's Treasure"
      "Rum Deal Priest in Peril"
      "Zogre Flesh Eaters Big Chompy Bird Hunting"
      "Jungle Potion Druidic Ritual"
      "Recipe for Disaster/Freeing Pirate Pete Recipe for Disaster/Another Cook's Quest Cook's Assistant"
      "Access to a player-owned house workshop and crafting table or the Grand Exchange"
      "Be able to kill a level 190 monster that can disable Prayers (can be safespotted without taking damage).")}
    {:title "What Lies Below",
     :quests ("Rune Mysteries" "Rune Mysteries"),
     :skills {:Runecraft 35},
     :extra ()}
    {:title "Olaf's Quest",
     :quests ("The Fremennik Trials"),
     :skills {:Firemaking 40, :Woodcutting 50},
     :extra
     ("Completion of The Fremennik Trials"
      "The ability to defeat a level 100 monster")}
    {:title "Another Slice of H.A.M.",
     :quests
     ("Death to the Dorgeshuun"
      "The Lost Tribe"
      "Goblin Diplomacy"
      "Rune Mysteries"
      "The Giant Dwarf"
      "The Dig Site"
      "Death to the Dorgeshuun"
      "The Lost Tribe"
      "Goblin Diplomacy"
      "Rune Mysteries"
      "The Giant Dwarf"
      "The Dig Site"),
     :skills {:Attack 15, :Prayer 25},
     :extra
     ("The ability to defeat a level 64 (using any combat style) and two level 30 enemies using either Ranged or Magic .")}
    {:title "Dream Mentor",
     :quests
     ("Lunar Diplomacy"
      "The Fremennik Trials"
      "Lost City"
      "Rune Mysteries"
      "Shilo Village"
      "Jungle Potion"
      "Eadgar's Ruse"
      "Druidic Ritual"
      "Troll Stronghold"
      "Death Plateau"
      "Lunar Diplomacy"
      "The Fremennik Trials"
      "Lost City"
      "Rune Mysteries"
      "Shilo Village"
      "Jungle Potion"
      "Eadgar's Ruse"
      "Druidic Ritual"
      "Troll Stronghold"
      "Death Plateau"),
     :skills {},
     :extra
     ("The ability to defeat 4 powerful monsters without the use of prayer")}
    {:title "Grim Tales",
     :quests ("Witch's House" "Witch's House"),
     :skills
     {:Farming 45,
      :Herblore 52,
      :Thieving 58,
      :Agility 59,
      :Woodcutting 71},
     :extra ("Ability to defeat a level 138 cloud giant— Glod")}
    {:title "King's Ransom",
     :quests
     ("Black Knights' Fortress"
      "Holy Grail"
      "Merlin's Crystal"
      "Murder Mystery"
      "One Small Favour"
      "Rune Mysteries"
      "Shilo Village"
      "Jungle Potion"
      "Druidic Ritual"
      "Black Knights' Fortress"
      "Holy Grail"
      "Merlin's Crystal"
      "Murder Mystery"
      "One Small Favour"
      "Rune Mysteries"
      "Shilo Village"
      "Jungle Potion"
      "Druidic Ritual"),
     :skills {:Magic 45, :Defence 65},
     :extra ()}
    {:title "Shilo Village",
     :quests
     ("Jungle Potion" "Druidic Ritual" "Jungle Potion" "Druidic Ritual"),
     :skills {:Crafting 20, :Agility 32},
     :extra
     ("Must be able to defend from many Undead ones (level 61-73) and able to defeat three monsters that are about level 90.")}
    {:title "Biohazard",
     :quests ("Plague City"),
     :skills {},
     :extra ("Completion of Plague City")}
    {:title "Tower of Life",
     :quests (),
     :skills {:Construction 10},
     :extra ()}
    {:title "Rag and Bone Man II",
     :quests (),
     :skills {:Slayer 40, :Defence 20},
     :extra
     ("Completed Rag and Bone Man I ( required to start )"
      "Completed Skippy and the Mogres ( not required to start )"
      "Completed Horror from the Deep or partial completion of The Fremennik Trials ( not required to start )"
      "Partial completion of Creature of Fenkenstrain ( not required to start )"
      "Partial completion of Waterfall Quest ( not required to start )"
      "The ability to kill several high-level monsters")}
    {:title "Land of the Goblins",
     :quests
     ("Another Slice of H.A.M."
      "Death to the Dorgeshuun"
      "The Lost Tribe"
      "Goblin Diplomacy"
      "Rune Mysteries"
      "The Giant Dwarf"
      "The Dig Site"
      "Fishing Contest"
      "Another Slice of H.A.M."
      "Death to the Dorgeshuun"
      "The Lost Tribe"
      "Goblin Diplomacy"
      "Rune Mysteries"
      "The Giant Dwarf"
      "The Dig Site"
      "Fishing Contest"),
     :skills {:Agility 38, :Fishing 40, :Thieving 45, :Herblore 48},
     :extra ()}
    {:title "While Guthix Sleeps",
     :quests
     ("Defender of Varrock"
      "Shield of Arrav"
      "Temple of Ikov"
      "Below Ice Mountain"
      "Family Crest"
      "What Lies Below"
      "Romeo & Juliet"
      "Demon Slayer"
      "Garden of Tranquillity"
      "Creature of Fenkenstrain"
      "Priest in Peril"
      "The Restless Ghost"
      "The Path of Glouphrie"
      "The Eyes of Glouphrie"
      "The Grand Tree"
      "Waterfall Quest"
      "Tree Gnome Village"
      "Fight Arena"
      "Dream Mentor"
      "Eadgar's Ruse"
      "Druidic Ritual"
      "Troll Stronghold"
      "Death Plateau"
      "Lunar Diplomacy"
      "The Fremennik Trials"
      "Lost City"
      "Rune Mysteries"
      "Shilo Village"
      "Jungle Potion"
      "The Hand in the Sand"
      "Wanted!"
      "Recruitment Drive"
      "Black Knights' Fortress"
      "Druidic Ritual"
      "The Lost Tribe"
      "Goblin Diplomacy"
      "Temple of the Eye"
      "Enter the Abyss"
      "Rune Mysteries"
      "Tears of Guthix"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"
      "A Tail of Two Cats"
      "Icthlarin's Little Helper"
      "Gertrude's Cat"
      "Defender of Varrock"
      "Shield of Arrav"
      "Temple of Ikov"
      "Below Ice Mountain"
      "Family Crest"
      "What Lies Below"
      "Romeo & Juliet"
      "Demon Slayer"
      "Garden of Tranquillity"
      "Creature of Fenkenstrain"
      "Priest in Peril"
      "The Restless Ghost"
      "The Path of Glouphrie"
      "The Eyes of Glouphrie"
      "The Grand Tree"
      "Waterfall Quest"
      "Tree Gnome Village"
      "Fight Arena"
      "Dream Mentor"
      "Eadgar's Ruse"
      "Druidic Ritual"
      "Troll Stronghold"
      "Death Plateau"
      "Lunar Diplomacy"
      "The Fremennik Trials"
      "Lost City"
      "Rune Mysteries"
      "Shilo Village"
      "Jungle Potion"
      "The Hand in the Sand"
      "Wanted!"
      "Recruitment Drive"
      "Black Knights' Fortress"
      "Druidic Ritual"
      "The Lost Tribe"
      "Goblin Diplomacy"
      "Temple of the Eye"
      "Enter the Abyss"
      "Rune Mysteries"
      "Tears of Guthix"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"
      "A Tail of Two Cats"
      "Icthlarin's Little Helper"
      "Gertrude's Cat"),
     :skills
     {:Herblore 65,
      :Attack 99,
      :Magic 67,
      :Farming 65,
      :Thieving 72,
      :Hunter 62,
      :Strength 99,
      :questpoints 180,
      :Agility 66},
     :extra ()}
    {:title "Zogre Flesh Eaters",
     :quests
     ("Big Chompy Bird Hunting"
      "Jungle Potion"
      "Druidic Ritual"
      "Big Chompy Bird Hunting"
      "Jungle Potion"
      "Druidic Ritual"),
     :skills {:Smithing 4, :Herblore 8, :Ranged 30},
     :extra ("You must be able to defeat a level 111 enemy.")}
    {:title "Monkey Madness II",
     :quests
     ("Enlightened Journey"
      "Gnome Stronghold"
      "The Eyes of Glouphrie"
      "Recipe for Disaster/Freeing King Awowogei"
      "Awowogei"
      "Monkey Madness I"
      "The Grand Tree"
      "Tree Gnome Village"
      "Troll Stronghold"
      "Death Plateau"
      "Watchtower"
      "Enlightened Journey"
      "Gnome Stronghold"
      "The Eyes of Glouphrie"
      "Recipe for Disaster/Freeing King Awowogei"
      "Awowogei"
      "Monkey Madness I"
      "The Grand Tree"
      "Tree Gnome Village"
      "Troll Stronghold"
      "Death Plateau"
      "Watchtower"),
     :skills
     {:Slayer 69,
      :Crafting 70,
      :Hunter 60,
      :Agility 55,
      :Thieving 55,
      :Firemaking 60},
     :extra ()}
    {:title "Client of Kourend",
     :quests ("X Marks the Spot"),
     :skills {},
     :extra ("Completion of the following quest: X Marks the Spot")}
    {:title "The Queen of Thieves",
     :quests
     ("Client of Kourend"
      "X Marks the Spot"
      "Client of Kourend"
      "X Marks the Spot"),
     :skills {:Thieving 20},
     :extra ()}
    {:title "Bone Voyage",
     :quests ("The Dig Site"),
     :skills {},
     :extra
     ("100 Kudos" "Completion of the following quest: The Dig Site")}
    {:title "Dragon Slayer II",
     :quests
     ("Legends' Quest"
      "Family Crest"
      "Heroes' Quest"
      "Shield of Arrav"
      "Lost City"
      "Merlin's Crystal"
      "Dragon Slayer I"
      "Underground Pass"
      "Biohazard"
      "Plague City"
      "Waterfall Quest"
      "Dream Mentor"
      "Lunar Diplomacy"
      "The Fremennik Trials"
      "Rune Mysteries"
      "Shilo Village"
      "Jungle Potion"
      "Eadgar's Ruse"
      "Druidic Ritual"
      "Troll Stronghold"
      "Death Plateau"
      "A Tail of Two Cats"
      "Icthlarin's Little Helper"
      "Gertrude's Cat"
      "Animal Magnetism"
      "Ernest the Chicken"
      "Priest in Peril"
      "The Restless Ghost"
      "Ghosts Ahoy"
      "Bone Voyage"
      "The Dig Site"
      "Kudos"
      "Client of Kourend"
      "X Marks the Spot"
      "Legends' Quest"
      "Family Crest"
      "Heroes' Quest"
      "Shield of Arrav"
      "Lost City"
      "Merlin's Crystal"
      "Dragon Slayer I"
      "Underground Pass"
      "Biohazard"
      "Plague City"
      "Waterfall Quest"
      "Dream Mentor"
      "Lunar Diplomacy"
      "The Fremennik Trials"
      "Rune Mysteries"
      "Shilo Village"
      "Jungle Potion"
      "Eadgar's Ruse"
      "Druidic Ritual"
      "Troll Stronghold"
      "Death Plateau"
      "A Tail of Two Cats"
      "Icthlarin's Little Helper"
      "Gertrude's Cat"
      "Animal Magnetism"
      "Ernest the Chicken"
      "Priest in Peril"
      "The Restless Ghost"
      "Ghosts Ahoy"
      "Bone Voyage"
      "The Dig Site"
      "Kudos"
      "Client of Kourend"
      "X Marks the Spot"),
     :skills
     {:Crafting 62,
      :Magic 75,
      :Construction 50,
      :Thieving 60,
      :Hitpoints 50,
      :Smithing 70,
      :Mining 68,
      :questpoints 200,
      :Agility 60},
     :extra
     ("Started the pyre ship portion of the Barbarian Training miniquest to gain access to the Ancient Cavern")}
    {:title "The Depths of Despair",
     :quests
     ("Client of Kourend"
      "X Marks the Spot"
      "Client of Kourend"
      "X Marks the Spot"),
     :skills {:Agility 18},
     :extra ("Ability to kill a level 36 Sand Snake")}
    {:title "Recipe for Disaster/Another Cook's Quest",
     :quests ("Cook's Assistant"),
     :skills {:Cooking 10},
     :extra ("Completion of Cook's Assistant")}
    {:title "Recipe for Disaster/Freeing the Goblin generals",
     :quests (),
     :skills {},
     :extra
     ("Recipe for Disaster/Another Cook's Quest Cook's Assistant"
      "Goblin Diplomacy")}
    {:title "Recipe for Disaster/Freeing the Mountain Dwarf",
     :quests
     ("Another Cook's Quest"
      "Cook's Assistant"
      "Fishing Contest"
      "Another Cook's Quest"
      "Cook's Assistant"
      "Fishing Contest"),
     :skills {},
     :extra
     ("The ability to defeat a level 13 icefiend if you don't have the ice gloves .")}
    {:title "Recipe for Disaster/Freeing Evil Dave",
     :quests
     ("Gertrude's Cat"
      "Recipe for Disaster/Another Cook's Quest"
      "Cook's Assistant"
      "Shadow of the Storm"
      "Demon Slayer"
      "The Golem"
      "Gertrude's Cat"
      "Recipe for Disaster/Another Cook's Quest"
      "Cook's Assistant"
      "Shadow of the Storm"
      "Demon Slayer"
      "The Golem"),
     :skills {:Cooking 25},
     :extra ()}
    {:title "Recipe for Disaster/Freeing Pirate Pete",
     :quests
     ("Recipe for Disaster/Another Cook's Quest"
      "Cook's Assistant"
      "Recipe for Disaster/Another Cook's Quest"
      "Cook's Assistant"),
     :skills {:Cooking 31},
     :extra ("The ability to defeat 5 level 30 monsters.")}
    {:title "Recipe for Disaster/Freeing the Lumbridge Guide",
     :quests
     ("Big Chompy Bird Hunting"
      "Biohazard"
      "Plague City"
      "Demon Slayer"
      "Murder Mystery"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"
      "Recipe for Disaster/Another Cook's Quest"
      "Cook's Assistant"
      "Witch's House"
      "Big Chompy Bird Hunting"
      "Biohazard"
      "Plague City"
      "Demon Slayer"
      "Murder Mystery"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"
      "Recipe for Disaster/Another Cook's Quest"
      "Cook's Assistant"
      "Witch's House"),
     :skills {:Cooking 40},
     :extra ()}
    {:title "Recipe for Disaster/Freeing Sir Amik Varze",
     :quests
     ("Family Crest"
      "Heroes' Quest"
      "Shield of Arrav"
      "Lost City"
      "Merlin's Crystal"
      "Dragon Slayer I"
      "Recipe for Disaster/Another Cook's Quest"
      "Cook's Assistant"
      "Shilo Village"
      "Jungle Potion"
      "Druidic Ritual"
      "Underground Pass"
      "Biohazard"
      "Plague City"
      "Waterfall Quest"
      "Family Crest"
      "Heroes' Quest"
      "Shield of Arrav"
      "Lost City"
      "Merlin's Crystal"
      "Dragon Slayer I"
      "Recipe for Disaster/Another Cook's Quest"
      "Cook's Assistant"
      "Shilo Village"
      "Jungle Potion"
      "Druidic Ritual"
      "Underground Pass"
      "Biohazard"
      "Plague City"
      "Waterfall Quest"),
     :skills {:questpoints 107},
     :extra
     ("Access to the Kharazi Jungle Started Legends' Quest"
      "The ability to defeat a level 227 Black dragon")}
    {:title "Recipe for Disaster/Freeing King Awowogei",
     :quests
     ("Monkey Madness I"
      "The Grand Tree"
      "Tree Gnome Village"
      "Recipe for Disaster/Another Cook's Quest"
      "Cook's Assistant"
      "Monkey Madness I"
      "The Grand Tree"
      "Tree Gnome Village"
      "Recipe for Disaster/Another Cook's Quest"
      "Cook's Assistant"),
     :skills {:Cooking 70, :Agility 48},
     :extra ("The ability to defeat a level 84 Big Snake")}
    {:title "Recipe for Disaster/Freeing Skrach Uglogwee",
     :quests
     ("Big Chompy Bird Hunting"
      "Recipe for Disaster/Another Cook's Quest"
      "Cook's Assistant"
      "Big Chompy Bird Hunting"
      "Recipe for Disaster/Another Cook's Quest"
      "Cook's Assistant"),
     :skills {:Cooking 41, :Firemaking 20},
     :extra ()}
    {:title "A Taste of Hope",
     :quests
     ("Darkness of Hallowvale"
      "In Aid of the Myreque"
      "In Search of the Myreque"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"
      "Darkness of Hallowvale"
      "In Aid of the Myreque"
      "In Search of the Myreque"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"),
     :skills
     {:Crafting 48, :Agility 45, :Attack 40, :Herblore 40, :Slayer 38},
     :extra ()}
    {:title "Tale of the Righteous",
     :quests
     ("Client of Kourend"
      "X Marks the Spot"
      "Client of Kourend"
      "X Marks the Spot"),
     :skills {:Strength 16, :Mining 10},
     :extra ()}
    {:title "Making Friends with My Arm",
     :quests
     ("My Arm's Big Adventure"
      "Eadgar's Ruse"
      "Druidic Ritual"
      "Troll Stronghold"
      "Death Plateau"
      "The Feud"
      "Jungle Potion"
      "Swan Song"
      "One Small Favour"
      "Rune Mysteries"
      "Shilo Village"
      "Garden of Tranquillity"
      "Creature of Fenkenstrain"
      "Priest in Peril"
      "The Restless Ghost"
      "Cold War"
      "Romeo & Juliet"
      "My Arm's Big Adventure"
      "Eadgar's Ruse"
      "Druidic Ritual"
      "Troll Stronghold"
      "Death Plateau"
      "The Feud"
      "Jungle Potion"
      "Swan Song"
      "One Small Favour"
      "Rune Mysteries"
      "Shilo Village"
      "Garden of Tranquillity"
      "Creature of Fenkenstrain"
      "Priest in Peril"
      "The Restless Ghost"
      "Cold War"
      "Romeo & Juliet"),
     :skills {:Firemaking 66, :Mining 72, :Construction 35, :Agility 68},
     :extra ("It is beneficial to have a higher Agility level.")}
    {:title "Recipe for Disaster/Defeating the Culinaromancer",
     :quests
     ("Desert Treasure I"
      "The Dig Site"
      "Temple of Ikov"
      "The Tourist Trap"
      "Troll Stronghold"
      "Death Plateau"
      "Priest in Peril"
      "Waterfall Quest"
      "Horror from the Deep"
      "Alfred Grimhand's Barcrawl"
      "Recipe for Disaster/Freeing Evil Dave"
      "Recipe for Disaster/Freeing the Goblin generals"
      "Recipe for Disaster/Freeing the Lumbridge Guide"
      "Recipe for Disaster/Freeing the Mountain Dwarf"
      "Recipe for Disaster/Freeing Pirate Pete"
      "Recipe for Disaster/Freeing Sir Amik Varze"
      "Recipe for Disaster/Freeing Skrach Uglogwee"
      "Recipe for Disaster/Freeing King Awowogei"
      "Desert Treasure I"
      "The Dig Site"
      "Temple of Ikov"
      "The Tourist Trap"
      "Troll Stronghold"
      "Death Plateau"
      "Priest in Peril"
      "Waterfall Quest"
      "Horror from the Deep"
      "Alfred Grimhand's Barcrawl"
      "Recipe for Disaster/Freeing Evil Dave"
      "Recipe for Disaster/Freeing the Goblin generals"
      "Recipe for Disaster/Freeing the Lumbridge Guide"
      "Recipe for Disaster/Freeing the Mountain Dwarf"
      "Recipe for Disaster/Freeing Pirate Pete"
      "Recipe for Disaster/Freeing Sir Amik Varze"
      "Recipe for Disaster/Freeing Skrach Uglogwee"
      "Recipe for Disaster/Freeing King Awowogei"),
     :skills {:questpoints 175},
     :extra ("The ability to defeat all enemies without Prayer")}
    {:title "Song of the Elves",
     :quests
     ("Mourning's End Part II"
      "Mourning's End Part I"
      "Big Chompy Bird Hunting"
      "Sheep Herder"
      "Roving Elves"
      "Waterfall Quest"
      "Regicide"
      "Underground Pass"
      "Biohazard"
      "Plague City"
      "Making History"
      "Priest in Peril"
      "The Restless Ghost"
      "Druidic Ritual"
      "Desert Treasure I"
      "Ancient Magicks"
      "Mourning's End Part II"
      "Mourning's End Part I"
      "Big Chompy Bird Hunting"
      "Sheep Herder"
      "Roving Elves"
      "Waterfall Quest"
      "Regicide"
      "Underground Pass"
      "Biohazard"
      "Plague City"
      "Making History"
      "Priest in Peril"
      "The Restless Ghost"
      "Druidic Ritual"),
     :skills
     {:Agility 70,
      :Construction 70,
      :Farming 70,
      :Herblore 70,
      :Hunter 70,
      :Mining 70,
      :Smithing 70,
      :Woodcutting 70},
     :extra ()}
    {:title "The Ascent of Arceuus",
     :quests
     ("Client of Kourend"
      "X Marks the Spot"
      "Client of Kourend"
      "X Marks the Spot"),
     :skills {:Hunter 12},
     :extra ()}
    {:title "The Forsaken Tower",
     :quests
     ("Client of Kourend"
      "X Marks the Spot"
      "Client of Kourend"
      "X Marks the Spot"),
     :skills {},
     :extra ()}
    {:title "The Fremennik Exiles",
     :quests
     ("The Fremennik Isles"
      "The Fremennik Trials"
      "Lunar Diplomacy"
      "Lost City"
      "Rune Mysteries"
      "Shilo Village"
      "Jungle Potion"
      "Druidic Ritual"
      "Mountain Daughter"
      "Heroes' Quest"
      "Dragon Slayer I"
      "Lost City"
      "Merlin's Crystal"
      "Shield of Arrav"
      "The Fremennik Isles"
      "The Fremennik Trials"
      "Lunar Diplomacy"
      "Lost City"
      "Rune Mysteries"
      "Shilo Village"
      "Jungle Potion"
      "Druidic Ritual"
      "Mountain Daughter"
      "Heroes' Quest"
      "Dragon Slayer I"
      "Lost City"
      "Merlin's Crystal"
      "Shield of Arrav"),
     :skills
     {:Crafting 65, :Slayer 60, :Smithing 60, :Fishing 60, :Runecraft 55},
     :extra ()}
    {:title "The Curse of Arrav",
     :quests
     ("Defender of Varrock"
      "Shield of Arrav"
      "Temple of Ikov"
      "Below Ice Mountain"
      "Family Crest"
      "Garden of Tranquillity"
      "Creature of Fenkenstrain"
      "Priest in Peril"
      "The Restless Ghost"
      "What Lies Below"
      "Rune Mysteries"
      "Romeo & Juliet"
      "Demon Slayer"
      "Troll Romance"
      "Troll Stronghold"
      "Death Plateau"
      "Defender of Varrock"
      "Shield of Arrav"
      "Temple of Ikov"
      "Below Ice Mountain"
      "Family Crest"
      "Garden of Tranquillity"
      "Creature of Fenkenstrain"
      "Priest in Peril"
      "The Restless Ghost"
      "What Lies Below"
      "Rune Mysteries"
      "Romeo & Juliet"
      "Demon Slayer"
      "Troll Romance"
      "Troll Stronghold"
      "Death Plateau"),
     :skills
     {:Mining 64,
      :Ranged 62,
      :Thieving 62,
      :Agility 61,
      :Strength 58,
      :Slayer 37},
     :extra ()}
    {:title "Defender of Varrock",
     :quests
     ("Shield of Arrav"
      "Temple of Ikov"
      "Below Ice Mountain"
      "Family Crest"
      "Garden of Tranquillity"
      "Creature of Fenkenstrain"
      "Priest in Peril"
      "The Restless Ghost"
      "What Lies Below"
      "Rune Mysteries"
      "Romeo & Juliet"
      "Demon Slayer"
      "Shield of Arrav"
      "Temple of Ikov"
      "Below Ice Mountain"
      "Family Crest"
      "Garden of Tranquillity"
      "Creature of Fenkenstrain"
      "Priest in Peril"
      "The Restless Ghost"
      "What Lies Below"
      "Rune Mysteries"
      "Romeo & Juliet"
      "Demon Slayer"),
     :skills {:Smithing 55, :Hunter 52},
     :extra ()}
    {:title "Sins of the Father",
     :quests
     ("Vampyre Slayer"
      "A Taste of Hope"
      "Darkness of Hallowvale"
      "In Aid of the Myreque"
      "In Search of the Myreque"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"
      "Vampyre Slayer"
      "A Taste of Hope"
      "Darkness of Hallowvale"
      "In Aid of the Myreque"
      "In Search of the Myreque"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"),
     :skills
     {:Woodcutting 62,
      :Fletching 60,
      :Crafting 56,
      :Agility 52,
      :Attack 50,
      :Slayer 50,
      :Magic 49},
     :extra ()}
    {:title "A Kingdom Divided",
     :quests
     ("The Depths of Despair"
      "The Queen of Thieves"
      "The Ascent of Arceuus"
      "The Forsaken Tower"
      "Tale of the Righteous"
      "Client of Kourend"
      "X Marks the Spot"
      "The Depths of Despair"
      "The Queen of Thieves"
      "The Ascent of Arceuus"
      "The Forsaken Tower"
      "Tale of the Righteous"
      "Client of Kourend"
      "X Marks the Spot"),
     :skills
     {:Agility 54,
      :Thieving 52,
      :Woodcutting 52,
      :Herblore 50,
      :Mining 42,
      :Crafting 38,
      :Magic 35},
     :extra ()}
    {:title "A Porcine of Interest", :quests (), :skills {}, :extra ()}
    {:title "Getting Ahead",
     :quests (),
     :skills {:Crafting 30, :Construction 26},
     :extra ()}
    {:title "A Night at the Theatre",
     :quests
     ("A Taste of Hope"
      "Darkness of Hallowvale"
      "In Aid of the Myreque"
      "In Search of the Myreque"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"
      "A Taste of Hope"
      "Darkness of Hallowvale"
      "In Aid of the Myreque"
      "In Search of the Myreque"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"),
     :skills {},
     :extra ()}
    {:title "Beneath Cursed Sands",
     :quests
     ("Contact!"
      "Prince Ali Rescue"
      "Icthlarin's Little Helper"
      "Gertrude's Cat"
      "Contact!"
      "Prince Ali Rescue"
      "Icthlarin's Little Helper"
      "Gertrude's Cat"),
     :skills {:Agility 62, :Crafting 55, :Firemaking 55},
     :extra ()}
    {:title "Temple of the Eye",
     :quests
     ("Enter the Abyss"
      "Rune Mysteries"
      "Enter the Abyss"
      "Rune Mysteries"),
     :skills {:Runecraft 10},
     :extra ()}
    {:title "The Path of Glouphrie",
     :quests
     ("The Eyes of Glouphrie"
      "The Grand Tree"
      "Waterfall Quest"
      "Tree Gnome Village"
      "The Eyes of Glouphrie"
      "The Grand Tree"
      "Waterfall Quest"
      "Tree Gnome Village"),
     :skills
     {:Strength 60, :Slayer 56, :Thieving 56, :Ranged 47, :Agility 45},
     :extra ()}
    {:title "Sleeping Giants",
     :quests (),
     :skills {:Smithing 15},
     :extra ()}
    {:title "The Garden of Death",
     :quests (),
     :skills {:Farming 20},
     :extra ()}
    {:title "Desert Treasure II - The Fallen Empire",
     :quests
     ("Desert Treasure I"
      "The Dig Site"
      "Temple of Ikov"
      "The Tourist Trap"
      "Troll Stronghold"
      "Death Plateau"
      "Priest in Peril"
      "Waterfall Quest"
      "Secrets of the North"
      "Making Friends with My Arm"
      "My Arm's Big Adventure"
      "Eadgar's Ruse"
      "Druidic Ritual"
      "Troll Stronghold"
      "Death Plateau"
      "The Feud"
      "Jungle Potion"
      "Swan Song"
      "One Small Favour"
      "Rune Mysteries"
      "Shilo Village"
      "Garden of Tranquillity"
      "Creature of Fenkenstrain"
      "Priest in Peril"
      "The Restless Ghost"
      "Cold War"
      "Romeo & Juliet"
      "The General's Shadow"
      "Curse of the Empty Lord"
      "Ghostly robes"
      "Fight Arena"
      "Devious Minds"
      "Wanted!"
      "Recruitment Drive"
      "Black Knights' Fortress"
      "Druidic Ritual"
      "The Lost Tribe"
      "Goblin Diplomacy"
      "Rune Mysteries"
      "Priest in Peril"
      "Troll Stronghold"
      "Death Plateau"
      "Doric's Quest"
      "Enter the Abyss"
      "Hazeel Cult"
      "Enakhra's Lament"
      "Temple of the Eye"
      "Enter the Abyss"
      "Rune Mysteries"
      "The Garden of Death"
      "Below Ice Mountain"
      "His Faithful Servants"
      "Priest in Peril"
      "Desert Treasure I"
      "The Dig Site"
      "Temple of Ikov"
      "The Tourist Trap"
      "Troll Stronghold"
      "Death Plateau"
      "Priest in Peril"
      "Waterfall Quest"
      "Secrets of the North"
      "Making Friends with My Arm"
      "My Arm's Big Adventure"
      "Eadgar's Ruse"
      "Druidic Ritual"
      "Troll Stronghold"
      "Death Plateau"
      "The Feud"
      "Jungle Potion"
      "Swan Song"
      "One Small Favour"
      "Rune Mysteries"
      "Shilo Village"
      "Garden of Tranquillity"
      "Creature of Fenkenstrain"
      "Priest in Peril"
      "The Restless Ghost"
      "Cold War"
      "Romeo & Juliet"
      "The General's Shadow"
      "Curse of the Empty Lord"
      "Ghostly robes"
      "Fight Arena"
      "Devious Minds"
      "Wanted!"
      "Recruitment Drive"
      "Black Knights' Fortress"
      "Druidic Ritual"
      "The Lost Tribe"
      "Goblin Diplomacy"
      "Rune Mysteries"
      "Priest in Peril"
      "Troll Stronghold"
      "Death Plateau"
      "Doric's Quest"
      "Enter the Abyss"
      "Hazeel Cult"
      "Enakhra's Lament"
      "Temple of the Eye"
      "Enter the Abyss"
      "Rune Mysteries"
      "The Garden of Death"
      "Below Ice Mountain"
      "His Faithful Servants"
      "Priest in Peril"),
     :skills
     {:Firemaking 75,
      :Magic 75,
      :Thieving 70,
      :Herblore 62,
      :Runecraft 60,
      :Construction 60},
     :extra ()}
    {:title "Secrets of the North",
     :quests
     ("Making Friends with My Arm"
      "My Arm's Big Adventure"
      "Eadgar's Ruse"
      "Druidic Ritual"
      "Troll Stronghold"
      "Death Plateau"
      "The Feud"
      "Jungle Potion"
      "Swan Song"
      "One Small Favour"
      "Rune Mysteries"
      "Shilo Village"
      "Garden of Tranquillity"
      "Creature of Fenkenstrain"
      "Priest in Peril"
      "The Restless Ghost"
      "Cold War"
      "Romeo & Juliet"
      "The General's Shadow"
      "Curse of the Empty Lord"
      "Ghostly robes"
      "Desert Treasure I"
      "Ring of visibility"
      "Fight Arena"
      "Devious Minds"
      "Wanted!"
      "Recruitment Drive"
      "Black Knights' Fortress"
      "Druidic Ritual"
      "The Lost Tribe"
      "Goblin Diplomacy"
      "Rune Mysteries"
      "Priest in Peril"
      "Doric's Quest"
      "Enter the Abyss"
      "Hazeel Cult"
      "Making Friends with My Arm"
      "My Arm's Big Adventure"
      "Eadgar's Ruse"
      "Druidic Ritual"
      "Troll Stronghold"
      "Death Plateau"
      "The Feud"
      "Jungle Potion"
      "Swan Song"
      "One Small Favour"
      "Rune Mysteries"
      "Shilo Village"
      "Garden of Tranquillity"
      "Creature of Fenkenstrain"
      "Priest in Peril"
      "The Restless Ghost"
      "Cold War"
      "Romeo & Juliet"
      "The General's Shadow"
      "Curse of the Empty Lord"
      "Ghostly robes"
      "Desert Treasure I"
      "Ring of visibility"
      "Fight Arena"
      "Devious Minds"
      "Wanted!"
      "Recruitment Drive"
      "Black Knights' Fortress"
      "Druidic Ritual"
      "The Lost Tribe"
      "Goblin Diplomacy"
      "Rune Mysteries"
      "Priest in Peril"
      "Doric's Quest"
      "Enter the Abyss"
      "Hazeel Cult"),
     :skills {:Agility 69, :Thieving 64, :Hunter 56},
     :extra ()}
    {:title "Children of the Sun", :quests (), :skills {}, :extra ()}
    {:title "Perilous Moons",
     :quests
     ("Twilight's Promise"
      "Children of the Sun"
      "Twilight's Promise"
      "Children of the Sun"),
     :skills
     {:Slayer 48,
      :Hunter 20,
      :Fishing 20,
      :Runecraft 20,
      :Construction 10},
     :extra ()}
    {:title "The Ribbiting Tale of a Lily Pad Labour Dispute",
     :quests ("Children of the Sun" "Children of the Sun"),
     :skills {:Woodcutting 15},
     :extra ()}
    {:title "Twilight's Promise",
     :quests ("Children of the Sun" "Children of the Sun"),
     :skills {},
     :extra ()}
    {:title "At First Light",
     :quests
     ("Children of the Sun"
      "Eagles' Peak"
      "Children of the Sun"
      "Eagles' Peak"),
     :skills {:Hunter 46, :Herblore 30, :Construction 27},
     :extra ()}
    {:title "The Heart of Darkness",
     :quests
     ("Twilight's Promise"
      "Children of the Sun"
      "Twilight's Promise"
      "Children of the Sun"),
     :skills {:Mining 55, :Thieving 48, :Slayer 48, :Agility 46},
     :extra ()}
    {:title "Death on the Isle",
     :quests ("Children of the Sun" "Children of the Sun"),
     :skills {:Thieving 34, :Agility 32},
     :extra ()}
    {:title "Meat and Greet",
     :quests ("Children of the Sun" "Children of the Sun"),
     :skills {},
     :extra ()}
    {:title "Ethically Acquired Antiquities",
     :quests
     ("Children of the Sun"
      "Shield of Arrav"
      "Children of the Sun"
      "Shield of Arrav"),
     :skills {:Thieving 25},
     :extra ()}
    {:title "The Final Dawn",
     :quests
     ("The Heart of Darkness"
      "Twilight's Promise"
      "Children of the Sun"
      "Perilous Moons"
      "Twilight's Promise"
      "Children of the Sun"
      "The Heart of Darkness"
      "Twilight's Promise"
      "Children of the Sun"
      "Perilous Moons"
      "Twilight's Promise"
      "Children of the Sun"),
     :skills {:Thieving 66, :Runecraft 52, :Fletching 52},
     :extra ()}
    {:title "Shadows of Custodia",
     :quests ("Children of the Sun" "Children of the Sun"),
     :skills {:Slayer 54, :Fishing 45, :Construction 41, :Hunter 36},
     :extra ()}
    {:title "Scrambled!",
     :quests (),
     :skills {:Construction 38, :Cooking 36, :Smithing 35},
     :extra ("Children of the Sun")}
    {:title "Alfred Grimhand's Barcrawl",
     :quests (),
     :skills {},
     :extra ()}
    {:title "Enter the Abyss",
     :quests ("Rune Mysteries"),
     :skills {},
     :extra ("Completion of Rune Mysteries")}
    {:title "The General's Shadow",
     :quests (),
     :skills {},
     :extra
     ("Curse of the Empty Lord , for full ghostly robes Started Desert Treasure I , for the ring of visibility"
      "Fight Arena")}
    {:title "Barbarian Training",
     :quests ("Tai Bwo Wannai Trio"),
     :skills
     {:Fishing 55,
      :Firemaking 35,
      :Strength 35,
      :Agility 15,
      :Farming 15,
      :Crafting 11,
      :Smithing 5,
      :Herblore 4},
     :extra
     ("Completion of Tai Bwo Wannai Trio ( not required to start )")}
    {:title "Skippy and the Mogres",
     :quests (),
     :skills {:Cooking 20},
     :extra ()}
    {:title "Curse of the Empty Lord",
     :quests (),
     :skills {:Thieving 53, :Prayer 31},
     :extra ()}
    {:title "Lair of Tarn Razorlor",
     :quests (),
     :skills {:Slayer 40},
     :extra
     ("The Haunted Mine quest is required to access Tarn's Lair .")}
    {:title "Bear Your Soul", :quests (), :skills {}, :extra ()}
    {:title "The Enchanted Key", :quests (), :skills {}, :extra ()}
    {:title "Mage Arena I", :quests (), :skills {:Magic 60}, :extra ()}
    {:title "Family Pest", :quests (), :skills {}, :extra ()}
    {:title "Mage Arena II",
     :quests ("Mage Arena I"),
     :skills {:Magic 75},
     :extra
     ("Completion of Mage Arena I"
      "Cast Claws of Guthix , Flames of Zamorak , and Saradomin Strike each 100 times inside the Mage Arena.")}
    {:title "In Search of Knowledge", :quests (), :skills {}, :extra ()}
    {:title "Daddy's Home", :quests (), :skills {}, :extra ()}
    {:title "The Frozen Door",
     :quests ("Desert Treasure I"),
     :skills {:Agility 70, :Hitpoints 70, :Ranged 70, :Strength 70},
     :extra ("Completion of Desert Treasure I")}
    {:title "Hopespear's Will",
     :quests
     ("Desert Treasure I"
      "Fairytale II - Cure a Queen"
      "Land of the Goblins"),
     :skills {:Prayer 50},
     :extra
     ("Started The Restless Ghost"
      "Completion of Desert Treasure I"
      "Completion of Fairytale II - Cure a Queen"
      "Completion of Land of the Goblins")}
    {:title "Into the Tombs",
     :quests ("Beneath Cursed Sands"),
     :skills {},
     :extra ("Completion of Beneath Cursed Sands")}
    {:title "His Faithful Servants",
     :quests (),
     :skills {},
     :extra ("Priest in Peril")}
    {:title "Vale Totems (miniquest)",
     :quests (),
     :skills {:Fletching 20},
     :extra ("Completions of the following quests: Children of the Sun")}))
