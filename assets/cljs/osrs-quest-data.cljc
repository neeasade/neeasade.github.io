(ns osrs.data)

(def all-quests
  ["The Restless Ghost" "The Knight's Sword" "The Corsair Curse" "Cook's Assistant" "Sheep Shearer" "Below Ice Mountain" "X Marks the Spot" "Misthalin Mystery" "Rune Mysteries" "Dragon Slayer I" "Pirate's Treasure" "Goblin Diplomacy" "Witch's Potion" "Black Knights' Fortress" "Doric's Quest" "Prince Ali Rescue" "Imp Catcher" "Vampyre Slayer" "Ernest the Chicken" "Shield of Arrav" "Demon Slayer" "Romeo & Juliet" "Druidic Ritual" "Lost City" "Witch's House" "Merlin's Crystal" "Heroes' Quest" "Scorpion Catcher" "Family Crest" "Fishing Contest" "Tribal Totem" "Monk's Friend" "Temple of Ikov" "Clock Tower" "Holy Grail" "Tree Gnome Village" "Fight Arena" "Hazeel Cult" "Sheep Herder" "Plague City" "Sea Slug" "Waterfall Quest" "Jungle Potion" "The Grand Tree" "Underground Pass" "Observatory Quest" "The Tourist Trap" "Watchtower" "Dwarf Cannon" "Murder Mystery" "The Dig Site" "Gertrude's Cat" "Legends' Quest" "Death Plateau" "Eadgar's Ruse" "Big Chompy Bird Hunting" "Elemental Workshop I" "Nature Spirit" "Priest in Peril" "Regicide" "Tai Bwo Wannai Trio" "Troll Stronghold" "Shades of Mort'ton" "The Fremennik Trials" "Horror from the Deep" "Throne of Miscellania" "Monkey Madness I" "Haunted Mine" "Troll Romance" "In Search of the Myreque" "Creature of Fenkenstrain" "Roving Elves" "Ghosts Ahoy" "One Small Favour" "Mountain Daughter" "Between a Rock..." "The Feud" "The Golem" "Desert Treasure I" "Icthlarin's Little Helper" "Tears of Guthix" "The Lost Tribe" "The Giant Dwarf" "Recruitment Drive" "Mourning's End Part I" "Forgettable Tale..." "Garden of Tranquillity" "A Tail of Two Cats" "Wanted!" "Mourning's End Part II" "Rum Deal" "Shadow of the Storm" "Making History" "Ratcatchers" "Spirits of the Elid" "Devious Minds" "The Hand in the Sand" "Enakhra's Lament" "Cabin Fever" "Fairytale I - Growing Pains" "Recipe for Disaster" "In Aid of the Myreque" "A Soul's Bane" "Rag and Bone Man I" "Swan Song" "Royal Trouble" "Death to the Dorgeshuun" "Fairytale II - Cure a Queen" "Lunar Diplomacy" "The Eyes of Glouphrie" "Darkness of Hallowvale" "The Slug Menace" "Elemental Workshop II" "My Arm's Big Adventure" "Enlightened Journey" "Eagles' Peak" "Animal Magnetism" "Contact!" "Cold War" "The Fremennik Isles" "The Great Brain Robbery" "What Lies Below" "Olaf's Quest" "Another Slice of H.A.M." "Dream Mentor" "Grim Tales" "King's Ransom" "Shilo Village" "Biohazard" "Tower of Life" "Rag and Bone Man II" "Land of the Goblins" "While Guthix Sleeps" "Zogre Flesh Eaters" "Monkey Madness II" "Client of Kourend" "The Queen of Thieves" "Bone Voyage" "Dragon Slayer II" "The Depths of Despair" "Recipe for Disaster/Another Cook's Quest" "Recipe for Disaster/Freeing the Goblin generals" "Recipe for Disaster/Freeing the Mountain Dwarf" "Recipe for Disaster/Freeing Evil Dave" "Recipe for Disaster/Freeing Pirate Pete" "Recipe for Disaster/Freeing the Lumbridge Guide" "Recipe for Disaster/Freeing Sir Amik Varze" "Recipe for Disaster/Freeing King Awowogei" "Recipe for Disaster/Freeing Skrach Uglogwee" "A Taste of Hope" "Tale of the Righteous" "Making Friends with My Arm" "Recipe for Disaster/Defeating the Culinaromancer" "Song of the Elves" "The Ascent of Arceuus" "The Forsaken Tower" "The Fremennik Exiles" "The Curse of Arrav" "Defender of Varrock" "Sins of the Father" "A Kingdom Divided" "A Porcine of Interest" "Getting Ahead" "A Night at the Theatre" "Beneath Cursed Sands" "Temple of the Eye" "The Path of Glouphrie" "Sleeping Giants" "The Garden of Death" "Desert Treasure II - The Fallen Empire" "Secrets of the North" "Children of the Sun" "Perilous Moons" "The Ribbiting Tale of a Lily Pad Labour Dispute" "Twilight's Promise" "At First Light" "The Heart of Darkness" "Death on the Isle" "Meat and Greet" "Ethically Acquired Antiquities" "The Final Dawn" "Shadows of Custodia" "Scrambled!" "Alfred Grimhand's Barcrawl" "Enter the Abyss" "The General's Shadow" "Barbarian Training" "Skippy and the Mogres" "Curse of the Empty Lord" "Lair of Tarn Razorlor" "Bear Your Soul" "The Enchanted Key" "Mage Arena I" "Family Pest" "Mage Arena II" "In Search of Knowledge" "Daddy's Home" "The Frozen Door" "Hopespear's Will" "Into the Tombs" "His Faithful Servants" "Vale Totems (miniquest)"])

