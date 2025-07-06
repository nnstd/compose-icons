package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterAlert: ImageVector
    get() {
        if (_PrinterAlert != null) {
            return _PrinterAlert!!
        }
        _PrinterAlert = ImageVector.Builder(
            name = "PrinterAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 3f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                moveTo(17f, 12f)
                curveTo(16.4f, 12f, 16f, 11.6f, 16f, 11f)
                reflectiveCurveTo(16.4f, 10f, 17f, 10f)
                reflectiveCurveTo(18f, 10.4f, 18f, 11f)
                reflectiveCurveTo(17.6f, 12f, 17f, 12f)
                moveTo(14f, 19f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                moveTo(17f, 8f)
                horizontalLineTo(3f)
                curveTo(1.3f, 8f, 0f, 9.3f, 0f, 11f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                curveTo(20f, 9.3f, 18.7f, 8f, 17f, 8f)
                moveTo(24f, 13f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(24f)
                verticalLineTo(13f)
                moveTo(24f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(24f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _PrinterAlert!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterAlert: ImageVector? = null
