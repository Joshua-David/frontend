package navigation

import NavLinks._
import NewNavigation._

object SectionLinks {

  val sectionLinks = List (
    SectionsLink ("uk", headlines, News),
    SectionsLink ("us", headlines, News),
    SectionsLink ("au", headlines, News),
    SectionsLink ("international", headlines, News),
    SectionsLink ("uk-news", ukNews, News),
    SectionsLink ("world", world, News),
    SectionsLink ("world/europe-news", europe, News),
    SectionsLink ("politics", politics, News),
    SectionsLink ("environment", environment, News),
    SectionsLink ("business", business, News),
    SectionsLink ("technology", tech, News),
    SectionsLink ("science", science, News),
    SectionsLink ("money", money, News),
    SectionsLink ("australia-news", australiaNews, News),
    SectionsLink ("media", media, News),
    SectionsLink ("us-news", usNews, News),
    SectionsLink ("cities", cities, News),
    SectionsLink ("inequality", inequality, News),
    SectionsLink ("global-development", globalDevelopment, News),
    SectionsLink ("sustainable-business", sustainableBusiness, News),
    SectionsLink ("law", law, News),
    SectionsLink ("us-news/us-politics", usPolitics, News),
    SectionsLink ("australia-news/australian-politics", auPolitics, News),
    SectionsLink ("australia-news/australian-immigration-and-asylum", auImmigration, News),
    SectionsLink ("australia-news/indigenous-australians", indigenousAustralia, News),

    SectionsLink ("commentisfree", opinion, Opinion),
    SectionsLink ("cartoons/archive", cartoons, Opinion),
    SectionsLink ("type/cartoon", cartoons, Opinion),
    SectionsLink ("au/index/contributors", auColumnists, Opinion),
    SectionsLink ("index/contributors", columnists, Opinion),
    SectionsLink ("commentisfree/series/comment-is-free-weekly", inMyOpinion, Opinion),
    SectionsLink ("profile/editorial", theGuardianView, Opinion),

    SectionsLink ("sport", sport, Sport),
    SectionsLink ("football", football, Sport),
    SectionsLink ("sport/rugby-union", rugbyUnion, Sport),
    SectionsLink ("sport/cricket", cricket, Sport),
    SectionsLink ("sport/tennis", tennis, Sport),
    SectionsLink ("sport/golf", golf, Sport),
    SectionsLink ("sport/us-sport", usSports, Sport),
    SectionsLink ("sport/horse-racing", racing, Sport),
    SectionsLink ("sport/rugbyleague", rugbyLeague, Sport),
    SectionsLink ("sport/boxing", boxing, Sport),
    SectionsLink ("sport/formulaone", formulaOne, Sport),
    SectionsLink ("sport/nfl", NFL, Sport),
    SectionsLink ("sport/mlb", MLB, Sport),
    SectionsLink ("football/mls", MLS, Sport),
    SectionsLink ("sport/nba", NBA, Sport),
    SectionsLink ("sport/nhl", NHL, Sport),
    SectionsLink ("sport/afl", AFL, Sport),
    SectionsLink ("football/a-league", aLeague, Sport),
    SectionsLink ("sport/nrl", NRL, Sport),
    SectionsLink ("sport/australia-sport", australiaSport, Sport),

    SectionsLink ("culture", culture, Arts),
    SectionsLink ("film", film, Arts),
    SectionsLink ("tv-and-radio", tvAndRadio, Arts),
    SectionsLink ("music", music, Arts),
    SectionsLink ("books", books, Arts),
    SectionsLink ("artanddesign", artAndDesign, Arts),
    SectionsLink ("stage", stage, Arts),
    SectionsLink ("music/classicalmusicandopera", classical, Arts),
    SectionsLink ("games", games, Arts),

    SectionsLink ("lifeandstyle", lifestyle, Lifestyle),
    SectionsLink ("fashion", fashion, Lifestyle),
    SectionsLink ("travel", travel, Lifestyle),
    SectionsLink ("society", society, Lifestyle),
    SectionsLink ("lifeandstyle/food-and-drink", food, Lifestyle),
    SectionsLink ("tone/recipes", recipes, Lifestyle),
    SectionsLink ("lifeandstyle/women", women, Lifestyle),
    SectionsLink ("lifeandstyle/health-and-wellbeing", health, Lifestyle),
    SectionsLink ("lifeandstyle/family", family, Lifestyle),
    SectionsLink ("lifeandstyle/love-and-sex", loveAndSex, Lifestyle),
    SectionsLink ("au/lifeandstyle/fashion", fashionAu, Lifestyle),
    SectionsLink ("au/lifeandstyle/food-and-drink", foodAu, Lifestyle),
    SectionsLink ("au/lifeandstyle/relationships", relationshipsAu, Lifestyle),
    SectionsLink ("au/lifeandstyle/health-and-wellbeing", healthAu, Lifestyle)
  )
}
