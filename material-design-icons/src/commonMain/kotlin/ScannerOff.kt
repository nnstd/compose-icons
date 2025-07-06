package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScannerOff: ImageVector
    get() {
        if (_ScannerOff != null) {
            return _ScannerOff!!
        }
        _ScannerOff = ImageVector.Builder(
            name = "ScannerOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(16.73f, 20f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18f)
                verticalLineTo(12.5f)
                curveTo(3f, 11.7f, 3.5f, 10.9f, 4.2f, 10.7f)
                lineTo(6.57f, 9.84f)
                lineTo(2f, 5.27f)
                moveTo(6.4f, 12f)
                horizontalLineTo(8.73f)
                lineTo(8.11f, 11.38f)
                lineTo(6.4f, 12f)
                moveTo(5f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(13.73f)
                lineTo(11.73f, 15f)
                horizontalLineTo(5f)
                moveTo(19.8f, 5f)
                lineTo(20.5f, 6.9f)
                lineTo(11.85f, 10.03f)
                lineTo(10.3f, 8.47f)
                lineTo(19.8f, 5f)
                moveTo(19f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 14f)
                verticalLineTo(18f)
                curveTo(21f, 18.34f, 20.91f, 18.66f, 20.76f, 18.94f)
                lineTo(19f, 17.18f)
                verticalLineTo(15f)
                horizontalLineTo(16.82f)
                lineTo(13.82f, 12f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _ScannerOff!!
    }

@Suppress("ObjectPropertyName")
private var _ScannerOff: ImageVector? = null
