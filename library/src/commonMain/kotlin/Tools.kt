package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Tools: ImageVector
    get() {
        if (_Tools != null) {
            return _Tools!!
        }
        _Tools = ImageVector.Builder(
            name = "Tools",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.71f, 20.29f)
                lineTo(20.29f, 21.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.88f, 21.71f)
                lineTo(7f, 9.85f)
                arcTo(3.81f, 3.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 10f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.22f, 4.7f)
                lineTo(4.76f, 7.24f)
                lineTo(5.29f, 6.71f)
                lineTo(6.71f, 5.29f)
                lineTo(7.24f, 4.76f)
                lineTo(4.7f, 2.22f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 6f)
                arcTo(3.81f, 3.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.85f, 7f)
                lineTo(21.71f, 18.88f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.71f, 20.29f)
                moveTo(2.29f, 18.88f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.29f, 20.29f)
                lineTo(3.71f, 21.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.12f, 21.71f)
                lineTo(10.59f, 16.25f)
                lineTo(7.76f, 13.42f)
                moveTo(20f, 2f)
                lineTo(16f, 4f)
                verticalLineTo(6f)
                lineTo(13.83f, 8.17f)
                lineTo(15.83f, 10.17f)
                lineTo(18f, 8f)
                horizontalLineTo(20f)
                lineTo(22f, 4f)
                close()
            }
        }.build()

        return _Tools!!
    }

@Suppress("ObjectPropertyName")
private var _Tools: ImageVector? = null
