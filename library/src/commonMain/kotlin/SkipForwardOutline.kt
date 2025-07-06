package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkipForwardOutline: ImageVector
    get() {
        if (_SkipForwardOutline != null) {
            return _SkipForwardOutline!!
        }
        _SkipForwardOutline = ImageVector.Builder(
            name = "SkipForwardOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 9.83f)
                lineTo(8.17f, 12f)
                lineTo(6f, 14.17f)
                verticalLineTo(9.83f)
                moveTo(4f, 5f)
                verticalLineTo(19f)
                lineTo(11f, 12f)
                moveTo(20f, 5f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                moveTo(13f, 9.83f)
                lineTo(15.17f, 12f)
                lineTo(13f, 14.17f)
                verticalLineTo(9.83f)
                moveTo(11f, 5f)
                verticalLineTo(19f)
                lineTo(18f, 12f)
            }
        }.build()

        return _SkipForwardOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SkipForwardOutline: ImageVector? = null
