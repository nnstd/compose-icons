package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbOn20: ImageVector
    get() {
        if (_LightbulbOn20 != null) {
            return _LightbulbOn20!!
        }
        _LightbulbOn20 = ImageVector.Builder(
            name = "LightbulbOn20",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(1f)
                verticalLineTo(11f)
                moveTo(4.9f, 3.5f)
                lineTo(3.5f, 4.9f)
                lineTo(5.6f, 7f)
                lineTo(7f, 5.6f)
                lineTo(4.9f, 3.5f)
                moveTo(13f, 1f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                moveTo(20f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                moveTo(10f, 22f)
                curveTo(10f, 22.6f, 10.4f, 23f, 11f, 23f)
                horizontalLineTo(13f)
                curveTo(13.6f, 23f, 14f, 22.6f, 14f, 22f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                verticalLineTo(22f)
                moveTo(19.1f, 3.5f)
                lineTo(17f, 5.6f)
                lineTo(18.4f, 7f)
                lineTo(20.5f, 4.9f)
                lineTo(19.1f, 3.5f)
                moveTo(18f, 12f)
                curveTo(18f, 14.2f, 16.8f, 16.2f, 15f, 17.2f)
                verticalLineTo(19f)
                curveTo(15f, 19.6f, 14.6f, 20f, 14f, 20f)
                horizontalLineTo(10f)
                curveTo(9.4f, 20f, 9f, 19.6f, 9f, 19f)
                verticalLineTo(17.2f)
                curveTo(7.2f, 16.2f, 6f, 14.2f, 6f, 12f)
                curveTo(6f, 8.7f, 8.7f, 6f, 12f, 6f)
                reflectiveCurveTo(18f, 8.7f, 18f, 12f)
                moveTo(16f, 12f)
                curveTo(16f, 9.79f, 14.21f, 8f, 12f, 8f)
                reflectiveCurveTo(8f, 9.79f, 8f, 12f)
                reflectiveCurveTo(9.79f, 16f, 12f, 16f)
                reflectiveCurveTo(16f, 14.21f, 16f, 12f)
                close()
            }
        }.build()

        return _LightbulbOn20!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbOn20: ImageVector? = null
