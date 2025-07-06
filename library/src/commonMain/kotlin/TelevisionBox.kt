package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TelevisionBox: ImageVector
    get() {
        if (_TelevisionBox != null) {
            return _TelevisionBox!!
        }
        _TelevisionBox = ImageVector.Builder(
            name = "TelevisionBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                moveTo(16f, 16f)
                lineTo(19f, 8f)
                horizontalLineTo(16.5f)
                lineTo(15f, 12.5f)
                lineTo(13.5f, 8f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(11.77f)
                lineTo(14f, 16f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _TelevisionBox!!
    }

@Suppress("ObjectPropertyName")
private var _TelevisionBox: ImageVector? = null
