package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SelectionOff: ImageVector
    get() {
        if (_SelectionOff != null) {
            return _SelectionOff!!
        }
        _SelectionOff = ImageVector.Builder(
            name = "SelectionOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.5f, 3.77f)
                lineTo(1.78f, 2.5f)
                lineTo(21.5f, 22.22f)
                lineTo(20.23f, 23.5f)
                lineTo(18.73f, 22f)
                horizontalLineTo(17f)
                verticalLineTo(20.27f)
                lineTo(3.73f, 7f)
                horizontalLineTo(2f)
                verticalLineTo(5.27f)
                lineTo(0.5f, 3.77f)
                moveTo(4f, 2f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(5.82f)
                lineTo(3.83f, 2f)
                horizontalLineTo(4f)
                moveTo(22f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                moveTo(20f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                lineTo(22f, 20.17f)
                lineTo(20f, 18.18f)
                verticalLineTo(17f)
                moveTo(2f, 20f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                moveTo(10f, 2f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                moveTo(10f, 20f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                moveTo(20f, 10f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                moveTo(2f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _SelectionOff!!
    }

@Suppress("ObjectPropertyName")
private var _SelectionOff: ImageVector? = null
