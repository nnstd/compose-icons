package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WindowMaximize: ImageVector
    get() {
        if (_WindowMaximize != null) {
            return _WindowMaximize!!
        }
        _WindowMaximize = ImageVector.Builder(
            name = "WindowMaximize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                moveTo(6f, 8f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _WindowMaximize!!
    }

@Suppress("ObjectPropertyName")
private var _WindowMaximize: ImageVector? = null
