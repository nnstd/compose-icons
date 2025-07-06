package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbQuestion: ImageVector
    get() {
        if (_LightbulbQuestion != null) {
            return _LightbulbQuestion!!
        }
        _LightbulbQuestion = ImageVector.Builder(
            name = "LightbulbQuestion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 2f)
                curveTo(4.1f, 2f, 1f, 5.1f, 1f, 9f)
                curveTo(1f, 11.4f, 2.2f, 13.5f, 4f, 14.7f)
                verticalLineTo(17f)
                curveTo(4f, 17.6f, 4.4f, 18f, 5f, 18f)
                horizontalLineTo(11f)
                curveTo(11.6f, 18f, 12f, 17.6f, 12f, 17f)
                verticalLineTo(14.7f)
                curveTo(13.8f, 13.4f, 15f, 11.3f, 15f, 9f)
                curveTo(15f, 5.1f, 11.9f, 2f, 8f, 2f)
                moveTo(5f, 21f)
                curveTo(5f, 21.6f, 5.4f, 22f, 6f, 22f)
                horizontalLineTo(10f)
                curveTo(10.6f, 22f, 11f, 21.6f, 11f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                moveTo(20.5f, 14.5f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                verticalLineTo(14.5f)
                horizontalLineTo(20.5f)
                moveTo(18.5f, 9.5f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                curveTo(17f, 7.3f, 18.3f, 6f, 20f, 6f)
                reflectiveCurveTo(23f, 7.3f, 23f, 9f)
                curveTo(23f, 10f, 22.5f, 10.9f, 21.7f, 11.4f)
                lineTo(21.4f, 11.6f)
                curveTo(20.8f, 12f, 20.5f, 12.6f, 20.5f, 13.3f)
                verticalLineTo(13.5f)
                horizontalLineTo(19f)
                verticalLineTo(13.3f)
                curveTo(19f, 12.1f, 19.6f, 11f, 20.6f, 10.4f)
                lineTo(20.9f, 10.2f)
                curveTo(21.3f, 9.9f, 21.5f, 9.5f, 21.5f, 9f)
                curveTo(21.5f, 8.2f, 20.8f, 7.5f, 20f, 7.5f)
                reflectiveCurveTo(18.5f, 8.2f, 18.5f, 9f)
                verticalLineTo(9.5f)
                close()
            }
        }.build()

        return _LightbulbQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbQuestion: ImageVector? = null
