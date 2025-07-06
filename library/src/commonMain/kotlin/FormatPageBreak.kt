package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatPageBreak: ImageVector
    get() {
        if (_FormatPageBreak != null) {
            return _FormatPageBreak!!
        }
        _FormatPageBreak = ImageVector.Builder(
            name = "FormatPageBreak",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(11f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                moveTo(16f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                moveTo(3f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                moveTo(21f, 16f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _FormatPageBreak!!
    }

@Suppress("ObjectPropertyName")
private var _FormatPageBreak: ImageVector? = null
