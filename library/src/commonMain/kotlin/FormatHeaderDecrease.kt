package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatHeaderDecrease: ImageVector
    get() {
        if (_FormatHeaderDecrease != null) {
            return _FormatHeaderDecrease!!
        }
        _FormatHeaderDecrease = ImageVector.Builder(
            name = "FormatHeaderDecrease",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                moveTo(20.42f, 7.41f)
                lineTo(16.83f, 11f)
                lineTo(20.42f, 14.59f)
                lineTo(19f, 16f)
                lineTo(14f, 11f)
                lineTo(19f, 6f)
                lineTo(20.42f, 7.41f)
                close()
            }
        }.build()

        return _FormatHeaderDecrease!!
    }

@Suppress("ObjectPropertyName")
private var _FormatHeaderDecrease: ImageVector? = null
