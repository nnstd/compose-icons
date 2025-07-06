package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanGreetingProximity: ImageVector
    get() {
        if (_HumanGreetingProximity != null) {
            return _HumanGreetingProximity!!
        }
        _HumanGreetingProximity = ImageVector.Builder(
            name = "HumanGreetingProximity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 14f)
                horizontalLineTo(9f)
                curveTo(9f, 9.03f, 13.03f, 5f, 18f, 5f)
                verticalLineTo(7f)
                curveTo(14.13f, 7f, 11f, 10.13f, 11f, 14f)
                moveTo(18f, 11f)
                verticalLineTo(9f)
                curveTo(15.24f, 9f, 13f, 11.24f, 13f, 14f)
                horizontalLineTo(15f)
                curveTo(15f, 12.34f, 16.34f, 11f, 18f, 11f)
                moveTo(7f, 4f)
                curveTo(7f, 2.89f, 6.11f, 2f, 5f, 2f)
                reflectiveCurveTo(3f, 2.89f, 3f, 4f)
                reflectiveCurveTo(3.89f, 6f, 5f, 6f)
                reflectiveCurveTo(7f, 5.11f, 7f, 4f)
                moveTo(11.45f, 4.5f)
                horizontalLineTo(9.45f)
                curveTo(9.21f, 5.92f, 8f, 7f, 6.5f, 7f)
                horizontalLineTo(3.5f)
                curveTo(2.67f, 7f, 2f, 7.67f, 2f, 8.5f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(8.74f)
                curveTo(9.86f, 8.15f, 11.25f, 6.5f, 11.45f, 4.5f)
                moveTo(19f, 17f)
                curveTo(20.11f, 17f, 21f, 16.11f, 21f, 15f)
                reflectiveCurveTo(20.11f, 13f, 19f, 13f)
                reflectiveCurveTo(17f, 13.89f, 17f, 15f)
                reflectiveCurveTo(17.89f, 17f, 19f, 17f)
                moveTo(20.5f, 18f)
                horizontalLineTo(17.5f)
                curveTo(16f, 18f, 14.79f, 16.92f, 14.55f, 15.5f)
                horizontalLineTo(12.55f)
                curveTo(12.75f, 17.5f, 14.14f, 19.15f, 16f, 19.74f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(19.5f)
                curveTo(22f, 18.67f, 21.33f, 18f, 20.5f, 18f)
                close()
            }
        }.build()

        return _HumanGreetingProximity!!
    }

@Suppress("ObjectPropertyName")
private var _HumanGreetingProximity: ImageVector? = null
