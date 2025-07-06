package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkewLess: ImageVector
    get() {
        if (_SkewLess != null) {
            return _SkewLess!!
        }
        _SkewLess = ImageVector.Builder(
            name = "SkewLess",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 11f)
                lineTo(15.41f, 20f)
                horizontalLineTo(10.5f)
                lineTo(12.59f, 11f)
                horizontalLineTo(17.5f)
                moveTo(20f, 9f)
                horizontalLineTo(11f)
                lineTo(8f, 22f)
                horizontalLineTo(17f)
                lineTo(20f, 9f)
                moveTo(4f, 6f)
                lineTo(8f, 2f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                lineTo(4f, 6f)
                close()
            }
        }.build()

        return _SkewLess!!
    }

@Suppress("ObjectPropertyName")
private var _SkewLess: ImageVector? = null
