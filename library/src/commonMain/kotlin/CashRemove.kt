package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CashRemove: ImageVector
    get() {
        if (_CashRemove != null) {
            return _CashRemove!!
        }
        _CashRemove = ImageVector.Builder(
            name = "CashRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.46f, 18.12f)
                lineTo(16.88f, 19.54f)
                lineTo(19f, 17.41f)
                lineTo(21.12f, 19.54f)
                lineTo(22.54f, 18.12f)
                lineTo(20.41f, 16f)
                lineTo(22.54f, 13.88f)
                lineTo(21.12f, 12.46f)
                lineTo(19f, 14.59f)
                lineTo(16.88f, 12.46f)
                lineTo(15.46f, 13.88f)
                lineTo(17.59f, 16f)
                moveTo(14.97f, 11.62f)
                curveTo(14.86f, 10.28f, 13.58f, 8.97f, 12f, 9f)
                curveTo(10.3f, 9.04f, 9f, 10.3f, 9f, 12f)
                curveTo(9f, 13.7f, 10.3f, 14.94f, 12f, 15f)
                curveTo(12.39f, 15f, 12.77f, 14.92f, 13.14f, 14.77f)
                curveTo(13.41f, 13.67f, 13.86f, 12.63f, 14.97f, 11.62f)
                moveTo(13f, 16f)
                horizontalLineTo(7f)
                curveTo(7f, 14.9f, 6.1f, 14f, 5f, 14f)
                verticalLineTo(10f)
                curveTo(6.1f, 10f, 7f, 9.1f, 7f, 8f)
                horizontalLineTo(17f)
                curveTo(17f, 9.1f, 17.9f, 10f, 19f, 10f)
                verticalLineTo(10.05f)
                curveTo(19.67f, 10.06f, 20.34f, 10.18f, 21f, 10.4f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                horizontalLineTo(13.32f)
                curveTo(13.1f, 17.33f, 13f, 16.66f, 13f, 16f)
                close()
            }
        }.build()

        return _CashRemove!!
    }

@Suppress("ObjectPropertyName")
private var _CashRemove: ImageVector? = null
