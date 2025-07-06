package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkipBackwardOutline: ImageVector
    get() {
        if (_SkipBackwardOutline != null) {
            return _SkipBackwardOutline!!
        }
        _SkipBackwardOutline = ImageVector.Builder(
            name = "SkipBackwardOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14.17f)
                lineTo(15.83f, 12f)
                lineTo(18f, 9.83f)
                verticalLineTo(14.17f)
                moveTo(20f, 19f)
                verticalLineTo(5f)
                lineTo(13f, 12f)
                moveTo(4f, 19f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                moveTo(11f, 14.17f)
                lineTo(8.83f, 12f)
                lineTo(11f, 9.83f)
                verticalLineTo(14.17f)
                moveTo(13f, 19f)
                verticalLineTo(5f)
                lineTo(6f, 12f)
            }
        }.build()

        return _SkipBackwardOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SkipBackwardOutline: ImageVector? = null
