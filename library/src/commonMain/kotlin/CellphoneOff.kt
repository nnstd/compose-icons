package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneOff: ImageVector
    get() {
        if (_CellphoneOff != null) {
            return _CellphoneOff!!
        }
        _CellphoneOff = ImageVector.Builder(
            name = "CellphoneOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.38f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(5f, 6.89f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 23f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 21f)
                verticalLineTo(20.89f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(17f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(8.89f)
                lineTo(17f, 18.89f)
                verticalLineTo(19f)
                moveTo(17f, 5f)
                verticalLineTo(13.8f)
                lineTo(19f, 15.8f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 1f)
                horizontalLineTo(7f)
                curveTo(6.28f, 1f, 5.6f, 1.37f, 5.24f, 2f)
                lineTo(8.24f, 5f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _CellphoneOff!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneOff: ImageVector? = null
