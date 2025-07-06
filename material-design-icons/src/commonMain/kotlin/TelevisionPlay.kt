package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TelevisionPlay: ImageVector
    get() {
        if (_TelevisionPlay != null) {
            return _TelevisionPlay!!
        }
        _TelevisionPlay = ImageVector.Builder(
            name = "TelevisionPlay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                curveTo(1.89f, 3f, 1f, 3.89f, 1f, 5f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 17f)
                verticalLineTo(5f)
                curveTo(23f, 3.89f, 22.1f, 3f, 21f, 3f)
                moveTo(21f, 17f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                moveTo(16f, 11f)
                lineTo(9f, 15f)
                verticalLineTo(7f)
            }
        }.build()

        return _TelevisionPlay!!
    }

@Suppress("ObjectPropertyName")
private var _TelevisionPlay: ImageVector? = null
