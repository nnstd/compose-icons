package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterPosWrenchOutline: ImageVector
    get() {
        if (_PrinterPosWrenchOutline != null) {
            return _PrinterPosWrenchOutline!!
        }
        _PrinterPosWrenchOutline = ImageVector.Builder(
            name = "PrinterPosWrenchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                moveTo(13.03f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(11.1f)
                curveTo(11.25f, 17.74f, 11.58f, 18.42f, 12f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                curveTo(4f, 10.9f, 4.89f, 10f, 6f, 10f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                curveTo(19.11f, 10f, 20f, 10.9f, 20f, 12f)
                verticalLineTo(13.03f)
                curveTo(19.09f, 11.8f, 17.64f, 11f, 16f, 11f)
                curveTo(14.88f, 11f, 13.86f, 11.38f, 13.03f, 12f)
                moveTo(9f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                moveTo(22.87f, 21.19f)
                lineTo(18.76f, 17.08f)
                curveTo(19.17f, 16.04f, 18.94f, 14.82f, 18.08f, 13.97f)
                curveTo(17.18f, 13.06f, 15.83f, 12.88f, 14.74f, 13.38f)
                lineTo(16.68f, 15.32f)
                lineTo(15.33f, 16.68f)
                lineTo(13.34f, 14.73f)
                curveTo(12.8f, 15.82f, 13.05f, 17.17f, 13.93f, 18.08f)
                curveTo(14.79f, 18.94f, 16f, 19.16f, 17.05f, 18.76f)
                lineTo(21.16f, 22.86f)
                curveTo(21.34f, 23.05f, 21.61f, 23.05f, 21.79f, 22.86f)
                lineTo(22.83f, 21.83f)
                curveTo(23.05f, 21.65f, 23.05f, 21.33f, 22.87f, 21.19f)
                close()
            }
        }.build()

        return _PrinterPosWrenchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterPosWrenchOutline: ImageVector? = null
