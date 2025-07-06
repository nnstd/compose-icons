package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkipForward: ImageVector
    get() {
        if (_SkipForward != null) {
            return _SkipForward!!
        }
        _SkipForward = ImageVector.Builder(
            name = "SkipForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 5f)
                verticalLineTo(19f)
                lineTo(11f, 12f)
                moveTo(18f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                moveTo(11f, 5f)
                verticalLineTo(19f)
                lineTo(18f, 12f)
            }
        }.build()

        return _SkipForward!!
    }

@Suppress("ObjectPropertyName")
private var _SkipForward: ImageVector? = null
