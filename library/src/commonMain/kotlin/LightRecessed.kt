package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightRecessed: ImageVector
    get() {
        if (_LightRecessed != null) {
            return _LightRecessed!!
        }
        _LightRecessed = ImageVector.Builder(
            name = "LightRecessed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                curveTo(6.5f, 7f, 2f, 9.46f, 2f, 12.5f)
                reflectiveCurveTo(6.5f, 18f, 12f, 18f)
                reflectiveCurveTo(22f, 15.54f, 22f, 12.5f)
                reflectiveCurveTo(17.5f, 7f, 12f, 7f)
                moveTo(16.5f, 10f)
                curveTo(16.5f, 10.4f, 14.9f, 11.54f, 12f, 11.54f)
                reflectiveCurveTo(7.5f, 10.4f, 7.5f, 10f)
                curveTo(7.5f, 9.91f, 7.65f, 9.74f, 7.9f, 9.55f)
                curveTo(9.06f, 9.21f, 10.44f, 9f, 12f, 9f)
                reflectiveCurveTo(14.94f, 9.21f, 16.1f, 9.55f)
                curveTo(16.35f, 9.74f, 16.5f, 9.91f, 16.5f, 10f)
                moveTo(12f, 16f)
                curveTo(7.12f, 16f, 4f, 13.93f, 4f, 12.5f)
                curveTo(4f, 11.81f, 4.73f, 11f, 6.03f, 10.29f)
                curveTo(6.3f, 11.83f, 8.87f, 13.04f, 12f, 13.04f)
                curveTo(15.13f, 13.04f, 17.7f, 11.83f, 17.97f, 10.29f)
                curveTo(19.27f, 11f, 20f, 11.81f, 20f, 12.5f)
                curveTo(20f, 13.93f, 16.88f, 16f, 12f, 16f)
                close()
            }
        }.build()

        return _LightRecessed!!
    }

@Suppress("ObjectPropertyName")
private var _LightRecessed: ImageVector? = null
