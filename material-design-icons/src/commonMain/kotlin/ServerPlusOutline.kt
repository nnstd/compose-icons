package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ServerPlusOutline: ImageVector
    get() {
        if (_ServerPlusOutline != null) {
            return _ServerPlusOutline!!
        }
        _ServerPlusOutline = ImageVector.Builder(
            name = "ServerPlusOutline",
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
                moveTo(8f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _ServerPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ServerPlusOutline: ImageVector? = null
