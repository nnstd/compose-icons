package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatIndentIncrease: ImageVector
    get() {
        if (_FormatIndentIncrease != null) {
            return _FormatIndentIncrease!!
        }
        _FormatIndentIncrease = ImageVector.Builder(
            name = "FormatIndentIncrease",
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
                moveTo(11f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                moveTo(3f, 8f)
                verticalLineTo(16f)
                lineTo(7f, 12f)
                moveTo(3f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _FormatIndentIncrease!!
    }

@Suppress("ObjectPropertyName")
private var _FormatIndentIncrease: ImageVector? = null
