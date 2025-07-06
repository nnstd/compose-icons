package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterPosCancel: ImageVector
    get() {
        if (_PrinterPosCancel != null) {
            return _PrinterPosCancel!!
        }
        _PrinterPosCancel = ImageVector.Builder(
            name = "PrinterPosCancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                moveTo(12f, 18.5f)
                curveTo(12f, 18.67f, 12f, 18.83f, 12.03f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                curveTo(4f, 10.9f, 4.89f, 10f, 6f, 10f)
                horizontalLineTo(18f)
                curveTo(19.11f, 10f, 20f, 10.9f, 20f, 12f)
                verticalLineTo(12.18f)
                curveTo(19.5f, 12.07f, 19f, 12f, 18.5f, 12f)
                curveTo(14.91f, 12f, 12f, 14.91f, 12f, 18.5f)
                moveTo(10f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                moveTo(23f, 18.5f)
                curveTo(23f, 21f, 21f, 23f, 18.5f, 23f)
                reflectiveCurveTo(14f, 21f, 14f, 18.5f)
                reflectiveCurveTo(16f, 14f, 18.5f, 14f)
                reflectiveCurveTo(23f, 16f, 23f, 18.5f)
                moveTo(20f, 21.08f)
                lineTo(15.92f, 17f)
                curveTo(15.65f, 17.42f, 15.5f, 17.94f, 15.5f, 18.5f)
                curveTo(15.5f, 20.16f, 16.84f, 21.5f, 18.5f, 21.5f)
                curveTo(19.06f, 21.5f, 19.58f, 21.35f, 20f, 21.08f)
                moveTo(21.5f, 18.5f)
                curveTo(21.5f, 16.84f, 20.16f, 15.5f, 18.5f, 15.5f)
                curveTo(17.94f, 15.5f, 17.42f, 15.65f, 17f, 15.92f)
                lineTo(21.08f, 20f)
                curveTo(21.35f, 19.58f, 21.5f, 19.06f, 21.5f, 18.5f)
                close()
            }
        }.build()

        return _PrinterPosCancel!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterPosCancel: ImageVector? = null
