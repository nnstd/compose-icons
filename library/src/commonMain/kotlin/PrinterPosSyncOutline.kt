package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterPosSyncOutline: ImageVector
    get() {
        if (_PrinterPosSyncOutline != null) {
            return _PrinterPosSyncOutline!!
        }
        _PrinterPosSyncOutline = ImageVector.Builder(
            name = "PrinterPosSyncOutline",
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
                moveTo(13f, 17.5f)
                curveTo(13f, 18f, 13.07f, 18.5f, 13.18f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                curveTo(4f, 10.9f, 4.89f, 10f, 6f, 10f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                curveTo(18.74f, 10f, 19.38f, 10.41f, 19.73f, 11f)
                curveTo(19.65f, 11f, 19.58f, 11f, 19.5f, 11f)
                curveTo(18.23f, 11f, 17.05f, 11.37f, 16.05f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(13.03f)
                curveTo(13f, 17.17f, 13f, 17.33f, 13f, 17.5f)
                moveTo(9f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                moveTo(19f, 13.5f)
                verticalLineTo(12f)
                lineTo(16.75f, 14.25f)
                lineTo(19f, 16.5f)
                verticalLineTo(15f)
                curveTo(20.38f, 15f, 21.5f, 16.12f, 21.5f, 17.5f)
                curveTo(21.5f, 17.9f, 21.41f, 18.28f, 21.24f, 18.62f)
                lineTo(22.33f, 19.71f)
                curveTo(22.75f, 19.08f, 23f, 18.32f, 23f, 17.5f)
                curveTo(23f, 15.29f, 21.21f, 13.5f, 19f, 13.5f)
                moveTo(19f, 20f)
                curveTo(17.62f, 20f, 16.5f, 18.88f, 16.5f, 17.5f)
                curveTo(16.5f, 17.1f, 16.59f, 16.72f, 16.76f, 16.38f)
                lineTo(15.67f, 15.29f)
                curveTo(15.25f, 15.92f, 15f, 16.68f, 15f, 17.5f)
                curveTo(15f, 19.71f, 16.79f, 21.5f, 19f, 21.5f)
                verticalLineTo(23f)
                lineTo(21.25f, 20.75f)
                lineTo(19f, 18.5f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _PrinterPosSyncOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterPosSyncOutline: ImageVector? = null
