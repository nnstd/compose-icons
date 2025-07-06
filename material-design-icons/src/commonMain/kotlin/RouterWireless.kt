package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RouterWireless: ImageVector
    get() {
        if (_RouterWireless != null) {
            return _RouterWireless!!
        }
        _RouterWireless = ImageVector.Builder(
            name = "RouterWireless",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.2f, 5.9f)
                lineTo(21f, 5.1f)
                curveTo(19.6f, 3.7f, 17.8f, 3f, 16f, 3f)
                curveTo(14.2f, 3f, 12.4f, 3.7f, 11f, 5.1f)
                lineTo(11.8f, 5.9f)
                curveTo(13f, 4.8f, 14.5f, 4.2f, 16f, 4.2f)
                curveTo(17.5f, 4.2f, 19f, 4.8f, 20.2f, 5.9f)
                moveTo(19.3f, 6.7f)
                curveTo(18.4f, 5.8f, 17.2f, 5.3f, 16f, 5.3f)
                curveTo(14.8f, 5.3f, 13.6f, 5.8f, 12.7f, 6.7f)
                lineTo(13.5f, 7.5f)
                curveTo(14.2f, 6.8f, 15.1f, 6.5f, 16f, 6.5f)
                curveTo(16.9f, 6.5f, 17.8f, 6.8f, 18.5f, 7.5f)
                lineTo(19.3f, 6.7f)
                moveTo(19f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 15f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 13f)
                moveTo(8f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                moveTo(11.5f, 18f)
                horizontalLineTo(9.5f)
                verticalLineTo(16f)
                horizontalLineTo(11.5f)
                verticalLineTo(18f)
                moveTo(15f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _RouterWireless!!
    }

@Suppress("ObjectPropertyName")
private var _RouterWireless: ImageVector? = null
