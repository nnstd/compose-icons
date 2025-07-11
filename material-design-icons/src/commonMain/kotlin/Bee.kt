package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bee: ImageVector
    get() {
        if (_Bee != null) {
            return _Bee!!
        }
        _Bee = ImageVector.Builder(
            name = "Bee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.4f, 9f)
                curveTo(17f, 7.8f, 16.2f, 7f, 15f, 6.5f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                verticalLineTo(6.4f)
                horizontalLineTo(13.6f)
                curveTo(12.5f, 6.4f, 11.6f, 6.8f, 10.8f, 7.6f)
                lineTo(10.4f, 8f)
                lineTo(9f, 7.5f)
                curveTo(8.7f, 7.4f, 8.4f, 7.3f, 8f, 7.3f)
                curveTo(7.4f, 7.3f, 6.8f, 7.5f, 6.3f, 7.9f)
                curveTo(5.7f, 8.3f, 5.4f, 8.8f, 5.2f, 9.3f)
                curveTo(5f, 10f, 5f, 10.6f, 5.2f, 11.3f)
                curveTo(5.5f, 12f, 5.8f, 12.5f, 6.3f, 12.8f)
                curveTo(5.9f, 14.3f, 6.2f, 15.6f, 7.3f, 16.7f)
                curveTo(8.1f, 17.5f, 9f, 17.9f, 10.1f, 17.9f)
                curveTo(10.6f, 17.9f, 10.9f, 17.9f, 11.2f, 17.8f)
                curveTo(11.8f, 18.6f, 12.6f, 19.1f, 13.6f, 19.1f)
                curveTo(13.9f, 19.1f, 14.3f, 19.1f, 14.6f, 19f)
                curveTo(15.2f, 18.8f, 15.6f, 18.4f, 16f, 17.9f)
                curveTo(16.4f, 17.3f, 16.6f, 16.8f, 16.6f, 16.2f)
                curveTo(16.6f, 15.8f, 16.6f, 15.5f, 16.5f, 15.2f)
                lineTo(16f, 13.6f)
                lineTo(16.6f, 13.2f)
                curveTo(17.4f, 12.4f, 17.8f, 11.3f, 17.7f, 10.1f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(17.4f)
                moveTo(7.7f, 11.3f)
                curveTo(7.1f, 11f, 6.9f, 10.6f, 7.1f, 10f)
                curveTo(7.3f, 9.4f, 7.7f, 9.2f, 8.3f, 9.4f)
                lineTo(11.5f, 10.6f)
                curveTo(9.9f, 11.4f, 8.7f, 11.6f, 7.7f, 11.3f)
                moveTo(14f, 16.9f)
                curveTo(13.4f, 17.1f, 13f, 16.9f, 12.7f, 16.3f)
                curveTo(12.4f, 15.3f, 12.6f, 14.1f, 13.4f, 12.5f)
                lineTo(14.6f, 15.6f)
                curveTo(14.8f, 16.3f, 14.6f, 16.7f, 14f, 16.9f)
                moveTo(15.2f, 11.6f)
                lineTo(14.6f, 10f)
                verticalLineTo(9.9f)
                lineTo(14.3f, 9.6f)
                horizontalLineTo(14.2f)
                lineTo(12.6f, 9f)
                curveTo(13f, 8.7f, 13.4f, 8.5f, 13.9f, 8.5f)
                curveTo(14.4f, 8.5f, 14.9f, 8.7f, 15.3f, 9.1f)
                curveTo(15.7f, 9.5f, 15.9f, 9.9f, 15.9f, 10.4f)
                curveTo(15.7f, 10.7f, 15.5f, 11.2f, 15.2f, 11.6f)
                close()
            }
        }.build()

        return _Bee!!
    }

@Suppress("ObjectPropertyName")
private var _Bee: ImageVector? = null
