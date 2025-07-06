package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterSettings: ImageVector
    get() {
        if (_PrinterSettings != null) {
            return _PrinterSettings!!
        }
        _PrinterSettings = ImageVector.Builder(
            name = "PrinterSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                moveTo(19f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 11f)
                moveTo(16f, 18f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                moveTo(19f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 10f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 7f)
                horizontalLineTo(19f)
                moveTo(15f, 24f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(24f)
                horizontalLineTo(15f)
                moveTo(11f, 24f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(24f)
                horizontalLineTo(11f)
                moveTo(7f, 24f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _PrinterSettings!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterSettings: ImageVector? = null
