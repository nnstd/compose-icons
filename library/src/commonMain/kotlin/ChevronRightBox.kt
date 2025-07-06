package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChevronRightBox: ImageVector
    get() {
        if (_ChevronRightBox != null) {
            return _ChevronRightBox!!
        }
        _ChevronRightBox = ImageVector.Builder(
            name = "ChevronRightBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(9.71f, 18f)
                lineTo(8.29f, 16.59f)
                lineTo(12.88f, 12f)
                lineTo(8.29f, 7.41f)
                lineTo(9.71f, 6f)
                lineTo(15.71f, 12f)
                lineTo(9.71f, 18f)
                close()
            }
        }.build()

        return _ChevronRightBox!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronRightBox: ImageVector? = null
