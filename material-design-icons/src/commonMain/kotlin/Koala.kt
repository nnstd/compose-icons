package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Koala: ImageVector
    get() {
        if (_Koala != null) {
            return _Koala!!
        }
        _Koala = ImageVector.Builder(
            name = "Koala",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                curveTo(18.1f, 3f, 15.5f, 3f, 14.3f, 6.1f)
                curveTo(13.9f, 6f, 13.4f, 6f, 13f, 6f)
                horizontalLineTo(11f)
                curveTo(10.6f, 6f, 10.1f, 6f, 9.7f, 6.1f)
                curveTo(8.5f, 3f, 5.9f, 3f, 5f, 3f)
                curveTo(4f, 3f, 1f, 4f, 1f, 9f)
                curveTo(1f, 12.6f, 3.5f, 13.6f, 5f, 13.9f)
                verticalLineTo(15f)
                curveTo(5f, 18.3f, 7.7f, 21f, 11f, 21f)
                horizontalLineTo(13f)
                curveTo(16.3f, 21f, 19f, 18.3f, 19f, 15f)
                verticalLineTo(13.9f)
                curveTo(20.5f, 13.6f, 23f, 12.6f, 23f, 9f)
                curveTo(23f, 4f, 20f, 3f, 19f, 3f)
                moveTo(5f, 12f)
                verticalLineTo(12.4f)
                curveTo(2.9f, 11.8f, 3.3f, 9.5f, 4.3f, 8.7f)
                curveTo(4f, 8.3f, 3f, 9f, 3f, 8.6f)
                curveTo(3f, 8.1f, 4.8f, 7.4f, 5.1f, 7.3f)
                curveTo(4.8f, 6.8f, 3.6f, 7f, 3.6f, 6.6f)
                curveTo(3.6f, 6.3f, 4.8f, 5.8f, 5.8f, 6f)
                curveTo(6.3f, 6.1f, 6.9f, 6.3f, 7.4f, 6.7f)
                curveTo(6f, 8f, 5f, 9.8f, 5f, 12f)
                moveTo(8.5f, 15f)
                curveTo(6.5f, 15f, 6.5f, 12f, 8.5f, 12f)
                curveTo(10.5f, 12f, 10.5f, 15f, 8.5f, 15f)
                moveTo(12.5f, 18f)
                horizontalLineTo(11.5f)
                curveTo(10.8f, 18f, 10.3f, 17.3f, 10.6f, 16.7f)
                lineTo(11.3f, 13.7f)
                curveTo(11.4f, 13.3f, 11.8f, 13.1f, 12.1f, 13f)
                curveTo(12.4f, 13f, 12.7f, 13.2f, 12.9f, 13.7f)
                lineTo(13.6f, 16.7f)
                curveTo(13.7f, 17.3f, 13.2f, 18f, 12.5f, 18f)
                moveTo(15.5f, 15f)
                curveTo(13.5f, 15f, 13.5f, 12f, 15.5f, 12f)
                curveTo(17.5f, 12f, 17.5f, 15f, 15.5f, 15f)
                moveTo(19.7f, 8.6f)
                curveTo(20.7f, 9.4f, 21.1f, 11.7f, 19f, 12.3f)
                curveTo(19.1f, 10.1f, 18.1f, 8f, 16.6f, 6.7f)
                curveTo(17.1f, 6.3f, 17.7f, 6.1f, 18.2f, 6f)
                curveTo(19.2f, 5.8f, 20.4f, 6.2f, 20.4f, 6.6f)
                curveTo(20.4f, 7f, 19.2f, 6.8f, 18.9f, 7.2f)
                curveTo(19.2f, 7.4f, 21f, 8.1f, 21f, 8.6f)
                curveTo(21f, 9f, 20.1f, 8.3f, 19.7f, 8.6f)
                close()
            }
        }.build()

        return _Koala!!
    }

@Suppress("ObjectPropertyName")
private var _Koala: ImageVector? = null