(def optimal-quest-list
  ["Tutorial Island"
   "Cook's Assistant"
   "Sheep Shearer"
   "Misthalin Mystery"
   "Prince Ali Rescue"
   "The Restless Ghost"
   "Rune Mysteries"
   "Stronghold of Security"
   "Imp Catcher"
   "Witch's Potion"
   "Gertrude's Cat"
   "Children of the Sun"
   "Natural history quiz"
   "Daddy's Home"
   "Dwarf Cannon"
   "Waterfall Quest"
   "Tree Gnome Village"
   "Doric's Quest"
   "Witch's House"
   "The Knight's Sword"
   "The Tourist Trap"
   "Black Knights' Fortress"
   "Druidic Ritual"
   "Recruitment Drive"
   "Goblin Diplomacy"
   "Sleeping Giants"
   "Fight Arena"
   "Plague City"
   "Monk's Friend"
   "Hazeel Cult"
   "Sheep Herder"
   "Biohazard"
   "Tower of Life"
   "Tribal Totem"
   "Death Plateau"
   "Merlin's Crystal"
   "Holy Grail"
   "Murder Mystery"
   "The Grand Tree"
   "Ardougne Easy Diary"
   "Rag and Bone Man I"
   "Priest in Peril"
   "Nature Spirit"
   "Ghosts Ahoy"
   "Making History"
   "The Lost Tribe"
   "Death to the Dorgeshuun"
   "Elemental Workshop I"
   "Icthlarin's Little Helper"
   "The Golem"
   "The Ribbiting Tale of a Lily Pad Labour Dispute"
   "Lost City"
   "Fairytale I - Growing Pains"
   "Recipe for Disaster/Another Cook's Quest"
   "Recipe for Disaster/Freeing the Goblin generals"
   "Sea Slug"
   "Fishing Contest"
   "Recipe for Disaster/Freeing the Mountain Dwarf"
   "Mountain Daughter"
   "Ratcatchers"
   "The Feud"
   "Death on the Isle"
   "Alfred Grimhand's Barcrawl"
   "Scorpion Catcher"
   "The Dig Site"
   "Elemental Workshop II"
   "A Soul's Bane"
   "Enter the Abyss"
   "X Marks the Spot"
   "Pirate's Treasure"
   "Client of Kourend"
   "The Queen of Thieves"
   "The Depths of Despair"
   "A Porcine of Interest"
   "Wanted!"
   "Shield of Arrav"
   "Varrock Museum"
   "Bone Voyage"
   "Watchtower"
   "The Giant Dwarf"
   "Forgettable Tale..."
   "Another Slice of H.A.M."
   "Vampyre Slayer"
   "Ernest the Chicken"
   "Demon Slayer"
   "Shadow of the Storm"
   "Horror from the Deep"
   "Animal Magnetism"
   "Creature of Fenkenstrain"
   "Big Chompy Bird Hunting"
   "Jungle Potion"
   "Shilo Village"
   "Karamja Easy Diary"
   "Zogre Flesh Eaters"
   "Observatory Quest"
   "Spirits of the Elid"
   "Garden of Tranquillity"
   "Enlightened Journey"
   "Crafting Guild Balloon"
   "Varrock Balloon"
   "Romeo & Juliet"
   "Tears of Guthix"
   "In Search of the Myreque"
   "Shades of Mort'ton"
   "In Aid of the Myreque"
   "Skippy and the Mogres"
   "Troll Stronghold"
   "Troll Romance"
   "Darkness of Hallowvale"
   "Underground Pass"
   "Regicide"
   "Dragon Slayer I"
   "The Fremennik Trials"
   "The Fremennik Isles"
   "Recipe for Disaster/Freeing Evil Dave"
   "Recipe for Disaster/Freeing Pirate Pete"
   "Tai Bwo Wannai Trio"
   "Kandarin Easy Diary"
   "Contact!"
   "Temple of Ikov"
   "The Eyes of Glouphrie"
   "Temple of the Eye"
   "One Small Favour"
   "The Ascent of Arceuus"
   "Tale of the Righteous"
   "The Forsaken Tower"
   "Easy Diaries"
   "Between a Rock..."
   "The Slug Menace"
   "Getting Ahead"
   "Museum Camp"
   "Cold War"
   "The Hand in the Sand"
   "Enakhra's Lament"
   "Eadgar's Ruse"
   "My Arm's Big Adventure"
   "The Garden of Death"
   "Rag and Bone Man II"
   "Rum Deal"
   "Cabin Fever"
   "Meat and Greet"
   "Recipe for Disaster/Freeing the Lumbridge Guide"
   "Recipe for Disaster/Freeing Skrach Uglogwee"
   "Heroes' Quest"
   "Throne of Miscellania"
   "Royal Trouble"
   "Haunted Mine"
   "Lair of Tarn Razorlor"
   "Monkey Madness I"
   "Ethically Acquired Antiquities"
   "Twilight's Promise"
   "Roving Elves"
   "Mourning's End Part I"
   "Mourning's End Part II"
   "Desert Treasure I"
   "Family Crest"
   "What Lies Below"
   "Eagles' Peak"
   "A Tail of Two Cats"
   "Legends' Quest"
   "Land of the Goblins"
   "Recipe for Disaster/Freeing Sir Amik Varze"
   "Olaf's Quest"
   "A Kingdom Divided"
   "A Taste of Hope"
   "At First Light"
   "Castle Wars Balloon"
   "Ardougne Medium Diary"
   "Desert Medium Diary"
   "Falador Medium Diary"
   "Fremennik Medium Diary"
   "Kandarin Medium Diary"
   "Kourend & Kebos Medium Diary"
   "Lumbridge Medium Diary"
   "Morytania Medium Diary"
   "Varrock Medium Diary"
   "Western Provinces Medium Diary"
   "Curse of the Empty Lord"
   "The General's Shadow"
   "Varrock Museum 2"
   "His Faithful Servants"
   "The Great Brain Robbery"
   "Scrambled!"
   "Fairytale II - Cure a Queen"
   "Recipe for Disaster/Freeing King Awowogei"
   "Recipe for Disaster/Defeating the Culinaromancer"
   "Perilous Moons"
   "The Path of Glouphrie"
   "The Heart of Darkness"
   "Lunar Diplomacy"
   "King's Ransom"
   "Knight Waves Training Grounds"
   "Swan Song"
   "Below Ice Mountain"
   "Defender of Varrock"
   "Devious Minds"
   "Grim Tales"
   "Dream Mentor"
   "Karamja Medium Diary"
   "Wilderness Medium Diary"
   "The Fremennik Exiles"
   "Sins of the Father"
   "Grand Tree Balloon"
   "In Search of Knowledge"
   "Hopespear's Will"
   "Beneath Cursed Sands"
   "Monkey Madness II"
   "Into the Tombs"
   "A Night at the Theatre"
   "Shadows of Custodia"
   "Dragon Slayer II"
   "The Curse of Arrav"
   "Making Friends with My Arm"
   "Secrets of the North"
   "The Final Dawn"
   "While Guthix Sleeps"
   "Desert Treasure II - The Fallen Empire"
   "Song of the Elves"
   "Clock Tower"
   "The Corsair Curse"])

