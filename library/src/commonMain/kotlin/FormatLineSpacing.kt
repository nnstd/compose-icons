package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatLineSpacing: ImageVector
    get() {
        if (_FormatLineSpacing != null) {
            return _FormatLineSpacing!!
        }
        _FormatLineSpacing = ImageVector.Builder(
            name = "FormatLineSpacing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 13f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                moveTo(10f, 19f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                moveTo(10f, 7f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                moveTo(6f, 7f)
                horizontalLineTo(8.5f)
                lineTo(5f, 3.5f)
                lineTo(1.5f, 7f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(1.5f)
                lineTo(5f, 20.5f)
                lineTo(8.5f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _FormatLineSpacing!!
    }

@Suppress("ObjectPropertyName")
private var _FormatLineSpacing: ImageVector? = null
