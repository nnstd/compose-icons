package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoogleAnalytics: ImageVector
    get() {
        if (_GoogleAnalytics != null) {
            return _GoogleAnalytics!!
        }
        _GoogleAnalytics = ImageVector.Builder(
            name = "GoogleAnalytics",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.86f, 4.39f)
                verticalLineTo(19.39f)
                curveTo(15.86f, 21.06f, 17f, 22f, 18.25f, 22f)
                curveTo(19.39f, 22f, 20.64f, 21.21f, 20.64f, 19.39f)
                verticalLineTo(4.5f)
                curveTo(20.64f, 2.96f, 19.5f, 2f, 18.25f, 2f)
                reflectiveCurveTo(15.86f, 3.06f, 15.86f, 4.39f)
                moveTo(9.61f, 12f)
                verticalLineTo(19.39f)
                curveTo(9.61f, 21.07f, 10.77f, 22f, 12f, 22f)
                curveTo(13.14f, 22f, 14.39f, 21.21f, 14.39f, 19.39f)
                verticalLineTo(12.11f)
                curveTo(14.39f, 10.57f, 13.25f, 9.61f, 12f, 9.61f)
                reflectiveCurveTo(9.61f, 10.67f, 9.61f, 12f)
                moveTo(5.75f, 17.23f)
                curveTo(7.07f, 17.23f, 8.14f, 18.3f, 8.14f, 19.61f)
                curveTo(8.14f, 20.93f, 7.07f, 22f, 5.75f, 22f)
                reflectiveCurveTo(3.36f, 20.93f, 3.36f, 19.61f)
                curveTo(3.36f, 18.3f, 4.43f, 17.23f, 5.75f, 17.23f)
                close()
            }
        }.build()

        return _GoogleAnalytics!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleAnalytics: ImageVector? = null
