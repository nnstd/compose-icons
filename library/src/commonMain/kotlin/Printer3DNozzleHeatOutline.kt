package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Printer3DNozzleHeatOutline: ImageVector
    get() {
        if (_Printer3DNozzleHeatOutline != null) {
            return _Printer3DNozzleHeatOutline!!
        }
        _Printer3DNozzleHeatOutline = ImageVector.Builder(
            name = "Printer3DNozzleHeatOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 14.5f)
                lineTo(21.6f, 16.7f)
                lineTo(23f, 18.9f)
                lineTo(21f, 22f)
                lineTo(19.2f, 21.1f)
                lineTo(20.7f, 18.9f)
                lineTo(19.2f, 16.7f)
                lineTo(21.2f, 13.6f)
                lineTo(23f, 14.5f)
                moveTo(18.7f, 14.5f)
                lineTo(17.2f, 16.7f)
                lineTo(18.7f, 18.9f)
                lineTo(16.7f, 22f)
                lineTo(14.9f, 21.1f)
                lineTo(16.3f, 18.9f)
                lineTo(14.9f, 16.7f)
                lineTo(16.9f, 13.6f)
                lineTo(18.7f, 14.5f)
                moveTo(4f, 2f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(13.5f)
                lineTo(10f, 17f)
                horizontalLineTo(8f)
                lineTo(4.5f, 13f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(2f)
                moveTo(4f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(5.5f)
                lineTo(9f, 15f)
                lineTo(12.5f, 11f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _Printer3DNozzleHeatOutline!!
    }

@Suppress("ObjectPropertyName")
private var _Printer3DNozzleHeatOutline: ImageVector? = null
