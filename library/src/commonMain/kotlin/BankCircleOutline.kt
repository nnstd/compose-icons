package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BankCircleOutline: ImageVector
    get() {
        if (_BankCircleOutline != null) {
            return _BankCircleOutline!!
        }
        _BankCircleOutline = ImageVector.Builder(
            name = "BankCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveTo(16.4f, 4f, 20f, 7.6f, 20f, 12f)
                reflectiveCurveTo(16.4f, 20f, 12f, 20f)
                reflectiveCurveTo(4f, 16.4f, 4f, 12f)
                reflectiveCurveTo(7.6f, 4f, 12f, 4f)
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                moveTo(17f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                moveTo(8f, 14f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                moveTo(11f, 14f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                moveTo(14f, 14f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                moveTo(17f, 10f)
                horizontalLineTo(7f)
                verticalLineTo(8.5f)
                lineTo(12f, 6f)
                lineTo(17f, 8.5f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _BankCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BankCircleOutline: ImageVector? = null
