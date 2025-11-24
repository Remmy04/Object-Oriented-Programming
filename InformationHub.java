package oop.group.project;

import java.util.Scanner;

public class InformationHub {
    public void information(){
    Scanner sc = new Scanner(System.in);
        
        while(true){      
        System.out.println("\nWelcome to Information Hub!");
        System.out.println("");
        System.out.println("""
                            The Information Hub feature serves as a central repository of knowledge 
                            on climate change, offering users a one-stop destination to access educational content, 
                            resources, and the latest information on climate-related topics.""");
        System.out.println("");
        System.out.println("In this Information Hub, you can explore and research on these relevant topics:");
        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("1) Climate Change Basics ");
        System.out.println("2) Education and Awareness ");
        System.out.println("3) Mitigation Strategies ");
        System.out.println("4) Adaptation Measures ");
        System.out.println("5) Impact Reduction Techniques ");
        System.out.println("-------------------------------");
        System.out.println("");
        System.out.println("Please enter a topic number to search: ");
        System.out.println("Enter 'BACK' to go back to the Main Page.");
        
        String userInput = sc.next();
        

             
        if ("BACK".equalsIgnoreCase(userInput)) {
                break;
            }

        
        int topicNumber = Integer.parseInt(userInput);
        
        switch(topicNumber){
                case 1:
                    handleClimateChangeBasics(sc);
                    break;
                case 2:
                    handleEducationAndAwareness(sc);
                    break;
                case 3:
                    handleMitigationStrategies(sc);
                    break;
                case 4:
                    handleAdaptationMeasures(sc);
                    break;
                case 5:
                    handleImpactReductionTechniques(sc);
                    break;
                // Add cases for other topics if needed
                default:
                    System.out.println("Invalid input. Please enter a valid topic number or 'EXIT'.");
            }
        }
    }
    
    private static void handleClimateChangeBasics(Scanner a) {
        while(true){
            System.out.println("You selected the topic: Climate Change Basics");
            System.out.println("Below are some related topics pertaining to the main topic you selected:");
            System.out.println("");
            System.out.println("-------------------------------------------");
            System.out.println("1) Definition of global warming");
            System.out.println("2) How it contributes to climate change. ");
            System.out.println("3) What are greenhouse gases?");
            System.out.println("4) Climate vs Weather");
            System.out.println("-------------------------------------------");
            System.out.println("");
            System.out.println("Please enter a topic number to search:");
            System.out.println("Enter BACK to go back to the main Information Hub page.");
               
            String userInput = a.next();
            
            if ("BACK".equalsIgnoreCase(userInput)) {
                break;
            }

            int subtopicNumber = Integer.parseInt(userInput);
            
            switch(subtopicNumber){
                    case 1 : 
                        System.out.println("Definition of global warning.");
                        System.out.println("");
                        System.out.println("""
                                           Global warming refers to the long-term increase in Earth's average surface 
                                           temperature due to human activities, such as the emission of greenhouse gases like 
                                           carbon dioxide, methane, and nitrous oxide. These gases trap heat in the Earth's atmosphere,
                                           leading to a gradual warming of the planet.""");
                        System.out.println("");
                        break;
                    case 2 : 
                        System.out.println("How it contributes to climate change.");
                        System.out.println("");
                        System.out.println("""
                                           1)Greenhouse Gas Emissions: Human activities, such as burning fossil fuels(coal, oil, and natural gas), 
                                           deforestation, and industrial processes, release large amounts of greenhouse gases into the atmosphere.
                                           
                                           2)Greenhouse Effect: These gases trap heat in the atmosphere, leading to a natural greenhouse effect. 
                                           However, human activities have significantly increased the concentration of these gases, enhancing the greenhouse effect.
                                           
                                           3)Global Warming: The increased greenhouse effect causes a rise in Earth's average surface temperature. 
                                           
                                           4)Climate Change: Elevated temperatures result in widespread climate changes, including extreme weather events, 
                                           altered precipitation, and rising sea levels. 
                                           
                                           5)Feedback Loops: Global warming triggers processes like ice melt and permafrost thaw, creating self-reinforcing 
                                           feedback loops that amplify climate change. 
                                           
                                           In essence, human-induced global warming is the primary driver of climate change, impacting weather patterns, 
                                           sea levels, and ecosystems worldwide. Addressing this issue involves reducing greenhouse gas emissions and 
                                           adapting to the changing climate.""");
                        System.out.println("");
                        break;   
                    case 3 : 
                        System.out.println("What are greenhouse gases?");
                        System.out.println("");
                        System.out.println("""
                                           Greenhouse gases (GHGs) are gases in the Earth's atmosphere that can trap heat. 
                                           They allow sunlight to enter the atmosphere but prevent some of the heat that the Earth would normally radiate back into space from escaping. 
                                           This natural greenhouse effect is essential for maintaining a habitable temperature on Earth. 
                                           However, human activities have significantly increased the concentration of certain greenhouse gases, 
                                           enhancing the greenhouse effect and leading to global warming and climate change.
                                           
                                           Example: Carbon Dioxide (CO2), Methane (CH4), Nitrous Oxide (N20), Flourinated Gases.""");
                        System.out.println("");
                        break;    
                    case 4 : 
                        System.out.println("Climate vs Weather");
                        System.out.println("");
                        System.out.println("""
                                           Weather: Weather refers to the short-term atmospheric conditions in a specific location at a given moment or over a short period, 
                                           typically hours to days.
                                           
                                           Climate: Climate refers to the long-term patterns and averages of weather conditions in a particular region over an extended period, 
                                           typically 30 years or more.
                                           
                                           Differences
                                           Time Frame: Climate involves long-term trends, while weather pertains to short-term conditions.
                                           
                                           Predictability: While climate can be predicted with some reliability, day-to-day weather is often more 
                                           variable and challenging to forecast accurately.""");
                        System.out.println("");
                        break;
                    default : 
                        System.out.println("The search you entered is invalid. Please check and try again.");
                        System.out.println("");
                }       
        }
    }

