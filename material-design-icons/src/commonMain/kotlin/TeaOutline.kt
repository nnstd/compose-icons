package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TeaOutline: ImageVector
    get() {
        if (_TeaOutline != null) {
            return _TeaOutline!!
        }
        _TeaOutline = ImageVector.Builder(
            name = "TeaOutline",
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
                moveTo(21.4f, 3.6f)
                curveTo(21f, 3.2f, 20.6f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                curveTo(4f, 14.1f, 4.4f, 15f, 5.2f, 15.8f)
                curveTo(6f, 16.6f, 6.9f, 17f, 8f, 17f)
                horizontalLineTo(14f)
                curveTo(15.1f, 17f, 16f, 16.6f, 16.8f, 15.8f)
                curveTo(17.6f, 15f, 18f, 14.1f, 18f, 13f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                curveTo(20.6f, 10f, 21f, 9.8f, 21.4f, 9.4f)
                curveTo(21.8f, 9f, 22f, 8.6f, 22f, 8f)
                verticalLineTo(5f)
                curveTo(22f, 4.5f, 21.8f, 4f, 21.4f, 3.6f)
                moveTo(16f, 5f)
                verticalLineTo(8f)
                lineTo(16f, 10f)
                verticalLineTo(13f)
                curveTo(16f, 13.6f, 15.8f, 14f, 15.4f, 14.4f)
                curveTo(15f, 14.8f, 14.6f, 15f, 14f, 15f)
                horizontalLineTo(8f)
                curveTo(7.4f, 15f, 7f, 14.8f, 6.6f, 14.4f)
                curveTo(6.2f, 14f, 6f, 13.5f, 6f, 13f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(6.4f)
                lineTo(8.2f, 7.8f)
                curveTo(8f, 7.9f, 8f, 8.1f, 8f, 8.2f)
                verticalLineTo(12.5f)
                curveTo(8f, 12.8f, 8.2f, 13f, 8.5f, 13f)
                horizontalLineTo(12.5f)
                curveTo(12.8f, 13f, 13f, 12.8f, 13f, 12.5f)
                verticalLineTo(8.2f)
                curveTo(13f, 8f, 12.9f, 7.9f, 12.8f, 7.8f)
                lineTo(11f, 6.4f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                moveTo(20f, 8f)
                horizontalLineTo(18f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _TeaOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TeaOutline: ImageVector? = null
