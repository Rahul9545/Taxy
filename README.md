# Taxy
Taxy app create in jetpack composed.
day 1: Splash screen
day 2 : Login screen
day 3 : Signup screen
day 4 : Forgot screen
day 5 : Custom Toolbar screen - dynamic re-usable custom toolbar used every screen.
day 6 : Home Screen - bottom navigation, drawer navigation, tab layout, floating action button 
# bottom navigation :
** issue 1: bottom navigation tab not clicked and not open any action screen **
ans: issue solved -

This behaviour is due to the creation of several navigation controllers along the composable hierarchy. You are creating 3 NavHostController objects in your tree but you should create only one at the very top of the hierarchy instead in order to syncronize all of the composables and the screens in the navigation tree.

These 3 controllers I'm mentioning are: one passed as parameter in DashboardScreen, and the two that are being created inside NavigationGraph and BottomNavigation composables.

When you click on a botton nav item, the bottom nav bar is referencing to the latest navController which is not connected to the other 2 nav controllers. That's why the error says you are trying to setGraph() before getGraph(), because there is no such NavHost configured with the same navController you are using in the Bottom Navigation Bar.

In order to fix this problem, just pass the DashboardScreen parameter to both of the 2 composables NavigationGraph and BottomNavigation as a parameter, and get rid off the other 2 navController objects created inside the inner two composables.
val navClicked = rememberNavController()
Scaffold (
bottomBar = {
BottomAppBar {
BottomNavigation(navClicked)
}
}
) {
NavigationGraph(navClicked)
}

# Drawer Navigation on dashboard screen


