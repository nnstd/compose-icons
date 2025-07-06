package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbOn60: ImageVector
    get() {
        if (_LightbulbOn60 != null) {
            return _LightbulbOn60!!
        }
        _LightbulbOn60 = ImageVector.Builder(
            name = "LightbulbOn60",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 21f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                curveTo(14f, 22.6f, 13.6f, 23f, 13f, 23f)
                horizontalLineTo(11f)
                curveTo(10.4f, 23f, 10f, 22.6f, 10f, 22f)
                verticalLineTo(21f)
                moveTo(1f, 13f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
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
                moveTo(8f, 12f)
                horizontalLineTo(16f)
                curveTo(16f, 9.79f, 14.21f, 8f, 12f, 8f)
                reflectiveCurveTo(8f, 9.79f, 8f, 12f)
                moveTo(19.1f, 3.5f)
                lineTo(17f, 5.6f)
                lineTo(18.4f, 7f)
                lineTo(20.5f, 4.9f)
                lineTo(19.1f, 3.5f)
                close()
            }
        }.build()

        return _LightbulbOn60!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbOn60: ImageVector? = null
