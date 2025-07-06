package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseClock: ImageVector
    get() {
        if (_DatabaseClock != null) {
            return _DatabaseClock!!
        }
        _DatabaseClock = ImageVector.Builder(
            name = "DatabaseClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15f, 17f)
                verticalLineTo(12f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                moveTo(23f, 16f)
                curveTo(23f, 19.87f, 19.87f, 23f, 16f, 23f)
                curveTo(13.61f, 23f, 11.5f, 21.8f, 10.25f, 20f)
                curveTo(6.18f, 19.79f, 3f, 18.08f, 3f, 16f)
                verticalLineTo(13f)
                curveTo(3f, 14.88f, 5.58f, 16.44f, 9.06f, 16.88f)
                curveTo(9.03f, 16.59f, 9f, 16.3f, 9f, 16f)
                curveTo(9f, 15.62f, 9.04f, 15.25f, 9.1f, 14.88f)
                curveTo(5.6f, 14.45f, 3f, 12.88f, 3f, 11f)
                verticalLineTo(8f)
                curveTo(3f, 10.09f, 6.2f, 11.8f, 10.27f, 12f)
                curveTo(10.87f, 11.14f, 11.64f, 10.44f, 12.53f, 9.93f)
                curveTo(12.04f, 9.97f, 11.5f, 10f, 11f, 10f)
                curveTo(6.58f, 10f, 3f, 8.21f, 3f, 6f)
                reflectiveCurveTo(6.58f, 2f, 11f, 2f)
                reflectiveCurveTo(19f, 3.79f, 19f, 6f)
                curveTo(19f, 7.2f, 17.93f, 8.28f, 16.25f, 9f)
                curveTo(17f, 9.04f, 17.75f, 9.19f, 18.44f, 9.45f)
                curveTo(18.79f, 9f, 19f, 8.5f, 19f, 8f)
                verticalLineTo(9.68f)
                curveTo(21.36f, 10.81f, 23f, 13.21f, 23f, 16f)
                moveTo(21f, 16f)
                curveTo(21f, 13.24f, 18.76f, 11f, 16f, 11f)
                reflectiveCurveTo(11f, 13.24f, 11f, 16f)
                reflectiveCurveTo(13.24f, 21f, 16f, 21f)
                reflectiveCurveTo(21f, 18.76f, 21f, 16f)
                close()
            }
        }.build()

        return _DatabaseClock!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseClock: ImageVector? = null
