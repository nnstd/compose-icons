package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ServerOutline: ImageVector
    get() {
        if (_ServerOutline != null) {
            return _ServerOutline!!
        }
        _ServerOutline = ImageVector.Builder(
            name = "ServerOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4.6f)
                verticalLineTo(9.4f)
                curveTo(2f, 10.3f, 2.5f, 11f, 3.2f, 11f)
                horizontalLineTo(20.9f)
                curveTo(21.5f, 11f, 22.1f, 10.3f, 22.1f, 9.4f)
                verticalLineTo(4.6f)
                curveTo(22f, 3.7f, 21.5f, 3f, 20.8f, 3f)
                horizontalLineTo(3.2f)
                curveTo(2.5f, 3f, 2f, 3.7f, 2f, 4.6f)
                moveTo(10f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                moveTo(5f, 8f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                moveTo(20f, 9f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                moveTo(2f, 14.6f)
                verticalLineTo(19.4f)
                curveTo(2f, 20.3f, 2.5f, 21f, 3.2f, 21f)
                horizontalLineTo(20.9f)
                curveTo(21.5f, 21f, 22.1f, 20.3f, 22.1f, 19.4f)
                verticalLineTo(14.6f)
                curveTo(22.1f, 13.7f, 21.6f, 13f, 20.9f, 13f)
                horizontalLineTo(3.2f)
                curveTo(2.5f, 13f, 2f, 13.7f, 2f, 14.6f)
                moveTo(10f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                moveTo(5f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                moveTo(20f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _ServerOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ServerOutline: ImageVector? = null
