package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkipPreviousOutline: ImageVector
    get() {
        if (_SkipPreviousOutline != null) {
            return _SkipPreviousOutline!!
        }
        _SkipPreviousOutline = ImageVector.Builder(
            name = "SkipPreviousOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                moveTo(9.5f, 12f)
                lineTo(18f, 18f)
                verticalLineTo(6f)
                moveTo(16f, 14.14f)
                lineTo(12.97f, 12f)
                lineTo(16f, 9.86f)
                verticalLineTo(14.14f)
                close()
            }
        }.build()

        return _SkipPreviousOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SkipPreviousOutline: ImageVector? = null
