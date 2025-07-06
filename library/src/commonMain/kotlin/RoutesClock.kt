package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RoutesClock: ImageVector
    get() {
        if (_RoutesClock != null) {
            return _RoutesClock!!
        }
        _RoutesClock = ImageVector.Builder(
            name = "RoutesClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 13f)
                horizontalLineTo(15f)
                verticalLineTo(16.69f)
                lineTo(18.19f, 18.53f)
                lineTo(18.94f, 17.23f)
                lineTo(16.5f, 15.82f)
                verticalLineTo(13f)
                moveTo(16f, 9f)
                curveTo(14.04f, 9f, 12.27f, 9.82f, 11f, 11.12f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                lineTo(19f, 5f)
                lineTo(17f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                lineTo(10f, 1f)
                lineTo(9f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                lineTo(1f, 8f)
                lineTo(3f, 10f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                curveTo(7.9f, 20f, 7f, 20.9f, 7f, 22f)
                horizontalLineTo(12.41f)
                curveTo(13.46f, 22.63f, 14.69f, 23f, 16f, 23f)
                curveTo(19.87f, 23f, 23f, 19.87f, 23f, 16f)
                reflectiveCurveTo(19.87f, 9f, 16f, 9f)
                moveTo(16f, 20.85f)
                curveTo(13.32f, 20.85f, 11.15f, 18.68f, 11.15f, 16f)
                reflectiveCurveTo(13.32f, 11.15f, 16f, 11.15f)
                reflectiveCurveTo(20.85f, 13.32f, 20.85f, 16f)
                reflectiveCurveTo(18.68f, 20.85f, 16f, 20.85f)
                close()
            }
        }.build()

        return _RoutesClock!!
    }

@Suppress("ObjectPropertyName")
private var _RoutesClock: ImageVector? = null
