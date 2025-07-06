package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonLol: ImageVector
    get() {
        if (_EmoticonLol != null) {
            return _EmoticonLol!!
        }
        _EmoticonLol = ImageVector.Builder(
            name = "EmoticonLol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.07f, 8.93f)
                verticalLineTo(4.93f)
                arcTo(4.06f, 4.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.73f, 2.72f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.73f, 15.72f)
                arcTo(4.06f, 4.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.94f, 15.06f)
                horizontalLineTo(8.94f)
                verticalLineTo(19.06f)
                arcTo(4.06f, 4.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.28f, 21.27f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.28f, 8.27f)
                arcTo(4.06f, 4.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.07f, 8.93f)
                moveTo(11f, 6f)
                horizontalLineTo(12.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                moveTo(7.5f, 14f)
                verticalLineTo(12.5f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                moveTo(15.89f, 15.9f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.8f, 17f)
                lineTo(17f, 9.8f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.89f, 15.89f)
                moveTo(4.89f, 21.08f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.89f, 19.08f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.89f, 17.08f)
                horizontalLineTo(6.89f)
                verticalLineTo(19.08f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.93f, 21.07f)
                moveTo(19.07f, 2.93f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.07f, 4.93f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.07f, 6.93f)
                horizontalLineTo(17.07f)
                verticalLineTo(4.93f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.07f, 2.93f)
                close()
            }
        }.build()

        return _EmoticonLol!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonLol: ImageVector? = null
