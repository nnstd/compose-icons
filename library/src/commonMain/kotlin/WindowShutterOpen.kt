package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WindowShutterOpen: ImageVector
    get() {
        if (_WindowShutterOpen != null) {
            return _WindowShutterOpen!!
        }
        _WindowShutterOpen = ImageVector.Builder(
            name = "WindowShutterOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                horizontalLineTo(21f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                moveTo(8f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _WindowShutterOpen!!
    }

@Suppress("ObjectPropertyName")
private var _WindowShutterOpen: ImageVector? = null
