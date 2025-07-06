package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatTextWrappingOverflow: ImageVector
    get() {
        if (_FormatTextWrappingOverflow != null) {
            return _FormatTextWrappingOverflow!!
        }
        _FormatTextWrappingOverflow = ImageVector.Builder(
            name = "FormatTextWrappingOverflow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 21f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                moveTo(14f, 3f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                moveTo(14f, 15f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                moveTo(19f, 12f)
                lineTo(16f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                lineTo(19f, 12f)
                close()
            }
        }.build()

        return _FormatTextWrappingOverflow!!
    }

@Suppress("ObjectPropertyName")
private var _FormatTextWrappingOverflow: ImageVector? = null
