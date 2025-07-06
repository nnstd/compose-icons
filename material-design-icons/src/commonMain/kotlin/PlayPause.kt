package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlayPause: ImageVector
    get() {
        if (_PlayPause != null) {
            return _PlayPause!!
        }
        _PlayPause = ImageVector.Builder(
            name = "PlayPause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5f)
                verticalLineTo(19f)
                lineTo(11f, 12f)
                moveTo(13f, 19f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                moveTo(18f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
            }
        }.build()

        return _PlayPause!!
    }

@Suppress("ObjectPropertyName")
private var _PlayPause: ImageVector? = null
