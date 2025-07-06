package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterPosCancelOutline: ImageVector
    get() {
        if (_PrinterPosCancelOutline != null) {
            return _PrinterPosCancelOutline!!
        }
        _PrinterPosCancelOutline = ImageVector.Builder(
            name = "PrinterPosCancelOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 14f)
                curveTo(16f, 14f, 14f, 16f, 14f, 18.5f)
                reflectiveCurveTo(16f, 23f, 18.5f, 23f)
                reflectiveCurveTo(23f, 21f, 23f, 18.5f)
                reflectiveCurveTo(21f, 14f, 18.5f, 14f)
                moveTo(18.5f, 21.5f)
                curveTo(16.84f, 21.5f, 15.5f, 20.16f, 15.5f, 18.5f)
                curveTo(15.5f, 17.94f, 15.65f, 17.42f, 15.92f, 17f)
                lineTo(20f, 21.08f)
                curveTo(19.58f, 21.35f, 19.06f, 21.5f, 18.5f, 21.5f)
                moveTo(21.08f, 20f)
                lineTo(17f, 15.92f)
                curveTo(17.42f, 15.65f, 17.94f, 15.5f, 18.5f, 15.5f)
                curveTo(20.16f, 15.5f, 21.5f, 16.84f, 21.5f, 18.5f)
                curveTo(21.5f, 19.06f, 21.35f, 19.58f, 21.08f, 20f)
                moveTo(7f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                moveTo(6f, 17f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                curveTo(20f, 10.9f, 19.11f, 10f, 18f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                curveTo(4.89f, 10f, 4f, 10.9f, 4f, 12f)
                verticalLineTo(19f)
                horizontalLineTo(12.03f)
                curveTo(12f, 18.83f, 12f, 18.67f, 12f, 18.5f)
                curveTo(12f, 18f, 12.07f, 17.5f, 12.18f, 17f)
                horizontalLineTo(6f)
                moveTo(9f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _PrinterPosCancelOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterPosCancelOutline: ImageVector? = null