    private static void handleEducationAndAwareness(Scanner a) {
        while(true){
            System.out.println("You selected the topic: Education and Awareness");
            System.out.println("Below are some related topics pertaining to the main topic you selected:");
            System.out.println("");
            System.out.println("-------------------------------------------");
            System.out.println("1) Importance of Climate Education ");
            System.out.println("2) Educational Programs and Initiatives. ");
            System.out.println("3) Public Awareness Campaigns ");
            System.out.println("-------------------------------------------");
            System.out.println("");
            System.out.println("Please enter a topic number to search:");
            System.out.println("Enter BACK to go back to the main Information Hub page.");
               
            String userInput = a.next();
            
            if ("BACK".equalsIgnoreCase(userInput)) {
                break;
            }
            
            int subtopicNumber = Integer.parseInt(userInput);
            
            switch(subtopicNumber){
                    case 1 : 
                        System.out.println("Importance of Climate Education");
                        System.out.println("");
                        System.out.println("""
                                           Informed Decision-Making: Climate education empowers individuals to 
                                           make informed decisions, fostering sustainable practices and influencing 
                                           choices that contribute to mitigating climate change. 
                                           
                                           Global Citizenship: Climate education promotes a sense of global citizenship,
                                           emphasizing the interconnectedness of environmental issues and encouraging a 
                                           collective responsibility for the planet.
                                           
                                           Youth Engagement and Leadership: By inspiring and informing the next generation, 
                                           climate education plays a crucial role in engaging youth as advocates and 
                                           leaders in addressing climate challenges. 
                                           
                                           Policy Advocacy: Informed citizens, through climate education, are more likely 
                                           to advocate for and support policies at various levels that address climate 
                                           change and promote sustainable practices. 
                                           
                                           Resilience Building: Communities equipped with climate education are better 
                                           prepared to build resilience against the impacts of climate change, fostering 
                                           adaptation strategies and sustainable resource management.""");
                        System.out.println("");
                        break;
                    case 2 : 
                        System.out.println("Educational Programs and Initiatives");
                        System.out.println("");
                        System.out.println("""
                                           1)UNESCO Climate Education 
                                           
                                           Launched in 2010, the UNESCO Climate Change Education for Sustainable 
                                           Development (CCESD) program aims to boost understanding of climate change. 
                                           It expands nonformal education through media, partnerships, and networking. 
                                           Aligned with Education for Sustainable Development, it integrates climate 
                                           change into education, emphasizing environmental sustainability, economic 
                                           viability, and social justice. Utilizing participatory teaching methods, 
                                           the program motivates learners to adopt sustainable behaviours. 
                                           In collaboration with national governments, UNESCO integrates climate change 
                                           education into curricula, emphasizing innovation. The program, supported by 
                                           partnerships, includes the World Higher Education Conference, focusing on 
                                           climate change education. The ultimate goal is to enhance 'climate literacy' 
                                           particularly among young people, making education a central aspect of the 
                                           global response to climate change.
                                           
                                           2)NASA Climate Kids
                                           
                                           NASA provides educational resources and games for children to learn about 
                                           climate science. It is an educational website with activities, resources, 
                                           and games to teach kids of all ages about Earth's systems, water cycle, 
                                           weather and climate.
                                           
                                           3)Citizens’ Climate Education
                                           
                                           Citizens’ Climate Education (CCE) is a nonpartisan grassroots advocacy 
                                           organization that empowers individuals from diverse backgrounds to educate 
                                           policymakers and the public about effective climate change solutions. 
                                           This dedicated group of climate advocates works to build political support 
                                           for lasting climate solutions at both federal and state levels.""");
                        System.out.println("");
                        break;    
                    case 3 : 
                        System.out.println("Public Awareness Campaigns");
                        System.out.println("");
                        System.out.println("""
                                          Public awareness campaigns are initiatives designed to inform and 
                                          engage the general public on specific issues, often with the goal 
                                          of promoting understanding, changing behaviour, or encouraging action. 
                                          These campaigns use various communication channels, including media, 
                                          social platforms, and community events, to reach a broad audience. 
                                           
                                          Public awareness campaigns can cover a wide range of topics, from health
                                          and safety to environmental issues, social causes, and public policy.
                                          The primary aim is to raise awareness, generate interest, and inspire 
                                          individuals to take informed actions that contribute to positive 
                                          change in society. These campaigns often leverage compelling messaging,
                                          visuals, and storytelling techniques to effectively convey their
                                          messages and resonate with diverse audiences.""");
                        System.out.println("");
                        break;
                    default : 
                        System.out.println("The search you entered is invalid. Please check and try again.");
                        System.out.println("");
                }       
        }
    }
    
