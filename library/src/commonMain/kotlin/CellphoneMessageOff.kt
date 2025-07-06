package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneMessageOff: ImageVector
    get() {
        if (_CellphoneMessageOff != null) {
            return _CellphoneMessageOff!!
        }
        _CellphoneMessageOff = ImageVector.Builder(
            name = "CellphoneMessageOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(2.22f, 4.11f)
                curveTo(2.08f, 4.38f, 2f, 4.68f, 2f, 5f)
                verticalLineTo(19f)
                curveTo(2f, 20.1f, 2.89f, 21f, 4f, 21f)
                horizontalLineTo(11f)
                curveTo(12.1f, 21f, 13f, 20.1f, 13f, 19f)
                verticalLineTo(14.89f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(11f, 17f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(5.11f)
                lineTo(11f, 12.89f)
                verticalLineTo(17f)
                moveTo(23f, 4.5f)
                verticalLineTo(7.5f)
                curveTo(23f, 8.33f, 22.33f, 9f, 21.5f, 9f)
                horizontalLineTo(18f)
                lineTo(15.1f, 11.9f)
                lineTo(15f, 11.8f)
                verticalLineTo(4.5f)
                curveTo(15f, 3.67f, 15.67f, 3f, 16.5f, 3f)
                horizontalLineTo(21.5f)
                curveTo(22.33f, 3f, 23f, 3.67f, 23f, 4.5f)
                moveTo(10.2f, 7f)
                lineTo(6.2f, 3f)
                horizontalLineTo(11f)
                curveTo(12.1f, 3f, 13f, 3.9f, 13f, 5f)
                verticalLineTo(9.8f)
                lineTo(11f, 7.8f)
                verticalLineTo(7f)
                horizontalLineTo(10.2f)
            }
        }.build()

        return _CellphoneMessageOff!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneMessageOff: ImageVector? = null
