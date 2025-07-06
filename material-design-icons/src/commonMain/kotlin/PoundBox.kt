package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PoundBox: ImageVector
    get() {
        if (_PoundBox != null) {
            return _PoundBox!!
        }
        _PoundBox = ImageVector.Builder(
            name = "PoundBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                moveTo(7f, 18f)
                horizontalLineTo(9f)
                lineTo(9.35f, 16f)
                horizontalLineTo(13.35f)
                lineTo(13f, 18f)
                horizontalLineTo(15f)
                lineTo(15.35f, 16f)
                horizontalLineTo(17.35f)
                lineTo(17.71f, 14f)
                horizontalLineTo(15.71f)
                lineTo(16.41f, 10f)
                horizontalLineTo(18.41f)
                lineTo(18.76f, 8f)
                horizontalLineTo(16.76f)
                lineTo(17.12f, 6f)
                horizontalLineTo(15.12f)
                lineTo(14.76f, 8f)
                horizontalLineTo(10.76f)
                lineTo(11.12f, 6f)
                horizontalLineTo(9.12f)
                lineTo(8.76f, 8f)
                horizontalLineTo(6.76f)
                lineTo(6.41f, 10f)
                horizontalLineTo(8.41f)
                lineTo(7.71f, 14f)
                horizontalLineTo(5.71f)
                lineTo(5.35f, 16f)
                horizontalLineTo(7.35f)
                lineTo(7f, 18f)
                moveTo(10.41f, 10f)
                horizontalLineTo(14.41f)
                lineTo(13.71f, 14f)
                horizontalLineTo(9.71f)
                lineTo(10.41f, 10f)
                close()
            }
        }.build()

        return _PoundBox!!
    }

@Suppress("ObjectPropertyName")
private var _PoundBox: ImageVector? = null
