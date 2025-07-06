package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bugle: ImageVector
    get() {
        if (_Bugle != null) {
            return _Bugle!!
        }
        _Bugle = ImageVector.Builder(
            name = "Bugle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6f)
                curveTo(21f, 11f, 12f, 11f, 12f, 11f)
                curveTo(12f, 11f, 6f, 11f, 5f, 11f)
                curveTo(4f, 11f, 3f, 10f, 3f, 10f)
                horizontalLineTo(2f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                curveTo(3f, 14f, 4f, 13f, 5f, 13f)
                curveTo(5.2f, 13f, 5.7f, 13f, 6.3f, 13f)
                curveTo(5.5f, 13.5f, 5f, 14.2f, 5f, 15f)
                curveTo(5f, 16.8f, 7.3f, 18f, 10.5f, 18f)
                curveTo(13.7f, 18f, 16f, 16.8f, 16f, 15f)
                curveTo(16f, 14.4f, 15.7f, 13.8f, 15.2f, 13.3f)
                curveTo(17.8f, 13.8f, 21f, 15f, 21f, 18f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                moveTo(10.5f, 16.7f)
                curveTo(8.2f, 16.7f, 6.4f, 15.9f, 6.4f, 15f)
                curveTo(6.4f, 14.1f, 8.2f, 13.3f, 10.5f, 13.3f)
                curveTo(12.8f, 13.3f, 14.6f, 14.1f, 14.6f, 15f)
                curveTo(14.6f, 15.9f, 12.8f, 16.7f, 10.5f, 16.7f)
                close()
            }
        }.build()

        return _Bugle!!
    }

@Suppress("ObjectPropertyName")
private var _Bugle: ImageVector? = null
