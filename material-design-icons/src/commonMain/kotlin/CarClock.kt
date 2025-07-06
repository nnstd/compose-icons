package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarClock: ImageVector
    get() {
        if (_CarClock != null) {
            return _CarClock!!
        }
        _CarClock = ImageVector.Builder(
            name = "CarClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 8f)
                curveTo(23f, 4.13f, 19.87f, 1f, 16f, 1f)
                curveTo(12.47f, 1f, 9.57f, 3.61f, 9.08f, 7f)
                horizontalLineTo(4.5f)
                curveTo(3.84f, 7f, 3.28f, 7.42f, 3.08f, 8f)
                lineTo(1f, 14f)
                verticalLineTo(22f)
                curveTo(1f, 22.55f, 1.45f, 23f, 2f, 23f)
                horizontalLineTo(3f)
                curveTo(3.55f, 23f, 4f, 22.55f, 4f, 22f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                curveTo(16f, 22.55f, 16.45f, 23f, 17f, 23f)
                horizontalLineTo(18f)
                curveTo(18.55f, 23f, 19f, 22.55f, 19f, 22f)
                verticalLineTo(14.32f)
                curveTo(21.36f, 13.19f, 23f, 10.79f, 23f, 8f)
                moveTo(4.5f, 8.5f)
                horizontalLineTo(9.03f)
                curveTo(9.15f, 10.26f, 9.92f, 11.84f, 11.11f, 13f)
                horizontalLineTo(3f)
                lineTo(4.5f, 8.5f)
                moveTo(4.5f, 18f)
                curveTo(3.67f, 18f, 3f, 17.33f, 3f, 16.5f)
                reflectiveCurveTo(3.67f, 15f, 4.5f, 15f)
                reflectiveCurveTo(6f, 15.67f, 6f, 16.5f)
                reflectiveCurveTo(5.33f, 18f, 4.5f, 18f)
                moveTo(15.5f, 18f)
                curveTo(14.67f, 18f, 14f, 17.33f, 14f, 16.5f)
                reflectiveCurveTo(14.67f, 15f, 15.5f, 15f)
                reflectiveCurveTo(17f, 15.67f, 17f, 16.5f)
                reflectiveCurveTo(16.33f, 18f, 15.5f, 18f)
                moveTo(16f, 13f)
                curveTo(14.61f, 13f, 13.44f, 12.5f, 12.47f, 11.53f)
                curveTo(11.5f, 10.56f, 11f, 9.39f, 11f, 8f)
                curveTo(11f, 6.64f, 11.5f, 5.46f, 12.47f, 4.5f)
                curveTo(13.44f, 3.5f, 14.61f, 3f, 16f, 3f)
                curveTo(17.36f, 3f, 18.54f, 3.5f, 19.5f, 4.5f)
                curveTo(20.5f, 5.46f, 21f, 6.64f, 21f, 8f)
                curveTo(21f, 9.39f, 20.5f, 10.56f, 19.5f, 11.53f)
                curveTo(18.54f, 12.5f, 17.36f, 13f, 16f, 13f)
                moveTo(16.5f, 8.25f)
                lineTo(19.36f, 9.94f)
                lineTo(18.61f, 11.16f)
                lineTo(15f, 9f)
                verticalLineTo(4f)
                horizontalLineTo(16.5f)
                verticalLineTo(8.25f)
                close()
            }
        }.build()

        return _CarClock!!
    }

@Suppress("ObjectPropertyName")
private var _CarClock: ImageVector? = null
