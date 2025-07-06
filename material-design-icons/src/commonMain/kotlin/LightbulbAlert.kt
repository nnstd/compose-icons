package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbAlert: ImageVector
    get() {
        if (_LightbulbAlert != null) {
            return _LightbulbAlert!!
        }
        _LightbulbAlert = ImageVector.Builder(
            name = "LightbulbAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                curveTo(6.1f, 2f, 3f, 5.1f, 3f, 9f)
                curveTo(3f, 11.4f, 4.2f, 13.5f, 6f, 14.7f)
                verticalLineTo(17f)
                curveTo(6f, 17.6f, 6.4f, 18f, 7f, 18f)
                horizontalLineTo(13f)
                curveTo(13.6f, 18f, 14f, 17.6f, 14f, 17f)
                verticalLineTo(14.7f)
                curveTo(15.8f, 13.4f, 17f, 11.3f, 17f, 9f)
                curveTo(17f, 5.1f, 13.9f, 2f, 10f, 2f)
                moveTo(7f, 21f)
                curveTo(7f, 21.6f, 7.4f, 22f, 8f, 22f)
                horizontalLineTo(12f)
                curveTo(12.6f, 22f, 13f, 21.6f, 13f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
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

        return _LightbulbAlert!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbAlert: ImageVector? = null
