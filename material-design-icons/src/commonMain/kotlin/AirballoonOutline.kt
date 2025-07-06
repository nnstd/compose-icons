package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AirballoonOutline: ImageVector
    get() {
        if (_AirballoonOutline != null) {
            return _AirballoonOutline!!
        }
        _AirballoonOutline = ImageVector.Builder(
            name = "AirballoonOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 23f)
                curveTo(9.9f, 23f, 9f, 22.1f, 9f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                curveTo(15f, 22.1f, 14.1f, 23f, 13f, 23f)
                horizontalLineTo(11f)
                moveTo(12f, 3f)
                curveTo(12.28f, 3f, 12.55f, 3f, 12.81f, 3.05f)
                curveTo(13.42f, 4.22f, 14f, 6.26f, 14f, 9f)
                curveTo(14f, 11.1f, 13f, 16f, 13f, 16f)
                horizontalLineTo(11f)
                curveTo(11f, 16f, 10f, 11.1f, 10f, 9f)
                curveTo(10f, 6.26f, 10.58f, 4.22f, 11.19f, 3.05f)
                curveTo(11.45f, 3f, 11.72f, 3f, 12f, 3f)
                moveTo(12f, 1f)
                curveTo(11.29f, 1f, 10.61f, 1.09f, 9.95f, 1.26f)
                curveTo(8.78f, 2.83f, 8f, 5.71f, 8f, 9f)
                curveTo(8f, 11.28f, 8.38f, 13.37f, 9f, 16f)
                curveTo(9f, 17.1f, 9.9f, 18f, 11f, 18f)
                horizontalLineTo(13f)
                curveTo(14.1f, 18f, 15f, 17.1f, 15f, 16f)
                curveTo(15.62f, 13.37f, 16f, 11.28f, 16f, 9f)
                curveTo(16f, 5.71f, 15.22f, 2.83f, 14.05f, 1.26f)
                curveTo(13.39f, 1.09f, 12.71f, 1f, 12f, 1f)
                moveTo(4f, 8f)
                curveTo(4f, 11.18f, 5.85f, 15.92f, 8.54f, 17.21f)
                curveTo(8f, 16.21f, 7.61f, 14.67f, 7.34f, 13f)
                curveTo(6.55f, 11.53f, 6f, 9.62f, 6f, 8f)
                curveTo(6f, 6.66f, 6.44f, 5.67f, 7.47f, 4.8f)
                curveTo(7.73f, 3.67f, 8.09f, 2.65f, 8.54f, 1.79f)
                curveTo(5.85f, 3.08f, 4f, 4.82f, 4f, 8f)
                moveTo(15.46f, 1.79f)
                curveTo(15.91f, 2.65f, 16.27f, 3.67f, 16.53f, 4.8f)
                curveTo(17.56f, 5.67f, 18f, 6.66f, 18f, 8f)
                curveTo(18f, 9.62f, 17.45f, 11.53f, 16.66f, 13f)
                curveTo(16.39f, 14.67f, 16f, 16.21f, 15.46f, 17.21f)
                curveTo(18.15f, 15.92f, 20f, 11.18f, 20f, 8f)
                reflectiveCurveTo(18.15f, 3.08f, 15.46f, 1.79f)
                close()
            }
        }.build()

        return _AirballoonOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AirballoonOutline: ImageVector? = null
