package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MouseRightClickOutline: ImageVector
    get() {
        if (_MouseRightClickOutline != null) {
            return _MouseRightClickOutline!!
        }
        _MouseRightClickOutline = ImageVector.Builder(
            name = "MouseRightClickOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                verticalLineTo(1.07f)
                curveTo(16.94f, 1.56f, 20f, 4.92f, 20f, 9f)
                horizontalLineTo(13f)
                moveTo(11f, 9f)
                verticalLineTo(1.07f)
                curveTo(10.3f, 1.16f, 9.63f, 1.33f, 9f, 1.59f)
                curveTo(6.67f, 2.53f, 4.89f, 4.53f, 4.25f, 7f)
                curveTo(4.09f, 7.64f, 4f, 8.31f, 4f, 9f)
                horizontalLineTo(11f)
                moveTo(6.34f, 7f)
                curveTo(6.82f, 5.65f, 7.78f, 4.5f, 9f, 3.81f)
                verticalLineTo(7f)
                horizontalLineTo(6.34f)
                moveTo(6f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                curveTo(18f, 16.59f, 17.37f, 18.12f, 16.24f, 19.24f)
                curveTo(15.12f, 20.37f, 13.59f, 21f, 12f, 21f)
                curveTo(10.41f, 21f, 8.88f, 20.37f, 7.76f, 19.24f)
                curveTo(6.63f, 18.12f, 6f, 16.59f, 6f, 15f)
                moveTo(4f, 15f)
                curveTo(4f, 17.12f, 4.84f, 19.16f, 6.34f, 20.66f)
                curveTo(7.84f, 22.16f, 9.88f, 23f, 12f, 23f)
                curveTo(14.12f, 23f, 16.16f, 22.16f, 17.66f, 20.66f)
                curveTo(19.16f, 19.16f, 20f, 17.12f, 20f, 15f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _MouseRightClickOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MouseRightClickOutline: ImageVector? = null
