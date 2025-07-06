package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterPosEditOutline: ImageVector
    get() {
        if (_PrinterPosEditOutline != null) {
            return _PrinterPosEditOutline!!
        }
        _PrinterPosEditOutline = ImageVector.Builder(
            name = "PrinterPosEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 17f)
                verticalLineTo(12f)
                horizontalLineTo(18.13f)
                lineTo(19.39f, 10.74f)
                curveTo(19.42f, 10.71f, 19.45f, 10.69f, 19.5f, 10.67f)
                curveTo(19.11f, 10.26f, 18.59f, 10f, 18f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                curveTo(4.89f, 10f, 4f, 10.9f, 4f, 12f)
                verticalLineTo(19f)
                horizontalLineTo(11.13f)
                lineTo(13.13f, 17f)
                horizontalLineTo(6f)
                moveTo(9f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                moveTo(7f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                moveTo(22.85f, 14.19f)
                lineTo(21.87f, 15.17f)
                lineTo(19.83f, 13.13f)
                lineTo(20.81f, 12.15f)
                curveTo(21f, 11.95f, 21.33f, 11.95f, 21.53f, 12.15f)
                lineTo(22.85f, 13.47f)
                curveTo(23.05f, 13.67f, 23.05f, 14f, 22.85f, 14.19f)
                moveTo(19.13f, 13.83f)
                lineTo(21.17f, 15.87f)
                lineTo(15.04f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(19.96f)
                lineTo(19.13f, 13.83f)
                close()
            }
        }.build()

        return _PrinterPosEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterPosEditOutline: ImageVector? = null
