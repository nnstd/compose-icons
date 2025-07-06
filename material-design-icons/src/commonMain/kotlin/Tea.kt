package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Tea: ImageVector
    get() {
        if (_Tea != null) {
            return _Tea!!
        }
        _Tea = ImageVector.Builder(
            name = "Tea",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 19f)
                horizontalLineTo(20f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                moveTo(20f, 8f)
                verticalLineTo(5f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                moveTo(20f, 3f)
                curveTo(20.6f, 3f, 21f, 3.2f, 21.4f, 3.6f)
                curveTo(21.8f, 4f, 22f, 4.5f, 22f, 5f)
                verticalLineTo(8f)
                curveTo(22f, 8.6f, 21.8f, 9f, 21.4f, 9.4f)
                curveTo(21f, 9.8f, 20.6f, 10f, 20f, 10f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                curveTo(18f, 14.1f, 17.6f, 15f, 16.8f, 15.8f)
                curveTo(16f, 16.6f, 15.1f, 17f, 14f, 17f)
                horizontalLineTo(8f)
                curveTo(6.9f, 17f, 6f, 16.6f, 5.2f, 15.8f)
                curveTo(4.4f, 15f, 4f, 14.1f, 4f, 13f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(5.4f)
                lineTo(7.2f, 6.8f)
                curveTo(7.1f, 6.9f, 7f, 7.1f, 7f, 7.2f)
                verticalLineTo(11.5f)
                curveTo(7f, 11.8f, 7.2f, 12f, 7.5f, 12f)
                horizontalLineTo(11.5f)
                curveTo(11.8f, 12f, 12f, 11.8f, 12f, 11.5f)
                verticalLineTo(7.2f)
                curveTo(12f, 7f, 11.9f, 6.9f, 11.8f, 6.8f)
                lineTo(10f, 5.4f)
                verticalLineTo(3f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _Tea!!
    }

@Suppress("ObjectPropertyName")
private var _Tea: ImageVector? = null
