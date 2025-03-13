# RideShare
AP CS Spring Project!
-Reference planning sheet in notebook for methods and classes. 
-Each car can hold 3 passengers.

Testing results:
"If there are 50 randomly generated passengers, what percentage of them make it to their destination if there are 20 cars?"

(following copied from Terminal)
_____________
Stage 10:
Stations:
RideShare.Station@5acf9800 place: 0, Leftbound:[], Rightbound:[RideShare.Passenger@3b9a45b3 St: 0, Dstn: 3, Right? true, RideShare.Passenger@5f184fc6 St: 0, Dstn: 2, Right? true], Completed:[]
RideShare.Station@4c873330 place: 1, Leftbound:[], Rightbound:[RideShare.Passenger@3feba861 St: 1, Dstn: 4, Right? true, RideShare.Passenger@5b480cf9 St: 1, Dstn: 2, Right? true, RideShare.Passenger@6f496d9f St: 1, Dstn: 3, Right? true], Completed:[]
RideShare.Station@119d7047 place: 2, Leftbound:[RideShare.Passenger@b4c966a St: 2, Dstn: 1, Right? false], Rightbound:[RideShare.Passenger@2f4d3709 St: 2, Dstn: 5, Right? true, RideShare.Passenger@1d81eb93 St: 2, Dstn: 5, Right? true, RideShare.Passenger@7291c18f St: 2, Dstn: 4, Right? true, RideShare.Passenger@34a245ab St: 2, Dstn: 6, Right? true], Completed:[]
RideShare.Station@776ec8df place: 3, Leftbound:[RideShare.Passenger@6e8cf4c6 St: 3, Dstn: 1, Right? false, RideShare.Passenger@12edcd21 St: 3, Dstn: 0, Right? false, RideShare.Passenger@7530d0a St: 4, Dstn: 1, Right? false], Rightbound:[RideShare.Passenger@27973e9b St: 3, Dstn: 4, Right? true], Completed:[RideShare.Passenger@312b1dae St: 3, Dstn: 3, Right? false]
RideShare.Station@4eec7777 place: 4, Leftbound:[], Rightbound:[], Completed:[RideShare.Passenger@5b6f7412 St: 3, Dstn: 4, Right? true]
RideShare.Station@3b07d329 place: 5, Leftbound:[RideShare.Passenger@3941a79c St: 5, Dstn: 4, Right? false, RideShare.Passenger@506e1b77 St: 5, Dstn: 1, Right? false], Rightbound:[], Completed:[RideShare.Passenger@34c45dca St: 3, Dstn: 5, Right? true]
RideShare.Station@41629346 place: 6, Leftbound:[RideShare.Passenger@7cd84586 St: 6, Dstn: 1, Right? false, RideShare.Passenger@30dae81 St: 6, Dstn: 3, Right? false, RideShare.Passenger@1ddc4ec2 St: 6, Dstn: 4, Right? false, RideShare.Passenger@133314b St: 6, Dstn: 3, Right? false, RideShare.Passenger@b1bc7ed St: 6, Dstn: 2, Right? false], Rightbound:[], Completed:[RideShare.Passenger@4edde6e5 St: 7, Dstn: 6, Right? false, RideShare.Passenger@4e50df2e St: 2, Dstn: 6, Right? true]
RideShare.Station@404b9385 place: 7, Leftbound:[RideShare.Passenger@70177ecd St: 7, Dstn: 6, Right? false, RideShare.Passenger@1e80bfe8 St: 7, Dstn: 2, Right? false, RideShare.Passenger@66a29884 St: 7, Dstn: 4, Right? false], Rightbound:[], Completed:[RideShare.Passenger@9807454 St: 5, Dstn: 7, Right? true, RideShare.Passenger@27bc2616 St: 4, Dstn: 7, Right? true]
RideShare.Station@6d311334 place: 8, Leftbound:[RideShare.Passenger@65b3120a St: 8, Dstn: 7, Right? false, RideShare.Passenger@6f539caf St: 8, Dstn: 6, Right? false], Rightbound:[], Completed:[RideShare.Passenger@1b2c6ec2 St: 6, Dstn: 8, Right? true, RideShare.Passenger@52cc8049 St: 3, Dstn: 8, Right? true]
RideShare.Station@682a0b20 place: 9, Leftbound:[RideShare.Passenger@50040f0c St: 9, Dstn: 1, Right? false, RideShare.Passenger@2dda6444 St: 9, Dstn: 1, Right? false, RideShare.Passenger@5e9f23b4 St: 9, Dstn: 2, Right? false, RideShare.Passenger@4783da3f St: 9, Dstn: 4, Right? false], Rightbound:[], Completed:[RideShare.Passenger@378fd1ac St: 9, Dstn: 9, Right? false, RideShare.Passenger@49097b5d St: 9, Dstn: 9, Right? false]
Cars:
RideShare.Car@6e2c634b Dstn: 3, CurLoc: 3, Right? false, Psngrs: []
RideShare.Car@1a6c5a9e Dstn: 2, CurLoc: 2, Right? false, Psngrs: []
RideShare.Car@37bba400 Dstn: 7, CurLoc: 7, Right? false, Psngrs: [RideShare.Passenger@4769b07b St: 7, Dstn: 4, Right? false]
RideShare.Car@179d3b25 Dstn: 2, CurLoc: 2, Right? true, Psngrs: [RideShare.Passenger@7cc355be St: 2, Dstn: 7, Right? true]
RideShare.Car@254989ff Dstn: 1, CurLoc: 1, Right? true, Psngrs: [RideShare.Passenger@723279cf St: 1, Dstn: 6, Right? true]
RideShare.Car@5d099f62 Dstn: 1, CurLoc: 1, Right? false, Psngrs: []
RideShare.Car@37f8bb67 Dstn: 7, CurLoc: 7, Right? true, Psngrs: []
RideShare.Car@49c2faae Dstn: 2, CurLoc: 2, Right? false, Psngrs: []
RideShare.Car@20ad9418 Dstn: 7, CurLoc: 7, Right? false, Psngrs: [RideShare.Passenger@cc34f4d St: 7, Dstn: 2, Right? false]
RideShare.Car@31cefde0 Dstn: 5, CurLoc: 5, Right? false, Psngrs: [RideShare.Passenger@4fca772d St: 5, Dstn: 1, Right? false]
RideShare.Car@439f5b3d Dstn: 1, CurLoc: 1, Right? false, Psngrs: []
RideShare.Car@1d56ce6a Dstn: 6, CurLoc: 6, Right? false, Psngrs: []
RideShare.Car@5197848c Dstn: 3, CurLoc: 3, Right? false, Psngrs: []
RideShare.Car@17f052a3 Dstn: 1, CurLoc: 1, Right? true, Psngrs: [RideShare.Passenger@10f87f48 St: 1, Dstn: 3, Right? true]
RideShare.Car@2e0fa5d3 Dstn: 6, CurLoc: 6, Right? true, Psngrs: [RideShare.Passenger@3d494fbf St: 5, Dstn: 7, Right? true]
RideShare.Car@5010be6 Dstn: 5, CurLoc: 5, Right? true, Psngrs: []
RideShare.Car@685f4c2e Dstn: 8, CurLoc: 8, Right? true, Psngrs: [RideShare.Passenger@79fc0f2f St: 8, Dstn: 9, Right? true]
RideShare.Car@7daf6ecc Dstn: 7, CurLoc: 7, Right? false, Psngrs: [RideShare.Passenger@17a7cec2 St: 7, Dstn: 3, Right? false]
RideShare.Car@2e5d6d97 Dstn: 9, CurLoc: 9, Right? true, Psngrs: []
RideShare.Car@238e0d81 Dstn: 1, CurLoc: 1, Right? false, Psngrs: []

