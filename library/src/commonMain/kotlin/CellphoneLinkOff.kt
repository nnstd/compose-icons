package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneLinkOff: ImageVector
    get() {
        if (_CellphoneLinkOff != null) {
            return _CellphoneLinkOff!!
        }
        _CellphoneLinkOff = ImageVector.Builder(
            name = "CellphoneLinkOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 8f)
                horizontalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 9f)
                verticalLineTo(13.18f)
                lineTo(18f, 15.18f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(19.82f)
                lineTo(22.82f, 20f)
                horizontalLineTo(23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 8f)
                moveTo(4f, 6.27f)
                lineTo(14.73f, 17f)
                horizontalLineTo(4f)
                verticalLineTo(6.27f)
                moveTo(1.92f, 1.65f)
                lineTo(0.65f, 2.92f)
                lineTo(2.47f, 4.74f)
                curveTo(2.18f, 5.08f, 2f, 5.5f, 2f, 6f)
                verticalLineTo(17f)
                horizontalLineTo(0f)
                verticalLineTo(20f)
                horizontalLineTo(17.73f)
                lineTo(20.08f, 22.35f)
                lineTo(21.35f, 21.08f)
                lineTo(3.89f, 3.62f)
                lineTo(1.92f, 1.65f)
                moveTo(22f, 6f)
                verticalLineTo(4f)
                horizontalLineTo(6.82f)
                lineTo(8.82f, 6f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _CellphoneLinkOff!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneLinkOff: ImageVector? = null
