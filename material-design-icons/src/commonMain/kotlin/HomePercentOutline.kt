package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomePercentOutline: ImageVector
    get() {
        if (_HomePercentOutline != null) {
            return _HomePercentOutline!!
        }
        _HomePercentOutline = ImageVector.Builder(
            name = "HomePercentOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.53f, 11.03f)
                lineTo(14.47f, 9.97f)
                lineTo(8.47f, 15.97f)
                lineTo(9.53f, 17.03f)
                lineTo(15.53f, 11.03f)
                moveTo(10.63f, 10.37f)
                curveTo(10.4f, 10.13f, 10.08f, 10f, 9.75f, 10f)
                curveTo(9.42f, 10f, 9.1f, 10.13f, 8.87f, 10.37f)
                curveTo(8.63f, 10.6f, 8.5f, 10.92f, 8.5f, 11.25f)
                curveTo(8.5f, 11.58f, 8.63f, 11.9f, 8.87f, 12.13f)
                curveTo(9.1f, 12.37f, 9.42f, 12.5f, 9.75f, 12.5f)
                curveTo(10.08f, 12.5f, 10.4f, 12.37f, 10.63f, 12.13f)
                curveTo(10.87f, 11.9f, 11f, 11.58f, 11f, 11.25f)
                curveTo(11f, 10.92f, 10.87f, 10.6f, 10.63f, 10.37f)
                moveTo(15.13f, 14.87f)
                curveTo(14.9f, 14.63f, 14.58f, 14.5f, 14.25f, 14.5f)
                curveTo(13.92f, 14.5f, 13.6f, 14.63f, 13.37f, 14.87f)
                curveTo(13.13f, 15.1f, 13f, 15.42f, 13f, 15.75f)
                curveTo(13f, 16.08f, 13.13f, 16.4f, 13.37f, 16.63f)
                curveTo(13.6f, 16.87f, 13.92f, 17f, 14.25f, 17f)
                curveTo(14.58f, 17f, 14.9f, 16.87f, 15.13f, 16.63f)
                curveTo(15.37f, 16.4f, 15.5f, 16.08f, 15.5f, 15.75f)
                curveTo(15.5f, 15.42f, 15.37f, 15.1f, 15.13f, 14.87f)
                moveTo(19f, 12f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                lineTo(12f, 3f)
                lineTo(22f, 12f)
                horizontalLineTo(19f)
                moveTo(17f, 10.2f)
                lineTo(12f, 5.7f)
                lineTo(7f, 10.2f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(10.2f)
                close()
            }
        }.build()

        return _HomePercentOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomePercentOutline: ImageVector? = null