_____________
The percentage of passengers that were brought to their chosen destination was 22.0%.

====================================
In this case, 22.0% of passengers were brought to their chosen destination, equivalent to 11 of 50 passengers. Following iterations demonstrated percentages of 32.0%, roughly 28.0%, 26.0%, 18.0%, and so on.
====================================

"What percentage of passengers make it for 40 cars?"

(following copied from Terminal)
_____________
Stage 10:
Stations:
RideShare.Station@5acf9800 place: 0, Leftbound:[], Rightbound:[RideShare.Passenger@3b9a45b3 St: 0, Dstn: 5, Right? true, RideShare.Passenger@5f184fc6 St: 0, Dstn: 8, Right? true, RideShare.Passenger@3feba861 St: 0, Dstn: 6, Right? true], Completed:[]
RideShare.Station@4c873330 place: 1, Leftbound:[], Rightbound:[], Completed:[RideShare.Passenger@723279cf St: 1, Dstn: 1, Right? false]
RideShare.Station@119d7047 place: 2, Leftbound:[RideShare.Passenger@52cc8049 St: 4, Dstn: 1, Right? false, RideShare.Passenger@4769b07b St: 7, Dstn: 0, Right? false], Rightbound:[], Completed:[RideShare.Passenger@7291c18f St: 2, Dstn: 2, Right? false, RideShare.Passenger@34a245ab St: 3, Dstn: 2, Right? false, RideShare.Passenger@27bc2616 St: 5, Dstn: 2, Right? false]
RideShare.Station@776ec8df place: 3, Leftbound:[], Rightbound:[], Completed:[RideShare.Passenger@b4c966a St: 2, Dstn: 3, Right? true]
RideShare.Station@4eec7777 place: 4, Leftbound:[], Rightbound:[], Completed:[RideShare.Passenger@b1bc7ed St: 6, Dstn: 4, Right? false]
RideShare.Station@3b07d329 place: 5, Leftbound:[], Rightbound:[], Completed:[RideShare.Passenger@4fca772d St: 5, Dstn: 5, Right? false, RideShare.Passenger@9807454 St: 5, Dstn: 5, Right? false, RideShare.Passenger@27973e9b St: 4, Dstn: 5, Right? true, RideShare.Passenger@6e8cf4c6 St: 3, Dstn: 5, Right? true, RideShare.Passenger@133314b St: 6, Dstn: 5, Right? false, RideShare.Passenger@4e50df2e St: 2, Dstn: 5, Right? true, RideShare.Passenger@50040f0c St: 8, Dstn: 5, Right? false]
RideShare.Station@41629346 place: 6, Leftbound:[], Rightbound:[], Completed:[RideShare.Passenger@1e80bfe8 St: 6, Dstn: 6, Right? false, RideShare.Passenger@66a29884 St: 6, Dstn: 6, Right? false, RideShare.Passenger@cc34f4d St: 7, Dstn: 6, Right? false, RideShare.Passenger@7cc355be St: 3, Dstn: 6, Right? true, RideShare.Passenger@7530d0a St: 4, Dstn: 6, Right? true, RideShare.Passenger@34c45dca St: 3, Dstn: 6, Right? true]
RideShare.Station@404b9385 place: 7, Leftbound:[RideShare.Passenger@17a7cec2 St: 7, Dstn: 4, Right? false], Rightbound:[], Completed:[RideShare.Passenger@6f539caf St: 7, Dstn: 7, Right? false, RideShare.Passenger@506e1b77 St: 5, Dstn: 7, Right? true]
RideShare.Station@6d311334 place: 8, Leftbound:[], Rightbound:[], Completed:[RideShare.Passenger@65b3120a St: 7, Dstn: 8, Right? true]
RideShare.Station@682a0b20 place: 9, Leftbound:[RideShare.Passenger@2dda6444 St: 9, Dstn: 8, Right? false, RideShare.Passenger@5e9f23b4 St: 9, Dstn: 3, Right? false, RideShare.Passenger@4783da3f St: 9, Dstn: 0, Right? false], Rightbound:[], Completed:[]
Cars:
RideShare.Car@6e2c634b Dstn: 6, CurLoc: 6, Right? true, Psngrs: [RideShare.Passenger@4edde6e5 St: 6, Dstn: 9, Right? true]
RideShare.Car@1a6c5a9e Dstn: 5, CurLoc: 5, Right? false, Psngrs: [RideShare.Passenger@3941a79c St: 5, Dstn: 0, Right? false]
RideShare.Car@37bba400 Dstn: 7, CurLoc: 7, Right? true, Psngrs: [RideShare.Passenger@12edcd21 St: 3, Dstn: 9, Right? true]
RideShare.Car@179d3b25 Dstn: 0, CurLoc: 0, Right? false, Psngrs: []
RideShare.Car@254989ff Dstn: 7, CurLoc: 7, Right? false, Psngrs: []
RideShare.Car@5d099f62 Dstn: 7, CurLoc: 7, Right? true, Psngrs: [RideShare.Passenger@312b1dae St: 4, Dstn: 9, Right? true]
RideShare.Car@37f8bb67 Dstn: 6, CurLoc: 6, Right? false, Psngrs: [RideShare.Passenger@1b2c6ec2 St: 6, Dstn: 0, Right? false]
RideShare.Car@49c2faae Dstn: 1, CurLoc: 1, Right? false, Psngrs: [RideShare.Passenger@5b6f7412 St: 4, Dstn: 0, Right? false]
RideShare.Car@20ad9418 Dstn: 9, CurLoc: 9, Right? true, Psngrs: []
RideShare.Car@31cefde0 Dstn: 9, CurLoc: 9, Right? false, Psngrs: [RideShare.Passenger@378fd1ac St: 9, Dstn: 2, Right? false]
RideShare.Car@439f5b3d Dstn: 2, CurLoc: 2, Right? false, Psngrs: []
RideShare.Car@1d56ce6a Dstn: 6, CurLoc: 6, Right? true, Psngrs: []
RideShare.Car@5197848c Dstn: 8, CurLoc: 8, Right? false, Psngrs: [RideShare.Passenger@79fc0f2f St: 8, Dstn: 2, Right? false]
RideShare.Car@17f052a3 Dstn: 2, CurLoc: 2, Right? false, Psngrs: []
RideShare.Car@2e0fa5d3 Dstn: 7, CurLoc: 7, Right? true, Psngrs: [RideShare.Passenger@70177ecd St: 6, Dstn: 8, Right? true]
RideShare.Car@5010be6 Dstn: 2, CurLoc: 2, Right? true, Psngrs: [RideShare.Passenger@5b480cf9 St: 1, Dstn: 9, Right? true]
RideShare.Car@685f4c2e Dstn: 5, CurLoc: 5, Right? true, Psngrs: []
RideShare.Car@7daf6ecc Dstn: 3, CurLoc: 3, Right? false, Psngrs: []
RideShare.Car@2e5d6d97 Dstn: 7, CurLoc: 7, Right? true, Psngrs: []
RideShare.Car@238e0d81 Dstn: 5, CurLoc: 5, Right? false, Psngrs: [RideShare.Passenger@7cd84586 St: 6, Dstn: 3, Right? false]
RideShare.Car@31221be2 Dstn: 4, CurLoc: 4, Right? false, Psngrs: []
RideShare.Car@377dca04 Dstn: 3, CurLoc: 3, Right? true, Psngrs: [RideShare.Passenger@2f4d3709 St: 2, Dstn: 9, Right? true]
RideShare.Car@728938a9 Dstn: 6, CurLoc: 6, Right? true, Psngrs: []
RideShare.Car@21b8d17c Dstn: 4, CurLoc: 4, Right? true, Psngrs: [RideShare.Passenger@1d81eb93 St: 2, Dstn: 5, Right? true]
RideShare.Car@6433a2 Dstn: 7, CurLoc: 7, Right? true, Psngrs: []
RideShare.Car@5910e440 Dstn: 4, CurLoc: 4, Right? true, Psngrs: [RideShare.Passenger@6f496d9f St: 1, Dstn: 6, Right? true]
RideShare.Car@6267c3bb Dstn: 6, CurLoc: 6, Right? false, Psngrs: [RideShare.Passenger@30dae81 St: 6, Dstn: 1, Right? false]
RideShare.Car@533ddba Dstn: 6, CurLoc: 6, Right? true, Psngrs: []
RideShare.Car@246b179d Dstn: 0, CurLoc: 0, Right? false, Psngrs: []
RideShare.Car@7a07c5b4 Dstn: 2, CurLoc: 2, Right? false, Psngrs: [RideShare.Passenger@3d494fbf St: 6, Dstn: 0, Right? false]
RideShare.Car@26a1ab54 Dstn: 8, CurLoc: 8, Right? true, Psngrs: []
RideShare.Car@3d646c37 Dstn: 2, CurLoc: 2, Right? false, Psngrs: [RideShare.Passenger@1ddc4ec2 St: 6, Dstn: 0, Right? false]
RideShare.Car@41cf53f9 Dstn: 1, CurLoc: 1, Right? false, Psngrs: []
RideShare.Car@5a10411 Dstn: 9, CurLoc: 9, Right? false, Psngrs: [RideShare.Passenger@49097b5d St: 9, Dstn: 3, Right? false]
RideShare.Car@2ef1e4fa Dstn: 2, CurLoc: 2, Right? false, Psngrs: [RideShare.Passenger@10f87f48 St: 2, Dstn: 1, Right? false]
RideShare.Car@306a30c7 Dstn: 1, CurLoc: 1, Right? false, Psngrs: []
RideShare.Car@b81eda8 Dstn: 5, CurLoc: 5, Right? false, Psngrs: []
RideShare.Car@68de145 Dstn: 4, CurLoc: 4, Right? false, Psngrs: []
RideShare.Car@27fa135a Dstn: 4, CurLoc: 4, Right? false, Psngrs: []
RideShare.Car@46f7f36a Dstn: 4, CurLoc: 4, Right? true, Psngrs: []

_____________
The percentage of passengers that were brought to their chosen destination was 44.0%.

====================================
In this case, 44.0% of passengers were brought to their chosen destination, equivalent to 22 of 50 passengers. The increase in cars correlates with an increase in passengers reaching their intended destination. Following iterations demonstrated percentages of 54.0%, 24.0%, 36.0%, 38.0%, and so on. Overall, across iterations, more passengers were brought to their intended destination.

Note: the parameters for passengers and cars currently inputted in the tester correspond to this second scenario.
====================================

Reflection on process:
Thank you, Mr. Rosato, for helping me during this process. This program took many hours, between trying to understand how to approach formulating different methods to typing code that I thought would work but ended up not. I remember at one point I created an alternate tester that could have significantly been been streamlined... Ultimately, I'm proud of my perseverance and my tester, since it underwent dozens of changes during this process. 






