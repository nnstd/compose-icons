package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerSocketFr: ImageVector
    get() {
        if (_PowerSocketFr != null) {
            return _PowerSocketFr!!
        }
        _PowerSocketFr = ImageVector.Builder(
            name = "PowerSocketFr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.22f, 2f)
                arcTo(2.22f, 2.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4.22f)
                verticalLineTo(19.78f)
                curveTo(2f, 21f, 3f, 22f, 4.22f, 22f)
                horizontalLineTo(19.78f)
                arcTo(2.22f, 2.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 19.78f)
                verticalLineTo(4.22f)
                curveTo(22f, 3f, 21f, 2f, 19.78f, 2f)
                horizontalLineTo(4.22f)
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                moveTo(12f, 6f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 7.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 7.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                moveTo(7.5f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 12f)
                curveTo(6f, 12.83f, 6.66f, 13.5f, 7.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 10.5f)
                moveTo(16.5f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 10.5f)
                close()
            }
        }.build()

        return _PowerSocketFr!!
    }

@Suppress("ObjectPropertyName")
private var _PowerSocketFr: ImageVector? = null
