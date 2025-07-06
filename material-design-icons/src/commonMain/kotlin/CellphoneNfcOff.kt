package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneNfcOff: ImageVector
    get() {
        if (_CellphoneNfcOff != null) {
            return _CellphoneNfcOff!!
        }
        _CellphoneNfcOff = ImageVector.Builder(
            name = "CellphoneNfcOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(18.85f, 20.74f)
                curveTo(18.56f, 21.5f, 17.84f, 22f, 17f, 22f)
                horizontalLineTo(14.92f)
                curveTo(14.81f, 20.59f, 14.5f, 19.25f, 13.97f, 18f)
                horizontalLineTo(16.11f)
                lineTo(7f, 8.89f)
                verticalLineTo(11f)
                curveTo(6.36f, 10.74f, 5.69f, 10.53f, 5f, 10.37f)
                verticalLineTo(6.89f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(17f, 5f)
                verticalLineTo(13.8f)
                lineTo(19f, 15.8f)
                verticalLineTo(3f)
                curveTo(19f, 1.9f, 18.11f, 1f, 17f, 1f)
                horizontalLineTo(7f)
                curveTo(6.24f, 1f, 5.59f, 1.43f, 5.25f, 2.05f)
                lineTo(8.2f, 5f)
                horizontalLineTo(17f)
                moveTo(2f, 20f)
                verticalLineTo(23f)
                horizontalLineTo(5f)
                curveTo(5f, 21.34f, 3.66f, 20f, 2f, 20f)
                moveTo(2f, 16f)
                verticalLineTo(18f)
                curveTo(4.76f, 18f, 7f, 20.24f, 7f, 23f)
                horizontalLineTo(9f)
                curveTo(9f, 19.13f, 5.87f, 16f, 2f, 16f)
                moveTo(2f, 12f)
                verticalLineTo(14f)
                curveTo(6.97f, 14f, 11f, 18.03f, 11f, 23f)
                horizontalLineTo(13f)
                curveTo(13f, 16.92f, 8.08f, 12f, 2f, 12f)
                close()
            }
        }.build()

        return _CellphoneNfcOff!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneNfcOff: ImageVector? = null
