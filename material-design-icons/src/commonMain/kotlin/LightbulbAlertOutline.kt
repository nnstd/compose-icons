package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbAlertOutline: ImageVector
    get() {
        if (_LightbulbAlertOutline != null) {
            return _LightbulbAlertOutline!!
        }
        _LightbulbAlertOutline = ImageVector.Builder(
            name = "LightbulbAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                curveTo(13.9f, 2f, 17f, 5.1f, 17f, 9f)
                curveTo(17f, 11.4f, 15.8f, 13.5f, 14f, 14.7f)
                verticalLineTo(17f)
                curveTo(14f, 17.6f, 13.6f, 18f, 13f, 18f)
                horizontalLineTo(7f)
                curveTo(6.4f, 18f, 6f, 17.6f, 6f, 17f)
                verticalLineTo(14.7f)
                curveTo(4.2f, 13.5f, 3f, 11.4f, 3f, 9f)
                curveTo(3f, 5.1f, 6.1f, 2f, 10f, 2f)
                moveTo(7f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                curveTo(13f, 21.6f, 12.6f, 22f, 12f, 22f)
                horizontalLineTo(8f)
                curveTo(7.4f, 22f, 7f, 21.6f, 7f, 21f)
                moveTo(10f, 4f)
                curveTo(7.2f, 4f, 5f, 6.2f, 5f, 9f)
                curveTo(5f, 11.1f, 6.2f, 12.8f, 8f, 13.6f)
                verticalLineTo(16f)
                horizontalLineTo(12f)
                verticalLineTo(13.6f)
                curveTo(13.8f, 12.8f, 15f, 11.1f, 15f, 9f)
                curveTo(15f, 6.2f, 12.8f, 4f, 10f, 4f)
                moveTo(19f, 12f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                moveTo(19f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _LightbulbAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbAlertOutline: ImageVector? = null
