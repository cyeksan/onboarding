# Jetpack Compose Onboarding Library

https://user-images.githubusercontent.com/34041050/152655883-f41319c9-7339-4500-aea2-5bc7cc966847.mp4

# Implementation
1. Add the dependency to build.gradle (app-level):

```kotlin
implementation 'com.github.cyeksan:onboarding:1.1.0'
```
2. Add jitpack.io maven to settings.gradle:
```kotlin
pluginManagement {
    repositories {
        ..
        maven { url 'https://jitpack.io' }
    }
}
dependencyResolutionManagement {
    repositories {
        ..
        maven { url 'https://jitpack.io' }
    }
}
```
# How to use:
```kotlin
OnboardingScreen(
	imageIdList = imageIdList,
	navController = navController,
	lifecycleCoroutineScope = lifecycleScope,
	pageNum = pageNum, // It must be between 3 and 5 (both inclusive)
	titleList = titleList,
	descriptionList = descriptionList,
	skipTo = Screen.HomeScreen.route,
	properties = OnboardingProperties(
		titleColorList = titleColorList,
		descriptionColorList = descriptionColorList,
		backgroundColorStartList = backgroundColorStartList,
		backgroundColorEndList = backgroundColorEndList,
		buttonColor = Color.White,
		selectedDotColor = Color.White,
		unselectedDotColor = UnselectedDot,
		imageContentScale = ContentScale.Crop,
		titleFontSize = 24.sp,
		descriptionFontSize = 16.sp,
		titleFontFamily = FontFamily.Default,
		descriptionFontFamily = FontFamily.Default,
		skipButtonName = "SKIP",
		nextButtonName = "NEXT",
		nextArrowIconDrawableId = R.drawable.next_arrow)
```

# Params
| Name | Description |
| --- | --- |
| navController | common navController between onboarding and the screen transitioned (e.g. home page) |
| lifecycleCoroutineScope | lifecycleScope - CoroutineScope tied to this LifecycleOwner's Lifecycle |
| pageNum | Onboarding page number. It must be between 3 and 5 (both inclusive) |
| imageIdList | Image id list of the main images on the onboarding pages. You can set the ith item to 0 if you do not want image at the ith page |
| titleList | Title texts of the onboarding pages |
| descriptionList | Description texts on the onboarding pages |
| skipTo | The route string that onboarding screen will end up with (in the end or with Skip Button click) |

# Params of Onboarding Properties
| Name | Description | Default Value
| --- | --- | --- |
| buttonColor | Color of Skip and Next Buttons | DarkGray |
| selectedDotColor | Color of dot of the selected item | DarkGray |
| unselectedDotColor | Color of dot of the unselected item | Gray |
| imageContentScale | Content scale param of main image on the onboarding pages | ContentScale.Crop |
| titleFontSize | Font size of title on the onboarding pages | 24sp |
| descriptionFontSize | Font size of description on the onboarding pages | 16sp |
| titleFontFamily | Font family of title on the onboarding pages | FontFamily.Default |
| descriptionFontFamily | Font family of description on the onboarding pages | FontFamily.Default |
| skipButtonName | Text of the Skip button (at left). You can localize text of the Skip Button | SKIP |
| nextButtonName | Text of the Next button (at right). You can localize text of the Next Button | NEXT |
| nextArrowIconDrawableId | Icon item next to the Next button. You can add an icon to Next button, like arrow | 0 |
| titleColorList | List of title color on each page | DarkGray (all) |
| descriptionColorList | List of description color on each page | DarkGray (all) |
| backgroundColorStartList | Start color for a gradient background for each page | White (all)
| backgroundColorEndList | End color for a gradient background for each page | White (all)
