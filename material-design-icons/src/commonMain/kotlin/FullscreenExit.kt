package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FullscreenExit: ImageVector
    get() {
        if (_FullscreenExit != null) {
            return _FullscreenExit!!
        }
        _FullscreenExit = ImageVector.Builder(
            name = "FullscreenExit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 14f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                moveTo(5f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                moveTo(8f, 5f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                moveTo(19f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _FullscreenExit!!
    }

@Suppress("ObjectPropertyName")
private var _FullscreenExit: ImageVector? = null
