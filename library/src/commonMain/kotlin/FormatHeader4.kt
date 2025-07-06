package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatHeader4: ImageVector
    get() {
        if (_FormatHeader4 != null) {
            return _FormatHeader4!!
        }
        _FormatHeader4 = ImageVector.Builder(
            name = "FormatHeader4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                moveTo(18f, 18f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                lineTo(18f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                moveTo(18f, 11f)
                verticalLineTo(7.42f)
                lineTo(15.45f, 11f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _FormatHeader4!!
    }

@Suppress("ObjectPropertyName")
private var _FormatHeader4: ImageVector? = null
