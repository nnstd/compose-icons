package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkipNext: ImageVector
    get() {
        if (_SkipNext != null) {
            return _SkipNext!!
        }
        _SkipNext = ImageVector.Builder(
            name = "SkipNext",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 18f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                moveTo(6f, 18f)
                lineTo(14.5f, 12f)
                lineTo(6f, 6f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _SkipNext!!
    }

@Suppress("ObjectPropertyName")
private var _SkipNext: ImageVector? = null
