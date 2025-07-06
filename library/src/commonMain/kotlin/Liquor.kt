package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Liquor: ImageVector
    get() {
        if (_Liquor != null) {
            return _Liquor!!
        }
        _Liquor = ImageVector.Builder(
            name = "Liquor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 14f)
                curveTo(3f, 15.3f, 3.8f, 16.4f, 5f, 16.8f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(16.8f)
                curveTo(8.2f, 16.4f, 9f, 15.3f, 9f, 14f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                moveTo(5f, 8f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                moveTo(20.6f, 8.5f)
                lineTo(19.6f, 8.2f)
                curveTo(19.3f, 8.1f, 19f, 7.7f, 19f, 7.3f)
                verticalLineTo(3f)
                curveTo(19f, 2.5f, 18.5f, 2f, 18f, 2f)
                horizontalLineTo(15f)
                curveTo(14.4f, 2f, 14f, 2.5f, 14f, 3f)
                verticalLineTo(7.3f)
                curveTo(14f, 7.7f, 13.7f, 8.1f, 13.3f, 8.3f)
                lineTo(12.4f, 8.6f)
                curveTo(11.6f, 8.9f, 11f, 9.6f, 11f, 10.5f)
                verticalLineTo(20f)
                curveTo(11f, 21.1f, 11.9f, 22f, 13f, 22f)
                horizontalLineTo(20f)
                curveTo(21.1f, 22f, 22f, 21.1f, 22f, 20f)
                verticalLineTo(10.4f)
                curveTo(22f, 9.6f, 21.5f, 8.8f, 20.6f, 8.5f)
                moveTo(16f, 4f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                moveTo(13f, 10.4f)
                lineTo(13.9f, 10.1f)
                curveTo(15.2f, 9.7f, 16f, 8.6f, 16f, 7.3f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(7.3f)
                curveTo(17f, 8.6f, 17.8f, 9.7f, 19f, 10.1f)
                lineTo(20f, 10.4f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(10.4f)
                moveTo(20f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _Liquor!!
    }

@Suppress("ObjectPropertyName")
private var _Liquor: ImageVector? = null
