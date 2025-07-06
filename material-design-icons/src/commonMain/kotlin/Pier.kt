package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pier: ImageVector
    get() {
        if (_Pier != null) {
            return _Pier!!
        }
        _Pier = ImageVector.Builder(
            name = "Pier",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 18f)
                curveTo(18.6f, 18f, 17.2f, 17.5f, 16f, 16.7f)
                curveTo(13.6f, 18.4f, 10.4f, 18.4f, 8f, 16.7f)
                curveTo(6.8f, 17.5f, 5.4f, 18f, 4f, 18f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                curveTo(5.4f, 20f, 6.7f, 19.6f, 8f, 19f)
                curveTo(10.5f, 20.3f, 13.5f, 20.3f, 16f, 19f)
                curveTo(17.3f, 19.6f, 18.6f, 20f, 20f, 20f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                moveTo(20f, 13f)
                horizontalLineTo(19f)
                verticalLineTo(16.9f)
                curveTo(18.3f, 16.8f, 17.6f, 16.6f, 17f, 16.2f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                curveTo(11.3f, 17f, 10.7f, 16.9f, 10f, 16.7f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(16.9f)
                curveTo(4.7f, 17f, 4.3f, 17f, 4f, 17f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Pier!!
    }

@Suppress("ObjectPropertyName")
private var _Pier: ImageVector? = null