(def quest-data
  '({:title "The Restless Ghost",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "The Knight's Sword",
     :questpoints 1,
     :quests (),
     :skills {:Mining 10},
     :extra
     ("The ability to run from level 57 ice warriors and level 53 ice giants could help.")}
    {:title "The Corsair Curse",
     :questpoints 2,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Cook's Assistant",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Sheep Shearer",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Below Ice Mountain",
     :questpoints 16,
     :quests (),
     :skills {:questpoints 16},
     :extra ()}
    {:title "X Marks the Spot",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Misthalin Mystery",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Rune Mysteries",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Dragon Slayer I",
     :questpoints 32,
     :quests (),
     :skills {},
     :extra ("The ability to defeat a level 83 dragon")}
    {:title "Pirate's Treasure",
     :questpoints 2,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Goblin Diplomacy",
     :questpoints 5,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Witch's Potion",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Black Knights' Fortress",
     :questpoints 12,
     :quests (),
     :skills {},
     :extra ("The ability to evade level 33 Black Knights")}
    {:title "Doric's Quest",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Prince Ali Rescue",
     :questpoints 3,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Imp Catcher",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Vampyre Slayer",
     :questpoints 3,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Ernest the Chicken",
     :questpoints 4,
     :quests (),
     :skills {},
     :extra ("The ability to defend from a level 22 Skeleton .")}
    {:title "Shield of Arrav",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Demon Slayer",
     :questpoints 3,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Romeo & Juliet",
     :questpoints 5,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Druidic Ritual",
     :questpoints 4,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Lost City",
     :questpoints 3,
     :quests (),
     :skills {:Crafting 31, :Woodcutting 36},
     :extra
     ("Ability to kill a level 101 Tree spirit with limited armour and weapons .")}
    {:title "Witch's House",
     :questpoints 4,
     :quests (),
     :skills {},
     :extra
     ("The ability to defeat 4 monsters from level 19 to 53 without a break.")}
    {:title "Merlin's Crystal",
     :questpoints 6,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Heroes' Quest",
     :questpoints 55,
     :quests
     ("Shield of Arrav" "Lost City" "Merlin's Crystal" "Dragon Slayer I"),
     :skills
     {:questpoints 55,
      :Cooking 53,
      :Fishing 53,
      :Herblore 25,
      :Mining 50},
     :extra ("A partner")}
    {:title "Scorpion Catcher",
     :questpoints 1,
     :quests (),
     :skills {:Prayer 31},
     :extra
     ("Completion of Alfred Grimhand's Barcrawl"
      "The ability to run past level 172 black demons and level 64 poison spiders")}
    {:title "Family Crest",
     :questpoints 1,
     :quests (),
     :skills {:Mining 40, :Smithing 40, :Magic 59, :Crafting 40},
     :extra
     ("The ability to defeat a level 170 demon (can be safespotted )")}
    {:title "Fishing Contest",
     :questpoints 1,
     :quests (),
     :skills {:Fishing 10},
     :extra ()}
    {:title "Tribal Totem",
     :questpoints 1,
     :quests (),
     :skills {:Thieving 21},
     :extra ()}
    {:title "Monk's Friend",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Temple of Ikov",
     :questpoints 1,
     :quests (),
     :skills {:Thieving 42, :Ranged 40},
     :extra ("The ability to defeat a level 84 enemy with Ranged")}
    {:title "Clock Tower",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Holy Grail",
     :questpoints 2,
     :quests ("Merlin's Crystal"),
     :skills {:Attack 20},
     :extra
     ("Must be able to defeat a level 120 Black Knight Titan (can be safespotted or flinched )")}
    {:title "Tree Gnome Village",
     :questpoints 2,
     :quests (),
     :skills {},
     :extra ("The ability to defeat a level 112 Khazard warlord")}
    {:title "Fight Arena",
     :questpoints 2,
     :quests (),
     :skills {},
     :extra
     ("The ability to defeat level 44, 63 and 137 enemies (all can be safespotted )")}
    {:title "Hazeel Cult",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Sheep Herder",
     :questpoints 4,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Plague City",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Sea Slug",
     :questpoints 1,
     :quests (),
     :skills {:Firemaking 30},
     :extra ()}
    {:title "Waterfall Quest",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra
     ("The ability to withstand and evade attacks from level 86 Fire Giants and level 84 Moss Guardian without any equipment.")}
    {:title "Jungle Potion",
     :questpoints 1,
     :quests (),
     :skills {:Herblore 3},
     :extra
     ("Completion of Druidic Ritual"
      "The ability to defend against level 53 Jogres and level 46 Harpie Bug Swarms .")}
    {:title "The Grand Tree",
     :questpoints 5,
     :quests (),
     :skills {:Agility 25},
     :extra
     ("The ability to defeat a level 172 Black demon (safespottable for Ranged and Magic or melee using a halberd ).")}
    {:title "Underground Pass",
     :questpoints 5,
     :quests ("Biohazard" "Plague City"),
     :skills {:Ranged 25},
     :extra ()}
    {:title "Observatory Quest",
     :questpoints 2,
     :quests (),
     :skills {},
     :extra ()}
    {:title "The Tourist Trap",
     :questpoints 2,
     :quests (),
     :skills {:Fletching 10, :Smithing 20},
     :extra ("The ability to defeat a level 47 enemy")}
    {:title "Watchtower",
     :questpoints 4,
     :quests (),
     :skills
     {:Magic 14, :Thieving 15, :Agility 25, :Herblore 14, :Mining 40},
     :extra
     ("The ability to defeat a level 68 Ogre and run past level 111 Blue dragons")}
    {:title "Dwarf Cannon",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Murder Mystery",
     :questpoints 3,
     :quests (),
     :skills {},
     :extra ()}
    {:title "The Dig Site",
     :questpoints 2,
     :quests (),
     :skills {:Agility 10, :Herblore 10, :Thieving 25},
     :extra ()}
    {:title "Gertrude's Cat",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Legends' Quest",
     :questpoints 107,
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
    {:title "Death Plateau",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Eadgar's Ruse",
     :questpoints 1,
     :quests ("Druidic Ritual" "Troll Stronghold" "Death Plateau"),
     :skills {:Herblore 31},
     :extra ()}
    {:title "Big Chompy Bird Hunting",
     :questpoints 2,
     :quests (),
     :skills {:Fletching 5, :Cooking 30, :Ranged 30},
     :extra
     ("The ability to defend against level 64 wolves and level 53 ogres")}
    {:title "Elemental Workshop I",
     :questpoints 1,
     :quests (),
     :skills {:Mining 20, :Smithing 20, :Crafting 20},
     :extra ()}
    {:title "Nature Spirit",
     :questpoints 2,
     :quests (),
     :skills {},
     :extra
     ("Completion of Priest in Peril" "Completion of The Restless Ghost")}
    {:title "Priest in Peril",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Regicide",
     :questpoints 3,
     :quests ("Underground Pass" "Biohazard" "Plague City"),
     :skills {:Crafting 10, :Agility 56},
     :extra
     ("The ability to defeat a level 110 Tyras guard (can be safespotted )")}
    {:title "Tai Bwo Wannai Trio",
     :questpoints 2,
     :quests ("Jungle Potion" "Druidic Ritual"),
     :skills {:Agility 15, :Cooking 30, :Fishing 5},
     :extra ()}
    {:title "Troll Stronghold",
     :questpoints nil,
     :quests (),
     :skills {:Agility 15},
     :extra
     ("Completion of Death Plateau"
      "The ability to defeat a level 113 Troll General (can be safespotted )")}
    {:title "Shades of Mort'ton",
     :questpoints 3,
     :quests ("Priest in Peril"),
     :skills {:Crafting 20, :Herblore 15, :Firemaking 5},
     :extra
     ("Must be able to defeat 5 level-40 Loar Shades ."
      "Must be able to survive an onslaught when rebuilding the Temple (Being surrounded by many players makes this much easier)."
      "Access to Mort'ton")}
    {:title "The Fremennik Trials",
     :questpoints 3,
     :quests (),
     :skills {:Fletching 25, :Woodcutting 40, :Crafting 40},
     :extra
     ("OR Players can kill Lanzig , Borrokar , Lensa , or Freidir to obtain the lyre (1/17 chance)"
      "Ability to defeat a level-69 Draugen"
      "Ability to defeat a fairly strong warrior without armour , weapons , or spells")}
    {:title "Horror from the Deep",
     :questpoints nil,
     :quests (),
     :skills {:Agility 35},
     :extra ("Completion of Alfred Grimhand's Barcrawl")}
    {:title "Throne of Miscellania",
     :questpoints 1,
     :quests
     ("Heroes' Quest"
      "Shield of Arrav"
      "Lost City"
      "Merlin's Crystal"
      "Dragon Slayer I"
      "The Fremennik Trials"),
     :skills {},
     :extra ()}
    {:title "Monkey Madness I",
     :questpoints 3,
     :quests ("The Grand Tree" "Tree Gnome Village"),
     :skills {},
     :extra ("The ability to defeat a level 195 Jungle Demon")}
    {:title "Haunted Mine",
     :questpoints nil,
     :quests ("Priest in Peril"),
     :skills {:Crafting 35},
     :extra
     ("The ability to defeat a level 95 enemy"
      "Access to Abandoned Mine")}
    {:title "Troll Romance",
     :questpoints 2,
     :quests ("Troll Stronghold" "Death Plateau"),
     :skills {:Agility 28},
     :extra ("The ability to defeat a level 113 troll")}
    {:title "In Search of the Myreque",
     :questpoints 2,
     :quests ("Nature Spirit" "Priest in Peril" "The Restless Ghost"),
     :skills {:Agility 25},
     :extra ("The ability to defeat a level 97 foe ( safespottable )")}
    {:title "Creature of Fenkenstrain",
     :questpoints 2,
     :quests (),
     :skills {:Crafting 20, :Thieving 25},
     :extra
     ("Completion of Priest in Peril"
      "Completion of The Restless Ghost"
      "Able to defeat a level 51 monster and run past level 72 monsters")}
    {:title "Roving Elves",
     :questpoints 1,
     :quests
     ("Regicide"
      "Underground Pass"
      "Biohazard"
      "Plague City"
      "Waterfall Quest"),
     :skills {:Agility 56},
     :extra
     ("The ability to defeat a level 84 enemy unarmed, with heavy restrictions")}
    {:title "Ghosts Ahoy",
     :questpoints 2,
     :quests (),
     :skills {:Agility 25, :Cooking 20},
     :extra ("Completed Priest in Peril" "Completed The Restless Ghost")}
    {:title "One Small Favour",
     :questpoints 2,
     :quests
     ("Rune Mysteries" "Shilo Village" "Jungle Potion" "Druidic Ritual"),
     :skills {:Agility 36, :Crafting 25, :Herblore 18, :Smithing 30},
     :extra ()}
    {:title "Mountain Daughter",
     :questpoints 2,
     :quests (),
     :skills {:Agility 20},
     :extra
     ("The ability to defeat a level 70 monster (can be safespotted )")}
    {:title "Between a Rock...",
     :questpoints 2,
     :quests ("Dwarf Cannon" "Fishing Contest"),
     :skills {:Defence 30, :Mining 40, :Smithing 50},
     :extra
     ("The ability to defeat a level 75-125 enemy (depends on how much gold you mine)")}
    {:title "The Feud",
     :questpoints 1,
     :quests (),
     :skills {:Thieving 30},
     :extra
     ("The ability to kill a level 70 bandit and a level 75 Menaphite (both can be safespotted).")}
    {:title "The Golem",
     :questpoints 1,
     :quests (),
     :skills {:Crafting 20, :Thieving 25},
     :extra ()}
    {:title "Desert Treasure I",
     :questpoints 3,
     :quests
     ("The Dig Site"
      "Temple of Ikov"
      "The Tourist Trap"
      "Troll Stronghold"
      "Death Plateau"
      "Priest in Peril"
      "Waterfall Quest"),
     :skills {:Thieving 53, :Magic 50, :Firemaking 50, :Slayer 10},
     :extra ("Access to Morytania Graveyard")}
    {:title "Icthlarin's Little Helper",
     :questpoints nil,
     :quests (),
     :skills {},
     :extra
     ("Completion of Gertrude's Cat"
      "The ability to defeat a level 91 monster.")}
    {:title "Tears of Guthix",
     :questpoints 43,
     :quests (),
     :skills {:questpoints 43, :Firemaking 49, :Crafting 20, :Mining 20},
     :extra ()}
    {:title "The Lost Tribe",
     :questpoints 1,
     :quests ("Goblin Diplomacy" "Rune Mysteries"),
     :skills {:Agility 13, :Thieving 13, :Mining 17},
     :extra ()}
    {:title "The Giant Dwarf",
     :questpoints 2,
     :quests (),
     :skills {:Crafting 12, :Firemaking 16, :Magic 33, :Thieving 14},
     :extra ()}
    {:title "Recruitment Drive",
     :questpoints 1,
     :quests ("Black Knights' Fortress" "Druidic Ritual"),
     :skills {},
     :extra ()}
    {:title "Mourning's End Part I",
     :questpoints 2,
     :quests
     ("Roving Elves"
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
     :questpoints 2,
     :quests ("The Giant Dwarf" "Fishing Contest"),
     :skills {:Cooking 22, :Farming 17},
     :extra ()}
    {:title "Garden of Tranquillity",
     :questpoints 2,
     :quests
     ("Creature of Fenkenstrain" "Priest in Peril" "The Restless Ghost"),
     :skills {:Farming 25},
     :extra ()}
    {:title "A Tail of Two Cats",
     :questpoints 2,
     :quests ("Icthlarin's Little Helper" "Gertrude's Cat"),
     :skills {},
     :extra ()}
    {:title "Wanted!",
     :questpoints 32,
     :quests
     ("Recruitment Drive"
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
     :questpoints 2,
     :quests
     ("Mourning's End Part I"
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
     :questpoints 2,
     :quests
     ("Zogre Flesh Eaters"
      "Big Chompy Bird Hunting"
      "Jungle Potion"
      "Druidic Ritual"
      "Priest in Peril"),
     :skills
     {:Crafting 42, :Fishing 50, :Farming 40, :Prayer 47, :Slayer 42},
     :extra
     ("The ability to kill a combat level 150 monster (can be safespotted )")}
    {:title "Shadow of the Storm",
     :questpoints 1,
     :quests ("The Golem" "Demon Slayer"),
     :skills {:Crafting 30},
     :extra ("The ability to defeat a level 100 demon")}
    {:title "Making History",
     :questpoints 3,
     :quests ("Priest in Peril" "The Restless Ghost"),
     :skills {},
     :extra ()}
    {:title "Ratcatchers",
     :questpoints 2,
     :quests ("Icthlarin's Little Helper" "Gertrude's Cat"),
     :skills {},
     :extra ("Access to Keldagrim The Giant Dwarf started")}
    {:title "Spirits of the Elid",
     :questpoints 2,
     :quests (),
     :skills {:Magic 33, :Ranged 37, :Mining 37, :Thieving 37},
     :extra ("Ability to defeat three level 75 golems")}
    {:title "Devious Minds",
     :questpoints 1,
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
      "Enter the Abyss"),
     :skills {:Smithing 65, :Runecraft 50, :Fletching 50},
     :extra ()}
    {:title "The Hand in the Sand",
     :questpoints 1,
     :quests (),
     :skills {:Thieving 17, :Crafting 49},
     :extra ()}
    {:title "Enakhra's Lament",
     :questpoints 2,
     :quests (),
     :skills {:Crafting 50, :Firemaking 45, :Prayer 43, :Magic 39},
     :extra ("Must be on the standard spellbook")}
    {:title "Cabin Fever",
     :questpoints 2,
     :quests
     ("Pirate's Treasure"
      "Rum Deal"
      "Zogre Flesh Eaters"
      "Big Chompy Bird Hunting"
      "Jungle Potion"
      "Druidic Ritual"
      "Priest in Peril"),
     :skills {:Agility 42, :Crafting 45, :Smithing 50, :Ranged 40},
     :extra ()}
    {:title "Fairytale I - Growing Pains",
     :questpoints 2,
     :quests
     ("Lost City" "Nature Spirit" "Priest in Peril" "The Restless Ghost"),
     :skills {},
     :extra
     ("The ability to defeat a level 111 Tanglefoot with limited weaponry")}
    {:title "Recipe for Disaster",
     :questpoints 175,
     :quests
     ("Big Chompy Bird Hunting"
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
     :questpoints 2,
     :quests
     ("In Search of the Myreque"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"),
     :skills {:Agility 25, :Crafting 25, :Mining 15, :Magic 7},
     :extra ()}
    {:title "A Soul's Bane",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Rag and Bone Man I",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Swan Song",
     :questpoints 100,
     :quests
     ("One Small Favour"
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
     :questpoints 1,
     :quests
     ("Throne of Miscellania"
      "Heroes' Quest"
      "Shield of Arrav"
      "Lost City"
      "Merlin's Crystal"
      "Dragon Slayer I"
      "The Fremennik Trials"),
     :skills {:Agility 40, :Slayer 40},
     :extra ()}
    {:title "Death to the Dorgeshuun",
     :questpoints 1,
     :quests ("The Lost Tribe" "Goblin Diplomacy" "Rune Mysteries"),
     :skills {:Agility 23, :Thieving 23},
     :extra
     ("The ability to defeat a level 50 enemy with Melee or Magic")}
    {:title "Fairytale II - Cure a Queen",
     :questpoints 2,
     :quests
     ("Fairytale I - Growing Pains"
      "Lost City"
      "Nature Spirit"
      "The Restless Ghost"
      "Priest in Peril"),
     :skills {:Thieving 40, :Farming 49, :Herblore 57},
     :extra ()}
    {:title "Lunar Diplomacy",
     :questpoints 2,
     :quests
     ("The Fremennik Trials"
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
     :questpoints 2,
     :quests (),
     :skills {:Construction 5, :Magic 46},
     :extra ("Completed The Grand Tree quest")}
    {:title "Darkness of Hallowvale",
     :questpoints 2,
     :quests
     ("In Aid of the Myreque"
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
     :questpoints 1,
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
      "Sea Slug"),
     :skills {:Crafting 30, :Runecraft 30, :Slayer 30, :Thieving 30},
     :extra
     ("The ability to defeat a level 62 enemy with Melee ."
      "You must have the Commorb in your inventory to start the quest.")}
    {:title "Elemental Workshop II",
     :questpoints 1,
     :quests (),
     :skills {:Magic 20, :Smithing 30},
     :extra ("Completion of Elemental Workshop I")}
    {:title "My Arm's Big Adventure",
     :questpoints 1,
     :quests
     ("Eadgar's Ruse"
      "Druidic Ritual"
      "Troll Stronghold"
      "Death Plateau"
      "The Feud"
      "Jungle Potion"),
     :skills {:Farming 29, :Woodcutting 10},
     :extra
     ("At least 60% favour in the Tai Bwo Wannai Cleanup minigame before starting this quest - this will be subtracted from the total favour Acquiring 100% Tai Bwo Favour rating is a requirement for the Medium Karamja Diary . If completion of the medium diary is desired, it is recommended to get 100% prior to starting this quest")}
    {:title "Enlightened Journey",
     :questpoints 20,
     :quests (),
     :skills {:questpoints 20, :Firemaking 20, :Farming 30, :Crafting 36},
     :extra ()}
    {:title "Eagles' Peak",
     :questpoints 2,
     :quests (),
     :skills {:Hunter 27},
     :extra ()}
    {:title "Animal Magnetism",
     :questpoints 1,
     :quests
     ("The Restless Ghost" "Ernest the Chicken" "Priest in Peril"),
     :skills {:Slayer 18, :Crafting 19, :Ranged 30, :Woodcutting 35},
     :extra ()}
    {:title "Contact!",
     :questpoints 1,
     :quests
     ("Prince Ali Rescue" "Icthlarin's Little Helper" "Gertrude's Cat"),
     :skills {},
     :extra ()}
    {:title "Cold War",
     :questpoints 1,
     :quests (),
     :skills
     {:Hunter 10,
      :Agility 30,
      :Crafting 30,
      :Construction 34,
      :Thieving 15},
     :extra ("Access to a crafting table 3")}
    {:title "The Fremennik Isles",
     :questpoints 1,
     :quests (),
     :skills {:Construction 20},
     :extra
     ("Completion of The Fremennik Trials"
      "The ability to kill a level 122 Troll King (Damage can be reduced) and, separately, 10 rock throwing ice trolls in a multicombat area .")}
    {:title "The Great Brain Robbery",
     :questpoints 2,
     :quests ("Creature of Fenkenstrain"
              "Cabin Fever"
              "Pirate's Treasure"
              "Rum Deal"
              "Priest in Peril"
              "Zogre Flesh Eaters"
              "Big Chompy Bird Hunting"
              "Jungle Potion"
              "Druidic Ritual"
              "Recipe for Disaster/Freeing Pirate Pete"
              "Recipe for Disaster/Another Cook's Quest"
              "Cook's Assistant"),
     :skills {:Crafting 16, :Construction 30, :Prayer 50},
     :extra
     ("Access to a player-owned house workshop and crafting table or the Grand Exchange"
      "Be able to kill a level 190 monster that can disable Prayers (can be safespotted without taking damage).")}
    {:title "What Lies Below",
     :questpoints 1,
     :quests ("Rune Mysteries"),
     :skills {:Runecraft 35},
     :extra ()}
    {:title "Olaf's Quest",
     :questpoints 1,
     :quests (),
     :skills {:Firemaking 40, :Woodcutting 50},
     :extra
     ("Completion of The Fremennik Trials"
      "The ability to defeat a level 100 monster")}
    {:title "Another Slice of H.A.M.",
     :questpoints 1,
     :quests
     ("Death to the Dorgeshuun"
      "The Lost Tribe"
      "Goblin Diplomacy"
      "Rune Mysteries"
      "The Giant Dwarf"
      "The Dig Site"),
     :skills {:Attack 15, :Prayer 25},
     :extra
     ("The ability to defeat a level 64 (using any combat style) and two level 30 enemies using either Ranged or Magic .")}
    {:title "Dream Mentor",
     :questpoints 2,
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
      "Death Plateau"),
     :skills {},
     :extra
     ("The ability to defeat 4 powerful monsters without the use of prayer")}
    {:title "Grim Tales",
     :questpoints 1,
     :quests ("Witch's House"),
     :skills
     {:Farming 45,
      :Herblore 52,
      :Thieving 58,
      :Agility 59,
      :Woodcutting 71},
     :extra ("Ability to defeat a level 138 cloud giant— Glod")}
    {:title "King's Ransom",
     :questpoints 1,
     :quests
     ("Black Knights' Fortress"
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
     :questpoints 2,
     :quests ("Jungle Potion" "Druidic Ritual"),
     :skills {:Crafting 20, :Agility 32},
     :extra
     ("Must be able to defend from many Undead ones (level 61-73) and able to defeat three monsters that are about level 90.")}
    {:title "Biohazard",
     :questpoints 3,
     :quests (),
     :skills {},
     :extra ("Completion of Plague City")}
    {:title "Tower of Life",
     :questpoints 2,
     :quests (),
     :skills {:Construction 10},
     :extra ()}
    {:title "Rag and Bone Man II",
     :questpoints 1,
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
     :questpoints 2,
     :quests
     ("Another Slice of H.A.M."
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
     :questpoints 180,
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
     :questpoints 1,
     :quests ("Big Chompy Bird Hunting" "Jungle Potion" "Druidic Ritual"),
     :skills {:Smithing 4, :Herblore 8, :Ranged 30},
     :extra ("You must be able to defeat a level 111 enemy.")}
    {:title "Monkey Madness II",
     :questpoints 4,
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
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ("Completion of the following quest: X Marks the Spot")}
    {:title "The Queen of Thieves",
     :questpoints 1,
     :quests ("Client of Kourend" "X Marks the Spot"),
     :skills {:Thieving 20},
     :extra ()}
    {:title "Bone Voyage",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra
     ("100 Kudos" "Completion of the following quest: The Dig Site")}
    {:title "Dragon Slayer II",
     :questpoints 200,
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
     :questpoints 1,
     :quests ("Client of Kourend" "X Marks the Spot"),
     :skills {:Agility 18},
     :extra ("Ability to kill a level 36 Sand Snake")}
    {:title "Recipe for Disaster/Another Cook's Quest",
     :questpoints 1,
     :quests (),
     :skills {:Cooking 10},
     :extra ("Completion of Cook's Assistant")}
    {:title "Recipe for Disaster/Freeing the Goblin generals",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra
     ("Recipe for Disaster/Another Cook's Quest Cook's Assistant"
      "Goblin Diplomacy")}
    {:title "Recipe for Disaster/Freeing the Mountain Dwarf",
     :questpoints 1,
     :quests
     ("Another Cook's Quest" "Cook's Assistant" "Fishing Contest"),
     :skills {},
     :extra
     ("The ability to defeat a level 13 icefiend if you don't have the ice gloves .")}
    {:title "Recipe for Disaster/Freeing Evil Dave",
     :questpoints 1,
     :quests
     ("Gertrude's Cat"
      "Recipe for Disaster/Another Cook's Quest"
      "Cook's Assistant"
      "Shadow of the Storm"
      "Demon Slayer"
      "The Golem"),
     :skills {:Cooking 25},
     :extra ()}
    {:title "Recipe for Disaster/Freeing Pirate Pete",
     :questpoints 1,
     :quests
     ("Recipe for Disaster/Another Cook's Quest" "Cook's Assistant"),
     :skills {:Cooking 31},
     :extra ("The ability to defeat 5 level 30 monsters.")}
    {:title "Recipe for Disaster/Freeing the Lumbridge Guide",
     :questpoints 1,
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
      "Witch's House"),
     :skills {:Cooking 40},
     :extra ()}
    {:title "Recipe for Disaster/Freeing Sir Amik Varze",
     :questpoints 107,
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
      "Waterfall Quest"),
     :skills {:questpoints 107},
     :extra
     ("Access to the Kharazi Jungle Started Legends' Quest"
      "The ability to defeat a level 227 Black dragon")}
    {:title "Recipe for Disaster/Freeing King Awowogei",
     :questpoints 1,
     :quests
     ("Monkey Madness I"
      "The Grand Tree"
      "Tree Gnome Village"
      "Recipe for Disaster/Another Cook's Quest"
      "Cook's Assistant"),
     :skills {:Cooking 70, :Agility 48},
     :extra ("The ability to defeat a level 84 Big Snake")}
    {:title "Recipe for Disaster/Freeing Skrach Uglogwee",
     :questpoints 1,
     :quests
     ("Big Chompy Bird Hunting"
      "Recipe for Disaster/Another Cook's Quest"
      "Cook's Assistant"),
     :skills {:Cooking 41, :Firemaking 20},
     :extra ()}
    {:title "A Taste of Hope",
     :questpoints 1,
     :quests
     ("Darkness of Hallowvale"
      "In Aid of the Myreque"
      "In Search of the Myreque"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"),
     :skills
     {:Crafting 48, :Agility 45, :Attack 40, :Herblore 40, :Slayer 38},
     :extra ()}
    {:title "Tale of the Righteous",
     :questpoints 1,
     :quests ("Client of Kourend" "X Marks the Spot"),
     :skills {:Strength 16, :Mining 10},
     :extra ()}
    {:title "Making Friends with My Arm",
     :questpoints 2,
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
      "Romeo & Juliet"),
     :skills {:Firemaking 66, :Mining 72, :Construction 35, :Agility 68},
     :extra ("It is beneficial to have a higher Agility level.")}
    {:title "Recipe for Disaster/Defeating the Culinaromancer",
     :questpoints 175,
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
      "Recipe for Disaster/Freeing King Awowogei"),
     :skills {:questpoints 175},
     :extra ("The ability to defeat all enemies without Prayer")}
    {:title "Song of the Elves",
     :questpoints 4,
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
     :questpoints nil,
     :quests ("Client of Kourend" "X Marks the Spot"),
     :skills {:Hunter 12},
     :extra ()}
    {:title "The Forsaken Tower",
     :questpoints 1,
     :quests ("Client of Kourend" "X Marks the Spot"),
     :skills {},
     :extra ()}
    {:title "The Fremennik Exiles",
     :questpoints 2,
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
      "Shield of Arrav"),
     :skills
     {:Crafting 65, :Slayer 60, :Smithing 60, :Fishing 60, :Runecraft 55},
     :extra ()}
    {:title "The Curse of Arrav",
     :questpoints 2,
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
     :questpoints 2,
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
      "Demon Slayer"),
     :skills {:Smithing 55, :Hunter 52},
     :extra ()}
    {:title "Sins of the Father",
     :questpoints 2,
     :quests
     ("Vampyre Slayer"
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
     :questpoints 2,
     :quests
     ("The Depths of Despair"
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
    {:title "A Porcine of Interest",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Getting Ahead",
     :questpoints 1,
     :quests (),
     :skills {:Crafting 30, :Construction 26},
     :extra ()}
    {:title "A Night at the Theatre",
     :questpoints 2,
     :quests
     ("A Taste of Hope"
      "Darkness of Hallowvale"
      "In Aid of the Myreque"
      "In Search of the Myreque"
      "Nature Spirit"
      "Priest in Peril"
      "The Restless Ghost"),
     :skills {},
     :extra ()}
    {:title "Beneath Cursed Sands",
     :questpoints 2,
     :quests
     ("Contact!"
      "Prince Ali Rescue"
      "Icthlarin's Little Helper"
      "Gertrude's Cat"),
     :skills {:Agility 62, :Crafting 55, :Firemaking 55},
     :extra ()}
    {:title "Temple of the Eye",
     :questpoints 1,
     :quests ("Enter the Abyss" "Rune Mysteries"),
     :skills {:Runecraft 10},
     :extra ()}
    {:title "The Path of Glouphrie",
     :questpoints 2,
     :quests
     ("The Eyes of Glouphrie"
      "The Grand Tree"
      "Waterfall Quest"
      "Tree Gnome Village"),
     :skills
     {:Strength 60, :Slayer 56, :Thieving 56, :Ranged 47, :Agility 45},
     :extra ()}
    {:title "Sleeping Giants",
     :questpoints 1,
     :quests (),
     :skills {:Smithing 15},
     :extra ()}
    {:title "The Garden of Death",
     :questpoints 1,
     :quests (),
     :skills {:Farming 20},
     :extra ()}
    {:title "Desert Treasure II - The Fallen Empire",
     :questpoints 5,
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
     :questpoints 2,
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
      "Hazeel Cult"),
     :skills {:Agility 69, :Thieving 64, :Hunter 56},
     :extra ()}
    {:title "Children of the Sun",
     :questpoints 1,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Perilous Moons",
     :questpoints 2,
     :quests ("Twilight's Promise" "Children of the Sun"),
     :skills
     {:Slayer 48,
      :Hunter 20,
      :Fishing 20,
      :Runecraft 20,
      :Construction 10},
     :extra ()}
    {:title "The Ribbiting Tale of a Lily Pad Labour Dispute",
     :questpoints 1,
     :quests ("Children of the Sun"),
     :skills {:Woodcutting 15},
     :extra ()}
    {:title "Twilight's Promise",
     :questpoints 1,
     :quests ("Children of the Sun"),
     :skills {},
     :extra ()}
    {:title "At First Light",
     :questpoints 1,
     :quests ("Children of the Sun" "Eagles' Peak"),
     :skills {:Hunter 46, :Herblore 30, :Construction 27},
     :extra ()}
    {:title "The Heart of Darkness",
     :questpoints 2,
     :quests ("Twilight's Promise" "Children of the Sun"),
     :skills {:Mining 55, :Thieving 48, :Slayer 48, :Agility 46},
     :extra ()}
    {:title "Death on the Isle",
     :questpoints 2,
     :quests ("Children of the Sun"),
     :skills {:Thieving 34, :Agility 32},
     :extra ()}
    {:title "Meat and Greet",
     :questpoints 1,
     :quests ("Children of the Sun"),
     :skills {},
     :extra ()}
    {:title "Ethically Acquired Antiquities",
     :questpoints 1,
     :quests ("Children of the Sun" "Shield of Arrav"),
     :skills {:Thieving 25},
     :extra ()}
    {:title "The Final Dawn",
     :questpoints 3,
     :quests
     ("The Heart of Darkness"
      "Twilight's Promise"
      "Children of the Sun"
      "Perilous Moons"
      "Twilight's Promise"
      "Children of the Sun"),
     :skills {:Thieving 66, :Runecraft 52, :Fletching 52},
     :extra ()}
    {:title "Shadows of Custodia",
     :questpoints 2,
     :quests ("Children of the Sun"),
     :skills {:Slayer 54, :Fishing 45, :Construction 41, :Hunter 36},
     :extra ()}
    {:title "Scrambled!",
     :questpoints 1,
     :quests (),
     :skills {:Construction 38, :Cooking 36, :Smithing 35},
     :extra ("Children of the Sun")}
    {:title "Alfred Grimhand's Barcrawl",
     :questpoints nil,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Enter the Abyss",
     :questpoints nil,
     :quests (),
     :skills {},
     :extra ("Completion of Rune Mysteries")}
    {:title "The General's Shadow",
     :questpoints nil,
     :quests (),
     :skills {},
     :extra
     ("Curse of the Empty Lord , for full ghostly robes Started Desert Treasure I , for the ring of visibility"
      "Fight Arena")}
    {:title "Barbarian Training",
     :questpoints nil,
     :quests (),
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
     :questpoints nil,
     :quests (),
     :skills {:Cooking 20},
     :extra ()}
    {:title "Curse of the Empty Lord",
     :questpoints nil,
     :quests (),
     :skills {:Thieving 53, :Prayer 31},
     :extra ()}
    {:title "Lair of Tarn Razorlor",
     :questpoints nil,
     :quests (),
     :skills {:Slayer 40},
     :extra
     ("The Haunted Mine quest is required to access Tarn's Lair .")}
    {:title "Bear Your Soul",
     :questpoints nil,
     :quests (),
     :skills {},
     :extra ()}
    {:title "The Enchanted Key",
     :questpoints nil,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Mage Arena I",
     :questpoints nil,
     :quests (),
     :skills {:Magic 60},
     :extra ()}
    {:title "Family Pest",
     :questpoints nil,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Mage Arena II",
     :questpoints nil,
     :quests (),
     :skills {:Magic 75},
     :extra
     ("Completion of Mage Arena I"
      "Cast Claws of Guthix , Flames of Zamorak , and Saradomin Strike each 100 times inside the Mage Arena.")}
    {:title "In Search of Knowledge",
     :questpoints nil,
     :quests (),
     :skills {},
     :extra ()}
    {:title "Daddy's Home",
     :questpoints nil,
     :quests (),
     :skills {},
     :extra ()}
    {:title "The Frozen Door",
     :questpoints nil,
     :quests (),
     :skills {:Agility 70, :Hitpoints 70, :Ranged 70, :Strength 70},
     :extra ("Completion of Desert Treasure I")}
    {:title "Hopespear's Will",
     :questpoints nil,
     :quests (),
     :skills {:Prayer 50},
     :extra
     ("Started The Restless Ghost"
      "Completion of Desert Treasure I"
      "Completion of Fairytale II - Cure a Queen"
      "Completion of Land of the Goblins")}
    {:title "Into the Tombs",
     :questpoints nil,
     :quests (),
     :skills {},
     :extra ("Completion of Beneath Cursed Sands")}
    {:title "His Faithful Servants",
     :questpoints nil,
     :quests (),
     :skills {},
     :extra ("Priest in Peril")}
    {:title "Vale Totems (miniquest)",
     :questpoints nil,
     :quests (),
     :skills {:Fletching 20},
     :extra ("Completions of the following quests: Children of the Sun")}
    {:title "Ardougne Easy Diaries",
     :skills {:Thieving 5},
     :quests ["Biohazard" "Rune Mysteries"]}
    {:title "Ardougne Medium Diaries",
     :skills
     {:Crafting 49,
      :Magic 51,
      :Ranged 25,
      :Construction 10,
      :Farming 31,
      :Firemaking 50,
      :Thieving 38,
      :Strength 38,
      :Smithing 1,
      :Fletching 1,
      :Woodcutting 36,
      :Agility 39},
     :quests
     ["Enlightened Journey"
      "The Hand in the Sand"
      "Tower of Life"
      "Underground Pass"]}
    {:title "Ardougne Hard Diaries",
     :skills
     {:Crafting 50,
      :Herblore 45,
      :Magic 66,
      :Runecraft 65,
      :Ranged 60,
      :Construction 50,
      :Farming 70,
      :Thieving 72,
      :Hunter 59,
      :Strength 50,
      :Smithing 68,
      :Prayer 42,
      :Fletching 5,
      :Mining 52,
      :Woodcutting 50,
      :Cooking 53,
      :Fishing 53,
      :Agility 56},
     :quests
     ["Legends' Quest"
      "Monkey Madness I"
      "Mourning's End Part II"
      "Watchtower"]}
    {:title "Ardougne Elite Diaries",
     :skills
     {:Crafting 35,
      :Herblore 10,
      :Magic 94,
      :Ranged 40,
      :Farming 85,
      :Firemaking 50,
      :Thieving 82,
      :Smithing 91,
      :Fletching 69,
      :Cooking 91,
      :Fishing 81,
      :Agility 90},
     :quests ["Desert Treasure I" "Haunted Mine"]}
    {:title "Ardougne Easy Diaries",
     :skills {:Thieving 5},
     :quests ["Biohazard" "Rune Mysteries"]}
    {:title "Ardougne Medium Diaries",
     :skills
     {:Crafting 49,
      :Magic 51,
      :Ranged 25,
      :Construction 10,
      :Farming 31,
      :Firemaking 50,
      :Thieving 38,
      :Strength 38,
      :Smithing 1,
      :Fletching 1,
      :Woodcutting 36,
      :Agility 39},
     :quests
     ["Enlightened Journey"
      "The Hand in the Sand"
      "Tower of Life"
      "Underground Pass"]}
    {:title "Ardougne Hard Diaries",
     :skills
     {:Crafting 50,
      :Herblore 45,
      :Magic 66,
      :Runecraft 65,
      :Ranged 60,
      :Construction 50,
      :Farming 70,
      :Thieving 72,
      :Hunter 59,
      :Strength 50,
      :Smithing 68,
      :Prayer 42,
      :Fletching 5,
      :Mining 52,
      :Woodcutting 50,
      :Cooking 53,
      :Fishing 53,
      :Agility 56},
     :quests
     ["Legends' Quest"
      "Monkey Madness I"
      "Mourning's End Part II"
      "Watchtower"]}
    {:title "Ardougne Elite Diaries",
     :skills
     {:Crafting 35,
      :Herblore 10,
      :Magic 94,
      :Ranged 40,
      :Farming 85,
      :Firemaking 50,
      :Thieving 82,
      :Smithing 91,
      :Fletching 69,
      :Cooking 91,
      :Fishing 81,
      :Agility 90},
     :quests ["Desert Treasure I" "Haunted Mine"]}
    {:title "Desert Easy Diaries",
     :skills {:Thieving 21, :Hunter 5},
     :quests ["Gertrude's Cat"]}
    {:title "Desert Medium Diaries",
     :skills
     {:Crafting 50,
      :Herblore 36,
      :Slayer 22,
      :Magic 39,
      :Ranged 37,
      :Construction 20,
      :Firemaking 45,
      :Thieving 37,
      :Hunter 47,
      :Prayer 43,
      :Mining 34,
      :Woodcutting 35,
      :Agility 30},
     :quests
     ["Eagles' Peak"
      "Enakhra's Lament"
      "The Golem"
      "Spirits of the Elid"]}
    {:title "Desert Hard Diaries",
     :skills
     {:Crafting 61,
      :Herblore 31,
      :Slayer 65,
      :Attack 50,
      :Magic 68,
      :Ranged 40,
      :Firemaking 60,
      :Thieving 65,
      :Smithing 68,
      :Fletching 10,
      :Mining 45,
      :Woodcutting 55,
      :Defence 40,
      :Agility 70},
     :quests ["Contact!" "Desert Treasure I" "Dream Mentor" "The Feud"]}
    {:title "Desert Elite Diaries",
     :skills
     {:Herblore 10,
      :Magic 94,
      :Ranged 40,
      :Construction 78,
      :Firemaking 50,
      :Thieving 91,
      :Smithing 20,
      :Prayer 85,
      :Fletching 95,
      :Cooking 85,
      :Agility 15},
     :quests ["Desert Treasure I"]}
    {:title "Falador Easy Diaries",
     :skills {:Mining 10, :Agility 5, :Smithing 13, :Construction 16},
     :quests ["Doric's Quest" "The Knight's Sword"]}
    {:title "Falador Medium Diaries",
     :skills
     {:Crafting 40,
      :Slayer 32,
      :Magic 37,
      :Ranged 19,
      :Farming 23,
      :Firemaking 49,
      :Thieving 40,
      :Strength 37,
      :Smithing 1,
      :Prayer 10,
      :Fletching 1,
      :Mining 40,
      :Woodcutting 30,
      :Cooking 20,
      :Defence 20,
      :Agility 42},
     :quests ["Recruitment Drive" "Skippy and the Mogres"]}
    {:title "Falador Hard Diaries",
     :skills
     {:Crafting 31,
      :Herblore 52,
      :Slayer 72,
      :Attack 1,
      :Runecraft 56,
      :Farming 45,
      :Firemaking 30,
      :Thieving 58,
      :Strength 1,
      :Prayer 70,
      :Mining 60,
      :Woodcutting 71,
      :Cooking 53,
      :Defence 50,
      :Fishing 53,
      :Agility 59},
     :quests ["Heroes' Quest" "The Slug Menace" "Grim Tales"]}
    {:title "Falador Elite Diaries",
     :skills
     {:Mining 17,
      :Agility 80,
      :Herblore 81,
      :Thieving 13,
      :Woodcutting 75,
      :Runecraft 88,
      :Farming 91},
     :quests ["Wanted!"]}
    {:title "Fremennik Easy Diaries",
     :skills
     {:Mining 20,
      :Smithing 20,
      :Thieving 5,
      :Crafting 23,
      :Firemaking 15,
      :Woodcutting 15,
      :Hunter 11},
     :quests ["The Fremennik Trials"]}
    {:title "Fremennik Medium Diaries",
     :skills
     {:Mining 40,
      :Agility 35,
      :Smithing 50,
      :Defence 30,
      :Thieving 42,
      :Slayer 47,
      :Construction 37,
      :Hunter 35},
     :quests ["Eagles' Peak" "Horror from the Deep"]}
    {:title "Fremennik Hard Diaries",
     :skills
     {:Crafting 61,
      :Herblore 66,
      :Magic 72,
      :Construction 20,
      :Firemaking 49,
      :Thieving 75,
      :Hunter 55,
      :Smithing 60,
      :Fletching 25,
      :Mining 70,
      :Woodcutting 56,
      :Defence 40,
      :Agility 32},
     :quests
     ["Eadgar's Ruse"
      "The Fremennik Isles"
      "Lunar Diplomacy"
      "Throne of Miscellania"]}
    {:title "Fremennik Elite Diaries",
     :skills
     {:Hitpoints 70,
      :Strength 70,
      :Agility 80,
      :Ranged 70,
      :Crafting 80,
      :Runecraft 82,
      :Slayer 83},
     :quests ["The Fremennik Isles" "Lunar Diplomacy" "Troll Stronghold"]}
    {:title "Kandarin Easy Diaries",
     :skills {:Agility 20, :Fishing 16, :Crafting 1, :Farming 13},
     :quests [""]}
    {:title "Kandarin Medium Diaries",
     :skills
     {:Herblore 48,
      :Magic 45,
      :Ranged 40,
      :Farming 26,
      :Thieving 47,
      :Strength 22,
      :Smithing 1,
      :Fletching 50,
      :Mining 30,
      :Cooking 43,
      :Fishing 46,
      :Agility 36},
     :quests
     ["Alfred Grimhand's Barcrawl"
      "Elemental Workshop II"
      "Waterfall Quest"]}
    {:title "Kandarin Hard Diaries",
     :skills
     {:Crafting 10,
      :Magic 56,
      :Construction 50,
      :Firemaking 65,
      :Thieving 53,
      :Strength 50,
      :Smithing 75,
      :Prayer 70,
      :Fletching 70,
      :Woodcutting 60,
      :Defence 70,
      :Fishing 70,
      :Agility 60},
     :quests ["King's Ransom" "Tai Bwo Wannai Trio"]}
    {:title "Kandarin Elite Diaries",
     :skills
     {:Crafting 85,
      :Herblore 86,
      :Magic 87,
      :Farming 79,
      :Firemaking 85,
      :Smithing 90,
      :Cooking 80,
      :Fishing 76,
      :Agility 60},
     :quests ["Family Crest" "Lunar Diplomacy" "Tai Bwo Wannai Trio"]}
    {:title "Karamja Easy Diaries",
     :skills {:Mining 40, :Agility 15},
     :quests [""]}
    {:title "Karamja Medium Diaries",
     :skills
     {:Mining 40,
      :Agility 12,
      :Fishing 65,
      :Cooking 16,
      :Woodcutting 50,
      :Farming 27,
      :Hunter 41},
     :quests ["The Grand Tree" "Shilo Village"]}
    {:title "Karamja Hard Diaries",
     :skills
     {:Slayer 50,
      :Magic 59,
      :Runecraft 44,
      :Ranged 42,
      :Thieving 50,
      :Strength 50,
      :Smithing 40,
      :Fletching 1,
      :Mining 52,
      :Woodcutting 34,
      :Cooking 53,
      :Agility 53},
     :quests ["Tai Bwo Wannai Trio"]}
    {:title "Karamja Elite Diaries",
     :skills {:Herblore 87, :Runecraft 91, :Farming 72},
     :quests [""]}
    {:title "Kourend & Kebos Easy Diaries",
     :skills
     {:Mining 15,
      :Herblore 12,
      :Fishing 20,
      :Thieving 25,
      :Construction 25},
     :quests ["Druidic Ritual"]}
    {:title "Kourend & Kebos Medium Diaries",
     :skills
     {:Crafting 30,
      :Construction 30,
      :Farming 45,
      :Firemaking 50,
      :Hunter 53,
      :Mining 42,
      :Woodcutting 50,
      :Fishing 43,
      :Agility 49},
     :quests
     ["The Ascent of Arceuus"
      "The Depths of Despair"
      "Eagles' Peak"
      "The Forsaken Tower"
      "The Queen of Thieves"
      "Tale of the Righteous"]}
    {:title "Kourend & Kebos Hard Diaries",
     :skills
     {:Mining 65,
      :Smithing 70,
      :Thieving 49,
      :Magic 66,
      :Woodcutting 60,
      :Slayer 62,
      :Farming 74},
     :quests ["Dream Mentor"]}
    {:title "Kourend & Kebos Elite Diaries",
     :skills
     {:Crafting 38,
      :Slayer 95,
      :Magic 90,
      :Runecraft 77,
      :Farming 85,
      :Fletching 40,
      :Mining 38,
      :Woodcutting 90,
      :Cooking 84,
      :Fishing 82},
     :quests [""]}
    {:title "Lumbridge & Draynor Easy Diaries",
     :skills
     {:Mining 15,
      :Fishing 15,
      :Firemaking 15,
      :Woodcutting 15,
      :Runecraft 5,
      :Slayer 7},
     :quests ["Cook's Assistant" "Rune Mysteries"]}
    {:title "Lumbridge & Draynor Medium Diaries",
     :skills
     {:Crafting 38,
      :Magic 31,
      :Runecraft 23,
      :Ranged 50,
      :Thieving 38,
      :Hunter 42,
      :Strength 19,
      :Smithing 1,
      :Fletching 1,
      :Woodcutting 36,
      :Fishing 30,
      :Agility 20},
     :quests ["Animal Magnetism"]}
    {:title "Lumbridge & Draynor Hard Diaries",
     :skills
     {:Crafting 70,
      :Herblore 25,
      :Magic 60,
      :Runecraft 59,
      :Ranged 40,
      :Farming 63,
      :Firemaking 65,
      :Thieving 53,
      :Smithing 40,
      :Prayer 52,
      :Fletching 10,
      :Mining 50,
      :Woodcutting 57,
      :Cooking 70,
      :Fishing 53,
      :Agility 46},
     :quests
     ["Another Slice of H.A.M." "Tears of Guthix" "Recipe for Disaster"]}
    {:title "Lumbridge & Draynor Elite Diaries",
     :skills
     {:Crafting 70,
      :Herblore 70,
      :Slayer 69,
      :Attack 50,
      :Magic 75,
      :Runecraft 76,
      :Ranged 70,
      :Construction 70,
      :Farming 70,
      :Firemaking 75,
      :Thieving 78,
      :Hunter 70,
      :Strength 70,
      :Hitpoints 50,
      :Smithing 88,
      :Prayer 50,
      :Fletching 60,
      :Mining 72,
      :Woodcutting 75,
      :Cooking 70,
      :Defence 65,
      :Fishing 62,
      :Agility 70},
     :quests [""]}
    {:title "Morytania Easy Diaries",
     :skills
     {:Defence 13, :Cooking 12, :Crafting 15, :Slayer 15, :Farming 23},
     :quests ["Nature Spirit"]}
    {:title "Morytania Medium Diaries",
     :skills
     {:Herblore 22,
      :Slayer 42,
      :Ranged 40,
      :Farming 40,
      :Hunter 29,
      :Smithing 50,
      :Woodcutting 45,
      :Cooking 40,
      :Fishing 50,
      :Agility 42},
     :quests
     ["Cabin Fever" "Dwarf Cannon" "Ghosts Ahoy" "Lair of Tarn Razorlor"]}
    {:title "Morytania Hard Diaries",
     :skills
     {:Slayer 58,
      :Magic 66,
      :Construction 50,
      :Farming 53,
      :Firemaking 50,
      :Thieving 53,
      :Smithing 50,
      :Prayer 70,
      :Mining 55,
      :Woodcutting 50,
      :Defence 70,
      :Agility 71},
     :quests
     ["Desert Treasure I"
      "Haunted Mine"
      "In Aid of the Myreque"
      "King's Ransom"]}
    {:title "Morytania Elite Diaries",
     :skills
     {:Crafting 84,
      :Slayer 85,
      :Attack 1,
      :Magic 83,
      :Ranged 1,
      :Firemaking 80,
      :Strength 76,
      :Defence 70,
      :Fishing 96},
     :quests
     ["In Aid of the Myreque" "Lunar Diplomacy" "Shades of Mort'ton"]}
    {:title "Varrock Easy Diaries",
     :skills
     {:Mining 15,
      :Agility 13,
      :Fishing 20,
      :Thieving 5,
      :Crafting 8,
      :Runecraft 9},
     :quests ["Rune Mysteries"]}
    {:title "Varrock Medium Diaries",
     :skills
     {:Agility 30,
      :Herblore 10,
      :Thieving 25,
      :Crafting 36,
      :Firemaking 40,
      :Magic 25,
      :Farming 30},
     :quests
     ["The Dig Site"
      "Enlightened Journey"
      "Garden of Tranquillity"
      "Gertrude's Cat"
      "A Soul's Bane"
      "Tree Gnome Village"]}
    {:title "Varrock Hard Diaries",
     :skills
     {:Magic 54,
      :Ranged 40,
      :Construction 50,
      :Farming 68,
      :Firemaking 60,
      :Thieving 53,
      :Hunter 66,
      :Prayer 52,
      :Woodcutting 60,
      :Agility 51},
     :quests ["Desert Treasure I"]}
    {:title "Varrock Elite Diaries",
     :skills
     {:Smithing 89,
      :Herblore 90,
      :Cooking 95,
      :Magic 86,
      :Fletching 81,
      :Runecraft 78},
     :quests ["Dream Mentor" "Rune Mysteries" "The Tourist Trap"]}
    {:title "Western Provinces Easy Diaries",
     :skills {:Mining 15, :Ranged 30, :Fletching 20, :Hunter 9},
     :quests ["Big Chompy Bird Hunting" "Rune Mysteries"]}
    {:title "Western Provinces Medium Diaries",
     :skills
     {:Ranged 30,
      :Firemaking 35,
      :Hunter 31,
      :Fletching 5,
      :Mining 40,
      :Woodcutting 35,
      :Cooking 42,
      :Fishing 46,
      :Agility 37},
     :quests
     ["Big Chompy Bird Hunting"
      "Eagles' Peak"
      "The Eyes of Glouphrie"
      "The Grand Tree"]}
    {:title "Western Provinces Hard Diaries",
     :skills
     {:Magic 64,
      :Ranged 70,
      :Construction 65,
      :Farming 68,
      :Firemaking 50,
      :Thieving 75,
      :Hunter 69,
      :Fletching 5,
      :Mining 70,
      :Woodcutting 50,
      :Cooking 70,
      :Fishing 62,
      :Agility 56},
     :quests ["Swan Song" "Recipe for Disaster - King Awowogei"]}
    {:title "Western Provinces Elite Diaries",
     :skills
     {:Slayer 93,
      :Attack 42,
      :Magic 42,
      :Ranged 42,
      :Farming 75,
      :Thieving 85,
      :Strength 42,
      :Hitpoints 42,
      :Prayer 22,
      :Fletching 85,
      :Defence 42,
      :Agility 85},
     :quests ["Mourning's End Part I"]}
    {:title "Wilderness Easy Diaries",
     :skills {:Mining 15, :Agility 15, :Magic 21},
     :quests ["Enter the Abyss"]}
    {:title "Wilderness Medium Diaries",
     :skills
     {:Mining 55,
      :Strength 1,
      :Agility 52,
      :Smithing 50,
      :Magic 60,
      :Woodcutting 61,
      :Slayer 50},
     :quests [""]}
    {:title "Wilderness Hard Diaries",
     :skills
     {:Agility 64,
      :Smithing 75,
      :Fishing 53,
      :Magic 66,
      :Slayer 68,
      :Hunter 67},
     :quests ["Death Plateau" "Mage Arena I"]}
    {:title "Wilderness Elite Diaries",
     :skills
     {:Slayer 83,
      :Magic 96,
      :Firemaking 75,
      :Thieving 84,
      :Strength 60,
      :Smithing 90,
      :Mining 85,
      :Woodcutting 75,
      :Cooking 90,
      :Fishing 85,
      :Agility 60},
     :quests ["Desert Treasure I"]}
    ))
