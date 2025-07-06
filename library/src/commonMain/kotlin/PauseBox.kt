package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PauseBox: ImageVector
    get() {
        if (_PauseBox != null) {
            return _PauseBox!!
        }
        _PauseBox = ImageVector.Builder(
            name = "PauseBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                moveTo(11f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                moveTo(15f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _PauseBox!!
    }

@Suppress("ObjectPropertyName")
private var _PauseBox: ImageVector? = null
