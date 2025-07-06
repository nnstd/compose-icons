package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarSelect: ImageVector
    get() {
        if (_CarSelect != null) {
            return _CarSelect!!
        }
        _CarSelect = ImageVector.Builder(
            name = "CarSelect",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 13f)
                lineTo(6.5f, 8.5f)
                horizontalLineTo(17.5f)
                lineTo(19f, 13f)
                moveTo(17.5f, 18f)
                curveTo(16.7f, 18f, 16f, 17.3f, 16f, 16.5f)
                reflectiveCurveTo(16.7f, 15f, 17.5f, 15f)
                reflectiveCurveTo(19f, 15.7f, 19f, 16.5f)
                reflectiveCurveTo(18.3f, 18f, 17.5f, 18f)
                moveTo(6.5f, 18f)
                curveTo(5.7f, 18f, 5f, 17.3f, 5f, 16.5f)
                reflectiveCurveTo(5.7f, 15f, 6.5f, 15f)
                reflectiveCurveTo(8f, 15.7f, 8f, 16.5f)
                reflectiveCurveTo(7.3f, 18f, 6.5f, 18f)
                moveTo(18.9f, 8f)
                curveTo(18.7f, 7.4f, 18.1f, 7f, 17.5f, 7f)
                horizontalLineTo(6.5f)
                curveTo(5.8f, 7f, 5.3f, 7.4f, 5.1f, 8f)
                lineTo(3f, 14f)
                verticalLineTo(22f)
                curveTo(3f, 22.6f, 3.4f, 23f, 4f, 23f)
                horizontalLineTo(5f)
                curveTo(5.6f, 23f, 6f, 22.6f, 6f, 22f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                curveTo(18f, 22.6f, 18.4f, 23f, 19f, 23f)
                horizontalLineTo(20f)
                curveTo(20.6f, 23f, 21f, 22.6f, 21f, 22f)
                verticalLineTo(14f)
                moveTo(8f, 1f)
                lineTo(12f, 5.5f)
                lineTo(16f, 1f)
                close()
            }
        }.build()

        return _CarSelect!!
    }

@Suppress("ObjectPropertyName")
private var _CarSelect: ImageVector? = null
