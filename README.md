## Inspiration
As we were browsing the challenges for this semesters hackathon, we stumbled across Geico's challenge. It's goal is to bring an activity score to different activities that have something to do with the different insurance plans that Geico has. We thought this would be interesting since relating the weather to a risk factor is something we all subconsciously do when we ask for the weather in the morning, and having something to quantify it in a more specific manner sounded interesting.

## What it does
We thought this would be a great time to try out AccuWeather APIs to relate various weather conditions and warnings to make the score for these activities. We uses the AccuWeather APIs to gather a multitude of weather data that could give a score for some of the Geico insurance types. This combination of weather data and info on the insurance plans were put into custom functions that quantify a final score for each activity.

## How We built it
We started off by splitting into two teams, one to understand how to use the AccuWeather API for our data collecting, and the other to figure out what data from the API had an impact on the different Geico Insurance Policies. For both of these purposes we chose to start out with Java.

**AccuWeather**
Once we had the understanding and initial implementation of the API, we began learning how to ping the AccuWeather site for our data and store it as usable variables in Java. We settled on using the Location, Forecast, Current Conditions, and Weather Alerts API's from AccuWeather. 

**Calculations**
Meanwhile, the other team was listing the measurements each insurance plan was affected by. Using these values, we created equations that deducted points from the max of 100 to get a final score for each insurance type. The points were subtracted based on the severity of the weather conditions. The insurance plans we settled on were Automotive, Motorcycle/ATV, Wellness and Fitness, Boating, and Air Travel. 

**Website**
Once both of these were completed, we added in the data and equations to get our final values in Java. These final values were calculated on the GlassFish server via a Java Bean using a portion of the javax library. The Java Bean acts as a consolidator for all the data from the different API's.The results are then displayed to the customer on our mock Geico website. The first page prompts the user to enter their zip code and gives them a short description of the site. The Second page gives the scores for each of the insurance types and the risks of participating in those types of activities (ex. Car Travel, Boating, etc.). The Third and final page shows a breakdown of the weather conditions for someone who is also interested in the details.

## Challenges We ran into
The largest challenge that we ran into when tackling this project was properly writing the network code in order to access the AccuWeather API. We encountered a few issues where our API key appeared to be acting up even though our request URL appeared to be correct. This resulted in us spending the first few hours trying to get any sort of response from the API. But once we got data out of the API, we weren't out of the woods yet. We still needed to take the data and manipulate it into a form we could use. We spend a considerable amount of time browsing Java libraries to find the best way to turn our data into something usable in our project plan.

Another big challenge we ran into was the creation of the scales for each activity. A lot of the activities used some similar data sets but they all had their own specializations that we had to work around. The team had to come together and brainstorm/search for the danger zones of things such as temperature and precipitation. With these thresholds, we then created equations from the scores by using the data affecting the attribute of weather at maximum conditions, and equating that to a maximum score deduction (100). With this we had scaling equations for each of the weather equations.

## Accomplishments that We're proud of
One of the things we are proud of is how quickly we got on task. Once we decided on a topic, we switched into high gear and got a lot of the groundwork started very quickly and efficiently. Because of this quick startup, it made the rest of the project when we came together and connected the two halves more manageable.

Another thing we are proud of is our organization and steps we took to properly choose which weather conditions affected which of the insurance plans. This also led into creating all of our equations for the final activity ratings which, even though they were challenging, they are something that really shaped the outcome of this project.

## What We learned
We learned how to use the AccuWeather API and what goes into the compiling of data into a usable format. We also got to learn about how to talk with a data center (AccuWeather) through the internet and ping it for data. With the data we received, we also learned how to make a usable format out of this through custom formulas and weighting. The combination of these things allowed us to get a better understanding of data processing and compilation, which was something we were excited to learn about and use.

## What's next for Weather Gecko
- Moving the website to the Geico App for better accessibility
- Implement more style on the final product to better match the themes on the Geico website
- Possibly use more API's to get a broader set of info that encompass more than just weather
