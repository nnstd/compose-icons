package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatWrapTopBottom: ImageVector
    get() {
        if (_FormatWrapTopBottom != null) {
            return _FormatWrapTopBottom!!
        }
        _FormatWrapTopBottom = ImageVector.Builder(
            name = "FormatWrapTopBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                lineTo(17f, 17f)
                horizontalLineTo(7f)
                lineTo(12f, 7f)
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(3f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _FormatWrapTopBottom!!
    }

@Suppress("ObjectPropertyName")
private var _FormatWrapTopBottom: ImageVector? = null
