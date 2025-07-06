package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkipBackward: ImageVector
    get() {
        if (_SkipBackward != null) {
            return _SkipBackward!!
        }
        _SkipBackward = ImageVector.Builder(
            name = "SkipBackward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 5f)
                verticalLineTo(19f)
                lineTo(13f, 12f)
                moveTo(6f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                moveTo(13f, 5f)
                verticalLineTo(19f)
                lineTo(6f, 12f)
            }
        }.build()

        return _SkipBackward!!
    }

@Suppress("ObjectPropertyName")
private var _SkipBackward: ImageVector? = null