    private static void handleMitigationStrategies(Scanner a) {
        while(true){
            System.out.println("You selected the topic: Mitigation Strategies");
            System.out.println("Below are some related topics pertaining to the main topic you selected:");
            System.out.println("");
            System.out.println("-------------------------------------------");
            System.out.println("1) Definition of mitigation of climate change");
            System.out.println("2) Renewable Energy");
            System.out.println("3) Energy Efficiency");
            System.out.println("4) Sustainable Transportation ");
            System.out.println("-------------------------------------------");
            System.out.println("");
            System.out.println("Please enter a topic number to search:");
            System.out.println("Enter BACK to go back to the main Information Hub page.");
               
            String userInput = a.next();
            
            if ("BACK".equalsIgnoreCase(userInput)) {
                break;
            }
            
            int subtopicNumber = Integer.parseInt(userInput);
            
            switch(subtopicNumber){
                    case 1 : 
                        System.out.println("Definition of mitigation of climate change");
                        System.out.println("");
                        System.out.println("""
                                          Mitigation of climate change refers to efforts and strategies undertaken 
                                          to reduce or prevent the emission of greenhouse gases into the atmosphere 
                                          and to enhance activities that remove these gases. The primary goal of 
                                          mitigation is to limit the extent of global warming and its associated 
                                          impacts on the Earth's climate. 
                                           
                                          Mitigation actions include transitioning to renewable energy sources, 
                                          improving energy efficiency, protecting and restoring forests 
                                          (which act as carbon sinks), and implementing sustainable practices in 
                                          various sectors such as transportation, agriculture, and industry. 
                                          The overarching objective is to curb the human-induced factors 
                                          contributing to climate change, thereby lessening its overall impact 
                                          and promoting a more sustainable and resilient future.""");
                        System.out.println("");
                        break;
                    case 2 : 
                        System.out.println("Renewable Energy");
                        System.out.println("");
                        System.out.println("""
                                           Renewable energy sources, abundant in our surroundings and harnessed 
                                           from the sun, wind, water, waste, and Earth's heat, are continually 
                                           replenished by nature. These sources emit minimal greenhouse gases or 
                                           pollutants into the air. Harnessing the power of renewables is a 
                                           sustainable approach that aligns with environmental goals, offering a 
                                           cleaner and more environmentally friendly alternative to traditional 
                                           energy sources.""");
                        System.out.println("");
                        break;    
                    case 3 : 
                        System.out.println("Energy Efficiency");
                        System.out.println("");
                        System.out.println("""
                                          Energy-efficient homes and businesses contribute to a greener and healthier 
                                          planet by reducing the demand for fossil fuels, subsequently lowering 
                                          carbon dioxide levels in the atmosphere. This approach helps mitigate climate 
                                          change, addressing issues like heatwaves, drought, rising sea levels, 
                                          abnormal weather patterns, and the increased likelihood of natural disasters.
                                          Simple measures such as minimizing single-use plastics and adopting low-flow 
                                          water systems, in the context of energy efficiency, can collectively make a 
                                          significant positive impact on combating climate change and promoting 
                                          environmental sustainability.""");
                        System.out.println("");
                        break;
                    case 4 :
                        System.out.println("Sustainable Transportation");
                        System.out.println("");
                        System.out.println("""
                                          Sustainable transportation encompasses energy-efficient, affordable, and 
                                          accessible low- and zero-emission modes, relying on electric, alternative-fuel, 
                                          and domestic fuel vehicles instead of depleting natural resources like coal, 
                                          oil, and gas. This approach significantly reduces carbon dioxide emissions, 
                                          benefiting the environment by mitigating atmospheric pollution and enhancing 
                                          air quality in urban areas. Sustainable transport is crucial for addressing 
                                          environmental concerns and promoting a cleaner, healthier future.""");
                        System.out.println("");
                        break;
                    default : 
                        System.out.println("The search you entered is invalid. Please check and try again.");
                        System.out.println("");
                }       
        }
    }
    private static void handleAdaptationMeasures(Scanner a) {
        while(true){
            System.out.println("You selected the topic: Adaptation Measures");
            System.out.println("Below are some related topics pertaining to the main topic you selected:");
            System.out.println("");
            System.out.println("-------------------------------------------");
            System.out.println("1) Climate-Resilient Agriculture");
            System.out.println("2) Urban Planning for Climate Resilience");
            System.out.println("3) Water Management and Adaptation");
            System.out.println("-------------------------------------------");
            System.out.println("");
            System.out.println("Please enter a topic number to search:");
            System.out.println("Enter BACK to go back to the main Information Hub page.");
               
            String userInput = a.next();
            
            if ("BACK".equalsIgnoreCase(userInput)) {
                break;
            }
            
            int subtopicNumber = Integer.parseInt(userInput);
            
            switch(subtopicNumber){
                    case 1 : 
                        System.out.println("Climate-Resilient Agriculture");
                        System.out.println("");
                        System.out.println("""
                                          Climate-resilient agriculture (CRA) involves the sustainable utilization of 
                                          natural resources in crop and livestock production systems, aiming for 
                                          sustained productivity and increased farm incomes amid climate variability. 
                                          This approach addresses long-term goals, reducing hunger and poverty for 
                                          future generations in the face of climate change. CRA practices, 
                                          implemented at local and global levels, promote agricultural sustainability.
                                          
                                          These practices result in improved access to technology, transparent trade 
                                          regimes, and the adoption of resource conservation technologies. They also 
                                          enhance the adaptability of crops and livestock to climatic stress, 
                                          fostering resilience in the agricultural sector. In countries facing crises 
                                          from disasters and conflicts, CRA becomes crucial for ensuring food 
                                          security by mitigating the impact of inadequate food stocks, fluctuations 
                                          in basic food prices, high demand for agro-fuels, and abrupt weather changes.""");
                        System.out.println("");
                        break;
                    case 2 : 
                        System.out.println("Urban Planning for Climate Resillience");
                        System.out.println("");
                        System.out.println("""
                                           In the Philippines, urban planning for climate resilience is guided by the 
                                           core principle of building resilience in city planning and design. Aligned 
                                           with the vision of creating "Better, Greener, Smarter Cities in an Inclusive 
                                           Philippines," this guide is a collaborative effort involving key organizations.
                                           Developed through the Building Climate Resilience through Urban Plans and 
                                           Designs (BCRUPD) project, supported by the International Climate Initiative 
                                           of the German government, the guide targets national and local government 
                                           entities. It provides essential concepts and technical information, emphasizing
                                           evidence-based, data-driven solutions for urgent climate action. The aim is 
                                           to encourage tangible local actions in resilient urban planning, fostering 
                                           sustainable cities amid the Philippines' unique climate challenges.""");
                        System.out.println("");
                        break;    
                    case 3 : 
                        System.out.println("Water Management and Adaptation");
                        System.out.println("");
                        System.out.println("""
                                          Water management is vital for climate change adaptation as shifting climate 
                                          patterns intensify challenges to water resources. Adaptive strategies, 
                                          including optimized allocation, enhanced infrastructure, and nature-based 
                                          solutions, are essential for resilience. Integration of smart technologies 
                                          for monitoring supports informed decision-making. Prioritizing adaptive water 
                                          management ensures sustainable access to water resources, fostering resilience 
                                          in the face of climate change impacts.""");
                        System.out.println("");
                        break;
                    default : 
                        System.out.println("The search you entered is invalid. Please check and try again.");
                        System.out.println("");
                }       
        }
    }
        private static void handleImpactReductionTechniques(Scanner a) {
        while(true){
            System.out.println("You selected the topic: Impact Reduction Techniques");
            System.out.println("Below are some related topics pertaining to the main topic you selected:");
            System.out.println("");
            System.out.println("-------------------------------------------");
            System.out.println("1) Biodiversity Conservation");
            System.out.println("2) Sustainable Practices");
            System.out.println("3) Waste Management");
            System.out.println("-------------------------------------------");
            System.out.println("");
            System.out.println("Please enter a topic number to search:");
            System.out.println("Enter BACK to go back to the main Information Hub page.");
               
            String userInput = a.next();
            
            if ("BACK".equalsIgnoreCase(userInput)) {
                break;
            }
            
            int subtopicNumber = Integer.parseInt(userInput);
            
            switch(subtopicNumber){
                    case 1 : 
                        System.out.println("Biodiversity Conservation ");
                        System.out.println("");
                        System.out.println("""
                                          Conserving and restoring natural spaces, along with their rich biodiversity, 
                                          is crucial for both mitigating emissions and adapting to climate impacts. 
                                          Biodiversity encompasses the diverse array of life on Earth, spanning genes,
                                          bacteria, and entire ecosystems like forests or coral reefs. This intricate 
                                          web of life, shaped over 4.5 billion years of evolution, is now significantly 
                                          impacted by human activities. Recognizing the interconnectedness of ecosystems
                                          and the role of biodiversity is paramount in our collective efforts to address
                                          climate change challenges effectively.""");
                        System.out.println("");
                        break;
                    case 2 : 
                        System.out.println("Sustainable Practices");
                        System.out.println("");
                        System.out.println("""
                                          Adopting sustainable practices is paramount in addressing climate change. 
                                          Keeping fossil fuels in the ground, including coal, oil, and gas, is crucial 
                                          to mitigate the worsening impacts of climate change. It is imperative for all 
                                          nations to transition their economies away from fossil fuels swiftly. 
                                           
                                          Investing in renewable energy sources such as solar, wind, wave, tidal, and 
                                          geothermal power is key to replacing reliance on traditional fossil fuels. 
                                           
                                          Additionally, a shift towards sustainable transport, embracing electric 
                                          vehicles, reducing car use, and minimizing air travel, not only contributes 
                                          to climate change mitigation but also aids in curbing air pollution. These 
                                          concerted efforts are essential for building a more sustainable and resilient 
                                          future.""");
                        System.out.println("");
                        break;    
                    case 3 : 
                        System.out.println("Waste Management");
                        System.out.println("");
                        System.out.println("""
                                           Recycling and waste prevention play pivotal roles in energy conservation and 
                                           emission reduction. Manufacturing goods from recycled materials demands less 
                                           energy than using virgin materials, contributing to a decrease in fossil fuel 
                                           consumption and carbon dioxide emissions. Further energy savings occur when 
                                           people reuse items or when products are designed with fewer materials, reducing
                                           the need for extracting, transporting, and processing raw materials. 
                                           
                                           Notably, this decline in energy demand translates to a reduction in greenhouse
                                           gas emissions, particularly from incinerators. By prioritizing recycling and 
                                           waste prevention, we not only save energy but also contribute significantly to
                                           mitigating the environmental impact of our consumption habits.""");
                        System.out.println("");
                        break;
                    default : 
                        System.out.println("The search you entered is invalid. Please check and try again.");
                        System.out.println("");
                }       
        }
    }
}

    


