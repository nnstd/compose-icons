package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BarcodeOff: ImageVector
    get() {
        if (_BarcodeOff != null) {
            return _BarcodeOff!!
        }
        _BarcodeOff = ImageVector.Builder(
            name = "BarcodeOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(16f, 17.89f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(15.89f)
                lineTo(12f, 13.89f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(12.89f)
                lineTo(10f, 11.89f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(8.89f)
                lineTo(6f, 7.89f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineTo(6.89f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(7f, 6.34f)
                lineTo(10f, 9.34f)
                lineTo(11f, 10.34f)
                lineTo(12f, 11.34f)
                lineTo(14f, 13.35f)
                verticalLineTo(13.34f)
                lineTo(16f, 15.34f)
                verticalLineTo(15.35f)
                lineTo(17f, 16.35f)
                verticalLineTo(16.34f)
                lineTo(18.66f, 18f)
                horizontalLineTo(18.65f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(16f, 6f)
                horizontalLineTo(14f)
                verticalLineTo(10.8f)
                lineTo(16f, 12.8f)
                verticalLineTo(6f)
                moveTo(12f, 6f)
                horizontalLineTo(11f)
                verticalLineTo(7.8f)
                lineTo(12f, 8.8f)
                verticalLineTo(6f)
                moveTo(20f, 6f)
                horizontalLineTo(17f)
                verticalLineTo(13.8f)
                lineTo(20f, 16.8f)
                verticalLineTo(6f)
                moveTo(22f, 18f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                verticalLineTo(17.8f)
                lineTo(21.2f, 18f)
                horizontalLineTo(22f)
                moveTo(10f, 6f)
                horizontalLineTo(9.2f)
                lineTo(10f, 6.8f)
                verticalLineTo(6f)
                moveTo(2f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _BarcodeOff!!
    }

@Suppress("ObjectPropertyName")
private var _BarcodeOff: ImageVector? = null
