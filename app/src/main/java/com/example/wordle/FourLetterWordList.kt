package com.example.wordle

object FourLetterWordList {
    private val words = listOf(
        "AREA", "ARMY", "BABY", "BACK", "BALL", "BAND", "BANK", "BASE", "BILL", "BODY",
        "BOOK", "BOOT", "BOSS", "BOY", "CASH", "CITY", "CLUB", "COAT", "COKE", "COLD",
        "COME", "COOL", "COPY", "COST", "DADY", "DARK", "DATA", "DATE", "DEAL", "DEAR",
        "DEER", "DESK", "DIET", "DIRT", "DISH", "DISK", "DOOR", "DOTS", "DRAW", "DRUG",
        "DRUM", "DUCK", "DUST", "DUTY", "EARN", "EAST", "EDGE", "ELSE", "EVER", "FACE",
        "FACT", "FAIL", "FALL", "FARM", "FAST", "FEAR", "FEEL", "FEET", "FILE", "FILL",
        "FILM", "FIND", "FINE", "FIRE", "FISH", "FIVE", "FLAT", "FLOW", "FOOD", "FOOT",
        "FORD", "FORM", "FORT", "FOUR", "FREE", "FROM", "FUEL", "FULL", "FUND", "GAIN",
        "GAME", "GATE", "GIFT", "GIRL", "GIVE", "GLAD", "GOAL", "GOAT", "GOLD", "GOLF",
        "GONE", "GOOD", "GRAY", "GREW", "GREY", "GROW", "GULF", "HAIR", "HALF", "HALL",
        "HAND", "HANG", "HARD", "HATE", "HAVE", "HEAD", "HEAR", "HEAT", "HELL", "HELP",
        "HERE", "HERO", "HIGH", "HILL", "HIRE", "HOLD", "HOLE", "HOME", "HOPE", "HOST",
        "HOUR", "HUGE", "HUNG", "HUNT", "HURT", "IDEA", "INCH", "IRON", "ITEM", "JACK",
        "JANE", "JAVA", "JOBS", "JOIN", "JUMP", "JUNE", "JURY", "JUST", "KEEP", "KEPT",
        "KEYS", "KIDS", "KILL", "KIND", "KING", "KNEE", "KNEW", "KNOW", "LACK", "LADY",
        "LAID", "LAKE", "LAND", "LANE", "LAST", "LATE", "LEAD", "LEFT", "LESS", "LIFE",
        "LIFT", "LIKE", "LINE", "LINK", "LIST", "LIVE", "LOAD", "LOAN", "LOCK", "LOGO",
        "LONG", "LOOK", "LORD", "LOSE", "LOSS", "LOST", "LOVE", "LUCK", "MADE", "MAIL",
        "MAIN", "MAKE", "MALE", "MANY", "MARK", "MASS", "MATT", "MEAL", "MEAN", "MEAT",
        "MEET", "MENU", "MESS", "MICE", "MIKE", "MILD", "MILE", "MILK", "MILL", "MIND",
        "MINE", "MISS", "MODE", "MOOD", "MOON", "MORE", "MOST", "MOVE", "MUCH", "MUST",
        "NAME", "NEAR", "NECK", "NEED", "NEWS", "NEXT", "NICE", "NICK", "NINE", "NONE",
        "NOSE", "NOTE", "OKAY", "ONCE", "ONLY", "OPEN", "ORAL", "OVER", "PACE", "PACK",
        "PAGE", "PAID", "PAIN", "PAIR", "PALM", "PARK", "PART", "PASS", "PAST", "PATH",
        "PEAK", "PICK", "PINK", "PIPE", "PLAN", "PLAY", "PLOT", "PLUG", "PLUS", "POLL",
        "POOL", "POOR", "PORT", "POST", "PULL", "PURE", "PUSH", "RACE", "RAIL", "RAIN",
        "RANK", "RARE", "RATE", "READ", "REAL", "REAR", "RELY", "RENT", "REST", "RICE",
        "RICH", "RIDE", "RING", "RISE", "RISK", "ROAD", "ROCK", "ROLE", "ROLL", "ROOF",
        "ROOM", "ROOT", "ROSE", "RULE", "RUSH", "SAFE", "SAID", "SAKE", "SALE", "SALT",
        "SAME", "SAND", "SAVE", "SEAT", "SEED", "SEEK", "SEEM", "SELL", "SEND", "SENT",
        "SEPT", "SHIP", "SHOP", "SHOT", "SHOW", "SHUT", "SICK", "SIDE", "SIGN", "SITE",
        "SIZE", "SKIN", "SLIP", "SLOW", "SNOW", "SOFT", "SOLO", "SOME", "SONG", "SOON",
        "SORT", "SOUL", "SPOT", "STAR", "STAY", "STEP", "STOP", "SUCH", "SUIT", "SURE",
        "TAKE", "TALE", "TALK", "TALL", "TANK", "TAPE", "TASK", "TEAM", "TECH", "TELL",
        "TENT", "TERM", "TEST", "TEXT", "THAN", "THAT", "THEM", "THEN", "THEY", "THIN",
        "THIS", "THUS", "TICK", "TIDE", "TILL", "TIME", "TINY", "TOLD", "TOLL", "TONE",
        "TONY", "TOOK", "TOOL", "TOUR", "TOWN", "TREE", "TRIP", "TRUE", "TUNE", "TURN",
        "TWIN", "TYPE", "UNIT", "UPON", "USED", "USER", "VARY", "VICE", "VIEW", "VOTE",
        "WAGE", "WAIT", "WAKE", "WALK", "WALL", "WANT", "WARD", "WARM", "WASH", "WAVE",
        "WAYS", "WEAK", "WEAR", "WEEK", "WELL", "WENT", "WERE", "WEST", "WHAT", "WHEN",
        "WHOM", "WIDE", "WIFE", "WILD", "WILL", "WIND", "WINE", "WING", "WIRE", "WISE",
        "WISH", "WITH", "WOOD", "WORD", "WORK", "YARD", "YEAR", "YOUR", "ZERO", "ZONE"
    )

    fun getRandomFourLetterWord(): String {
        return words.random()
    }
}
