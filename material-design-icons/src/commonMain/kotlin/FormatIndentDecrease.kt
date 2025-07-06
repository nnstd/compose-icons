package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatIndentDecrease: ImageVector
    get() {
        if (_FormatIndentDecrease != null) {
            return _FormatIndentDecrease!!
        }
        _FormatIndentDecrease = ImageVector.Builder(
            name = "FormatIndentDecrease",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                moveTo(11f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                moveTo(3f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                moveTo(3f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                moveTo(3f, 12f)
                lineTo(7f, 16f)
                verticalLineTo(8f)
                moveTo(11f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _FormatIndentDecrease!!
    }

@Suppress("ObjectPropertyName")
private var _FormatIndentDecrease: ImageVector? = null
