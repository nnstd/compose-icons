package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CashCheck: ImageVector
    get() {
        if (_CashCheck != null) {
            return _CashCheck!!
        }
        _CashCheck = ImageVector.Builder(
            name = "CashCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 6f)
                verticalLineTo(18f)
                horizontalLineTo(13.32f)
                curveTo(13.1f, 17.33f, 13f, 16.66f, 13f, 16f)
                horizontalLineTo(7f)
                curveTo(7f, 14.9f, 6.11f, 14f, 5f, 14f)
                verticalLineTo(10f)
                curveTo(6.11f, 10f, 7f, 9.11f, 7f, 8f)
                horizontalLineTo(17f)
                curveTo(17f, 9.11f, 17.9f, 10f, 19f, 10f)
                verticalLineTo(10.06f)
                curveTo(19.67f, 10.06f, 20.34f, 10.18f, 21f, 10.4f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                moveTo(12f, 9f)
                curveTo(10.3f, 9.03f, 9f, 10.3f, 9f, 12f)
                curveTo(9f, 13.7f, 10.3f, 14.94f, 12f, 15f)
                curveTo(12.38f, 15f, 12.77f, 14.92f, 13.14f, 14.77f)
                curveTo(13.41f, 13.67f, 13.86f, 12.63f, 14.97f, 11.61f)
                curveTo(14.85f, 10.28f, 13.59f, 8.97f, 12f, 9f)
                moveTo(21.63f, 12.27f)
                lineTo(17.76f, 16.17f)
                lineTo(16.41f, 14.8f)
                lineTo(15f, 16.22f)
                lineTo(17.75f, 19f)
                lineTo(23.03f, 13.68f)
                lineTo(21.63f, 12.27f)
                close()
            }
        }.build()

        return _CashCheck!!
    }

@Suppress("ObjectPropertyName")
private var _CashCheck: ImageVector? = null
