(ns osrs.diary.data)

(def all-diaries
  {:Desert-Diary
   {:easy
    {:requirements
     {:skills
      [{:skill "Thieving", :level 21, :boostable true}
       {:skill "Hunter", :level 5, :boostable true}],
      :quests [],
      :other ["Total level: 56+" "Started Icthlarin's Little Helper"]},
     :tasks
     [{:task "Catch a Golden Warbler .",
       :requirements
       {:skills [{:skill "Hunter", :level 5, :boostable true}],
        :quests [],
        :other
        ["Bird snare"
         "Necklace of passage recommended for quick access to Eagle's Eyrie, near the Uzer Hunter area"]}}
      {:task "Mine 5 clay in the north-eastern desert .",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["Any pickaxe"
         "Necklace of passage recommended for quick access to Eagle's Eyrie, near the Uzer mine"]}}
      {:task "Enter the Kalphite Hive .",
       :requirements {:skills [], :quests [], :other ["Rope"]}}
      {:task
       "Enter the Desert with a set of Desert robes equipped. Note: Not to be confused with the desert outfit , which doesn't count for this task. You also cannot use the black desert shirt or black desert robe .",
       :requirements
       {:skills [],
        :quests [],
        :other ["Desert shirt , desert robe , and desert boots"]}}
      {:task
       "Kill a Vulture Note: These are found north of Menaphos or Sophanem .",
       :requirements
       {:skills [],
        :quests [],
        :other ["Weaponry , preferably Ranged or Magic"]}}
      {:task "Have the Nardah Herbalist clean a Herb for you.",
       :requirements
       {:skills [], :quests [], :other ["Any grimy herb and 200 coins"]}}
      {:task
       "Collect 5 Potato Cactus [ sic ] from the Kalphite Hive . Note: You can bring a single potato cactus to the lair, then drop and pick it up five times.",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["Rope"
         "Antipoison and food recommended if not bringing your own potato cactus"]}}
      {:task
       "Sell some artefacts to Simon Templeton . Note: The pyramid top from the nearby Agility Pyramid does not count.",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["Players must have started Icthlarin's Little Helper for access to Sophanem ."
         "Any artefact from Pyramid Plunder ."]}}
      {:task "Open the Sarcophagus in the first room of Pyramid Plunder",
       :requirements
       {:skills [{:skill "Thieving", :level 21, :boostable true}],
        :quests ["Icthlarin's Little Helper"],
        :other []}}
      {:task "Cut a desert cactus open to fill a waterskin .",
       :requirements
       {:skills [],
        :quests [],
        :other ["Knife or a slash weapon, and an empty waterskin"]}}
      {:task
       "Travel from the Shantay Pass to Pollnivneach by Magic Carpet .",
       :requirements
       {:skills [],
        :quests [],
        :other ["200 coins and a Shantay Pass or another 5 coins."]}}]},
    :medium
    {:requirements
     {:skills
      [{:skill "Mining", :level 37, :boostable true}
       {:skill "Agility", :level 30, :boostable true}
       {:skill "Herblore", :level 36, :boostable true}
       {:skill "Ranged", :level 37, :boostable true}
       {:skill "Thieving", :level 37, :boostable true}
       {:skill "Prayer", :level 43, :boostable false}
       {:skill "Crafting", :level 50, :boostable false}
       {:skill "Firemaking", :level 45, :boostable true}
       {:skill "Magic", :level 39, :boostable true}
       {:skill "Woodcutting", :level 35, :boostable true}
       {:skill "Slayer", :level 22, :boostable true}
       {:skill "Construction", :level 20, :boostable true}
       {:skill "Hunter", :level 47, :boostable true}],
      :quests
      ["Eagles' Peak"
       "Enakhra's Lament"
       "The Golem"
       "Spirits of the Elid"],
      :other ["Total level: 497+" "Started Icthlarin's Little Helper"]},
     :tasks
     [{:task "Climb to the summit of the Agility Pyramid .",
       :requirements
       {:skills [{:skill "Agility", :level 30, :boostable true}],
        :quests [],
        :other ["Protection against desert heat recommended"]}}
      {:task "Slay a desert lizard .",
       :requirements
       {:skills [{:skill "Slayer", :level 22, :boostable true}],
        :quests [],
        :other ["Ice cooler"]}}
      {:task "Catch an Orange Salamander .",
       :requirements
       {:skills [{:skill "Hunter", :level 47, :boostable true}],
        :quests [],
        :other ["Rope and a small fishing net"]}}
      {:task "Steal a feather from the Desert Phoenix .",
       :requirements
       {:skills [{:skill "Thieving", :level 25, :boostable true}],
        :quests [],
        :other []}}
      {:task "Travel to Uzer via Magic Carpet .",
       :requirements
       {:skills [],
        :quests ["The Golem"],
        :other ["200 coins (or 205 coins if using the Shantay Pass )"]}}
      {:task
       "Travel to the Desert via Eagle . Note: You'll unlock travel from the Eagles' Peak Dungeon after the required quest.",
       :requirements
       {:skills [], :quests ["Eagles' Peak"], :other ["Rope"]}}
      {:task
       "Pray at the Elidinis statuette in Nardah Note: Requires you to have less than full Prayer points .",
       :requirements
       {:skills [], :quests ["Spirits of the Elid"], :other []}}
      {:task "Create a combat potion in the desert .",
       :requirements
       {:skills [{:skill "Herblore", :level 36, :boostable true}],
        :quests [],
        :other ["Harralander potion (unf) and goat horn dust"]}}
      {:task "Teleport to Enakhra's Temple with the Camulet .",
       :requirements
       {:skills [], :quests ["Enakhra's Lament"], :other ["Camulet"]}}
      {:task
       "Visit the Genie . Note: This task is automatically completed during Spirits of the Elid .",
       :requirements
       {:skills [],
        :quests ["Spirits of the Elid"],
        :other ["Rope and light source"]}}
      {:task
       "Teleport to Pollnivneach with a redirected teleport to house tablet . Note: Ironmen must instead enter their house via the Pollnivneach house portal .",
       :requirements
       {:skills [{:skill "Construction", :level 20, :boostable true}],
        :quests [],
        :other ["Scroll of redirection and a house tablet"]}}
      {:task
       "Chop some Teak Logs near Uzer . Note: Teak trees are found north-east of the oasis.",
       :requirements
       {:skills [{:skill "Woodcutting", :level 35, :boostable true}],
        :quests [],
        :other ["Any axe"]}}]},
    :hard
    {:requirements
     {:skills
      [{:skill "Attack", :level 50, :boostable true}
       {:skill "Mining", :level 60, :boostable false}
       {:skill "Agility", :level 70, :boostable true}
       {:skill "Smithing", :level 68, :boostable true}
       {:skill "Defence", :level 40, :boostable false}
       {:skill "Herblore", :level 36, :boostable true}
       {:skill "Ranged", :level 40, :boostable false}
       {:skill "Thieving", :level 65, :boostable true}
       {:skill "Prayer", :level 43, :boostable false}
       {:skill "Crafting", :level 61, :boostable false}
       {:skill "Firemaking", :level 60, :boostable true}
       {:skill "Magic", :level 68, :boostable true}
       {:skill "Fletching", :level 10, :boostable true}
       {:skill "Woodcutting", :level 55, :boostable false}
       {:skill "Slayer", :level 65, :boostable true}
       {:skill "Construction", :level 20, :boostable true}
       {:skill "Hunter", :level 47, :boostable true}],
      :quests
      ["Contact!"
       "Desert Treasure I"
       "Dream Mentor"
       "Eagles' Peak"
       "Enakhra's Lament"
       "The Feud"
       "The Golem"
       "Spirits of the Elid"],
      :other ["Total level: 873+" "Defeat the Kalphite Queen"]},
     :tasks
     [{:task "Knock out and pickpocket a Menaphite Thug .",
       :requirements
       {:skills [{:skill "Thieving", :level 65, :boostable true}],
        :quests ["The Feud"],
        :other ["Any blackjack"]}}
      {:task "Mine some Granite . [ d 1 ]",
       :requirements
       {:skills [{:skill "Mining", :level 45, :boostable true}],
        :quests [],
        :other ["Any pickaxe"]}}
      {:task
       "Refill your waterskins in the Desert using Lunar magic . Note: The spell must be cast outside of a desert settlement.",
       :requirements
       {:skills [{:skill "Magic", :level 68, :boostable true}],
        :quests ["Dream Mentor"],
        :other
        ["Lunar spellbook selected"
         "Waterskin that isn't full and means to cast Humidify ( 1 3 1 )"]}}
      {:task "Kill the Kalphite Queen .",
       :requirements
       {:skills [], :quests [], :other ["See the strategy guide"]}}
      {:task "Complete a lap of the Pollnivneach agility course .",
       :requirements
       {:skills [{:skill "Agility", :level 70, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Slay a Dust Devil in the desert cave with a Slayer helmet equipped.",
       :requirements
       {:skills
        [{:skill "Slayer", :level 65, :boostable true}
         {:skill "Crafting", :level 55, :boostable true}],
        :quests ["Desert Treasure I"],
        :other []}}
      {:task
       "Activate Ancient Magicks at the altar in the Jaldraocht Pyramid .",
       :requirements
       {:skills [], :quests ["Desert Treasure I"], :other []}}
      {:task
       "Defeat a Locust Rider with Keris . Note: This weapon only has to be equipped as it dies, allowing you to deal damage with other weapons.",
       :requirements
       {:skills [{:skill "Attack", :level 50, :boostable true}],
        :quests ["Contact!"],
        :other ["Keris or Keris partisan , and any light source"]}}
      {:task
       "Burn some yew logs on the Nardah Mayor 's balcony. Note: He lives directly east of the central fountain.",
       :requirements
       {:skills [{:skill "Firemaking", :level 60, :boostable true}],
        :quests [],
        :other ["Yew log and a tinderbox"]}}
      {:task
       "Create a Mithril Platebody in Nardah . Note: The anvil is found in the westernmost building.",
       :requirements
       {:skills [{:skill "Smithing", :level 68, :boostable true}],
        :quests [],
        :other ["5 mithril bars and a hammer"]}}]},
    :elite
    {:requirements
     {:skills
      [{:skill "Attack", :level 50, :boostable true}
       {:skill "Mining", :level 60, :boostable false}
       {:skill "Agility", :level 70, :boostable true}
       {:skill "Smithing", :level 68, :boostable true}
       {:skill "Defence", :level 40, :boostable false}
       {:skill "Herblore", :level 36, :boostable true}
       {:skill "Ranged", :level 40, :boostable false}
       {:skill "Thieving", :level 91, :boostable false}
       {:skill "Cooking", :level 85, :boostable true}
       {:skill "Prayer", :level 85, :boostable false}
       {:skill "Crafting", :level 61, :boostable false}
       {:skill "Firemaking", :level 60, :boostable true}
       {:skill "Magic", :level 94, :boostable true}
       {:skill "Fletching", :level 95, :boostable true}
       {:skill "Woodcutting", :level 55, :boostable false}
       {:skill "Slayer", :level 65, :boostable true}
       {:skill "Construction", :level 78, :boostable true}
       {:skill "Hunter", :level 47, :boostable true}],
      :quests
      ["Contact!"
       "Desert Treasure I"
       "Dream Mentor"
       "Eagles' Peak"
       "Enakhra's Lament"
       "The Feud"
       "The Golem"
       "Spirits of the Elid"],
      :other
      ["Total level: 1194+"
       "Defeat the Kalphite Queen and obtain her ( tattered ) head"
       "Open the Grand Gold Chest in the final room of Pyramid Plunder"]},
     :tasks
     [{:task "Bake a wild pie at the Nardah Clay Oven .",
       :requirements
       {:skills [{:skill "Cooking", :level 85, :boostable true}],
        :quests [],
        :other ["Raw wild pie"]}}
      {:task
       "Cast Ice Barrage against a foe in the Desert Note: The spell must be cast outside of a desert settlement, and must successfully hit.",
       :requirements
       {:skills [{:skill "Magic", :level 94, :boostable true}],
        :quests ["Desert Treasure I"],
        :other ["Means to cast Ice Barrage ( 6 2 4 )"]}}
      {:task "Fletch some Dragon darts at the Bedabin Camp .",
       :requirements
       {:skills [{:skill "Fletching", :level 95, :boostable true}],
        :quests [],
        :other ["Dragon dart tip and feather"]}}
      {:task
       "Speak to the KQ head in your POH . Note: The Kalphite Queen has a 1/128 chance of dropping her head on death, and is guaranteed to drop a tattered head on the 256th kill, both of which can be used to create the KQ head .",
       :requirements
       {:skills [{:skill "Construction", :level 78, :boostable true}],
        :quests ["Priest in Peril"],
        :other
        ["2 mahogany planks , 2 gold leaves , saw , and hammer"
         "Kq head or Kq head (tattered) , and 50,000 coins to have the taxidermist stuff it"
         "Additional 15,000 coins to construct a Skill Hall if you haven't already"]}}
      {:task
       "Steal from the Grand Gold Chest in the final room of Pyramid Plunder .",
       :requirements
       {:skills [{:skill "Thieving", :level 91, :boostable false}],
        :quests ["Icthlarin's Little Helper"],
        :other []}}
      {:task
       "Restore at least 85 Prayer points when praying at the Altar in Sophanem .",
       :requirements
       {:skills [{:skill "Prayer", :level 85, :boostable false}],
        :quests ["Icthlarin's Little Helper"],
        :other []}}]}},
   :Fremennik-Diary
   {:easy
    {:requirements
     {:skills
      [{:skill "Mining", :level 20, :boostable true}
       {:skill "Smithing", :level 20, :boostable true}
       {:skill "Thieving", :level 5, :boostable true}
       {:skill "Crafting", :level 23, :boostable true}
       {:skill "Firemaking", :level 15, :boostable true}
       {:skill "Woodcutting", :level 15, :boostable true}
       {:skill "Hunter", :level 11, :boostable true}],
      :quests ["The Fremennik Trials"],
      :other
      ["Total level: 134+"
       "Started The Giant Dwarf"
       "Started Troll Stronghold"]},
     :tasks
     [{:task
       "Catch a Cerulean twitch . Note: These birds are found in the Rellekka Hunter area . While you're here, with a high enough Hunter level you can also complete a medium and a hard task by catching a Snowy knight and Sabre-toothed kyatt , respectively.",
       :requirements
       {:skills [{:skill "Hunter", :level 11, :boostable true}],
        :quests [],
        :other ["Bird snare"]}}
      {:task
       "Change your boots at Yrsa 's Shoe Store. Note: Her shoe store has been removed in an update. You'll now have to talk to her for a makeover for 500 coins . Alternatively, you can freely browse her regular clothing store for the task to count as completed.",
       :requirements
       {:skills [],
        :quests ["The Fremennik Trials"],
        :other ["500 coins (optional)"]}}
      {:task
       "Kill 5 Rock crabs . Note: The giant rock crabs and rock lobsters on Waterbirth Island do not count.",
       :requirements {:skills [], :quests [], :other ["Weaponry"]}}
      {:task
       "Craft a tiara from scratch in Rellekka . Note: You have to mine silver ore from the Rellekka mine , then use it on the furnace in the city's westernmost building. Completing or updating any other task in-between these steps will reset the progress for this task.",
       :requirements
       {:skills [{:skill "Crafting", :level 23, :boostable true}],
        :quests ["The Fremennik Trials"],
        :other
        ["Any pickaxe (can be found north of the Rellekka mine ) and a tiara mould"]}}
      {:task
       "Browse the Stonemasons shop . Note: He is located in western Keldagrim . Right-click him to trade.",
       :requirements
       {:skills [],
        :quests ["The Giant Dwarf"],
        :other
        ["Dramen or Lunar staff recommended to travel to Fairy ring code D K S for quick access to the city"]}}
      {:task
       "Collect 5 Snape grass on Waterbirth Island . Note: You can drop and pick up the same snape grass five times.",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["Waterbirth teleport tablet to directly access the island, or either 1000 coins or quest completion of The Fremennik Trials to travel via Jarvald"]}}
      {:task
       "Steal from the Keldagrim crafting or baker's stall. Note: These are located on the eastern side of the Keldagrim Palace .",
       :requirements
       {:skills [{:skill "Thieving", :level 5, :boostable true}],
        :quests ["The Giant Dwarf"],
        :other []}}
      {:task
       "Fill a bucket with water at the Rellekka well . Note: There's a bucket of milk north of the well that can be emptied and filled with water.",
       :requirements {:skills [], :quests [], :other ["Bucket"]}}
      {:task "Enter the Troll Stronghold .",
       :requirements
       {:skills [],
        :quests ["Troll Stronghold"],
        :other ["Climbing boots"]}}
      {:task
       "Chop and burn some oak logs in the Fremennik Province . Note: Oak trees can be found near the Rellekka house portal .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 15, :boostable true}],
        :quests [],
        :other
        ["Any axe (can be found north of the Rellekka mine ) and a tinderbox"]}}]},
    :medium
    {:requirements
     {:skills
      [{:skill "Mining", :level 40, :boostable true}
       {:skill "Agility", :level 35, :boostable true}
       {:skill "Smithing", :level 50, :boostable true}
       {:skill "Defence", :level 30, :boostable true}
       {:skill "Thieving", :level 42, :boostable true}
       {:skill "Crafting", :level 31, :boostable true}
       {:skill "Firemaking", :level 40, :boostable true}
       {:skill "Woodcutting", :level 50, :boostable true}
       {:skill "Slayer", :level 47, :boostable true}
       {:skill "Construction", :level 37, :boostable true}
       {:skill "Hunter", :level 35, :boostable true}],
      :quests
      ["Between a Rock..." "Eagles' Peak" "Horror from the Deep"],
      :other
      ["Total level: 458+"
       "Started Fairytale II - Cure a Queen"
       "Started The Giant Dwarf"
       "Started Troll Stronghold"
       "Partial completion of Olaf's Quest"]},
     :tasks
     [{:task "Slay a Brine rat .",
       :requirements
       {:skills [{:skill "Slayer", :level 47, :boostable true}],
        :quests ["Olaf's Quest"],
        :other ["Weaponry , and a spade to enter the Brine Rat Cavern"]}}
      {:task
       "Travel to the Snowy Hunter Area via Eagle . Note: You'll unlock travel from the Eagles' Peak Dungeon after the required quest.",
       :requirements
       {:skills [], :quests ["Eagles' Peak"], :other ["Rope"]}}
      {:task "Mine some coal in Rellekka .",
       :requirements
       {:skills [{:skill "Mining", :level 30, :boostable true}],
        :quests ["The Fremennik Trials"],
        :other
        ["Any pickaxe (can be found north of the Rellekka mine )"]}}
      {:task "Steal from the Rellekka Fish stalls .",
       :requirements
       {:skills [{:skill "Thieving", :level 42, :boostable true}],
        :quests ["The Fremennik Trials"],
        :other []}}
      {:task "Travel to Miscellania by Fairy ring .",
       :requirements
       {:skills [],
        :quests ["The Fremennik Trials"],
        :other
        ["Dramen or Lunar staff to travel to Fairy ring code C I P"]}}
      {:task "Catch a Snowy knight .",
       :requirements
       {:skills
        [{:skill "Hunter", :level 45, :boostable true}
         {:skill "Hunter", :level 35, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Pick up your Pet Rock from your POH Menagerie . Note: You need to use your pet rock on a pet house , then retrieve it off the ground. You cannot be in building mode .",
       :requirements
       {:skills [{:skill "Construction", :level 37, :boostable true}],
        :quests ["The Fremennik Trials"],
        :other
        ["30,000 coins , 4 oak planks , saw , and hammer to construct a menagerie with a pet house , if you haven't already"
         "Pet rock"]}}
      {:task
       "Visit the Lighthouse from Waterbirth island . Note: You must exit the Waterbirth Island Dungeon on the 5th sublevel.",
       :requirements
       {:skills
        [{:skill "Prayer", :level 43, :boostable true}
         {:skill "Agility", :level 85, :boostable true}],
        :quests ["Horror from the Deep"],
        :other []}}
      {:task
       "Mine some gold at the Arzinian mine . Note: This task is automatically completed during Between a Rock... .",
       :requirements
       {:skills
        [{:skill "Mining", :level 40, :boostable true}
         {:skill "Defence", :level 30, :boostable true}],
        :quests ["Between a Rock..."],
        :other ["Any pickaxe and the gold helmet"]}}]},
    :hard
    {:requirements
     {:skills
      [{:skill "Mining", :level 70, :boostable true}
       {:skill "Agility", :level 35, :boostable true}
       {:skill "Smithing", :level 60, :boostable false}
       {:skill "Defence", :level 40, :boostable false}
       {:skill "Herblore", :level 66, :boostable true}
       {:skill "Fishing", :level 53, :boostable true}
       {:skill "Thieving", :level 75, :boostable true}
       {:skill "Cooking", :level 53, :boostable true}
       {:skill "Crafting", :level 61, :boostable false}
       {:skill "Firemaking", :level 49, :boostable false}
       {:skill "Magic", :level 72, :boostable true}
       {:skill "Woodcutting", :level 56, :boostable true}
       {:skill "Slayer", :level 47, :boostable true}
       {:skill "Construction", :level 37, :boostable true}
       {:skill "Hunter", :level 55, :boostable true}],
      :quests
      ["Between a Rock..."
       "Eadgar's Ruse"
       "Eagles' Peak"
       "Horror from the Deep"
       "Lunar Diplomacy"
       "Throne of Miscellania"],
      :other
      ["Quest points: 55"
       "Total level: 846+"
       "Started Fairytale II - Cure a Queen"
       "Started The Giant Dwarf"
       "Partial completion of Olaf's Quest"]},
     :tasks
     [{:task "Teleport to Trollheim .",
       :requirements
       {:skills [{:skill "Magic", :level 61, :boostable true}],
        :quests ["Eadgar's Ruse"],
        :other ["Means to cast Trollheim Teleport ( 2 2 )"]}}
      {:task "Catch a Sabre-toothed Kyatt .",
       :requirements
       {:skills [{:skill "Hunter", :level 55, :boostable true}],
        :quests [],
        :other ["Teasing stick , logs , and a knife"]}}
      {:task
       "Mix a super defence potion in the Fremennik Province . Note: This has to be done in or near Rellekka .",
       :requirements
       {:skills [{:skill "Herblore", :level 66, :boostable true}],
        :quests [],
        :other ["Cadantine potion (unf) and white berries"]}}
      {:task "Steal from the Keldagrim Gem Stall .",
       :requirements
       {:skills [{:skill "Thieving", :level 75, :boostable true}],
        :quests ["The Giant Dwarf"],
        :other []}}
      {:task "Craft a Neitiznot shield on Neitiznot .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 56, :boostable true}],
        :quests ["The Fremennik Isles"],
        :other
        ["Hammer , rope , a set of bronze nails , and 2 arctic pine logs ."]}}
      {:task "Mine 5 Adamantite ores on Jatizso .",
       :requirements
       {:skills [{:skill "Mining", :level 70, :boostable true}],
        :quests ["The Fremennik Isles"],
        :other ["Any pickaxe"]}}
      {:task "Obtain 100% support from your kingdom subjects.",
       :requirements
       {:skills [],
        :quests ["Throne of Miscellania"],
        :other
        ["Rake , pickaxe , axe , harpoon and/or lobster pot , depending on how you plan to gain support"]}}
      {:task "Teleport to Waterbirth Island .",
       :requirements
       {:skills [{:skill "Magic", :level 72, :boostable true}],
        :quests ["Lunar Diplomacy"],
        :other
        ["Lunar spellbook selected"
         "Means to cast Waterbirth Teleport ( 1 2 1 )"]}}
      {:task
       "Obtain the Blast Furnace Foremans permission to use the Blast Furnace for free. Note: With the requirements, talk to him and use the following dialogue options ( 1 • 3 • 1 ) … 1 What? 3 Can I use the furnace to smelt ore? 1 I have level 60! . Selecting the wrong choices may require you to pay him, in which case you can hop to another world to try again.",
       :requirements {:skills [], :quests [], :other []}}
      {:task "1", :requirements {:skills [], :quests [], :other []}}
      {:task "3", :requirements {:skills [], :quests [], :other []}}
      {:task "1", :requirements {:skills [], :quests [], :other []}}]},
    :elite
    {:requirements
     {:skills
      [{:skill "Hitpoints", :level 70, :boostable false}
       {:skill "Mining", :level 70, :boostable true}
       {:skill "Strength", :level 70, :boostable false}
       {:skill "Agility", :level 80, :boostable true}
       {:skill "Smithing", :level 60, :boostable false}
       {:skill "Defence", :level 40, :boostable false}
       {:skill "Herblore", :level 66, :boostable true}
       {:skill "Fishing", :level 53, :boostable true}
       {:skill "Ranged", :level 70, :boostable false}
       {:skill "Thieving", :level 75, :boostable true}
       {:skill "Cooking", :level 53, :boostable true}
       {:skill "Crafting", :level 80, :boostable true}
       {:skill "Firemaking", :level 49, :boostable false}
       {:skill "Magic", :level 72, :boostable true}
       {:skill "Woodcutting", :level 56, :boostable true}
       {:skill "Runecraft", :level 82, :boostable true}
       {:skill "Slayer", :level 83, :boostable true}
       {:skill "Construction", :level 37, :boostable true}
       {:skill "Hunter", :level 55, :boostable true}],
      :quests
      ["Between a Rock..."
       "Eadgar's Ruse"
       "Eagles' Peak"
       "Horror from the Deep"
       "Lunar Diplomacy"
       "Throne of Miscellania"],
      :other
      ["Quest points: 55"
       "Total level: 1225+"
       "Started Fairytale II - Cure a Queen"
       "Started The Giant Dwarf"
       "Partial completion of Olaf's Quest"
       "Defeat each of the Dagannoth Kings"
       "Defeat all God Wars Dungeon generals , except Nex"]},
     :tasks
     [{:task
       "Kill each of the Dagannoth Kings . Note: Completing or updating any other task in-between these steps will reset the progress for this task.",
       :requirements
       {:skills [{:skill "Agility", :level 85, :boostable true}],
        :quests [],
        :other ["See the strategy guide"]}}
      {:task
       "Craft 56 astral runes simultaneously from Essence without the use of Extracts .",
       :requirements
       {:skills [{:skill "Runecraft", :level 82, :boostable true}],
        :quests ["Lunar Diplomacy"],
        :other
        ["28 pure or daeyalt essence (this task is not bypass-able with Raiments of the Eye )"]}}
      {:task
       "Create a dragonstone amulet in the Neitiznot furnace . Note: Crafting a dragonstone amulet (u) is sufficient, you don't need a ball of wool for this task.",
       :requirements
       {:skills [{:skill "Crafting", :level 80, :boostable true}],
        :quests ["The Fremennik Isles"],
        :other ["Dragonstone , gold bar , and an amulet mould"]}}
      {:task "Complete a lap of the Rellekka agility course .",
       :requirements
       {:skills [{:skill "Agility", :level 80, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Kill the generals of Armadyl , Bandos , Saradomin and Zamorak in the God Wars Dungeon . Note: Having started the The Frozen Door miniquest is recommended to simultaneously unlock the key to Nex . You do not have to kill the generals' bodyguards for this task. Unlike most tasks that involve multiple steps, your progress towards this task will not reset when doing other tasks.",
       :requirements
       {:skills [{:skill "Agility", :level 70, :boostable true}],
        :quests ["Troll Stronghold"],
        :other
        ["See the boss overview (or see the individual strategy guides for Kree'arra , General Graardor , Commander Zilyana , and K'ril Tsutsaroth )"]}}
      {:task
       "Slay a Spiritual mage within the Godwars Dungeon [ sic ] .",
       :requirements
       {:skills [{:skill "Slayer", :level 83, :boostable true}],
        :quests ["Troll Stronghold"],
        :other ["Weaponry"]}}]}},
   :Ardougne-Diary
   {:easy
    {:requirements
     {:skills [{:skill "Thieving", :level 5, :boostable true}],
      :quests ["Biohazard" "Rune Mysteries"],
      :other ["Total level: 36+"]},
     :tasks
     [{:task
       "Have Wizard Cromperty teleport you to the Rune Essence mine . Note: You can right-click him to teleport.",
       :requirements {:skills [], :quests ["Rune Mysteries"], :other []}}
      {:task "Steal a cake from the Ardougne market stalls .",
       :requirements
       {:skills [{:skill "Thieving", :level 5, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Sell Silk to Silk trader [ sic ] in Ardougne for 60 coins each. Note: You must first offer to sell your silk for 120 coins, then counter his bid with 60 coins. He'll refuse to speak to you if you've just stolen from his silk stall , and his behaviour only resets after you've spent at least ten consecutive minutes outside of Ardougne without logging off.",
       :requirements {:skills [], :quests [], :other ["Silk"]}}
      {:task
       "Use the altar in East Ardougne 's church . Note: Requires you to have less than full Prayer points .",
       :requirements {:skills [], :quests [], :other []}}
      {:task
       "Go out fishing on the Fishing Trawler Note: You only have to start this minigame, completing it is optional.",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Enter the Combat Training Camp north of W. Ardougne .",
       :requirements {:skills [], :quests ["Biohazard"], :other []}}
      {:task
       "Have Tindel Marchant identify a Rusted Sword [ sic ] for you. Note: There is a 1/100 chance the sword turns out to be nothing, in which case you'll have to bring a new one.",
       :requirements
       {:skills [], :quests [], :other ["Rusty sword and 100 coins"]}}
      {:task
       "Use the Ardougne Lever to teleport to the Wilderness . Note: You can pull the lever there to return.",
       :requirements {:skills [], :quests [], :other []}}
      {:task "View Aleck's Hunter Emporium in Yanille .",
       :requirements {:skills [], :quests [], :other []}}
      {:task
       "Check what pets you have Insured with Probita in Ardougne . Note: You can right-click her to check.",
       :requirements {:skills [], :quests [], :other []}}]},
    :medium
    {:requirements
     {:skills
      [{:skill "Strength", :level 38, :boostable true}
       {:skill "Agility", :level 39, :boostable true}
       {:skill "Smithing", :level 1, :boostable true}
       {:skill "Ranged", :level 25, :boostable true}
       {:skill "Thieving", :level 38, :boostable true}
       {:skill "Crafting", :level 49, :boostable true}
       {:skill "Firemaking", :level 50, :boostable true}
       {:skill "Magic", :level 51, :boostable true}
       {:skill "Fletching", :level 1, :boostable true}
       {:skill "Woodcutting", :level 36, :boostable true}
       {:skill "Farming", :level 31, :boostable true}
       {:skill "Construction", :level 10, :boostable true}],
      :quests
      ["Enlightened Journey"
       "The Hand in the Sand"
       "Rune Mysteries"
       "Tower of Life"
       "Underground Pass"],
      :other
      ["Quest points: 20"
       "Total level: 391+"
       "Started Fairytale II - Cure a Queen"
       "Started Sea Slug"
       "Partial completion of Watchtower"]},
     :tasks
     [{:task "Enter the Unicorn pen in Ardougne zoo using Fairy rings .",
       :requirements
       {:skills [],
        :quests ["Fairytale II - Cure a Queen"],
        :other
        ["Dramen or Lunar staff to travel to Fairy ring code B I S ."]}}
      {:task "Grapple over Yanille 's south wall.",
       :requirements
       {:skills [{:skill "Agility", :level 39, :boostable true}],
        :quests [],
        :other ["Mith grapple [ a ] and any crossbow"]}}
      {:task
       "Harvest some strawberries from the Ardougne farming patch .",
       :requirements
       {:skills [{:skill "Farming", :level 31, :boostable true}],
        :quests [],
        :other
        ["3 strawberry seeds , spade , seed dibber (or Barbarian Farming ), and a rake"
         "Basket of apples recommended to pay the nearby farmer to protect the crop"]}}
      {:task "Cast the Ardougne Teleport spell.",
       :requirements
       {:skills [{:skill "Magic", :level 51, :boostable true}],
        :quests ["Plague City"],
        :other ["Means to cast Ardougne Teleport ( 2 2 )"]}}
      {:task "Travel to Castlewars [ sic ] by Hot Air Balloon .",
       :requirements
       {:skills [{:skill "Firemaking", :level 50, :boostable true}],
        :quests ["Enlightened Journey"],
        :other
        ["Yew log"
         "If the route has not been unlocked yet, 11 total yew logs are required to unlock it before flying again to Castle Wars to complete this task. Upon unlocking the route, you may use 1 normal log to depart to Taverley before returning to Castle Wars for the task completion."]}}
      {:task
       "Claim buckets of sand from Bert in Yanille . Note: Ultimate Ironmen must instead fill a bucket with sand from Bert's sand pit .",
       :requirements
       {:skills [], :quests ["The Hand in the Sand"], :other ["Bucket"]}}
      {:task "Catch any fish on the Fishing Platform .",
       :requirements
       {:skills [],
        :quests ["Sea Slug"],
        :other ["A small fishing net"]}}
      {:task "Pickpocket the master farmer north of Ardougne .",
       :requirements
       {:skills [{:skill "Thieving", :level 38, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Collect some Nightshade from the Skavid Caves . Note: It can be found in the northernmost cave.",
       :requirements
       {:skills [],
        :quests ["Watchtower"],
        :other ["Any light source and the Skavid map"]}}
      {:task "Kill a swordchick in the Tower of Life .",
       :requirements
       {:skills [],
        :quests ["Tower of Life"],
        :other ["Raw chicken and raw swordfish" "Weaponry"]}}
      {:task
       "Equip Iban's upgraded staff or upgrade an Iban staff . Note: You can upgrade the staff without equipping it.",
       :requirements
       {:skills [],
        :quests ["Underground Pass"],
        :other
        ["Iban's upgraded staff , or 200,000 coins and Iban's staff to have the Dark Mage in West Ardougne upgrade it"]}}
      {:task "Visit the Island East of the Necromancer's tower .",
       :requirements
       {:skills [],
        :quests ["Fairytale II - Cure a Queen"],
        :other
        ["Dramen or Lunar staff to travel to Fairy ring code A I R"]}}]},
    :hard
    {:requirements
     {:skills
      [{:skill "Mining", :level 52, :boostable true}
       {:skill "Strength", :level 50, :boostable true}
       {:skill "Agility", :level 56, :boostable true}
       {:skill "Smithing", :level 68, :boostable true}
       {:skill "Herblore", :level 45, :boostable true}
       {:skill "Fishing", :level 53, :boostable true}
       {:skill "Ranged", :level 60, :boostable true}
       {:skill "Thieving", :level 72, :boostable true}
       {:skill "Cooking", :level 53, :boostable true}
       {:skill "Prayer", :level 42, :boostable true}
       {:skill "Crafting", :level 50, :boostable true}
       {:skill "Firemaking", :level 50, :boostable true}
       {:skill "Magic", :level 66, :boostable true}
       {:skill "Fletching", :level 5, :boostable true}
       {:skill "Woodcutting", :level 50, :boostable true}
       {:skill "Runecraft", :level 65, :boostable true}
       {:skill "Farming", :level 70, :boostable true}
       {:skill "Construction", :level 50, :boostable true}
       {:skill "Hunter", :level 59, :boostable true}],
      :quests
      ["Enlightened Journey"
       "The Hand in the Sand"
       "Legends' Quest"
       "Monkey Madness I"
       "Mourning's End Part II"
       "Rune Mysteries"
       "Tower of Life"
       "Watchtower"],
      :other
      ["Quest points: 107"
       "Total level: 1029+"
       "Started Fairytale II - Cure a Queen"
       "Started Sea Slug"]},
     :tasks
     [{:task
       "Recharge some Jewellery at the Totem in the Legends Guild .",
       :requirements
       {:skills [],
        :quests ["Legends' Quest"],
        :other
        ["Less than fully charged skills necklace or combat bracelet"]}}
      {:task "Enter the Magic Guild .",
       :requirements
       {:skills [{:skill "Magic", :level 66, :boostable true}],
        :quests [],
        :other []}}
      {:task "Steal from a chest in Ardougne Castle .",
       :requirements
       {:skills [{:skill "Thieving", :level 72, :boostable true}],
        :quests [],
        :other ["Lockpick recommended"]}}
      {:task "Have a zookeeper put you in Ardougne Zoo 's monkey cage.",
       :requirements
       {:skills [],
        :quests ["Monkey Madness I"],
        :other ["Karamjan monkey greegree"]}}
      {:task "Teleport to the Watchtower .",
       :requirements
       {:skills [{:skill "Magic", :level 58, :boostable true}],
        :quests ["Watchtower"],
        :other ["Means to cast the Watchtower teleport ( 2 2 )"]}}
      {:task "Catch a Red Salamander .",
       :requirements
       {:skills [{:skill "Hunter", :level 59, :boostable true}],
        :quests [],
        :other ["Rope and small fishing net"]}}
      {:task
       "Check the health of a Palm tree near tree gnome village . Note: This is the farming patch next to Gileth .",
       :requirements
       {:skills [{:skill "Farming", :level 68, :boostable true}],
        :quests [],
        :other
        ["Palm sapling , spade and a rake"
         "15 Papaya fruit recommended to pay the gardener"]}}
      {:task
       "Pick some Poison Ivy berries from the patch south of Ardougne . Note: This patch is located next to the Ardougne Monastery .",
       :requirements
       {:skills [{:skill "Farming", :level 70, :boostable true}],
        :quests [],
        :other
        ["Poison ivy seed , seed dibber (or Barbarian Farming ), and a rake"]}}
      {:task
       "Smith a Mithril platebody near Ardougne . Note: You'll have to use the Port Khazard , Yanille , or West Ardougne anvil for this.",
       :requirements
       {:skills [{:skill "Smithing", :level 68, :boostable true}],
        :quests [],
        :other ["5 mithril bars and a hammer"]}}
      {:task "Enter your POH from Yanille .",
       :requirements
       {:skills [{:skill "Construction", :level 50, :boostable false}],
        :quests [],
        :other
        ["25,000 coins for an estate agent to move your house to Yanille"]}}
      {:task "Smith a Dragon sq shield in West Ardougne .",
       :requirements
       {:skills [{:skill "Smithing", :level 60, :boostable true}],
        :quests ["Plague City"],
        :other ["Shield left half , shield right half and a hammer"]}}
      {:task
       "Craft some Death runes from Essence. Note: Entering the Death Altar from the Mourner Headquarters is not recommended after the quest. It follows a lengthy route that requires mourner gear , the crystal trinket , the new key , and a death talisman / tiara or catalytic talisman / tiara . It's even possible to lock yourself out of this entrance with the light puzzle, which may require you to enter it via the Abyss anyway to change the rotation of the mirrors again.",
       :requirements
       {:skills [{:skill "Runecraft", :level 65, :boostable true}],
        :quests ["Mourning's End Part II"],
        :other
        ["Pure or daeyalt essence Note: Crafting runes using Guardian essence will NOT complete this achievement"
         "Note: Crafting runes using Guardian essence will NOT complete this achievement"
         "Access to the Death Altar via the Abyss"]}}]},
    :elite
    {:requirements
     {:skills
      [{:skill "Mining", :level 52, :boostable true}
       {:skill "Strength", :level 50, :boostable true}
       {:skill "Agility", :level 90, :boostable true}
       {:skill "Smithing", :level 91, :boostable true}
       {:skill "Herblore", :level 45, :boostable true}
       {:skill "Fishing", :level 81, :boostable false}
       {:skill "Ranged", :level 60, :boostable true}
       {:skill "Thieving", :level 82, :boostable true}
       {:skill "Cooking", :level 91, :boostable true}
       {:skill "Prayer", :level 42, :boostable true}
       {:skill "Crafting", :level 50, :boostable true}
       {:skill "Firemaking", :level 50, :boostable true}
       {:skill "Magic", :level 94, :boostable true}
       {:skill "Fletching", :level 69, :boostable true}
       {:skill "Woodcutting", :level 50, :boostable true}
       {:skill "Runecraft", :level 65, :boostable true}
       {:skill "Farming", :level 85, :boostable true}
       {:skill "Construction", :level 50, :boostable true}
       {:skill "Hunter", :level 59, :boostable true}],
      :quests
      ["Desert Treasure I"
       "Enlightened Journey"
       "The Hand in the Sand"
       "Haunted Mine"
       "Legends' Quest"
       "Monkey Madness I"
       "Mourning's End Part II"
       "Rune Mysteries"
       "Tower of Life"
       "Watchtower"],
      :other
      ["Quest points: 107"
       "Total level: 1269+"
       "Started Fairytale II - Cure a Queen"
       "Started Sea Slug"
       "Reach 800,000 Nightmare Zone points (or 400,000 with the hard tier of the Combat Achievements )"]},
     :tasks
     [{:task
       "Catch a Manta ray in the Fishing Trawler and cook it in Port Khazard . Note: Completing or updating any other task in-between these steps will reset the progress for this task.",
       :requirements
       {:skills [{:skill "Fishing", :level 81, :boostable false}],
        :quests [],
        :other
        ["Raw manta ray , multiple recommended in case of burning one"]}}
      {:task
       "Picklock the door to the basement of Yanille Agility Dungeon .",
       :requirements
       {:skills [{:skill "Thieving", :level 82, :boostable true}],
        :quests [],
        :other ["Lockpick"]}}
      {:task "Pickpocket a Hero .",
       :requirements
       {:skills [{:skill "Thieving", :level 80, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Make a rune crossbow yourself from scratch within Witchaven or Yanille . Note: You must use the spinning wheel in Witchaven to make the crossbow string and the anvil in Yanille to make the runite limbs . Fletching the yew stock and completing the rune crossbow can be done in either settlement. Completing or updating any other task in-between these steps will reset the progress for this task.",
       :requirements
       {:skills [{:skill "Crafting", :level 10, :boostable true}],
        :quests [],
        :other
        ["Yew logs , runite bar , hammer , knife , and sinew or a tree root"]}}
      {:task
       "Imbue a Salve amulet at Nightmare Zone , or equip a Salve amulet that was imbued there. Note: You cannot use a Scroll of imbuing from Emir's Arena or use Zeal Tokens from Soul Wars . [ 1 ] In Deadman Mode, the task is \"Attempt to equip an imbued Salve amulet at the Nightmare Zone plinth.\"",
       :requirements
       {:skills [],
        :quests ["Haunted Mine"],
        :other
        ["Access to the Nightmare Zone"
         "Salve amulet(i) or Salve amulet(ei) , or 800,000 Nightmare Zone points points to imbue the normal one (reduced to 400,000 points with the hard tier of the Combat Achievements completed)"]}}
      {:task "Pick some Torstol from the patch north of Ardougne .",
       :requirements
       {:skills [{:skill "Farming", :level 85, :boostable true}],
        :quests [],
        :other
        ["Torstol seed , seed dibber (or Barbarian Farming ), and a rake"
         "Ultracompost recommended"]}}
      {:task "Complete a lap of Ardougne's rooftop agility course .",
       :requirements
       {:skills [{:skill "Agility", :level 90, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Cast Ice Barrage on another player within Castle Wars . Note: You have to successfully hit the player, so multiple casts are recommended. In Deadman Mode, the task is \"Visit the Castle Wars lobby with at least 94 Magic after completing Desert Treasure I.\"",
       :requirements
       {:skills [{:skill "Magic", :level 94, :boostable true}],
        :quests ["Desert Treasure I"],
        :other
        ["Means to cast Ice Barrage ( 6 2 4 or a Blighted ancient ice sack for every cast)"]}}]}},
   :Wilderness-Diary
   {:easy
    {:requirements
     {:skills
      [{:skill "Mining", :level 15, :boostable true}
       {:skill "Agility", :level 15, :boostable true}
       {:skill "Magic", :level 21, :boostable true}],
      :quests ["Enter the Abyss"],
      :other ["Total level: 80+"]},
     :tasks
     [{:task "Cast Low Alchemy at the Fountain of Rune .",
       :requirements
       {:skills [{:skill "Magic", :level 21, :boostable true}],
        :quests [],
        :other ["Item that can be alchemised (nearly any item)"]}}
      {:task
       "Enter the Wilderness from the Ardougne or Edgeville lever.",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Pray at the Chaos Altar in the Western Wilderness .",
       :requirements {:skills [], :quests [], :other []}}
      {:task
       "Enter the Chaos Runecrafting temple . Note: Entering it through the Tunnel of Chaos or Guardians of the Rift will not count for this task.",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["Access to the Chaos Altar ( chaos talisman / tiara , catalytic talisman / tiara , or the Abyss )"]}}
      {:task
       "Kill a Mammoth in the Wilderness . Note: Mammoths are found south-east of Ferox Enclave .",
       :requirements {:skills [], :quests [], :other ["Weaponry"]}}
      {:task
       "Kill an Earth Warrior in the Wilderness beneath Edgeville .",
       :requirements
       {:skills [{:skill "Agility", :level 15, :boostable true}],
        :quests [],
        :other ["Weaponry"]}}
      {:task "Restore some prayer points at the demonic ruins .",
       :requirements {:skills [], :quests [], :other []}}
      {:task
       "Enter the King Black Dragon's lair . Note: This lair is located beneath the Lava Maze .",
       :requirements {:skills [], :quests [], :other []}}
      {:task
       "Collect 5 Red spiders' eggs from the Wilderness Note: These can be found in the northern part of the Edgeville Dungeon . You can also bring eggs into the wilderness, fulfilling the diary by dropping and picking them up five times.",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Mine some Iron ore in the Wilderness .",
       :requirements
       {:skills [{:skill "Mining", :level 15, :boostable true}],
        :quests [],
        :other ["Any pickaxe"]}}
      {:task
       "Have the Mage of Zamorak teleport you to the Abyss . Note: The one-time teleport to the Abyss from Varrock during Temple of the Eye does not count for this task.",
       :requirements
       {:skills [], :quests ["Enter the Abyss"], :other []}}
      {:task
       "Equip any team cape in the Wilderness . Note: Entering the Wilderness with one already equipped does not count for this task.",
       :requirements
       {:skills [], :quests [], :other ["Any team cape"]}}]},
    :medium
    {:requirements
     {:skills
      [{:skill "Mining", :level 55, :boostable true}
       {:skill "Strength", :level 1, :boostable true}
       {:skill "Agility", :level 52, :boostable true}
       {:skill "Smithing", :level 50, :boostable true}
       {:skill "Magic", :level 60, :boostable true}
       {:skill "Woodcutting", :level 61, :boostable false}
       {:skill "Slayer", :level 50, :boostable true}],
      :quests ["Enter the Abyss"],
      :other
      ["Total level: 362+"
       "Access to the Wilderness God Wars Dungeon [ 1 ]"
       "Partial completion of Between a Rock..."]},
     :tasks
     [{:task "Mine some Mithril ore in the wilderness .",
       :requirements
       {:skills [{:skill "Mining", :level 55, :boostable true}],
        :quests [],
        :other ["Any pickaxe"]}}
      {:task
       "Chop some yew logs from a fallen Ent . Note: This must be done within the Wilderness . You can find ents north and east of the chaos temple with the elder chaos druids .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 61, :boostable false}],
        :quests [],
        :other ["Any axe and weaponry"]}}
      {:task
       "Enter the Wilderness Godwars Dungeon . Note: While you're here, with a high enough Slayer level you can also complete another medium task and a hard task by killing a bloodveld and spiritual warrior , respectively.",
       :requirements
       {:skills [{:skill "Agility", :level 60, :boostable true}],
        :quests [],
        :other ["God equipment recommended if going further inside"]}}
      {:task "Complete a lap of the Wilderness Agility course .",
       :requirements
       {:skills [{:skill "Agility", :level 52, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Kill a Green Dragon . Note: This must be done within the Wilderness .",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["Protection from dragonfire recommended if not safe spotting and weaponry to slay it"]}}
      {:task "Kill an Ankou in the Wilderness .",
       :requirements {:skills [], :quests [], :other ["Weaponry"]}}
      {:task "Charge an Earth Orb .",
       :requirements
       {:skills [{:skill "Magic", :level 60, :boostable true}],
        :quests [],
        :other
        ["Unpowered orb and means to cast Charge Earth Orb ( 30 3 )"]}}
      {:task
       "Kill a Bloodveld in the Wilderness Godwars Dungeon . Note: Can be safespotted in the south-west corner while having a Saradomin and Zamorak item equipped.",
       :requirements
       {:skills [{:skill "Agility", :level 60, :boostable true}],
        :quests [],
        :other ["Weaponry and god equipment"]}}
      {:task
       "Talk to the Emblem Trader in Edgeville about emblems. (He's just north of the bank)",
       :requirements {:skills [], :quests [], :other []}}
      {:task
       "Smith a Golden helmet [ sic ] in the Resource Area . Note: You cannot do this while you already have a gold helmet in your inventory or bank, this must be dropped first. With 75 Smithing , you can bring 2 adamantite bars here as well to smith an adamant scimitar for a hard task .",
       :requirements
       {:skills [{:skill "Smithing", :level 50, :boostable true}],
        :quests ["Between a Rock..."],
        :other ["7500 coins , 3 gold bars , and a hammer"]}}
      {:task
       "Open the Muddy Chest in the lava maze . Note: With 53 Fishing , you can bring an oily fishing rod and fishing bait to catch a raw lava eel for a hard task .",
       :requirements
       {:skills [{:skill "Agility", :level 82, :boostable true}],
        :quests [],
        :other ["Muddy key"]}}]},
    :hard
    {:requirements
     {:skills
      [{:skill "Mining", :level 55, :boostable true}
       {:skill "Agility", :level 64, :boostable true}
       {:skill "Smithing", :level 75, :boostable true}
       {:skill "Fishing", :level 53, :boostable true}
       {:skill "Magic", :level 66, :boostable true}
       {:skill "Woodcutting", :level 61, :boostable false}
       {:skill "Slayer", :level 68, :boostable true}
       {:skill "Hunter", :level 67, :boostable true}],
      :quests ["Death Plateau" "Enter the Abyss" "Mage Arena I"],
      :other
      ["Total level: 533+"
       "Access to at least one of the three god spells"
       "Access to the Wilderness God Wars Dungeon"
       "Partial completion of Between a Rock..."
       "Defeat the Chaos elemental"
       "Defeat the Crazy archaeologist , Chaos fanatic , and Scorpia"]},
     :tasks
     [{:task
       "Cast any of the 3 God spells against another player in the Wilderness . Note: You have to successfully hit the player, so multiple casts are recommended. God spells must first be cast 100 times inside the Mage Arena before they can be cast elsewhere, but this task is just as completable inside the arena.",
       :requirements
       {:skills [{:skill "Magic", :level 60, :boostable true}],
        :quests ["Mage Arena I"],
        :other
        ["Any god staff and means to cast its related god spell ( 1-4 1-4 2 per cast)"]}}
      {:task "Charge an Air Orb .",
       :requirements
       {:skills [{:skill "Magic", :level 66, :boostable true}],
        :quests [],
        :other
        ["Unpowered orb and means to cast Charge Air Orb ( 30 3 )"]}}
      {:task "Catch a Black Salamander in the Wilderness .",
       :requirements
       {:skills [{:skill "Hunter", :level 67, :boostable true}],
        :quests [],
        :other ["Small fishing net and a rope"]}}
      {:task
       "Smith an Adamant scimitar in the Resource Area . Note: With 75 Woodcutting and 75 Firemaking , you can bring any axe and a tinderbox to cut and burn some magic logs for an elite task .",
       :requirements
       {:skills [{:skill "Smithing", :level 75, :boostable true}],
        :quests [],
        :other
        ["Hammer and 2 adamantite bars" "6,000-7,500 coins [ a ]"]}}
      {:task
       "Kill a Lava Dragon . Note: Lava dragons are found on Lava Dragon Isle .",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["Protection from dragonfire recommended if not safe spotting and weaponry to slay it"]}}
      {:task "Kill the Chaos Elemental .",
       :requirements
       {:skills [], :quests [], :other ["See the strategy guide"]}}
      {:task
       "Kill the Crazy Arc. [ sic ] , Chaos Fanatic & Scorpia . Note: While these bosses can be killed in any order, completing or updating any other task in-between will reset the progress for this task.",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["See the individual strategy guides for the Crazy archaeologist , Chaos Fanatic , and Scorpia"]}}
      {:task
       "Take the agility shortcut from Trollheim into the Wilderness . Note: Not to be confused with the rocky shortcut further north. The shortcut for this task goes in one direction, and cannot be used to leave the Wilderness again.",
       :requirements
       {:skills [{:skill "Agility", :level 64, :boostable true}],
        :quests ["Troll Stronghold"],
        :other []}}
      {:task
       "Kill a Spiritual warrior in the Wilderness Godwars Dungeon . Note: With 83 Slayer , you can also kill a spiritual mage here to complete an elite task",
       :requirements
       {:skills [{:skill "Agility", :level 60, :boostable true}],
        :quests [],
        :other ["Weaponry and god equipment"]}}
      {:task "Fish some Raw Lava Eel in the Wilderness .",
       :requirements
       {:skills [{:skill "Fishing", :level 53, :boostable true}],
        :quests [],
        :other
        ["Oily fishing rod , fishing bait"
         "Knife , Wilderness sword 1 or 2 , or a slashing weapon"]}}]},
    :elite
    {:requirements
     {:skills
      [{:skill "Mining", :level 85, :boostable true}
       {:skill "Agility", :level 64, :boostable true}
       {:skill "Smithing", :level 90, :boostable true}
       {:skill "Herblore", :level 10, :boostable true}
       {:skill "Fishing", :level 85, :boostable true}
       {:skill "Ranged", :level 40, :boostable true}
       {:skill "Thieving", :level 84, :boostable true}
       {:skill "Cooking", :level 90, :boostable true}
       {:skill "Firemaking", :level 75, :boostable true}
       {:skill "Magic", :level 96, :boostable true}
       {:skill "Fletching", :level 10, :boostable true}
       {:skill "Woodcutting", :level 75, :boostable true}
       {:skill "Slayer", :level 83, :boostable true}
       {:skill "Hunter", :level 67, :boostable true}],
      :quests
      ["Death Plateau"
       "Desert Treasure I"
       "Enter the Abyss"
       "Mage Arena I"],
      :other
      ["Total level: 972+"
       "Access to at least one of the three god spells"
       "Access to the Wilderness God Wars Dungeon"
       "Partial completion of Between a Rock..."
       "Defeat Callisto / Artio , Venenatis / Spindel , and Vet'ion / Calvar'ion"
       "Defeat the Chaos elemental"
       "Defeat the Crazy archaeologist , Chaos fanatic , and Scorpia"]},
     :tasks
     [{:task
       "Kill Callisto , Venenatis & Vet'ion . Note: The lesser versions of these bosses ( Artio , Spindel , and Calvar'ion ) also count towards this task. You must have claimed the rewards from the hard diary tasks before you can access these lesser bosses. While these bosses can be killed in any order, completing or updating any other task in-between will reset the progress for this task.",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["Completion of the Medium Wilderness diary is required to kill the greater versions, and completion of the Hard Wilderness diary is required to kill the lesser versions"
         "See the individual strategy guides for Callisto , Venenatis , and Vet'ion , or those for the weaker bosses Artio , Spindel , and Calvar'ion"]}}
      {:task "Teleport to Ghorrock .",
       :requirements
       {:skills [{:skill "Magic", :level 96, :boostable true}],
        :quests ["Desert Treasure I"],
        :other
        ["Ancient Magicks selected"
         "Means to cast Ghorrock Teleport ( 8 2 )"]}}
      {:task "Fish and Cook a Dark Crab in the Resource Area .",
       :requirements
       {:skills [{:skill "Fishing", :level 85, :boostable true}],
        :quests [],
        :other
        ["Lobster pot and dark fishing bait" "3,750-7,500 coins [ a ]"]}}
      {:task
       "Smith a rune scimitar from scratch in the Resource Area . Note: You must kill two Runite Golems and mine them for runite ores , smelt two runite bars in the nearby furnace , then smith the rune scimitar on the anvil . The step for mining the ore is still completed if it is destroyed by an infernal pickaxe . Completing or updating any other task in-between these steps will reset the progress for this task.",
       :requirements
       {:skills [{:skill "Mining", :level 85, :boostable true}],
        :quests [],
        :other
        ["Weaponry , any pickaxe , hammer , and 16 coal"
         "3,750-7,500 coins [ a ]"]}}
      {:task
       "Steal from the Rogues' chest . Note: You must right-click the chest to search for traps. You'll then be attacked by all nearby rogues .",
       :requirements
       {:skills [{:skill "Thieving", :level 84, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Slay a spiritual mage inside the wilderness Godwars Dungeon [ sic ] .",
       :requirements
       {:skills [{:skill "Agility", :level 60, :boostable true}],
        :quests [],
        :other ["Weaponry and god equipment"]}}
      {:task
       "Cut and burn some magic logs in the Resource Area . Note: Logs burnt by an infernal axe do not count towards this task. Logs may also be burnt on the Forester's Campfire. Completing or updating any other task in-between these steps will reset the progress for this task.",
       :requirements
       {:skills [{:skill "Woodcutting", :level 75, :boostable true}],
        :quests [],
        :other ["Any axe and tinderbox" "3,750-7,500 coins [ a ]"]}}]}},
   :Varrock-Diary
   {:easy
    {:requirements
     {:skills
      [{:skill "Mining", :level 15, :boostable true}
       {:skill "Agility", :level 13, :boostable true}
       {:skill "Fishing", :level 20, :boostable true}
       {:skill "Thieving", :level 5, :boostable true}
       {:skill "Crafting", :level 8, :boostable true}
       {:skill "Runecraft", :level 9, :boostable true}],
      :quests ["Rune Mysteries"],
      :other
      ["Total level: 96+" "Reach 50 kudos with the Varrock Museum"]},
     :tasks
     [{:task "Browse Thessalia's store .",
       :requirements {:skills [], :quests [], :other []}}
      {:task
       "Have Aubury teleport you to the Essence mine . Note: You can right-click him to teleport.",
       :requirements {:skills [], :quests ["Rune Mysteries"], :other []}}
      {:task
       "Mine some Iron in the south-east mining patch near Varrock .",
       :requirements
       {:skills [{:skill "Mining", :level 15, :boostable true}],
        :quests [],
        :other ["Any pickaxe"]}}
      {:task "Make a normal plank at the Sawmill .",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["100 coins"
         "Logs , obtainable from a dying tree here with any axe for another easy task"]}}
      {:task "Enter the second level of the Stronghold of Security .",
       :requirements
       {:skills [],
        :quests [],
        :other ["Food recommended at low combat levels"]}}
      {:task "Jump over the fence south of Varrock .",
       :requirements
       {:skills [{:skill "Agility", :level 13, :boostable true}],
        :quests [],
        :other []}}
      {:task "Chop down a dying tree in the Lumber Yard .",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["Any axe"
         "100 coins recommended, to have the Sawmill operator turn the logs from the tree into a plank for another easy task"]}}
      {:task
       "Buy a newspaper . Note: Can be bought from Benny in Varrock Square .",
       :requirements {:skills [], :quests [], :other ["50 coins"]}}
      {:task
       "Give a dog a bone ! Note: This does not count when done during the investigation segment of Children of the Sun .",
       :requirements {:skills [], :quests [], :other ["Bones"]}}
      {:task
       "Spin a bowl on the pottery wheel and fire it in the oven in Barb Village [ sic ] .",
       :requirements
       {:skills [{:skill "Crafting", :level 8, :boostable true}],
        :quests [],
        :other ["Soft clay"]}}
      {:task "Speak to Haig Halen after obtaining at least 50 Kudos .",
       :requirements
       {:skills [],
        :quests [],
        :other ["See Kudos for all activities that grant them"]}}
      {:task "Craft some Earth runes from Essence.",
       :requirements
       {:skills [{:skill "Runecraft", :level 9, :boostable true}],
        :quests [],
        :other
        ["Pure , daeyalt , or rune essence"
         "Access to the Earth Altar ( earth talisman / tiara , elemental talisman / tiara , or the Abyss )"]}}
      {:task "Catch some trout in the River Lum at Barbarian Village .",
       :requirements
       {:skills [{:skill "Fishing", :level 20, :boostable true}],
        :quests [],
        :other ["Fly fishing rod and some feathers"]}}
      {:task "Steal from the Tea stall in Varrock .",
       :requirements
       {:skills [{:skill "Thieving", :level 5, :boostable true}],
        :quests [],
        :other []}}]},
    :medium
    {:requirements
     {:skills
      [{:skill "Mining", :level 15, :boostable true}
       {:skill "Agility", :level 30, :boostable true}
       {:skill "Herblore", :level 10, :boostable true}
       {:skill "Fishing", :level 20, :boostable true}
       {:skill "Thieving", :level 25, :boostable true}
       {:skill "Crafting", :level 36, :boostable true}
       {:skill "Firemaking", :level 40, :boostable true}
       {:skill "Magic", :level 25, :boostable true}
       {:skill "Runecraft", :level 9, :boostable true}
       {:skill "Farming", :level 30, :boostable true}],
      :quests
      ["The Dig Site"
       "Enlightened Journey"
       "Garden of Tranquillity"
       "Gertrude's Cat"
       "Rune Mysteries"
       "A Soul's Bane"
       "Tree Gnome Village"],
      :other
      ["Quest points: 32"
       "Total level: 262+"
       "Own a Jagex Account , or set up the older RuneScape Authenticator"
       "Reach 50 kudos with the Varrock Museum"]},
     :tasks
     [{:task
       "Have the Apothecary in Varrock make you a strength potion .",
       :requirements
       {:skills [],
        :quests [],
        :other ["Limpwurt root , red spiders' eggs , and 5 coins"]}}
      {:task "Enter the Champions' Guild .",
       :requirements
       {:skills [], :quests [], :other ["32 Quest points"]}}
      {:task
       "Select a colour for your kitten . Note: You can only have one kitten (or cat ) following you at a time. If you already have one, you'll have to shoo it away, store it in a menagerie , or sell it for death runes to West Ardougne civilians . Storing it in your inventory or bank does not allow you to purchase a new one.",
       :requirements
       {:skills [],
        :quests ["Gertrude's Cat"],
        :other ["100 coins" "Wear an activated ring of charos"]}}
      {:task
       "Use the spirit tree north of Varrock . Note: This tree is located in the north-eastern corner of the Grand Exchange .",
       :requirements
       {:skills [], :quests ["Tree Gnome Village"], :other []}}
      {:task "Perform the 4 emotes from the Stronghold of Security .",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["Jagex Account or the older RuneScape Authenticator"
         "Food , protection prayers , and/or enough hitpoints to run through all four floors of the stronghold"]}}
      {:task "Enter the Tolna dungeon after completing A Soul's Bane .",
       :requirements {:skills [], :quests ["A Soul's Bane"], :other []}}
      {:task "Teleport to the digsite using a Digsite pendant .",
       :requirements
       {:skills
        [{:skill "Magic", :level 49, :boostable true}
         {:skill "Magic", :level 49, :boostable true}],
        :quests ["The Dig Site"],
        :other []}}
      {:task "Cast the teleport to Varrock spell.",
       :requirements
       {:skills [{:skill "Magic", :level 25, :boostable true}],
        :quests [],
        :other ["Means to cast Varrock Teleport ( 3 1 1 )"]}}
      {:task "Get a Slayer task from Vannaka .",
       :requirements
       {:skills [{:skill "Combat level", :level 40, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Make 20 Mahogany Planks in one go. Note: You can right-click the Sawmill operator to turn your logs into planks. You'll always need 20 mahogany logs , regardless of whether you're using sawmill vouchers .",
       :requirements
       {:skills [],
        :quests [],
        :other ["20 mahogany logs and 30,000 coins"]}}
      {:task "Pick a White tree fruit .",
       :requirements
       {:skills [{:skill "Farming", :level 25, :boostable true}],
        :quests ["Garden of Tranquillity"],
        :other []}}
      {:task
       "Use the balloon to travel from Varrock . Note: The destination does not matter for this task. You can even pick a locked destination and not take the trip.",
       :requirements
       {:skills
        [{:skill "Farming", :level 30, :boostable true}
         {:skill "Firemaking", :level 40, :boostable true}],
        :quests ["Enlightened Journey"],
        :other
        ["One set of normal logs , oak logs , yew logs , or magic logs , depending on the chosen destination"
         "If the starting point in Varrock has not been unlocked yet, an additional 10 willow logs are needed to first fly towards it from Entrana"]}}
      {:task "Complete a lap of the Varrock Agility course .",
       :requirements
       {:skills [{:skill "Agility", :level 30, :boostable true}],
        :quests [],
        :other []}}]},
    :hard
    {:requirements
     {:skills
      [{:skill "Mining", :level 15, :boostable true}
       {:skill "Agility", :level 51, :boostable true}
       {:skill "Smithing", :level 20, :boostable true}
       {:skill "Herblore", :level 10, :boostable true}
       {:skill "Fishing", :level 20, :boostable true}
       {:skill "Ranged", :level 40, :boostable true}
       {:skill "Thieving", :level 53, :boostable true}
       {:skill "Prayer", :level 52, :boostable true}
       {:skill "Crafting", :level 36, :boostable true}
       {:skill "Firemaking", :level 60, :boostable true}
       {:skill "Magic", :level 54, :boostable true}
       {:skill "Fletching", :level 10, :boostable true}
       {:skill "Woodcutting", :level 60, :boostable true}
       {:skill "Runecraft", :level 9, :boostable true}
       {:skill "Farming", :level 68, :boostable true}
       {:skill "Construction", :level 50, :boostable true}
       {:skill "Hunter", :level 66, :boostable false}],
      :quests
      ["Desert Treasure I"
       "Enlightened Journey"
       "Garden of Tranquillity"
       "Gertrude's Cat"
       "Rune Mysteries"
       "A Soul's Bane"
       "Tree Gnome Village"],
      :other
      ["Quest points: 32"
       "Total level: 689+"
       "Own a Jagex Account , or set up the older RuneScape Authenticator"
       "Reach 153 kudos with the Varrock Museum"]},
     :tasks
     [{:task
       "Trade furs with the Fancy Dress Seller for a spottier cape and equip it.",
       :requirements
       {:skills
        [{:skill "Hunter", :level 66, :boostable false}
         {:skill "Hunter", :level 69, :boostable true}],
        :quests [],
        :other ["800 coins"]}}
      {:task "Speak to Orlando Smith when you have achieved 153 Kudos .",
       :requirements
       {:skills [],
        :quests [],
        :other ["See Kudos for all activities that grant them"]}}
      {:task "Make a Waka canoe near Edgeville .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 57, :boostable true}],
        :quests [],
        :other ["Any axe"]}}
      {:task "Teleport to Paddewwa .",
       :requirements
       {:skills [{:skill "Magic", :level 54, :boostable true}],
        :quests ["Desert Treasure I"],
        :other
        ["Ancient Magicks selected"
         "Means to cast Paddewwa Teleport ( 1 1 2 )"]}}
      {:task "Teleport to Barbarian Village with a skull sceptre .",
       :requirements
       {:skills [],
        :quests [],
        :other ["Skull sceptre , or the required items to create it"]}}
      {:task
       "Chop some yew logs in Varrock and burn them at the top of the Varrock church . Note: There is a yew tree next to the church. Completing or updating any other task in-between these steps will reset the progress for this task. In Deadman Mode, the task is instead \"Burn some Yew logs at the top of the Varrock church with 60 Woodcutting.\"",
       :requirements
       {:skills [{:skill "Woodcutting", :level 60, :boostable true}],
        :quests [],
        :other ["Any axe and tinderbox"]}}
      {:task
       "Have the Varrock estate agent decorate your house with Fancy Stone . Note: You must finish the dialogue or the task will not count as completed.",
       :requirements
       {:skills [{:skill "Construction", :level 50, :boostable false}],
        :quests [],
        :other
        ["25,000 coins"
         "Additional 5,000 coins if already using Fancy Stone , to change to something else and back"]}}
      {:task
       "Collect at least 2 yew roots from the Tree patch in Varrock Palace . Note: While 60 Farming is required to grow the yew tree , you'll need 68 Farming to dig up more than a single root .",
       :requirements
       {:skills [{:skill "Farming", :level 68, :boostable true}],
        :quests [],
        :other
        ["Yew sapling , any axe , and a spade"
         "10 cactus spines recommended to pay the gardener"]}}
      {:task
       "Pray at the altar in Varrock palace with Smite active. Note: The altar is found on the 1 st floor [ UK ] 2 nd floor [ US ] of the palace.",
       :requirements
       {:skills [{:skill "Prayer", :level 52, :boostable false}],
        :quests [],
        :other []}}
      {:task "Squeeze through the obstacle pipe in Edgeville dungeon .",
       :requirements
       {:skills [{:skill "Agility", :level 51, :boostable true}],
        :quests [],
        :other []}}]},
    :elite
    {:requirements
     {:skills
      [{:skill "Mining", :level 60, :boostable true}
       {:skill "Agility", :level 51, :boostable true}
       {:skill "Smithing", :level 89, :boostable true}
       {:skill "Defence", :level 40, :boostable true}
       {:skill "Herblore", :level 90, :boostable true}
       {:skill "Fishing", :level 20, :boostable true}
       {:skill "Ranged", :level 40, :boostable true}
       {:skill "Thieving", :level 53, :boostable true}
       {:skill "Cooking", :level 95, :boostable true}
       {:skill "Prayer", :level 52, :boostable true}
       {:skill "Crafting", :level 61, :boostable true}
       {:skill "Firemaking", :level 60, :boostable true}
       {:skill "Magic", :level 86, :boostable true}
       {:skill "Fletching", :level 81, :boostable true}
       {:skill "Woodcutting", :level 60, :boostable true}
       {:skill "Runecraft", :level 78, :boostable true}
       {:skill "Farming", :level 68, :boostable true}
       {:skill "Construction", :level 50, :boostable true}
       {:skill "Hunter", :level 66, :boostable true}],
      :quests
      ["Desert Treasure I"
       "Dream Mentor"
       "Enlightened Journey"
       "Garden of Tranquillity"
       "Gertrude's Cat"
       "A Soul's Bane"
       "Tree Gnome Village"],
      :other
      ["Quest points: 32"
       "Total level: 1187+"
       "Own a Jagex Account , or set up the older RuneScape Authenticator"
       "Reach 153 kudos with the Varrock Museum"]},
     :tasks
     [{:task "Create a super combat potion in Varrock west bank .",
       :requirements
       {:skills [{:skill "Herblore", :level 90, :boostable true}],
        :quests ["Druidic Ritual"],
        :other
        ["Super attack (4) , super strength (4) , super defence (4) , and a torstol"]}}
      {:task
       "Use Lunar magic to make 20 mahogany planks at the Lumberyard . Note: You must stand within the Lumber Yard , past the fence.",
       :requirements
       {:skills [{:skill "Magic", :level 86, :boostable true}],
        :quests ["Dream Mentor"],
        :other
        ["Lunar spellbook selected"
         "21,000 coins and 20 mahogany logs [ a ]"
         "Means to cast Plank Make twenty times ( 300 40 20 ) [ a ]"]}}
      {:task
       "Bake a summer pie in the Cooking Guild . Note: Instead of using a range , you can use the Bake Pie spell to prevent burning the pie.",
       :requirements
       {:skills [{:skill "Cooking", :level 95, :boostable true}],
        :quests [],
        :other
        ["Raw summer pie"
         "Chef's hat , golden chef's hat , Varrock armour 3 , or Cooking cape"]}}
      {:task "Smith and fletch ten rune darts within Varrock .",
       :requirements
       {:skills [{:skill "Smithing", :level 89, :boostable true}],
        :quests ["The Tourist Trap"],
        :other ["Runite bar , 10 feathers and a hammer"]}}
      {:task
       "Craft 100 or more earth runes simultaneously from Essence without the use of Extracts .",
       :requirements
       {:skills
        [{:skill "Runecraft", :level 78, :boostable true}
         {:skill "Runecraft", :level 52, :boostable true}],
        :quests [],
        :other
        ["28 pure , daeyalt , or rune essence (less may suffice with more Raiments of the Eye pieces)"
         "Access to the Earth Altar ( earth talisman / tiara , elemental talisman / tiara , or the Abyss )"]}}]}},
   :Kandarin-Diary
   {:easy
    {:requirements
     {:skills
      [{:skill "Agility", :level 20, :boostable true}
       {:skill "Fishing", :level 16, :boostable true}
       {:skill "Crafting", :level 1, :boostable true}
       {:skill "Slayer", :level 1, :boostable true}
       {:skill "Farming", :level 13, :boostable true}],
      :quests [],
      :other ["Total level: 78+" "Started Elemental Workshop I"]},
     :tasks
     [{:task "Catch a Mackerel at Catherby .",
       :requirements
       {:skills [{:skill "Fishing", :level 16, :boostable true}],
        :quests [],
        :other ["Big fishing net"]}}
      {:task "Buy a candle from the Chandler in Catherby .",
       :requirements {:skills [], :quests [], :other ["3 coins"]}}
      {:task "Collect five Flax from the Seers' flax fields .",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Play the Organ in Seers' church .",
       :requirements {:skills [], :quests [], :other []}}
      {:task
       "Plant some Jute seeds in the patch north of McGrubor's Wood . Note: This is the farming patch next to Rhonen .",
       :requirements
       {:skills [{:skill "Farming", :level 13, :boostable true}],
        :quests [],
        :other ["3 jute seeds , rake , and a seed dibber"]}}
      {:task "Have Galahad make you a cup of tea .",
       :requirements {:skills [], :quests [], :other []}}
      {:task
       "Defeat one of each elemental in the workshop . Note: These are the earth , water , air , and fire elemental found on the 1 st floor [ UK ] 2 nd floor [ US ] of the workshop .",
       :requirements
       {:skills [],
        :quests ["Elemental Workshop I"],
        :other ["Battered key and weaponry"]}}
      {:task
       "Get a pet fish from Harry in Catherby . Note: You have to talk to Harry with all required items in your inventory.",
       :requirements
       {:skills [],
        :quests [],
        :other ["Fishbowl with water [ a ] , seaweed , and 10 coins"]}}
      {:task "Buy a Stew from the Seers' pub .",
       :requirements {:skills [], :quests [], :other ["20 coins"]}}
      {:task "Speak to Sherlock .",
       :requirements {:skills [], :quests [], :other []}}
      {:task
       "Cross the Coal truck log shortcut . Note: You can take a pickaxe to mine coal here to complete a medium task .",
       :requirements
       {:skills [{:skill "Agility", :level 20, :boostable true}],
        :quests [],
        :other []}}]},
    :medium
    {:requirements
     {:skills
      [{:skill "Mining", :level 30, :boostable true}
       {:skill "Strength", :level 22, :boostable true}
       {:skill "Agility", :level 36, :boostable true}
       {:skill "Smithing", :level 30, :boostable true}
       {:skill "Herblore", :level 48, :boostable true}
       {:skill "Fishing", :level 46, :boostable true}
       {:skill "Ranged", :level 40, :boostable true}
       {:skill "Thieving", :level 47, :boostable true}
       {:skill "Cooking", :level 43, :boostable true}
       {:skill "Crafting", :level 31, :boostable true}
       {:skill "Magic", :level 45, :boostable true}
       {:skill "Fletching", :level 50, :boostable true}
       {:skill "Woodcutting", :level 36, :boostable true}
       {:skill "Slayer", :level 1, :boostable true}
       {:skill "Farming", :level 26, :boostable true}],
      :quests ["Alfred Grimhand's Barcrawl" "Waterfall Quest"],
      :other
      ["Total level: 577+"
       "Started Fairytale II - Cure a Queen"
       "Partial completion of Elemental Workshop II"]},
     :tasks
     [{:task "Complete a lap of the Barbarian agility course .",
       :requirements
       {:skills [{:skill "Agility", :level 35, :boostable true}],
        :quests ["Alfred Grimhand's Barcrawl"],
        :other []}}
      {:task
       "Create a Super Antipoison [ sic ] potion from scratch in the Seers / Catherby Area. Note: Completing or updating any other task in-between adding ingredients will reset the progress for this task.",
       :requirements
       {:skills [{:skill "Herblore", :level 48, :boostable true}],
        :quests [],
        :other ["Vial of water , irit leaf , unicorn horn dust"]}}
      {:task "Enter the Ranging guild .",
       :requirements
       {:skills [{:skill "Ranged", :level 40, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Use the grapple shortcut to get from the water obelisk to Catherby shore. Note: With 56 Magic , you can bring an unpowered orb and runes for Charge Water Orb to complete a hard task .",
       :requirements
       {:skills
        [{:skill "Agility", :level 36, :boostable true}
         {:skill "Agility", :level 70, :boostable true}],
        :quests [],
        :other
        ["Mith grapple [ a ] and any crossbow"
         "Protection from dragonfire recommended"]}}
      {:task
       "Catch and cook a Bass in Catherby . Note: Completing or updating any other task in-between these steps will reset the progress for this task.",
       :requirements
       {:skills [{:skill "Fishing", :level 46, :boostable true}],
        :quests [],
        :other ["Big fishing net"]}}
      {:task "Teleport to Camelot .",
       :requirements
       {:skills [{:skill "Magic", :level 45, :boostable true}],
        :quests [],
        :other ["Means to cast Camelot Teleport ( 5 1 )"]}}
      {:task "String a Maple shortbow in Seers' Village bank .",
       :requirements
       {:skills [{:skill "Fletching", :level 50, :boostable true}],
        :quests [],
        :other ["Maple shortbow (u) and bow string"]}}
      {:task
       "Pick some Limpwurt root from the farming patch in Catherby . Note: This is the flower patch next to Dantaera .",
       :requirements
       {:skills [{:skill "Farming", :level 26, :boostable true}],
        :quests [],
        :other
        ["Limpwurt seed , seed dibber (or Barbarian Farming ), and a rake"
         "Ultracompost recommended"]}}
      {:task
       "Create a Mind helmet . Note: This task is automatically completed during Elemental Workshop II .",
       :requirements
       {:skills [], :quests ["Elemental Workshop II"], :other []}}
      {:task "Kill a Fire Giant inside Baxtorian Waterfall .",
       :requirements
       {:skills [],
        :quests ["Waterfall Quest"],
        :other
        ["Weaponry"
         "Rope"
         "Glarial's amulet only if Waterfall Quest isn't yet completed"]}}
      {:task "Complete a wave of Barbarian Assault .",
       :requirements
       {:skills [], :quests ["Barbarian Assault tutorial"], :other []}}
      {:task
       "Steal from the chest in Hemenster . Note: This chest is located in the building between the buildings with the range and anvil .",
       :requirements
       {:skills [{:skill "Thieving", :level 47, :boostable true}],
        :quests [],
        :other
        ["Lockpick"
         "Combat bracelet recommended for quick access from the nearby Ranging Guild"]}}
      {:task "Travel to McGrubor's Wood by Fairy Ring .",
       :requirements
       {:skills [],
        :quests ["Fairytale II - Cure a Queen"],
        :other
        ["Dramen or Lunar staff to travel to Fairy ring code A L S"]}}
      {:task "Mine some coal near the coal trucks .",
       :requirements
       {:skills [{:skill "Mining", :level 30, :boostable true}],
        :quests [],
        :other ["Any pickaxe"]}}]},
    :hard
    {:requirements
     {:skills
      [{:skill "Attack", :level 20, :boostable true}
       {:skill "Mining", :level 30, :boostable true}
       {:skill "Strength", :level 50, :boostable true}
       {:skill "Agility", :level 60, :boostable true}
       {:skill "Smithing", :level 75, :boostable true}
       {:skill "Defence", :level 70, :boostable false}
       {:skill "Herblore", :level 48, :boostable true}
       {:skill "Fishing", :level 70, :boostable true}
       {:skill "Ranged", :level 40, :boostable true}
       {:skill "Thieving", :level 53, :boostable true}
       {:skill "Cooking", :level 43, :boostable true}
       {:skill "Prayer", :level 70, :boostable false}
       {:skill "Crafting", :level 31, :boostable true}
       {:skill "Firemaking", :level 65, :boostable true}
       {:skill "Magic", :level 56, :boostable true}
       {:skill "Fletching", :level 70, :boostable true}
       {:skill "Woodcutting", :level 60, :boostable true}
       {:skill "Slayer", :level 1, :boostable true}
       {:skill "Farming", :level 26, :boostable true}
       {:skill "Construction", :level 50, :boostable false}],
      :quests ["Alfred Grimhand's Barcrawl"],
      :other
      ["Quest points: 12"
       "Total level: 1000+"
       "Access to Barbarian Fishing , Firemaking , and Smithing"
       "Started Desert Treasure I"
       "Started Fairytale II - Cure a Queen"
       "Partial completion of Elemental Workshop II"
       "Completion of the Knight Waves Training Grounds"
       "Defeat the Penance Queen and complete Barbarian Assault"]},
     :tasks
     [{:task
       "Catch a Leaping Sturgeon . Note: Must be caught at Otto's Grotto for this task.",
       :requirements
       {:skills [{:skill "Fishing", :level 70, :boostable true}],
        :quests [],
        :other
        ["Access to Barbarian Fishing"
         "Barbarian rod and suitable bait ( fishing bait , feathers , fish offcuts , roe , or caviar )"]}}
      {:task "Complete a lap of the Seers' Village agility course .",
       :requirements
       {:skills [{:skill "Agility", :level 60, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Create a Yew Longbow from scratch around Seers' Village . Note: This requires chopping a yew tree in the village, cutting the yew logs into a yew longbow (u) , then finishing it with a bow string . Completing or updating any other task in-between these steps will reset the progress for this task.",
       :requirements
       {:skills [{:skill "Fletching", :level 70, :boostable true}],
        :quests [],
        :other
        ["Any axe , bow string (can be spun from flax ), and a knife"]}}
      {:task "Enter the Seers' Village courthouse with piety turned on.",
       :requirements
       {:skills [{:skill "Prayer", :level 70, :boostable true}],
        :quests ["King's Ransom"],
        :other []}}
      {:task "Charge a Water Orb .",
       :requirements
       {:skills
        [{:skill "Magic", :level 56, :boostable true}
         {:skill "Agility", :level 70, :boostable true}],
        :quests [],
        :other
        ["Unpowered orb and means to cast Charge Water Orb ( 30 3 )"
         "Protection from dragonfire recommended"]}}
      {:task "Burn some Maple logs with a bow in Seers' Village .",
       :requirements
       {:skills [{:skill "Firemaking", :level 65, :boostable true}],
        :quests [],
        :other
        ["Access to Barbarian Firemaking"
         "Maple logs , and any bow (except the twisted , cursed , dark , crystal , ogre , rain , starter or signed oak bow )"]}}
      {:task "Kill a Shadow Hound in the Shadow dungeon .",
       :requirements
       {:skills [{:skill "Thieving", :level 53, :boostable true}],
        :quests ["Desert Treasure I"],
        :other
        ["Ring of visibility (or a ring of shadows ) and weaponry"]}}
      {:task
       "Kill a Mithril Dragon . Note: The mithril dragon fought during Dragon Slayer II does not count for this task.",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["Access to Barbarian Firemaking"
         "Weaponry and protection from dragonfire"]}}
      {:task
       "Purchase and equip a granite body from Barbarian Assault . Note: This requires having defeated the Penance Queen at the end of Barbarian Assault . Buying and equipping the granite body counts as two separate steps, and completing or updating any other task in-between these steps will reset the progress for this task.",
       :requirements
       {:skills [{:skill "Strength", :level 50, :boostable true}],
        :quests [],
        :other
        ["See the gameplay overview and the strategy guide"
         "95,000 coins to purchase the granite body"]}}
      {:task
       "Have the Seers' estate agent decorate your house with Fancy Stone . Note: You must finish the dialogue or the task will not count as completed.",
       :requirements
       {:skills [{:skill "Construction", :level 50, :boostable false}],
        :quests [],
        :other
        ["25,000 coins"
         "Additional 5,000 coins if already using Fancy Stone , to change to something else and back"]}}
      {:task "Smith an Adamant spear at Otto's Grotto .",
       :requirements
       {:skills [{:skill "Smithing", :level 75, :boostable true}],
        :quests [],
        :other
        ["Access to Barbarian Smithing"
         "Yew logs , adamantite bar , and a hammer"]}}]},
    :elite
    {:requirements
     {:skills
      [{:skill "Attack", :level 20, :boostable true}
       {:skill "Mining", :level 60, :boostable false}
       {:skill "Strength", :level 50, :boostable true}
       {:skill "Agility", :level 60, :boostable true}
       {:skill "Smithing", :level 90, :boostable true}
       {:skill "Defence", :level 70, :boostable false}
       {:skill "Herblore", :level 86, :boostable true}
       {:skill "Fishing", :level 76, :boostable true}
       {:skill "Ranged", :level 40, :boostable true}
       {:skill "Thieving", :level 53, :boostable true}
       {:skill "Cooking", :level 80, :boostable true}
       {:skill "Prayer", :level 70, :boostable false}
       {:skill "Crafting", :level 85, :boostable true}
       {:skill "Firemaking", :level 85, :boostable true}
       {:skill "Magic", :level 87, :boostable true}
       {:skill "Fletching", :level 70, :boostable true}
       {:skill "Woodcutting", :level 60, :boostable true}
       {:skill "Farming", :level 79, :boostable true}
       {:skill "Construction", :level 50, :boostable false}],
      :quests
      ["Alfred Grimhand's Barcrawl" "Family Crest" "Lunar Diplomacy"],
      :other
      ["Quest points: 12"
       "Total level: 1284+"
       "Access to Barbarian Fishing , Firemaking , Smithing , and Herblore"
       "Started Desert Treasure I"
       "Started Fairytale II - Cure a Queen"
       "Partial completion of Elemental Workshop II"
       "Completion of the Knight Waves Training Grounds"
       "Defeat the Penance Queen and acquire level 5 in all Barbarian Assault roles"]},
     :tasks
     [{:task
       "Read the Blackboard at Barbarian Assault after reaching level 5 in every role. Note: These levels are bought with honour points . Assuming no points are spent on armour or gambles , you'll need a total of 5,600 points (1,400 per role). In Deadman Mode, the task is instead \"Read the Blackboard at Barbarian Assault after finishing your training.\"",
       :requirements
       {:skills [],
        :quests [],
        :other ["See the gameplay overview and the strategy guide"]}}
      {:task
       "Pick some Dwarf weed from the herb patch at Catherby . Note: This is the herb patch next to Dantaera .",
       :requirements
       {:skills [{:skill "Farming", :level 79, :boostable true}],
        :quests [],
        :other
        ["Dwarf weed seed , spade , seed dibber (or Barbarian Farming ), and a rake"
         "Ultracompost recommended"]}}
      {:task
       "Fish and Cook 5 Sharks in Catherby using the Cooking gauntlets . Note: You specifically have to use the range in the building between the Catherby bank and the archery shop , the one in the building immediately north of that doesn't count. Extra sharks provided by Rada's blessing don't add up to the required number. Completing or updating any other task in-between these steps will reset the progress for this task.",
       :requirements
       {:skills [{:skill "Fishing", :level 76, :boostable true}],
        :quests ["Family Crest"],
        :other
        ["Harpoon (or Barbarian Fishing ) and cooking gauntlets"]}}
      {:task
       "Mix a Stamina Mix on top of the Seers' Village bank . Note: You have to start the Seers' Village Agility Course to climb on top of the bank.",
       :requirements
       {:skills [{:skill "Herblore", :level 86, :boostable true}],
        :quests [],
        :other
        ["Access to Barbarian Herblore"
         "Stamina potion (2) and caviar [ a ]"]}}
      {:task "Smith a Rune Hasta at Otto's Grotto .",
       :requirements
       {:skills [{:skill "Smithing", :level 90, :boostable true}],
        :quests [],
        :other
        ["Access to Barbarian Smithing"
         "Runite bar , magic logs , and a hammer"]}}
      {:task
       "Construct a Pyre ship from Magic Logs . Note: You must use chewed bones for the ship, not mangled bones .",
       :requirements
       {:skills [{:skill "Firemaking", :level 85, :boostable true}],
        :quests [],
        :other
        ["Access to Barbarian Firemaking"
         "Magic logs , chewed bones , tinderbox , and any woodcutting axe"]}}
      {:task "Teleport to Catherby .",
       :requirements
       {:skills [{:skill "Magic", :level 87, :boostable true}],
        :quests ["Lunar Diplomacy"],
        :other
        ["Lunar spellbook selected"
         "Means to cast Catherby Teleport ( 10 3 3 )"]}}]}},
   :Morytania-Diary
   {:easy
    {:requirements
     {:skills
      [{:skill "Cooking", :level 12, :boostable true}
       {:skill "Crafting", :level 15, :boostable true}
       {:skill "Slayer", :level 15, :boostable true}
       {:skill "Farming", :level 23, :boostable true}],
      :quests ["Nature Spirit"],
      :other ["Total level: 93+"]},
     :tasks
     [{:task
       "Craft any Snelm from scratch in Morytania . Note: Must be done outside of Mort Myre Swamp .",
       :requirements
       {:skills [{:skill "Crafting", :level 15, :boostable true}],
        :quests [],
        :other ["Chisel" "Any blamish shell"]}}
      {:task "Cook a thin Snail on the Port Phasmatys range .",
       :requirements
       {:skills [{:skill "Cooking", :level 12, :boostable true}],
        :quests [],
        :other
        ["Thin snail"
         "2 Ecto-tokens or quest completion of Ghosts Ahoy to walk into Port Phasmatys , or enough coins for a charter ship ."]}}
      {:task "Get a slayer task from the Slayer Master in Canifis .",
       :requirements
       {:skills [{:skill "Combat level", :level 20, :boostable true}],
        :quests [],
        :other []}}
      {:task "Kill a Banshee in the Slayer Tower .",
       :requirements
       {:skills [{:skill "Slayer", :level 15, :boostable true}],
        :quests [],
        :other ["Earmuffs or Slayer helmet recommended"]}}
      {:task "Have Sbott in Canifis tan something for you.",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["Any tannable hide and 2-45 coins depending on the type of hide"]}}
      {:task "Enter Mort Myre Swamp .",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Kill a Ghoul .",
       :requirements {:skills [], :quests [], :other ["Weaponry"]}}
      {:task "Place a Scarecrow in the Morytania flower patch .",
       :requirements
       {:skills [{:skill "Farming", :level 23, :boostable true}],
        :quests [],
        :other ["Bronze spear , watermelon , and a hay sack"]}}
      {:task "Offer some bonemeal at the Ectofuntus .",
       :requirements
       {:skills [], :quests [], :other ["Pot , bucket , and any bones"]}}
      {:task
       "Kill a werewolf in its human form using the Wolfbane Dagger [ sic ] .",
       :requirements {:skills [], :quests [], :other ["Wolfbane"]}}
      {:task
       "Restore your prayer points at the nature altar . Note: Requires you to have less than full Prayer points . If able, activate Piety while praying here to complete a hard task .",
       :requirements
       {:skills [],
        :quests ["Nature Spirit"],
        :other
        ["Dramen or Lunar staff recommended to travel to Fairy ring code B I P"]}}]},
    :medium
    {:requirements
     {:skills
      [{:skill "Mining", :level 15, :boostable true}
       {:skill "Agility", :level 42, :boostable false}
       {:skill "Smithing", :level 50, :boostable false}
       {:skill "Herblore", :level 22, :boostable true}
       {:skill "Fishing", :level 50, :boostable true}
       {:skill "Ranged", :level 40, :boostable false}
       {:skill "Cooking", :level 40, :boostable true}
       {:skill "Prayer", :level 47, :boostable true}
       {:skill "Crafting", :level 45, :boostable false}
       {:skill "Magic", :level 7, :boostable true}
       {:skill "Fletching", :level 5, :boostable true}
       {:skill "Woodcutting", :level 45, :boostable true}
       {:skill "Slayer", :level 42, :boostable false}
       {:skill "Farming", :level 40, :boostable true}
       {:skill "Hunter", :level 29, :boostable true}],
      :quests
      ["Cabin Fever"
       "Dwarf Cannon"
       "Ghosts Ahoy"
       "Lair of Tarn Razorlor"],
      :other ["Total level: 536+" "Started In Aid of the Myreque"]},
     :tasks
     [{:task "Catch a swamp lizard .",
       :requirements
       {:skills [{:skill "Hunter", :level 29, :boostable true}],
        :quests [],
        :other ["Rope and small fishing net"]}}
      {:task "Complete a lap of the Canifis agility course .",
       :requirements
       {:skills [{:skill "Agility", :level 40, :boostable true}],
        :quests [],
        :other []}}
      {:task "Obtain some Bark from a Hollow tree .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 45, :boostable true}],
        :quests [],
        :other ["Any axe"]}}
      {:task
       "Travel to Dragontooth Isle . Note: This task is automatically completed during Ghost Ahoy .",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["Ghostspeak amulet and 25 ecto-tokens (or 10 with the activated ring of charos )"]}}
      {:task "Kill a Terror Dog .",
       :requirements
       {:skills [{:skill "Slayer", :level 40, :boostable true}],
        :quests ["Lair of Tarn Razorlor"],
        :other
        ["Weaponry"
         "Slayer ring recommended for quick access to Tarn's Lair"]}}
      {:task
       "Complete a game of trouble brewing . Note: You only have to complete the minigame once, winning it is optional. In Deadman Mode, the task is instead \"Speak to Honest Jimmy about Trouble Brewing.\"",
       :requirements
       {:skills [{:skill "Cooking", :level 40, :boostable true}],
        :quests ["Cabin Fever"],
        :other
        ["Empty inventory and head slot"
         "At least one opposing player to start the game"]}}
      {:task "Board the Swampy boat [ sic ] at the Hollows .",
       :requirements
       {:skills [],
        :quests ["Nature Spirit"],
        :other
        ["Dramen or Lunar staff recommended to travel to Fairy ring code B K R"]}}
      {:task
       "Make a batch of cannonballs at the Port Phasmatys furnace.",
       :requirements
       {:skills [{:skill "Smithing", :level 35, :boostable true}],
        :quests ["Dwarf Cannon"],
        :other
        ["Steel bar and ammo mould (or 2 steel bars and double ammo mould )"]}}
      {:task
       "Kill a Fever Spider on Braindeath Island . Note: This task is automatically completed during Rum Deal .",
       :requirements
       {:skills [{:skill "Slayer", :level 42, :boostable true}],
        :quests ["Rum Deal"],
        :other
        ["Weaponry to fight at range, or means to negate disease (such as Slayer gloves ), recommended"]}}
      {:task "Use an ectophial to return to Port Phasmatys .",
       :requirements
       {:skills [], :quests ["Ghosts Ahoy"], :other ["Ectophial"]}}
      {:task "Mix a Guthix Balance potion while in Morytania .",
       :requirements
       {:skills [{:skill "Herblore", :level 22, :boostable true}],
        :quests ["In Aid of the Myreque"],
        :other
        ["Restore potion , garlic , and silver dust (made by using a silver bar on the Ectofuntus bone grinder )"]}}]},
    :hard
    {:requirements
     {:skills
      [{:skill "Attack", :level 20, :boostable true}
       {:skill "Mining", :level 55, :boostable true}
       {:skill "Agility", :level 71, :boostable true}
       {:skill "Smithing", :level 50, :boostable false}
       {:skill "Defence", :level 70, :boostable false}
       {:skill "Herblore", :level 22, :boostable true}
       {:skill "Fishing", :level 50, :boostable true}
       {:skill "Ranged", :level 40, :boostable false}
       {:skill "Thieving", :level 53, :boostable false}
       {:skill "Cooking", :level 40, :boostable true}
       {:skill "Prayer", :level 70, :boostable false}
       {:skill "Crafting", :level 45, :boostable false}
       {:skill "Firemaking", :level 50, :boostable true}
       {:skill "Magic", :level 66, :boostable true}
       {:skill "Fletching", :level 10, :boostable true}
       {:skill "Woodcutting", :level 50, :boostable true}
       {:skill "Slayer", :level 58, :boostable true}
       {:skill "Farming", :level 53, :boostable true}
       {:skill "Construction", :level 50, :boostable true}
       {:skill "Hunter", :level 29, :boostable true}],
      :quests
      ["Desert Treasure I"
       "Dwarf Cannon"
       "Ghosts Ahoy"
       "In Aid of the Myreque"
       "Lair of Tarn Razorlor"],
      :other
      ["Quest points: 12"
       "Total level: 964+"
       "Started The Great Brain Robbery"
       "Completion of the Knight Waves Training Grounds"]},
     :tasks
     [{:task
       "Enter the Kharyrll Portal in your POH . Note: Teleporting to Kharyrll from a more expensive portal nexus also counts for this task. Higher-tier materials can optionally be used for the portal and centrepiece .",
       :requirements
       {:skills [{:skill "Magic", :level 66, :boostable true}],
        :quests ["Desert Treasure I"],
        :other
        ["100,000 coins , 2 limestone bricks , 3 teak planks , hammer , and saw to construct a portal chamber with an activatable teak portal and teleport focus , if you haven't already"
         "200 law runes and 100 blood runes to direct the portal to Kharyrll"]}}
      {:task
       "Climb up the advanced spike chain within Slayer Tower . Note: This chain is located on the 1 st floor [ UK ] 2 nd floor [ US ] near the Infernal Mages , leading to the 2 nd floor [ UK ] 3 rd floor [ US ] to near the Nechryael .",
       :requirements
       {:skills [{:skill "Agility", :level 71, :boostable true}],
        :quests [],
        :other
        ["Slayer helmet or nose peg recommended against the aberrant spectres , when climbing the spikey chain on the ground floor [ UK ] 1 st floor [ US ] as a shortcut to the advanced spikey chain"]}}
      {:task
       "Harvest some Watermelon from the Allotment patch on Harmony Island .",
       :requirements
       {:skills [{:skill "Farming", :level 47, :boostable true}],
        :quests ["The Great Brain Robbery"],
        :other
        ["3 watermelon seeds , spade , seed dibber (or Barbarian Farming ), and a rake"
         "Ultracompost recommended"]}}
      {:task "Chop and burn some mahogany logs on Mos Le'Harmless .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 50, :boostable true}],
        :quests ["Cabin Fever"],
        :other
        ["Any axe and a tinderbox"
         "Witchwood icon and a light source (if Fire of Eternal Light has not been built) recommended"]}}
      {:task
       "Complete a temple trek with a hard companion. Note: Completion of Darkness of Hallowvale unlocks the reverse route. It's not necessary to complete any events for this task. In Deadman Mode, the task is instead \"Speak to a hard companion about completing a Temple Trek.\"",
       :requirements
       {:skills [],
        :quests ["In Aid of the Myreque"],
        :other ["See the recommendations"]}}
      {:task "Kill a Cave Horror .",
       :requirements
       {:skills [{:skill "Slayer", :level 58, :boostable true}],
        :quests ["Cabin Fever"],
        :other ["Witchwood icon and a light source"]}}
      {:task
       "Harvest some Bittercap Mushrooms from the patch in Canifis .",
       :requirements
       {:skills [{:skill "Farming", :level 53, :boostable true}],
        :quests [],
        :other
        ["Mushroom spore , seed dibber (or Barbarian Farming ), and a rake"
         "Ultracompost recommended"]}}
      {:task "Pray at the Altar of Nature with Piety activated.",
       :requirements
       {:skills [{:skill "Prayer", :level 70, :boostable true}],
        :quests ["Nature Spirit"],
        :other
        ["Dramen or Lunar staff recommended to travel to Fairy ring code B I P"]}}
      {:task
       "Use the shortcut to get to the bridge over the Salve . Note: You have to use the shortcut to go downwards for this task, not upwards.",
       :requirements
       {:skills [{:skill "Agility", :level 65, :boostable true}],
        :quests [],
        :other []}}
      {:task "Mine some Mithril ore in the Abandoned Mine .",
       :requirements
       {:skills [{:skill "Mining", :level 55, :boostable true}],
        :quests ["Haunted Mine"],
        :other ["Any pickaxe"]}}]},
    :elite
    {:requirements
     {:skills
      [{:skill "Attack", :level 20, :boostable true}
       {:skill "Mining", :level 60, :boostable false}
       {:skill "Strength", :level 76, :boostable true}
       {:skill "Agility", :level 71, :boostable true}
       {:skill "Smithing", :level 50, :boostable false}
       {:skill "Defence", :level 70, :boostable false}
       {:skill "Herblore", :level 22, :boostable true}
       {:skill "Fishing", :level 96, :boostable true}
       {:skill "Ranged", :level 40, :boostable false}
       {:skill "Thieving", :level 53, :boostable false}
       {:skill "Cooking", :level 40, :boostable true}
       {:skill "Prayer", :level 70, :boostable false}
       {:skill "Crafting", :level 84, :boostable true}
       {:skill "Firemaking", :level 80, :boostable true}
       {:skill "Magic", :level 83, :boostable true}
       {:skill "Fletching", :level 10, :boostable true}
       {:skill "Woodcutting", :level 55, :boostable false}
       {:skill "Slayer", :level 85, :boostable true}
       {:skill "Farming", :level 53, :boostable true}
       {:skill "Construction", :level 50, :boostable true}
       {:skill "Hunter", :level 29, :boostable true}],
      :quests
      ["Desert Treasure I"
       "Dwarf Cannon"
       "Ghosts Ahoy"
       "In Aid of the Myreque"
       "Lair of Tarn Razorlor"
       "Lunar Diplomacy"
       "Shades of Mort'ton"],
      :other
      ["Quest points: 12"
       "Total level: 1238+"
       "Access to Barbarian Fishing"
       "Started The Great Brain Robbery"
       "Completion of the Knight Waves Training Grounds"
       "Open the Barrows chest while wearing a full Barrows set"]},
     :tasks
     [{:task "Catch a shark in Burgh de Rott with your bare hands.",
       :requirements
       {:skills [{:skill "Fishing", :level 96, :boostable true}],
        :quests ["In Aid of the Myreque"],
        :other ["Access to Barbarian Fishing" "Shark lure recommended"]}}
      {:task "Cremate any Shade remains on a Magic or Redwood pyre .",
       :requirements
       {:skills [{:skill "Firemaking", :level 80, :boostable true}],
        :quests ["Shades of Mort'ton"],
        :other
        ["Magic or Redwood pyre logs , any shade remains , and a tinderbox"]}}
      {:task
       "Fertilize the Morytania herb patch using Lunar Magic . Note: This herb patch is located west of Port Phasmatys .",
       :requirements
       {:skills [{:skill "Magic", :level 83, :boostable true}],
        :quests ["Lunar Diplomacy"],
        :other
        ["Lunar spellbook selected"
         "Means to cast Fertile Soil ( 15 3 2 )"]}}
      {:task "Craft a Black dragonhide body in Canifis bank .",
       :requirements
       {:skills [{:skill "Crafting", :level 84, :boostable true}],
        :quests [],
        :other
        ["3 black dragon leather , and a needle and thread or the costume needle"]}}
      {:task
       "Kill an Abyssal demon in the Slayer Tower . Note: Abyssal demons on the 2 nd floor [ UK ] 3 rd floor [ US ] do not require a Slayer task to kill like those in the basement.",
       :requirements
       {:skills [{:skill "Slayer", :level 85, :boostable true}],
        :quests [],
        :other ["Weaponry"]}}
      {:task
       "Loot the Barrows chest while wearing any complete barrows set . Note: This includes the weapon that is part of the equipped set.",
       :requirements
       {:skills
        [{:skill "Defence", :level 70, :boostable false}
         {:skill "Attack", :level 70, :boostable true}
         {:skill "Attack", :level 70, :boostable true}
         {:skill "Attack", :level 70, :boostable true}
         {:skill "Attack", :level 70, :boostable true}
         {:skill "Ranged", :level 70, :boostable true}],
        :quests [],
        :other []}}]}},
   :Falador-Diary
   {:easy
    {:requirements
     {:skills
      [{:skill "Mining", :level 10, :boostable true}
       {:skill "Agility", :level 5, :boostable true}
       {:skill "Smithing", :level 13, :boostable true}
       {:skill "Construction", :level 16, :boostable true}],
      :quests ["Doric's Quest" "The Knight's Sword"],
      :other ["Total level: 72+"]},
     :tasks
     [{:task
       "Find out what your family crest is from Sir Renitee Note: You must finish the dialogue.",
       :requirements
       {:skills [{:skill "Construction", :level 16, :boostable true}],
        :quests [],
        :other []}}
      {:task "Climb over the western Falador wall.",
       :requirements
       {:skills [{:skill "Agility", :level 5, :boostable true}],
        :quests [],
        :other []}}
      {:task "Browse Sarah's farm shop .",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Get a Haircut or a Shave from the Falador Hairdresser .",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Fill a bucket from the pump north of Falador west bank .",
       :requirements {:skills [], :quests [], :other ["Bucket"]}}
      {:task "Kill a duck in Falador Park .",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["None, though using Magic or a Ranged weapon is recommended"]}}
      {:task "Make a mind tiara .",
       :requirements
       {:skills [], :quests [], :other ["Tiara and a mind talisman"]}}
      {:task "Take the boat to Entrana .",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["Have no weapons or armour equipped or in your inventory"]}}
      {:task "Repair a broken strut in the Motherlode Mine .",
       :requirements
       {:skills [], :quests [], :other ["Hammer and any pickaxe"]}}
      {:task
       "Claim a security book from the Security guard at Port Sarim jail. Note: The guard is found upstairs. Ask him about security and finish the dialogue.",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Smith some Blurite Limbs on Doric 's anvil.",
       :requirements
       {:skills [{:skill "Mining", :level 10, :boostable true}],
        :quests ["The Knight's Sword"],
        :other ["Hammer and a Blurite bar"]}}]},
    :medium
    {:requirements
     {:skills
      [{:skill "Mining", :level 40, :boostable true}
       {:skill "Strength", :level 37, :boostable true}
       {:skill "Agility", :level 42, :boostable true}
       {:skill "Smithing", :level 13, :boostable true}
       {:skill "Defence", :level 20, :boostable true}
       {:skill "Ranged", :level 19, :boostable true}
       {:skill "Thieving", :level 40, :boostable true}
       {:skill "Cooking", :level 20, :boostable true}
       {:skill "Prayer", :level 10, :boostable true}
       {:skill "Crafting", :level 40, :boostable true}
       {:skill "Firemaking", :level 49, :boostable true}
       {:skill "Magic", :level 37, :boostable true}
       {:skill "Fletching", :level 1, :boostable true}
       {:skill "Woodcutting", :level 30, :boostable true}
       {:skill "Slayer", :level 32, :boostable true}
       {:skill "Farming", :level 23, :boostable true}
       {:skill "Construction", :level 16, :boostable true}],
      :quests
      ["Doric's Quest"
       "The Knight's Sword"
       "Recruitment Drive"
       "Skippy and the Mogres"],
      :other
      ["Quest points: 12"
       "Total level: 484+"
       "Partial completion of Ratcatchers"]},
     :tasks
     [{:task "Light a Bullseye lantern at the Chemist's in Rimmington .",
       :requirements
       {:skills [{:skill "Firemaking", :level 49, :boostable true}],
        :quests [],
        :other ["Tinderbox and a regular bullseye lantern"]}}
      {:task
       "Telegrab some Wine of Zamorak at the Chaos Temple by the Wilderness . Note: This altar is located north-west of the Goblin Village . You have to be inside the building until the jug appears in your inventory for the task to register as completed.",
       :requirements
       {:skills [{:skill "Magic", :level 33, :boostable true}],
        :quests [],
        :other ["Means to cast Telegrab ( 1 1 )"]}}
      {:task "Unlock the Crystal chest in Taverley .",
       :requirements {:skills [], :quests [], :other ["Crystal key"]}}
      {:task "Place a Scarecrow in the Falador farm flower patch.",
       :requirements
       {:skills [{:skill "Farming", :level 23, :boostable true}],
        :quests [],
        :other
        ["Bronze spear , watermelon , and a hay sack (you can fill an empty sack with hay at the hay bale in the chicken coop nearby.)"]}}
      {:task "Kill a Mogre at Mudskipper Point .",
       :requirements
       {:skills [{:skill "Slayer", :level 32, :boostable true}],
        :quests ["Skippy and the Mogres"],
        :other
        ["Fishing explosive ."
         "It is not possible to skip having to complete Skippy and the Mogres, or needing a fishing explosive, by killing them through a boat cannon through the Sailing skill."]}}
      {:task "Visit the Port Sarim Rat Pits .",
       :requirements {:skills [], :quests ["Ratcatchers"], :other []}}
      {:task "Grapple up and then jump off the north Falador wall.",
       :requirements
       {:skills [{:skill "Agility", :level 11, :boostable true}],
        :quests [],
        :other ["Mith grapple [ a ] and any crossbow"]}}
      {:task "Pickpocket a Falador guard .",
       :requirements
       {:skills [{:skill "Thieving", :level 40, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Pray at the Altar of Guthix in Taverley whilst wearing full Initiate .",
       :requirements
       {:skills [{:skill "Prayer", :level 10, :boostable true}],
        :quests ["Recruitment Drive"],
        :other ["Initiate armour"]}}
      {:task "Mine some Gold ore at the Crafting Guild .",
       :requirements
       {:skills [{:skill "Crafting", :level 40, :boostable true}],
        :quests [],
        :other
        ["Any pickaxe and a brown apron , golden apron , or Crafting cape"]}}
      {:task "Squeeze through the crevice in the Dwarven mines .",
       :requirements
       {:skills [{:skill "Agility", :level 42, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Chop and burn some Willow logs in Taverley . Note: Willow trees can be found to the south-east along the lake. Player-grown willow trees do not count towards completing the task.",
       :requirements
       {:skills [{:skill "Woodcutting", :level 30, :boostable true}],
        :quests [],
        :other ["Any axe and a tinderbox"]}}
      {:task "Craft a fruit basket on the Falador Farm loom .",
       :requirements
       {:skills [{:skill "Crafting", :level 36, :boostable true}],
        :quests [],
        :other ["6 Willow branches"]}}
      {:task "Teleport to Falador .",
       :requirements
       {:skills [{:skill "Magic", :level 37, :boostable true}],
        :quests [],
        :other ["Means to cast Falador Teleport ( 3 1 1 )"]}}]},
    :hard
    {:requirements
     {:skills
      [{:skill "Attack", :level 1, :boostable true}
       {:skill "Mining", :level 60, :boostable true}
       {:skill "Strength", :level 37, :boostable true}
       {:skill "Agility", :level 59, :boostable true}
       {:skill "Smithing", :level 13, :boostable true}
       {:skill "Defence", :level 50, :boostable true}
       {:skill "Herblore", :level 52, :boostable true}
       {:skill "Fishing", :level 53, :boostable true}
       {:skill "Ranged", :level 19, :boostable true}
       {:skill "Thieving", :level 58, :boostable true}
       {:skill "Cooking", :level 53, :boostable true}
       {:skill "Prayer", :level 70, :boostable false}
       {:skill "Crafting", :level 40, :boostable true}
       {:skill "Firemaking", :level 49, :boostable true}
       {:skill "Magic", :level 37, :boostable true}
       {:skill "Fletching", :level 1, :boostable true}
       {:skill "Woodcutting", :level 71, :boostable true}
       {:skill "Runecraft", :level 56, :boostable true}
       {:skill "Slayer", :level 72, :boostable true}
       {:skill "Farming", :level 45, :boostable true}
       {:skill "Construction", :level 16, :boostable true}],
      :quests
      ["Doric's Quest"
       "Grim Tales"
       "Heroes' Quest"
       "The Knight's Sword"
       "Skippy and the Mogres"
       "The Slug Menace"],
      :other
      ["Quest points: 55"
       "Total level: 971+"
       "Access to the Warriors' Guild [ 1 ]"
       "Partial completion of Ratcatchers"
       "Defeat the Giant Mole"
       "Acquire a prospector helmet from the Motherlode Mine"]},
     :tasks
     [{:task
       "Craft 140 Mind runes simultaneously from Essence without the use of Extracts . Note: Mind cores do not count.",
       :requirements
       {:skills
        [{:skill "Runecraft", :level 56, :boostable true}
         {:skill "Runecraft", :level 42, :boostable true}],
        :quests [],
        :other
        ["28 pure , daeyalt , or rune essence (less may suffice at higher Runecraft levels)"
         "Access to the Mind Altar ( mind talisman / tiara , catalytic talisman / tiara , or the Abyss )"]}}
      {:task
       "Change your family crest to the Saradomin symbol. Note: This is done by talking to Sir Renitee .",
       :requirements
       {:skills
        [{:skill "Prayer", :level 70, :boostable false}
         {:skill "Construction", :level 16, :boostable true}],
        :quests [],
        :other
        ["5,000 coins (an additional 5,000 coins if your randomised family crest already is Saradomin , to change to another and back)"]}}
      {:task "Kill the Giant Mole beneath Falador Park .",
       :requirements
       {:skills [],
        :quests [],
        :other ["Spade and light source" "See the strategy guide"]}}
      {:task "Kill a Skeletal Wyvern in the Asgarnia Ice Dungeon .",
       :requirements
       {:skills [{:skill "Slayer", :level 72, :boostable true}],
        :quests [],
        :other
        ["Protection from the wyvern's icy breath and weaponry to slay it"]}}
      {:task "Complete a lap of the Falador rooftop agility course .",
       :requirements
       {:skills [{:skill "Agility", :level 50, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Enter the mining guild while wearing a Prospector helmet . Note: This helmet can be obtained from the Motherlode Mine or the Volcanic Mine .",
       :requirements
       {:skills [{:skill "Mining", :level 60, :boostable true}],
        :quests [],
        :other ["Prospector helmet or golden prospector helmet"]}}
      {:task "Kill the Blue Dragon under the Heroes' Guild .",
       :requirements
       {:skills [],
        :quests ["Heroes' Quest"],
        :other ["Protection from dragonfire and weaponry to slay it"]}}
      {:task
       "Crack a wall safe within Rogues' Den . Note: Wall safes in the maze do not count towards completing this task.",
       :requirements
       {:skills [{:skill "Thieving", :level 50, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Recharge your prayer in the Port Sarim church while wearing full Proselyte .",
       :requirements
       {:skills
        [{:skill "Defence", :level 30, :boostable true}
         {:skill "Prayer", :level 20, :boostable true}],
        :quests ["The Slug Menace"],
        :other ["Full Proselyte armour"]}}
      {:task "Enter the Warriors' Guild .",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["130 combined levels in Attack and Strength , or level 99 in either"]}}
      {:task "Equip a dwarven helmet within the dwarven mines .",
       :requirements
       {:skills [{:skill "Defence", :level 50, :boostable true}],
        :quests ["Grim Tales"],
        :other ["Dwarven helmet"]}}]},
    :elite
    {:requirements
     {:skills
      [{:skill "Attack", :level 1, :boostable true}
       {:skill "Mining", :level 60, :boostable true}
       {:skill "Strength", :level 37, :boostable true}
       {:skill "Agility", :level 80, :boostable true}
       {:skill "Smithing", :level 13, :boostable true}
       {:skill "Defence", :level 50, :boostable true}
       {:skill "Herblore", :level 81, :boostable true}
       {:skill "Fishing", :level 53, :boostable true}
       {:skill "Ranged", :level 19, :boostable true}
       {:skill "Thieving", :level 58, :boostable true}
       {:skill "Cooking", :level 53, :boostable true}
       {:skill "Prayer", :level 70, :boostable false}
       {:skill "Crafting", :level 40, :boostable true}
       {:skill "Firemaking", :level 49, :boostable true}
       {:skill "Magic", :level 37, :boostable true}
       {:skill "Fletching", :level 1, :boostable true}
       {:skill "Woodcutting", :level 75, :boostable true}
       {:skill "Runecraft", :level 88, :boostable true}
       {:skill "Slayer", :level 72, :boostable true}
       {:skill "Farming", :level 91, :boostable true}
       {:skill "Construction", :level 16, :boostable true}],
      :quests
      ["Doric's Quest"
       "Grim Tales"
       "Heroes' Quest"
       "The Knight's Sword"
       "Skippy and the Mogres"
       "The Slug Menace"],
      :other
      ["Quest points: 55"
       "Total level: 1080+"
       "Access to the Warriors' Guild [ 1 ]"
       "Partial completion of Ratcatchers"
       "Defeat the Giant Mole"
       "Reach the rank of White Knight Master"
       "Acquire a prospector helmet from the Motherlode Mine"
       "Completion of all quests , discovery of all music tracks , or level 99 in any skill"]},
     :tasks
     [{:task
       "Craft 252 Air Runes simultaneously from Essence without the use of Extracts .",
       :requirements
       {:skills
        [{:skill "Runecraft", :level 88, :boostable true}
         {:skill "Runecraft", :level 77, :boostable true}
         {:skill "Runecraft", :level 66, :boostable true}
         {:skill "Runecraft", :level 55, :boostable true}],
        :quests [],
        :other
        ["28 pure , daeyalt , or rune essence (less may suffice at higher Runecraft levels)"
         "Access to the Air Altar ( air talisman / tiara , elemental talisman / tiara , or the Abyss )"]}}
      {:task
       "Purchase a White 2h Sword from Sir Vyvin . Note: Selling this sword to him and then buying it back without having the proper rank does not count for this achievement.",
       :requirements
       {:skills [],
        :quests ["Wanted!"],
        :other
        ["1,920 coins"
         "Rank of White Knight Master (requires a Black Knight kill score of 1300 - this rank automatically starts at White Knight Novice, with a kill score of 100)"]}}
      {:task
       "Find at least 3 magic roots at once when digging up your magic tree in Falador . Note: You need to cut the tree down yourself.",
       :requirements
       {:skills [{:skill "Farming", :level 91, :boostable true}],
        :quests [],
        :other ["Magic sapling , spade and any axe"]}}
      {:task
       "Perform a skillcape or quest cape emote at the top of Falador Castle .",
       :requirements
       {:skills [],
        :quests ["quests"],
        :other
        ["Any Cape of Accomplishment (except for joke skillcapes or the Max cape )"]}}
      {:task
       "Jump over the strange floor in Taverley dungeon . Note: Might take several tries. You must take no damage from the jump.",
       :requirements
       {:skills [{:skill "Agility", :level 80, :boostable true}],
        :quests [],
        :other []}}
      {:task "Mix a Saradomin brew in Falador east bank .",
       :requirements
       {:skills [{:skill "Herblore", :level 81, :boostable true}],
        :quests [],
        :other ["Toadflax potion (unf) , crushed nest"]}}]}},
   :Lumbridge-&-Draynor-Diary
   {:easy
    {:requirements
     {:skills
      [{:skill "Mining", :level 15, :boostable true}
       {:skill "Fishing", :level 15, :boostable true}
       {:skill "Firemaking", :level 15, :boostable true}
       {:skill "Woodcutting", :level 15, :boostable true}
       {:skill "Runecraft", :level 5, :boostable true}
       {:skill "Slayer", :level 7, :boostable true}],
      :quests ["Cook's Assistant" "Rune Mysteries"],
      :other ["Total level: 98+"]},
     :tasks
     [{:task "Complete a lap of the Draynor Village agility course .",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Slay a Cave bug beneath Lumbridge Swamp .",
       :requirements
       {:skills [{:skill "Slayer", :level 7, :boostable true}],
        :quests [],
        :other
        ["Light source" "Rope if the caves haven't been entered yet"]}}
      {:task "Have Sedridor teleport you to the Rune essence mine .",
       :requirements {:skills [], :quests ["Rune Mysteries"], :other []}}
      {:task "Craft some water runes from Essence.",
       :requirements
       {:skills [{:skill "Runecraft", :level 5, :boostable true}],
        :quests [],
        :other
        ["Pure , daeyalt , or rune essence"
         "Access to the Water Altar ( water talisman / tiara , elemental talisman / tiara , or the Abyss )"]}}
      {:task "Learn your age from Hans in Lumbridge .",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Pickpocket a man or woman in Lumbridge .",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Chop and burn some oak logs in Lumbridge .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 15, :boostable true}],
        :quests [],
        :other ["Any axe and tinderbox"]}}
      {:task "Kill a Zombie in Draynor Sewers .",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Catch some Anchovies in Al Kharid .",
       :requirements
       {:skills [{:skill "Fishing", :level 15, :boostable true}],
        :quests [],
        :other ["Small fishing net"]}}
      {:task "Bake some Bread on the Lumbridge kitchen range .",
       :requirements
       {:skills [{:skill "Cooking", :level 34, :boostable true}],
        :quests ["Cook's Assistant"],
        :other []}}
      {:task "Mine some Iron ore at the Al Kharid mine .",
       :requirements
       {:skills [{:skill "Mining", :level 15, :boostable true}],
        :quests [],
        :other ["Any pickaxe"]}}
      {:task "Enter the H.A.M. Hideout .",
       :requirements
       {:skills [],
        :quests [],
        :other ["None, though a lockpick is recommended"]}}]},
    :medium
    {:requirements
     {:skills
      [{:skill "Mining", :level 15, :boostable true}
       {:skill "Strength", :level 19, :boostable true}
       {:skill "Agility", :level 20, :boostable true}
       {:skill "Smithing", :level 1, :boostable true}
       {:skill "Fishing", :level 30, :boostable true}
       {:skill "Ranged", :level 50, :boostable false}
       {:skill "Thieving", :level 38, :boostable true}
       {:skill "Prayer", :level 1, :boostable true}
       {:skill "Crafting", :level 38, :boostable true}
       {:skill "Firemaking", :level 15, :boostable true}
       {:skill "Magic", :level 31, :boostable true}
       {:skill "Fletching", :level 1, :boostable true}
       {:skill "Woodcutting", :level 36, :boostable true}
       {:skill "Runecraft", :level 23, :boostable true}
       {:skill "Slayer", :level 18, :boostable true}
       {:skill "Hunter", :level 42, :boostable true}],
      :quests ["Animal Magnetism" "Cook's Assistant" "Rune Mysteries"],
      :other
      ["Total level: 394+" "Started Fairytale II - Cure a Queen"]},
     :tasks
     [{:task "Complete a lap of the Al Kharid agility course .",
       :requirements
       {:skills [{:skill "Agility", :level 20, :boostable true}],
        :quests [],
        :other []}}
      {:task "Grapple across the River Lum .",
       :requirements
       {:skills [{:skill "Agility", :level 8, :boostable true}],
        :quests [],
        :other ["Mith grapple [ a ] and any crossbow"]}}
      {:task "Purchase an upgraded device from Ava .",
       :requirements
       {:skills [{:skill "Ranged", :level 50, :boostable false}],
        :quests ["Animal Magnetism"],
        :other
        ["75 steel arrows with Ava's attractor , or 75 steel arrows with 999 coins"]}}
      {:task "Travel to the Wizards' Tower by Fairy ring .",
       :requirements
       {:skills [],
        :quests ["Fairytale II - Cure a Queen"],
        :other
        ["Dramen or Lunar staff to travel to Fairy ring code D I S"]}}
      {:task "Cast the Teleport to Lumbridge spell.",
       :requirements
       {:skills [{:skill "Magic", :level 31, :boostable true}],
        :quests [],
        :other ["Means to cast Lumbridge Teleport ( 3 1 1 )"]}}
      {:task "Catch some Salmon in Lumbridge .",
       :requirements
       {:skills [{:skill "Fishing", :level 30, :boostable true}],
        :quests [],
        :other ["Fly fishing rod and some feathers"]}}
      {:task
       "Craft a coif in the Lumbridge cow pen . Note: Not to be confused with a cowl .",
       :requirements
       {:skills [{:skill "Crafting", :level 38, :boostable true}],
        :quests [],
        :other
        ["Leather , and a needle and thread or the costume needle"]}}
      {:task "Chop some willow logs in Draynor Village .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 30, :boostable true}],
        :quests [],
        :other ["Any axe"]}}
      {:task "Pickpocket Martin the Master Gardener .",
       :requirements
       {:skills [{:skill "Thieving", :level 38, :boostable true}],
        :quests [],
        :other []}}
      {:task "Get a slayer task from Chaeldar .",
       :requirements
       {:skills [{:skill "Combat level", :level 70, :boostable true}],
        :quests ["Lost City"],
        :other ["Dramen or Lunar staff to enter Zanaris"]}}
      {:task "Catch an Essence or Eclectic impling in Puro-Puro .",
       :requirements
       {:skills [{:skill "Hunter", :level 42, :boostable true}],
        :quests [],
        :other
        ["Dramen or Lunar staff to enter Zanaris"
         "Butterfly net and impling jar"]}}
      {:task
       "Craft some Lava runes at the fire altar in Al Kharid . Note: Use the earth runes you brought on the altar, do not use the essence.",
       :requirements
       {:skills [{:skill "Runecraft", :level 23, :boostable true}],
        :quests [],
        :other
        ["Earth talisman , earth runes , and pure or daeyalt essence"
         "Access to the Fire Altar ( fire talisman / tiara , elemental talisman / tiara , or the Abyss )"
         "Binding necklace recommended to guarantee the runes are successfully crafted"]}}]},
    :hard
    {:requirements
     {:skills
      [{:skill "Mining", :level 50, :boostable true}
       {:skill "Strength", :level 19, :boostable true}
       {:skill "Agility", :level 46, :boostable true}
       {:skill "Smithing", :level 40, :boostable true}
       {:skill "Herblore", :level 25, :boostable true}
       {:skill "Fishing", :level 53, :boostable true}
       {:skill "Ranged", :level 50, :boostable false}
       {:skill "Thieving", :level 53, :boostable true}
       {:skill "Cooking", :level 70, :boostable true}
       {:skill "Prayer", :level 52, :boostable false}
       {:skill "Crafting", :level 70, :boostable true}
       {:skill "Firemaking", :level 65, :boostable true}
       {:skill "Magic", :level 60, :boostable true}
       {:skill "Fletching", :level 10, :boostable true}
       {:skill "Woodcutting", :level 57, :boostable true}
       {:skill "Runecraft", :level 59, :boostable true}
       {:skill "Slayer", :level 18, :boostable true}
       {:skill "Farming", :level 63, :boostable true}
       {:skill "Hunter", :level 42, :boostable true}],
      :quests
      ["Animal Magnetism"
       "Another Slice of H.A.M."
       "Recipe for Disaster"
       "Rune Mysteries"
       "Tears of Guthix"],
      :other
      ["Quest points: 175"
       "Total level: 915+"
       "Access to the Bones to Peaches spell from the Mage Training Arena"
       "Started Fairytale II - Cure a Queen"]},
     :tasks
     [{:task
       "Cast Bones to Peaches in Al Kharid palace . Note: Using the Bones to Peaches tablet does not count.",
       :requirements
       {:skills [{:skill "Magic", :level 60, :boostable true}],
        :quests [],
        :other
        ["Access to Bones to Peaches via the Mage Training Arena"
         "Bones and means to cast Bones to Peaches ( 4 4 2 )"]}}
      {:task
       "Squeeze past the jutting wall on your way to the cosmic altar .",
       :requirements
       {:skills [{:skill "Agility", :level 46, :boostable true}],
        :quests ["Lost City"],
        :other
        ["Dramen or Lunar staff to enter Zanaris , or access to the Abyss"]}}
      {:task
       "Craft 56 Cosmic runes simultaneously from Essence without the use of Extracts .",
       :requirements
       {:skills [{:skill "Runecraft", :level 59, :boostable true}],
        :quests ["Lost City"],
        :other
        ["28 pure or daeyalt essence (less may suffice with Raiments of the Eye pieces) [ a ]"
         "Access to the Cosmic Altar ( cosmic talisman / tiara , catalytic talisman / tiara , or the Abyss )"]}}
      {:task "Travel from Lumbridge to Edgeville on a Waka Canoe .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 57, :boostable true}],
        :quests [],
        :other ["Any axe"]}}
      {:task
       "Collect at least 100 Tears of Guthix in one visit. Note: This minigame can only be tried once a week, so be aware. Each quest point increases the time you can spend collecting tears by one game tick . It's recommended to have at least 150 quest points before trying this task. See the Tears of Guthix (minigame) page for other strategies you can use to maximize points.",
       :requirements
       {:skills [],
        :quests ["Tears of Guthix"],
        :other ["Games necklace recommended for quick access"]}}
      {:task "Take the train from Dorgesh-Kaan to Keldagrim .",
       :requirements
       {:skills [], :quests ["Another Slice of H.A.M."], :other []}}
      {:task
       "Purchase some Barrows gloves from the Lumbridge bank chest [ sic ] .",
       :requirements
       {:skills [],
        :quests ["Recipe for Disaster"],
        :other ["130,000 coins"]}}
      {:task
       "Pick some Belladonna from the farming patch at Draynor Manor .",
       :requirements
       {:skills [{:skill "Farming", :level 63, :boostable true}],
        :quests [],
        :other
        ["Belladonna seed , seed dibber , spade , rake and any gloves"]}}
      {:task
       "Light your mining helmet in the Lumbridge castle basement.",
       :requirements
       {:skills [{:skill "Firemaking", :level 65, :boostable true}],
        :quests [],
        :other ["Tinderbox and mining helmet"]}}
      {:task
       "Recharge your prayer at Emir's Arena with Smite activated.",
       :requirements
       {:skills [{:skill "Prayer", :level 52, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Craft, string and enchant an Amulet of Power in Lumbridge . Note: Doing this upstairs in Lumbridge Castle does not count.",
       :requirements
       {:skills [{:skill "Crafting", :level 70, :boostable true}],
        :quests [],
        :other
        ["Gold bar , cut diamond , amulet mould , ball of wool"
         "Means to cast Lvl-4 Enchant ( 10 1 )"]}}]},
    :elite
    {:requirements
     {:skills
      [{:skill "Attack", :level 50, :boostable true}
       {:skill "Hitpoints", :level 50, :boostable false}
       {:skill "Mining", :level 72, :boostable true}
       {:skill "Strength", :level 70, :boostable true}
       {:skill "Agility", :level 70, :boostable false}
       {:skill "Smithing", :level 88, :boostable true}
       {:skill "Defence", :level 65, :boostable false}
       {:skill "Herblore", :level 70, :boostable false}
       {:skill "Fishing", :level 62, :boostable true}
       {:skill "Ranged", :level 70, :boostable true}
       {:skill "Thieving", :level 78, :boostable true}
       {:skill "Cooking", :level 70, :boostable true}
       {:skill "Prayer", :level 52, :boostable false}
       {:skill "Crafting", :level 70, :boostable false}
       {:skill "Firemaking", :level 75, :boostable false}
       {:skill "Magic", :level 75, :boostable false}
       {:skill "Fletching", :level 60, :boostable false}
       {:skill "Woodcutting", :level 75, :boostable true}
       {:skill "Runecraft", :level 76, :boostable true}
       {:skill "Slayer", :level 69, :boostable false}
       {:skill "Farming", :level 70, :boostable false}
       {:skill "Construction", :level 70, :boostable false}
       {:skill "Hunter", :level 70, :boostable false}
       {:skill "Sailing", :level 45, :boostable false}],
      :quests [],
      :other
      ["Quest points: 333"
       "Total level: 1571+"
       "Access to the Bones to Peaches spell from the Mage Training Arena"]},
     :tasks
     [{:task "Steal from a Dorgesh-Kaan rich chest .",
       :requirements
       {:skills [{:skill "Thieving", :level 78, :boostable true}],
        :quests ["Death to the Dorgeshuun"],
        :other ["Lockpick"]}}
      {:task
       "Grapple across a pylon on the Dorgesh-Kaan Agility Course .",
       :requirements
       {:skills [{:skill "Agility", :level 70, :boostable true}],
        :quests ["Death to the Dorgeshuun"],
        :other
        ["Mith grapple [ a ] , any crossbow , and a light source"]}}
      {:task "Chop some magic logs at the Mage Training Arena .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 75, :boostable true}],
        :quests [],
        :other ["Any axe"]}}
      {:task "Smith an Adamant platebody down Draynor sewer . [ sic ]",
       :requirements
       {:skills [{:skill "Smithing", :level 88, :boostable true}],
        :quests [],
        :other ["5 adamantite bars and a hammer"]}}
      {:task
       "Craft 140 or more Water runes simultaneously from Essence without the use of Extracts .",
       :requirements
       {:skills
        [{:skill "Runecraft", :level 76, :boostable true}
         {:skill "Runecraft", :level 57, :boostable true}
         {:skill "Runecraft", :level 38, :boostable true}],
        :quests [],
        :other
        ["28 pure , daeyalt , or rune essence (less may suffice at higher Runecraft levels)"
         "Access to the Water Altar ( water talisman / tiara , elemental talisman / tiara , or the Abyss )"]}}
      {:task "Perform the Quest cape emote in the Wise Old Man's house.",
       :requirements
       {:skills [],
        :quests [],
        :other ["Completion of all quests" "Quest point cape"]}}]}},
   :Kourend-&-Kebos-Diary
   {:easy
    {:requirements
     {:skills
      [{:skill "Mining", :level 15, :boostable true}
       {:skill "Herblore", :level 12, :boostable true}
       {:skill "Fishing", :level 20, :boostable true}
       {:skill "Thieving", :level 25, :boostable true}
       {:skill "Construction", :level 25, :boostable false}],
      :quests ["Druidic Ritual"],
      :other ["Total level: 124+"]},
     :tasks
     [{:task "Mine some Iron at the Mount Karuulm mine .",
       :requirements
       {:skills [{:skill "Mining", :level 15, :boostable true}],
        :quests [],
        :other ["Any pickaxe"]}}
      {:task "Kill a Sandcrab [ sic ] .",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Hand in a book at the Arceuus Library .",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Steal from a Hosidius Food Stall .",
       :requirements
       {:skills [{:skill "Thieving", :level 25, :boostable true}],
        :quests [],
        :other []}}
      {:task "Browse the Warrens General Store .",
       :requirements {:skills [], :quests [], :other []}}
      {:task
       "Take a boat to Land's End . Note: You have to travel with Veos from Port Sarim or Port Piscarilius .",
       :requirements {:skills [], :quests [], :other []}}
      {:task
       "Pray at the Altar in Kourend Castle Note: This altar is found on the top floor of the castle.",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Dig up some Saltpetre .",
       :requirements {:skills [], :quests [], :other ["Spade"]}}
      {:task "Enter your Player Owned House from Hosidius .",
       :requirements
       {:skills [{:skill "Construction", :level 25, :boostable false}],
        :quests [],
        :other
        ["8,750 coins for an estate agent to move your house to Hosidius (can only be done after you've visited Great Kourend )"]}}
      {:task "Do a lap of either tier of the Shayzien Agility Course .",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Create a Strength potion in the Lovakengj Pub .",
       :requirements
       {:skills [{:skill "Herblore", :level 12, :boostable true}],
        :quests ["Druidic Ritual"],
        :other ["Tarromin potion (unf) and limpwurt root"]}}
      {:task
       "Fish a Trout from the River Molch . Note: The fishing spot is found south-east of the Farming Guild .",
       :requirements
       {:skills [{:skill "Fishing", :level 20, :boostable true}],
        :quests [],
        :other
        ["Fly fishing rod and some feathers (bring enough feathers to account for fishing raw salmon multiple times before you get a raw trout)"]}}]},
    :medium
    {:requirements
     {:skills
      [{:skill "Mining", :level 42, :boostable true}
       {:skill "Strength", :level 16, :boostable true}
       {:skill "Agility", :level 49, :boostable true}
       {:skill "Herblore", :level 12, :boostable true}
       {:skill "Fishing", :level 43, :boostable true}
       {:skill "Thieving", :level 25, :boostable true}
       {:skill "Crafting", :level 31, :boostable true}
       {:skill "Firemaking", :level 50, :boostable true}
       {:skill "Woodcutting", :level 50, :boostable true}
       {:skill "Farming", :level 45, :boostable true}
       {:skill "Construction", :level 30, :boostable true}
       {:skill "Hunter", :level 53, :boostable true}],
      :quests
      ["The Ascent of Arceuus"
       "The Depths of Despair"
       "The Forsaken Tower"
       "The Queen of Thieves"
       "Tale of the Righteous"],
      :other
      ["Total level: 466+"
       "Started Fairytale II - Cure a Queen"
       "Partial completion of Eagles' Peak"]},
     :tasks
     [{:task "Travel to the Fairy Ring south of Mount Karuulm .",
       :requirements
       {:skills [],
        :quests ["Fairytale II - Cure a Queen"],
        :other
        ["Dramen or Lunar staff to travel to Fairy ring code C I R"]}}
      {:task "Kill a Lizardman .",
       :requirements
       {:skills [],
        :quests [],
        :other ["Combat gear" "Antipoison recommended"]}}
      {:task
       "Use Kharedst's memoirs to teleport to all five cities in Great Kourend .",
       :requirements
       {:skills [],
        :quests ["The Depths of Despair"],
        :other ["Kharedst's memoirs or the book of the dead"]}}
      {:task "Mine some Volcanic Sulphur .",
       :requirements
       {:skills [{:skill "Mining", :level 42, :boostable true}],
        :quests [],
        :other
        ["Any pickaxe" "Face mask , gas mask , or slayer helmet"]}}
      {:task
       "Enter the Farming Guild . Note: You have to walk through the guild's main entrance.",
       :requirements
       {:skills [{:skill "Farming", :level 45, :boostable true}],
        :quests [],
        :other []}}
      {:task "Switch to the Necromancy Spellbook at Tyss . [ sic ]",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Repair a Piscarilius crane .",
       :requirements
       {:skills [{:skill "Crafting", :level 30, :boostable true}],
        :quests [],
        :other
        ["Hammer , 3 regular planks , and about 50 nails of any variant"]}}
      {:task "Deliver some intelligence to Captain Ginea .",
       :requirements {:skills [], :quests [], :other ["Combat gear"]}}
      {:task "Catch a Bluegill on Molch Island .",
       :requirements
       {:skills [{:skill "Fishing", :level 43, :boostable true}],
        :quests [],
        :other ["King worms (found on the island) or fish offcuts"]}}
      {:task
       "Use the boulder leap shortcut in the Arceuus essence mine .",
       :requirements
       {:skills [{:skill "Agility", :level 49, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Subdue the Wintertodt Note: You must earn at least 500 points .",
       :requirements
       {:skills [{:skill "Firemaking", :level 50, :boostable true}],
        :quests [],
        :other
        ["Any axe , tinderbox , and warm clothing"
         "Knife and a hammer or Imcando hammer recommended to score more points"
         "Rejuvenation potions recommended for learners (these are made in the minigame's lobby)"]}}
      {:task "Catch a Chinchompa in the Kourend Woodland .",
       :requirements
       {:skills [{:skill "Hunter", :level 53, :boostable true}],
        :quests ["Eagles' Peak"],
        :other ["Box trap"]}}
      {:task "Chop some Mahogany logs north of the Farming Guild .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 50, :boostable true}],
        :quests [],
        :other ["Any axe"]}}]},
    :hard
    {:requirements
     {:skills
      [{:skill "Mining", :level 65, :boostable true}
       {:skill "Strength", :level 16, :boostable true}
       {:skill "Agility", :level 49, :boostable true}
       {:skill "Smithing", :level 70, :boostable true}
       {:skill "Defence", :level 40, :boostable true}
       {:skill "Herblore", :level 31, :boostable true}
       {:skill "Fishing", :level 43, :boostable true}
       {:skill "Thieving", :level 49, :boostable true}
       {:skill "Crafting", :level 61, :boostable false}
       {:skill "Firemaking", :level 50, :boostable true}
       {:skill "Magic", :level 66, :boostable true}
       {:skill "Fletching", :level 25, :boostable true}
       {:skill "Woodcutting", :level 60, :boostable true}
       {:skill "Slayer", :level 62, :boostable true}
       {:skill "Farming", :level 74, :boostable true}
       {:skill "Construction", :level 30, :boostable true}
       {:skill "Hunter", :level 53, :boostable true}],
      :quests
      ["The Ascent of Arceuus"
       "The Depths of Despair"
       "Dream Mentor"
       "The Forsaken Tower"
       "The Queen of Thieves"
       "Tale of the Righteous"],
      :other
      ["Total level: 859+"
       "Started Fairytale II - Cure a Queen"
       "Partial completion of Eagles' Peak"
       "Defeat a Lizardman Shaman in the Lizardman Temple"]},
     :tasks
     [{:task "Enter the Woodcutting Guild .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 60, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Smelt an Adamantite bar in The Forsaken Tower . Note: Using the Superheat Item spell does not count.",
       :requirements
       {:skills [{:skill "Smithing", :level 70, :boostable true}],
        :quests ["The Forsaken Tower"],
        :other ["Adamantite ore and 6 coal"]}}
      {:task "Kill a Lizardman Shaman in the Lizardman Temple .",
       :requirements
       {:skills [], :quests [], :other ["See the strategy guide"]}}
      {:task "Mine some Lovakite .",
       :requirements
       {:skills [{:skill "Mining", :level 65, :boostable true}],
        :quests [],
        :other ["Any pickaxe"]}}
      {:task "Plant some Logavano seeds at the Tithe Farm .",
       :requirements
       {:skills [{:skill "Farming", :level 74, :boostable true}],
        :quests [],
        :other ["Seed dibber"]}}
      {:task "Kill a Zombie in the Shayzien Crypts .",
       :requirements
       {:skills [],
        :quests [],
        :other ["Combat gear and a light source"]}}
      {:task "Teleport to Xeric's Heart using Xeric's Talisman .",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["Xeric's talisman charged with a lizardman fang , or a mounted xeric's talisman inside any player-owned house (see the House party worlds)"]}}
      {:task "Deliver an artefact to Captain Khaled .",
       :requirements
       {:skills [{:skill "Thieving", :level 49, :boostable true}],
        :quests [],
        :other ["Lockpick"]}}
      {:task "Kill a Wyrm in the Karuulm Slayer Dungeon .",
       :requirements
       {:skills [{:skill "Slayer", :level 62, :boostable true}],
        :quests [],
        :other
        ["Combat gear" "Boots of stone , brimstone , or granite"]}}
      {:task
       "Cast Monster Examine on a Troll south of Mount Quidamortem .",
       :requirements
       {:skills [{:skill "Magic", :level 66, :boostable true}],
        :quests ["Dream Mentor"],
        :other
        ["Lunar spellbook selected"
         "Means to cast Monster Examine ( 1 1 1 )"]}}]},
    :elite
    {:requirements
     {:skills
      [{:skill "Mining", :level 65, :boostable true}
       {:skill "Strength", :level 16, :boostable true}
       {:skill "Agility", :level 49, :boostable true}
       {:skill "Smithing", :level 70, :boostable true}
       {:skill "Defence", :level 40, :boostable true}
       {:skill "Herblore", :level 31, :boostable true}
       {:skill "Fishing", :level 82, :boostable true}
       {:skill "Thieving", :level 49, :boostable true}
       {:skill "Cooking", :level 84, :boostable true}
       {:skill "Crafting", :level 61, :boostable false}
       {:skill "Firemaking", :level 50, :boostable true}
       {:skill "Magic", :level 90, :boostable true}
       {:skill "Fletching", :level 40, :boostable true}
       {:skill "Woodcutting", :level 90, :boostable true}
       {:skill "Runecraft", :level 77, :boostable true}
       {:skill "Slayer", :level 95, :boostable true}
       {:skill "Farming", :level 85, :boostable true}
       {:skill "Construction", :level 30, :boostable true}
       {:skill "Hunter", :level 53, :boostable true}],
      :quests
      ["The Ascent of Arceuus"
       "The Depths of Despair"
       "Dream Mentor"
       "The Forsaken Tower"
       "The Queen of Thieves"
       "Tale of the Righteous"],
      :other
      ["Total level: 1170+"
       "Started Fairytale II - Cure a Queen"
       "Partial completion of Eagles' Peak"
       "Completion of the Chambers of Xeric"
       "Defeat a Hydra in the Karuulm Slayer Dungeon"
       "Defeat a Lizardman Shaman in the Lizardman Temple"
       "Defeat Skotizo"]},
     :tasks
     [{:task
       "Craft one or more Blood runes from Dark essence . Note: This requires mining a dark essence block and breaking it down into fragments , then using those fragments on the Kourend Blood Altar .",
       :requirements
       {:skills [{:skill "Runecraft", :level 77, :boostable true}],
        :quests [],
        :other ["Any pickaxe and chisel"]}}
      {:task "Chop some Redwood logs .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 90, :boostable true}],
        :quests [],
        :other ["Any axe"]}}
      {:task "Defeat Skotizo in the Catacombs of Kourend .",
       :requirements
       {:skills [],
        :quests [],
        :other ["Dark totem" "See the strategy guide"]}}
      {:task "Catch an Anglerfish and cook it whilst in Great Kourend .",
       :requirements
       {:skills [{:skill "Fishing", :level 82, :boostable true}],
        :quests [],
        :other ["Fishing rod and some sandworms"]}}
      {:task "Kill a Hydra in the Karuulm Slayer Dungeon .",
       :requirements
       {:skills [{:skill "Slayer", :level 95, :boostable true}],
        :quests [],
        :other ["Weaponry" "Antipoison recommended"]}}
      {:task "Create an Ape Atoll teleport tablet .",
       :requirements
       {:skills [{:skill "Magic", :level 90, :boostable true}],
        :quests [],
        :other
        ["Arceuus spellbook selected"
         "Dark essence block and the required runes ( 2 2 2 )"]}}
      {:task "Complete a Raid in the Chambers of Xeric .",
       :requirements
       {:skills [], :quests [], :other ["See the strategy guide"]}}
      {:task
       "Create your own Battlestaff from scratch within the Farming Guild .",
       :requirements
       {:skills [{:skill "Farming", :level 85, :boostable true}],
        :quests [],
        :other
        ["Celastrus sapling , knife , spade , rake , and any axe"
         "8 potato cacti recommended to protect your sapling"]}}]}},
   :Western-Provinces-Diary
   {:easy
    {:requirements
     {:skills
      [{:skill "Mining", :level 15, :boostable true}
       {:skill "Ranged", :level 30, :boostable false}
       {:skill "Cooking", :level 30, :boostable true}
       {:skill "Fletching", :level 20, :boostable true}
       {:skill "Hunter", :level 9, :boostable true}],
      :quests ["Big Chompy Bird Hunting" "Rune Mysteries"],
      :other
      ["Total level: 131+" "Reach 30 chompy or jubbly bird kills"]},
     :tasks
     [{:task "Catch a Copper Longtail .",
       :requirements
       {:skills [{:skill "Hunter", :level 9, :boostable true}],
        :quests [],
        :other ["Bird snare"]}}
      {:task
       "Complete a novice game of Pest Control . Note: You must've earnt commendation points for this task to count as completed. In Deadman Mode, the task is instead \"Attempt to board the novice Pest Control lander with at least 40 combat.\"",
       :requirements
       {:skills [{:skill "Combat level", :level 40, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Mine some Iron Ore near Piscatoris . Note: This must be done at the Piscatoris mine .",
       :requirements
       {:skills [{:skill "Mining", :level 15, :boostable true}],
        :quests [],
        :other ["Any pickaxe"]}}
      {:task "Complete a lap of the Gnome agility course .",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Score a goal in a Gnomeball match.",
       :requirements {:skills [], :quests [], :other []}}
      {:task
       "Claim any Chompy bird hat from Rantz . Note: You need to have a ( comp ) ogre bow in your inventory to claim hats.",
       :requirements
       {:skills [],
        :quests ["Big Chompy Bird Hunting"],
        :other
        ["Ogre bellows , ( comp ) ogre bow , and ogre or brutal arrows"
         "30 chompy or jubbly bird kills"]}}
      {:task
       "Teleport to Pest Control using the Minigame Teleport . Note: In Deadman Mode, the task is instead \"Travel to the Void Knight Outpost from Port Sarim.\"",
       :requirements
       {:skills [{:skill "Combat level", :level 40, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Collect a swamp toad at the Gnome Stronghold . Note: Only a swamp toad collected from the swamp pen north-west of Grand Tree counts for this task.",
       :requirements {:skills [], :quests [], :other []}}
      {:task
       "Have Brimstail teleport you to the Essence Mine . Note: You can right-click him to teleport.",
       :requirements {:skills [], :quests ["Rune Mysteries"], :other []}}
      {:task "Fletch an Oak Shortbow in the Gnome Stronghold .",
       :requirements
       {:skills [{:skill "Fletching", :level 20, :boostable true}],
        :quests [],
        :other ["Oak shortbow (u) and bow string"]}}
      {:task
       "Kill a Terrorbird in the Terrorbird enclosure. Note: This enclosure is found in the south-west of the Tree Gnome Stronghold , across the river.",
       :requirements {:skills [], :quests [], :other ["Weaponry"]}}]},
    :medium
    {:requirements
     {:skills
      [{:skill "Mining", :level 40, :boostable true}
       {:skill "Agility", :level 37, :boostable true}
       {:skill "Smithing", :level 30, :boostable true}
       {:skill "Herblore", :level 18, :boostable true}
       {:skill "Fishing", :level 46, :boostable true}
       {:skill "Ranged", :level 30, :boostable false}
       {:skill "Cooking", :level 42, :boostable true}
       {:skill "Crafting", :level 25, :boostable true}
       {:skill "Firemaking", :level 35, :boostable true}
       {:skill "Magic", :level 46, :boostable true}
       {:skill "Fletching", :level 20, :boostable true}
       {:skill "Woodcutting", :level 35, :boostable true}
       {:skill "Construction", :level 5, :boostable true}
       {:skill "Hunter", :level 31, :boostable true}],
      :quests
      ["Big Chompy Bird Hunting" "Eagles' Peak" "The Eyes of Glouphrie"],
      :other
      ["Total level: 458+"
       "Partial completion of Monkey Madness I"
       "Partial completion of One Small Favour"
       "Reach 125 chompy or jubbly bird kills"]},
     :tasks
     [{:task
       "Take the agility shortcut from the Grand Tree to Otto's Grotto .",
       :requirements
       {:skills [{:skill "Agility", :level 37, :boostable true}],
        :quests ["Tree Gnome Village"],
        :other []}}
      {:task "Travel to the Gnome Stronghold by Spirit Tree .",
       :requirements
       {:skills [], :quests ["Tree Gnome Village"], :other []}}
      {:task
       "Trap a Spined Larupia . Note: This creature is found in the Feldip Hunter area .",
       :requirements
       {:skills [{:skill "Hunter", :level 31, :boostable true}],
        :quests [],
        :other ["Teasing stick , logs , and a knife"]}}
      {:task "Fish some Bass on Ape Atoll .",
       :requirements
       {:skills [{:skill "Fishing", :level 46, :boostable true}],
        :quests ["Monkey Madness I"],
        :other ["Big fishing net"]}}
      {:task
       "Chop and burn some teak logs on Ape Atoll . Note: With 50 Woodcutting and 50 Firemaking , you can also chop and burn some mahogany logs here for a hard task . Completing or updating any other task in-between these steps will reset the progress for this task.",
       :requirements
       {:skills [{:skill "Woodcutting", :level 35, :boostable true}],
        :quests ["Monkey Madness I"],
        :other ["Any axe and tinderbox"]}}
      {:task
       "Complete an intermediate game of Pest Control . Note: You must've earnt commendation points for this task to count as completed. In Deadman Mode, the task is instead \"Attempt to board the intermediate Pest Control lander with at least 70 combat.\"",
       :requirements
       {:skills [{:skill "Combat level", :level 70, :boostable true}],
        :quests [],
        :other []}}
      {:task "Travel to the Feldip Hills by Gnome Glider .",
       :requirements {:skills [], :quests ["The Grand Tree"], :other []}}
      {:task
       "Claim a Chompy bird hat from Rantz after registering at least 125 kills. Note: You need to have a ( comp ) ogre bow in your inventory to claim hats.",
       :requirements
       {:skills [],
        :quests ["Big Chompy Bird Hunting"],
        :other
        ["Ogre bellows , ( comp ) ogre bow , and ogre or brutal arrows"
         "125 chompy or jubbly bird kills"]}}
      {:task
       "Travel from Eagles' Peak to the Feldip Hills by Eagle . Note: You'll unlock travel from the Eagles' Peak Dungeon after the required quest.",
       :requirements
       {:skills [], :quests ["Eagles' Peak"], :other ["Rope"]}}
      {:task "Make a Chocolate Bomb at the Grand Tree .",
       :requirements
       {:skills [{:skill "Cooking", :level 42, :boostable true}],
        :quests [],
        :other
        ["Gnomebowl mould , Gianne dough , 4 chocolate bars , an equa leaf , 2 pots of cream , and chocolate dust (can all be purchased at Grand Tree Groceries )"]}}
      {:task "Complete a delivery for the Gnome Restaurant .",
       :requirements
       {:skills [{:skill "Cooking", :level 42, :boostable true}],
        :quests ["Gnome Restaurant tutorial"],
        :other []}}
      {:task
       "Turn your small crystal seed into a Crystal saw . Note: You have to enchant it with the singing bowl in Brimstail's cave .",
       :requirements
       {:skills [],
        :quests ["The Eyes of Glouphrie"],
        :other ["Crystal saw seed"]}}
      {:task "Mine some Gold ore underneath the Grand Tree .",
       :requirements
       {:skills [{:skill "Mining", :level 40, :boostable true}],
        :quests ["The Grand Tree"],
        :other ["Any pickaxe"]}}]},
    :hard
    {:requirements
     {:skills
      [{:skill "Mining", :level 70, :boostable true}
       {:skill "Agility", :level 56, :boostable true}
       {:skill "Smithing", :level 45, :boostable true}
       {:skill "Herblore", :level 18, :boostable true}
       {:skill "Fishing", :level 62, :boostable true}
       {:skill "Ranged", :level 70, :boostable false}
       {:skill "Thieving", :level 75, :boostable true}
       {:skill "Cooking", :level 70, :boostable true}
       {:skill "Crafting", :level 40, :boostable true}
       {:skill "Firemaking", :level 50, :boostable true}
       {:skill "Magic", :level 66, :boostable true}
       {:skill "Fletching", :level 20, :boostable true}
       {:skill "Woodcutting", :level 50, :boostable true}
       {:skill "Farming", :level 68, :boostable true}
       {:skill "Construction", :level 65, :boostable true}
       {:skill "Hunter", :level 69, :boostable true}],
      :quests
      ["Eagles' Peak"
       "The Eyes of Glouphrie"
       "Recipe for Disaster/King Awowogei"
       "Swan Song"],
      :other
      ["Quest points: 100"
       "Total level: 910+"
       "Started Mourning's End Part I"
       "Defeat Zulrah"
       "Reach 300 chompy or jubbly bird kills"]},
     :tasks
     [{:task
       "Kill an Elf with a Crystal bow . Note: an inactive bow can be used if equipped whilst the elf dies to poison.",
       :requirements
       {:skills [{:skill "Ranged", :level 70, :boostable false}],
        :quests ["Roving Elves"],
        :other ["Crystal bow or Bow of faerdhinen"]}}
      {:task
       "Catch and cook a Monkfish in Piscatoris . Note: Monkfish is caught in the Piscatoris Fishing Colony .",
       :requirements
       {:skills [{:skill "Fishing", :level 62, :boostable true}],
        :quests ["Swan Song"],
        :other ["Small fishing net"]}}
      {:task
       "Complete a Veteran game of Pest Control . Note: You must've earnt commendation points for this task to count as completed. In Deadman Mode, the task is instead \"Attempt to board the veteran Pest Control lander with at least 100 combat.\"",
       :requirements
       {:skills [{:skill "Combat level", :level 100, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Catch a Dashing Kebbit . Note: This kebbit is found in the Piscatoris falconry area .",
       :requirements
       {:skills [{:skill "Hunter", :level 69, :boostable true}],
        :quests [],
        :other ["500 coins"]}}
      {:task "Complete a lap of the Ape Atoll agility course .",
       :requirements
       {:skills [{:skill "Agility", :level 48, :boostable true}],
        :quests ["Monkey Madness I"],
        :other
        ["Ninja monkey greegree or Kruk monkey greegree (other greegrees will cause you to fail the course)"]}}
      {:task
       "Chop and burn some Mahogany logs on Ape Atoll . Note: Logs burnt by the Infernal axe do not count towards this task.",
       :requirements
       {:skills [{:skill "Woodcutting", :level 50, :boostable true}],
        :quests ["Monkey Madness I"],
        :other ["Any axe (excluding felling axes ) and a tinderbox" ""]}}
      {:task
       "Mine some Adamantite ore in Tirannwn . Note: This can be done in the Isafdar mine outside of Lletya , or the Trahaearn mine in Prifddinas (with completion of Song of the Elves ).",
       :requirements
       {:skills [{:skill "Mining", :level 70, :boostable true}],
        :quests ["Regicide"],
        :other ["Any pickaxe"]}}
      {:task "Check the health of your Palm tree in Lletya .",
       :requirements
       {:skills [{:skill "Farming", :level 68, :boostable true}],
        :quests ["Mourning's End Part I"],
        :other
        ["Palm sapling , rake , and spade"
         "15 papayas recommended to pay the gardener"]}}
      {:task
       "Claim a Chompy bird hat from Rantz after registering at least 300 kills. Note: You need to have a ( comp ) ogre bow in your inventory to claim hats.",
       :requirements
       {:skills [],
        :quests ["Big Chompy Bird Hunting"],
        :other
        ["Ogre bellows , ( comp ) ogre bow , and ogre or brutal arrows"
         "300 chompy or jubbly bird kills"]}}
      {:task "Build an Isafdar painting in your POH Quest hall .",
       :requirements
       {:skills [{:skill "Construction", :level 65, :boostable true}],
        :quests ["Roving Elves"],
        :other
        ["3 mahogany planks , saw , and hammer"
         "Isafdar painting (bought from Sir Renitee for 2,000 coins )"
         "25,000 coins to construct a Quest Hall if you haven't already"]}}
      {:task
       "Kill Zulrah . Note: In Deadman Mode, the task is listed as \"Attempt to visit Zulrah.\", but doing so will not complete the task, and you must kill Zulrah like normal to complete it.",
       :requirements
       {:skills [],
        :quests ["Regicide"],
        :other ["See the strategy guide"]}}
      {:task "Teleport to Ape Atoll .",
       :requirements
       {:skills [{:skill "Magic", :level 64, :boostable true}],
        :quests ["Awowogei subquest"],
        :other ["Means to cast Ape Atoll Teleport ( 2 2 2 1 )"]}}
      {:task "Pickpocket a Gnome .",
       :requirements
       {:skills [{:skill "Thieving", :level 75, :boostable true}],
        :quests [],
        :other []}}]},
    :elite
    {:requirements
     {:skills
      [{:skill "Attack", :level 42, :boostable true}
       {:skill "Hitpoints", :level 42, :boostable true}
       {:skill "Mining", :level 70, :boostable true}
       {:skill "Strength", :level 42, :boostable true}
       {:skill "Agility", :level 85, :boostable true}
       {:skill "Smithing", :level 45, :boostable true}
       {:skill "Defence", :level 42, :boostable true}
       {:skill "Herblore", :level 18, :boostable true}
       {:skill "Fishing", :level 62, :boostable true}
       {:skill "Ranged", :level 70, :boostable false}
       {:skill "Thieving", :level 85, :boostable true}
       {:skill "Cooking", :level 70, :boostable true}
       {:skill "Prayer", :level 22, :boostable true}
       {:skill "Crafting", :level 40, :boostable true}
       {:skill "Firemaking", :level 50, :boostable true}
       {:skill "Magic", :level 66, :boostable true}
       {:skill "Fletching", :level 85, :boostable true}
       {:skill "Woodcutting", :level 50, :boostable true}
       {:skill "Slayer", :level 93, :boostable false}
       {:skill "Farming", :level 75, :boostable true}
       {:skill "Construction", :level 65, :boostable true}
       {:skill "Hunter", :level 69, :boostable true}],
      :quests
      ["Eagles' Peak"
       "The Eyes of Glouphrie"
       "Recipe for Disaster/King Awowogei"
       "Swan Song"],
      :other
      ["Quest points: 100"
       "Total level: 1289+"
       "Started Mourning's End Part I"
       "Defeat the Thermonuclear smoke devil"
       "Defeat Zulrah"
       "Reach 1,000 chompy or jubbly bird kills"
       "Acquire and wear any complete void set"]},
     :tasks
     [{:task "Fletch a Magic Longbow in Tirannwn .",
       :requirements
       {:skills [{:skill "Fletching", :level 85, :boostable true}],
        :quests ["Regicide"],
        :other ["Magic longbow (u) and a bow string"]}}
      {:task
       "Kill the Thermonuclear Smoke Devil . Note: While this boss normally requires a Slayer task , this is not needed for the first kill. You do not have to contact a Slayer master for this task.",
       :requirements
       {:skills [{:skill "Slayer", :level 93, :boostable false}],
        :quests [],
        :other ["See the strategy guide"]}}
      {:task "Have Prissy Scilla protect your Magic tree .",
       :requirements
       {:skills [{:skill "Farming", :level 75, :boostable true}],
        :quests [],
        :other ["Magic sapling , 25 coconuts , rake , and a spade"]}}
      {:task "Use the Elven overpass advanced cliffside shortcut .",
       :requirements
       {:skills [{:skill "Agility", :level 85, :boostable true}],
        :quests ["Underground Pass"],
        :other []}}
      {:task
       "Equip any complete void set . Note: In Deadman Mode, the task is instead \"Speak to the Elite Void Knight after claiming the Western hard diary reward.\"",
       :requirements
       {:skills [{:skill "Combat level", :level 40, :boostable true}],
        :quests [],
        :other
        ["Any void helm ( melee , ranger , or mage helm )"
         "Void knight top , robe , and gloves"]}}
      {:task
       "Claim a Chompy bird hat from Rantz after registering at least 1,000 kills. Note: You need to have a ( comp ) ogre bow in your inventory to claim hats.",
       :requirements
       {:skills [],
        :quests ["Big Chompy Bird Hunting"],
        :other
        ["Ogre bellows , ( comp ) ogre bow , and ogre or brutal arrows"
         "1,000 chompy or jubbly bird kills"]}}
      {:task "Pickpocket an Elf .",
       :requirements
       {:skills [{:skill "Thieving", :level 85, :boostable true}],
        :quests ["Mourning's End Part I"],
        :other []}}]}},
   :Karamja-Diary
   {:easy
    {:requirements
     {:skills
      [{:skill "Mining", :level 40, :boostable true}
       {:skill "Agility", :level 15, :boostable true}],
      :quests [],
      :other ["Total level: 85+"]},
     :tasks
     [{:task
       "Pick 5 bananas from the plantation located east of the volcano .",
       :requirements {:skills [], :quests [], :other []}}
      {:task
       "Use the rope swing to travel to the Moss Giant Island north-west of Karamja .",
       :requirements
       {:skills [{:skill "Agility", :level 10, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Mine some gold from the rocks on the north-west peninsula of Karamja .",
       :requirements
       {:skills [{:skill "Mining", :level 40, :boostable true}],
        :quests [],
        :other ["Any pickaxe"]}}
      {:task "Travel to Port Sarim via the dock, east of Musa Point .",
       :requirements
       {:skills [],
        :quests [],
        :other ["30 coins or an activated ring of charos"]}}
      {:task "Travel to Ardougne via the port near Brimhaven .",
       :requirements
       {:skills [],
        :quests [],
        :other ["30 coins or an activated ring of charos"]}}
      {:task "Explore Cairn Island to the west of Karamja .",
       :requirements
       {:skills [{:skill "Agility", :level 15, :boostable true}],
        :quests [],
        :other []}}
      {:task
       "Use the Fishing spots north of the banana plantation . Note: Fishing at any of the fishing spots there will count for this task.",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["Harpoon (or bare-handed fishing ), lobster pot , small fishing net , or a fishing rod with bait , depending on the spot you fish at"]}}
      {:task
       "Collect 5 seaweed from anywhere on Karamja . Note: You can just drop and pick up the same seaweed five times.",
       :requirements
       {:skills [],
        :quests [],
        :other ["Seaweed (can be found near Jiminua's Jungle Store )"]}}
      {:task
       "Attempt the TzHaar Fight Pits or Fight Cave . Note: You can simply enter and leave. No actual attempt is necessary, but the Fight Pits will not allow entrance without at least one other player.",
       :requirements {:skills [], :quests [], :other []}}
      {:task "Kill a jogre in the Pothole dungeon .",
       :requirements {:skills [], :quests [], :other ["Weaponry"]}}]},
    :medium
    {:requirements
     {:skills
      [{:skill "Mining", :level 40, :boostable true}
       {:skill "Agility", :level 32, :boostable true}
       {:skill "Herblore", :level 3, :boostable true}
       {:skill "Fishing", :level 65, :boostable true}
       {:skill "Cooking", :level 16, :boostable true}
       {:skill "Crafting", :level 20, :boostable true}
       {:skill "Woodcutting", :level 50, :boostable true}
       {:skill "Farming", :level 27, :boostable true}
       {:skill "Hunter", :level 41, :boostable true}],
      :quests ["The Grand Tree" "Shilo Village"],
      :other
      ["Quest points: 32"
       "Total level: 318+"
       "Partial completion of Dragon Slayer I"
       "Partial completion of Tai Bwo Wannai Trio"
       "Reach 100% Tai Bwo Wannai Cleanup favour"]},
     :tasks
     [{:task "Claim a ticket from the Agility Arena in Brimhaven .",
       :requirements
       {:skills [{:skill "Agility", :level 40, :boostable true}],
        :quests [],
        :other ["200 coins"]}}
      {:task
       "Discover hidden wall [ sic ] in the dungeon below the volcano .",
       :requirements
       {:skills [], :quests ["Dragon Slayer I"], :other []}}
      {:task
       "Visit the Isle of Crandor via the dungeon below the volcano . Note: You must go through the hidden wall , past the lesser demons , and then climb the rope to the surface of Crandor to complete this task.",
       :requirements
       {:skills [], :quests ["Dragon Slayer I"], :other []}}
      {:task "Use Vigroy and Hajedy 's cart service .",
       :requirements
       {:skills [], :quests ["Shilo Village"], :other ["200 coins"]}}
      {:task "Earn 100% favour in the village of Tai Bwo Wannai .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 10, :boostable true}],
        :quests ["Jungle Potion"],
        :other ["See the recommendations"]}}
      {:task
       "Cook a spider on a stick . Note: Cooking a spider on a shaft also counts for this task. This does not have to be done on Karamja .",
       :requirements
       {:skills [{:skill "Cooking", :level 16, :boostable true}],
        :quests [],
        :other
        ["Spider carcass , and a skewer stick or an arrow shaft"]}}
      {:task
       "Charter the Lady of the Waves from Cairn Isle to Port Khazard .",
       :requirements
       {:skills [],
        :quests ["Shilo Village"],
        :other ["Ship ticket or 20-50 coins (the price is random)"]}}
      {:task
       "Cut a log from a teak tree . Note: Teak trees can be found in the Hardwood Grove or within the harder-to-access Kharazi Jungle .",
       :requirements
       {:skills
        [{:skill "Woodcutting", :level 35, :boostable true}
         {:skill "Agility", :level 79, :boostable true}],
        :quests ["Jungle Potion"],
        :other
        ["Any axe"
         "100 trading sticks and having helped [ a ] in Tai Bwo Wannai Cleanup (if using the Hardwood Grove )"]}}
      {:task
       "Cut a log from a mahogany tree . Note: Mahogany trees can be found in the Hardwood Grove or within the harder-to-access Kharazi Jungle .",
       :requirements
       {:skills
        [{:skill "Woodcutting", :level 50, :boostable true}
         {:skill "Agility", :level 79, :boostable true}],
        :quests ["Jungle Potion"],
        :other
        ["Any axe"
         "100 trading sticks and having helped [ a ] in Tai Bwo Wannai Cleanup (if using the Hardwood Grove )"]}}
      {:task "Catch a karambwan .",
       :requirements
       {:skills [{:skill "Fishing", :level 65, :boostable true}],
        :quests ["Tai Bwo Wannai Trio"],
        :other
        ["Karambwan vessel , some raw karambwanji , and a small fishing net"]}}
      {:task
       "Exchange gems for a machete . Note: This is done by talking to Safta Doc with the required items. [ a ]",
       :requirements
       {:skills [],
        :quests ["Jungle Potion"],
        :other
        ["Gout tuber , as well one of the following: 300 trading sticks and 3 cut or uncut opals 600 trading sticks and 3 cut or uncut jades 1200 trading sticks and 3 cut or uncut red topaz"
         "300 trading sticks and 3 cut or uncut opals"
         "600 trading sticks and 3 cut or uncut jades"
         "1200 trading sticks and 3 cut or uncut red topaz"]}}
      {:task "Use the gnome glider to travel to Karamja .",
       :requirements {:skills [], :quests ["The Grand Tree"], :other []}}
      {:task "Grow a healthy fruit tree in the patch near Brimhaven .",
       :requirements
       {:skills [{:skill "Farming", :level 27, :boostable true}],
        :quests [],
        :other ["Any fruit tree sapling , a spade , and a rake"]}}
      {:task "Trap a horned graahk .",
       :requirements
       {:skills [{:skill "Hunter", :level 41, :boostable true}],
        :quests [],
        :other
        ["Teasing stick or Hunter's spear , knife , and any logs ."]}}
      {:task
       "Chop the vines to gain deeper access to Brimhaven Dungeon . Note: These are the vines found immediately within the main entrance .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 10, :boostable true}],
        :quests [],
        :other ["Any axe and 875 coins"]}}
      {:task
       "Cross the lava using the stepping stones within Brimhaven Dungeon . Note: Not to be confused with the stepping stones towards the red dragons .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 10, :boostable true}],
        :quests [],
        :other ["Any axe and 875 coins"]}}
      {:task
       "Climb the stairs within Brimhaven Dungeon . Note: You have to climb the stairs south of the stepping stones of the previous task, next to the moss giants .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 10, :boostable true}],
        :quests [],
        :other ["Any axe and 875 coins"]}}
      {:task
       "Charter a ship from the shipyard in the far east of Karamja . Note: The destination does not matter for this task.",
       :requirements
       {:skills [],
        :quests ["The Grand Tree"],
        :other ["Enough coins to pay the fare for a charter ship ."]}}
      {:task
       "Mine a red topaz from a gem rock . Note: Gem rocks are found Shilo Village and rarely appear within the Tai Bwo Wannai Cleanup minigame.",
       :requirements
       {:skills [{:skill "Mining", :level 40, :boostable true}],
        :quests ["Jungle Potion"],
        :other ["Any pickaxe"]}}]},
    :hard
    {:requirements
     {:skills
      [{:skill "Mining", :level 52, :boostable true}
       {:skill "Strength", :level 50, :boostable true}
       {:skill "Agility", :level 53, :boostable true}
       {:skill "Smithing", :level 40, :boostable true}
       {:skill "Herblore", :level 25, :boostable true}
       {:skill "Fishing", :level 65, :boostable true}
       {:skill "Ranged", :level 42, :boostable true}
       {:skill "Thieving", :level 50, :boostable true}
       {:skill "Cooking", :level 53, :boostable true}
       {:skill "Crafting", :level 50, :boostable true}
       {:skill "Magic", :level 59, :boostable true}
       {:skill "Fletching", :level 1, :boostable true}
       {:skill "Woodcutting", :level 50, :boostable true}
       {:skill "Runecraft", :level 44, :boostable true}
       {:skill "Slayer", :level 50, :boostable true}
       {:skill "Farming", :level 27, :boostable true}
       {:skill "Hunter", :level 41, :boostable true}],
      :quests ["The Grand Tree" "Tai Bwo Wannai Trio"],
      :other
      ["Quest points: 107"
       "Total level: 767+"
       "Partial completion of Legends' Quest"
       "Defeat a Ket-Zek in the TzHaar Fight Cave on the 31st wave"
       "Reach 100% Tai Bwo Wannai Cleanup favour"]},
     :tasks
     [{:task
       "Become the Champion of the Fight Pits . Note: In Deadman Mode, this task is instead \"Speak to TzHaar-Mej-Kah at the Fight Pits.\"",
       :requirements
       {:skills [],
        :quests [],
        :other ["At least one other player" "Weaponry , optionally"]}}
      {:task
       "Kill a Ket-Zek in the Fight Caves . Note: Ket-Zeks start to appear on the 31st wave. You can leave the arena safely after killing it. This wave can be reached with relatively little effort, as long as the Yt-MejKots are kept out of melee range and Protect from Missiles is used against the Tok-Xils . Though, you may as well try to complete the entire Fight Caves when going for this task.",
       :requirements
       {:skills [], :quests [], :other ["See the strategy guide"]}}
      {:task "Eat an oomlie wrap .",
       :requirements
       {:skills [{:skill "Cooking", :level 50, :boostable false}],
        :quests [],
        :other []}}
      {:task "Craft some nature runes from Essence.",
       :requirements
       {:skills [{:skill "Runecraft", :level 44, :boostable true}],
        :quests [],
        :other
        ["Pure or daeyalt essence"
         "Access to the Nature Altar ( nature talisman / tiara , catalytic talisman / tiara , or the Abyss )"]}}
      {:task "Cook a karambwan thoroughly.",
       :requirements
       {:skills [{:skill "Cooking", :level 30, :boostable true}],
        :quests ["Tai Bwo Wannai Trio"],
        :other
        ["Raw karambwan , multiple recommended in case of burning one"]}}
      {:task
       "Kill a deathwing [ sic ] in the dungeon under the Kharazi Jungle .",
       :requirements
       {:skills [{:skill "Agility", :level 50, :boostable true}],
        :quests ["Legends' Quest"],
        :other ["Any axe , any machete , any pickaxe , and a lockpick"]}}
      {:task "Use the crossbow shortcut south of the volcano .",
       :requirements
       {:skills [{:skill "Agility", :level 53, :boostable true}],
        :quests [],
        :other ["Mith grapple [ a ] and any crossbow"]}}
      {:task
       "Collect 5 palm leaves . Note: You can just drop and pick up the same palm leaf five times.",
       :requirements
       {:skills [{:skill "Agility", :level 79, :boostable true}],
        :quests ["Legends' Quest"],
        :other []}}
      {:task
       "Be assigned a Slayer task by the Slayer Master in Shilo Village .",
       :requirements
       {:skills [{:skill "Combat level", :level 100, :boostable true}],
        :quests ["Shilo Village"],
        :other []}}
      {:task "Kill a metal dragon in Brimhaven Dungeon .",
       :requirements
       {:skills [{:skill "Woodcutting", :level 10, :boostable true}],
        :quests [],
        :other
        ["Any axe , protection from dragonfire , and weaponry"
         "875 coins (unless you have unlocked permanently free access via either Saniboch or Banisoch )"]}}]},
    :elite
    {:requirements
     {:skills
      [{:skill "Mining", :level 52, :boostable true}
       {:skill "Strength", :level 50, :boostable true}
       {:skill "Agility", :level 53, :boostable true}
       {:skill "Smithing", :level 40, :boostable true}
       {:skill "Herblore", :level 87, :boostable true}
       {:skill "Fishing", :level 65, :boostable true}
       {:skill "Ranged", :level 42, :boostable true}
       {:skill "Thieving", :level 50, :boostable true}
       {:skill "Cooking", :level 53, :boostable true}
       {:skill "Crafting", :level 50, :boostable true}
       {:skill "Magic", :level 59, :boostable true}
       {:skill "Fletching", :level 1, :boostable true}
       {:skill "Woodcutting", :level 50, :boostable true}
       {:skill "Runecraft", :level 91, :boostable true}
       {:skill "Slayer", :level 50, :boostable true}
       {:skill "Farming", :level 72, :boostable true}
       {:skill "Hunter", :level 41, :boostable true}],
      :quests ["The Grand Tree" "Tai Bwo Wannai Trio"],
      :other
      ["Quest points: 107"
       "Total level: 921+"
       "Partial completion of Legends' Quest"
       "Completion of the TzHaar Fight Cave"
       "Reach 100% Tai Bwo Wannai Cleanup favour"]},
     :tasks
     [{:task
       "Craft 56 Nature runes simultaneously from Essence without the use of Extracts .",
       :requirements
       {:skills [{:skill "Runecraft", :level 91, :boostable true}],
        :quests [],
        :other
        ["28 pure or daeyalt essence (less may suffice with Raiments of the Eye pieces) [ a ]"
         "Access to the Nature Altar ( nature talisman / tiara , catalytic talisman / tiara , or the Abyss )"]}}
      {:task "Equip a Fire Cape or Infernal Cape in Mor Ul Rek .",
       :requirements
       {:skills [],
        :quests [],
        :other
        ["See the strategy guide for the TzHaar Fight Cave"
         "Fire cape or infernal cape"]}}
      {:task "Check the health of a palm tree in Brimhaven .",
       :requirements
       {:skills [{:skill "Farming", :level 68, :boostable true}],
        :quests [],
        :other
        ["Palm sapling , spade and rake"
         "15 papaya fruit recommended to pay the gardener"]}}
      {:task
       "Create an antivenom potion whilst standing in the horse shoe mine .",
       :requirements
       {:skills [{:skill "Herblore", :level 87, :boostable true}],
        :quests [],
        :other ["Antidote++ and 5-20 Zulrah's scales (5 per dose)"]}}
      {:task
       "Check the health of your Calquat tree patch. Note: This is the farming patch next to Imiago .",
       :requirements
       {:skills [{:skill "Farming", :level 72, :boostable true}],
        :quests [],
        :other
        ["Calquat sapling , spade and rake"
         "8 poison ivy berries recommended to pay the gardener"]}}]}}})
