package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AirplaneSearch: ImageVector
    get() {
        if (_AirplaneSearch != null) {
            return _AirplaneSearch!!
        }
        _AirplaneSearch = ImageVector.Builder(
            name = "AirplaneSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.55f, 9.63f)
                lineTo(10.9f, 12.22f)
                curveTo(11.5f, 11.17f, 12.41f, 10.31f, 13.5f, 9.74f)
                lineTo(12.73f, 6.45f)
                lineTo(16.62f, 2.56f)
                curveTo(17.2f, 1.97f, 17.2f, 1f, 16.62f, 0.438f)
                reflectiveCurveTo(15.08f, -0.148f, 14.5f, 0.438f)
                lineTo(10.61f, 4.33f)
                lineTo(1.41f, 2.21f)
                lineTo(0f, 3.62f)
                lineTo(7.43f, 7.5f)
                lineTo(3.54f, 11.4f)
                lineTo(1.06f, 11.05f)
                lineTo(0f, 12.11f)
                lineTo(3.18f, 13.87f)
                lineTo(4.95f, 17.06f)
                lineTo(6f, 16f)
                lineTo(5.66f, 13.5f)
                lineTo(9.55f, 9.63f)
                moveTo(16.5f, 11f)
                curveTo(19f, 11f, 21f, 13f, 21f, 15.5f)
                curveTo(21f, 16.38f, 20.75f, 17.21f, 20.31f, 17.9f)
                lineTo(23.39f, 21f)
                lineTo(22f, 22.39f)
                lineTo(18.88f, 19.32f)
                curveTo(18.19f, 19.75f, 17.37f, 20f, 16.5f, 20f)
                curveTo(14f, 20f, 12f, 18f, 12f, 15.5f)
                reflectiveCurveTo(14f, 11f, 16.5f, 11f)
                moveTo(16.5f, 13f)
                curveTo(15.12f, 13f, 14f, 14.12f, 14f, 15.5f)
                reflectiveCurveTo(15.12f, 18f, 16.5f, 18f)
                reflectiveCurveTo(19f, 16.88f, 19f, 15.5f)
                reflectiveCurveTo(17.88f, 13f, 16.5f, 13f)
            }
        }.build()

        return _AirplaneSearch!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneSearch: ImageVector? = null
