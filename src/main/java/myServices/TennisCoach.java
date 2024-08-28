package myServices;

@Component
public class TennisCoach implements Coach {

    private FortuneServices fortuneService;

    public TennisCoach() {
        // this is default constructor
    }

    @Autowired
    public TennisCoach(FortuneServices theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Component
    public class TennisCoach implements Coach {
        @Autowired
        private FortuneServices fortuneService;

        public TennisCoach(FortuneServices theFortuneService) {
            fortuneService = theFortuneService;
        }

        @Override
        public String getDailyWorkout() {
            return "Practice your backhand volley";
        }

        @Override
        public String getDailyFortune() {
            return fortuneService.getFortune();
        }

        @Component
        public class TennisCoach implements Coach {
            @Autowired
            @Qualifier("randomFortuneService")
            private FortuneService fortuneService;

            // default constructor
            public TennisCoach() {
            }
            public TennisCoach(FortuneService theFortuneService) {
                fortuneService = theFortuneService;
            }

            @Override
            public String getDailyWorkout() {
                return "Practice your backhand volley";
            }
            @Override
            public String getDailyFortune() {
                return fortuneService.getFortune();
            }
            @Component
            public class TennisCoach implements Coach {
                @Autowired
                @Qualifier("databaseFortuneService")
                private FortuneService fortuneService;
                // default constructor
                public TennisCoach() {
                }
                public TennisCoach(FortuneService theFortuneService) {
                    fortuneService = theFortuneService;
                }

                @Override
                public String getDailyWorkout() {
                    return "Practice your backhand volley";
                }

                @Override
                public String getDailyFortune() {
                    return fortuneService.getFortune();
                }
            }


        }



    }

}

