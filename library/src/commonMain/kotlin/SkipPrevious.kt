package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkipPrevious: ImageVector
    get() {
        if (_SkipPrevious != null) {
            return _SkipPrevious!!
        }
        _SkipPrevious = ImageVector.Builder(
            name = "SkipPrevious",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 18f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                moveTo(9.5f, 12f)
                lineTo(18f, 6f)
                verticalLineTo(18f)
                lineTo(9.5f, 12f)
                close()
            }
        }.build()

        return _SkipPrevious!!
    }

@Suppress("ObjectPropertyName")
private var _SkipPrevious: ImageVector? = null
