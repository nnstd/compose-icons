package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadRemoveOutline: ImageVector
    get() {
        if (_HeadRemoveOutline != null) {
            return _HeadRemoveOutline!!
        }
        _HeadRemoveOutline = ImageVector.Builder(
            name = "HeadRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                curveTo(16.9f, 3f, 20f, 6.1f, 20f, 10f)
                curveTo(20f, 12.8f, 18.4f, 15.2f, 16f, 16.3f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                curveTo(6.9f, 18f, 6f, 17.1f, 6f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(4.5f)
                curveTo(4.1f, 13f, 3.8f, 12.5f, 4.1f, 12.2f)
                lineTo(6f, 9.7f)
                curveTo(6.2f, 5.9f, 9.2f, 3f, 13f, 3f)
                moveTo(13f, 1f)
                curveTo(8.4f, 1f, 4.6f, 4.4f, 4.1f, 8.9f)
                lineTo(2.5f, 11f)
                curveTo(1.9f, 11.7f, 1.8f, 12.7f, 2.2f, 13.6f)
                curveTo(2.6f, 14.3f, 3.2f, 14.8f, 4f, 15f)
                verticalLineTo(16f)
                curveTo(4f, 17.9f, 5.3f, 19.4f, 7f, 19.9f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(17.5f)
                curveTo(20.5f, 15.9f, 22f, 13.1f, 22f, 10f)
                curveTo(22f, 5f, 18f, 1f, 13f, 1f)
                moveTo(16.5f, 6.9f)
                lineTo(14.4f, 9f)
                lineTo(16.5f, 11.1f)
                lineTo(15.1f, 12.5f)
                lineTo(13f, 10.4f)
                lineTo(10.9f, 12.5f)
                lineTo(9.5f, 11.1f)
                lineTo(11.6f, 9f)
                lineTo(9.5f, 6.9f)
                lineTo(10.9f, 5.5f)
                lineTo(13f, 7.6f)
                lineTo(15.1f, 5.5f)
                lineTo(16.5f, 6.9f)
                close()
            }
        }.build()

        return _HeadRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HeadRemoveOutline: ImageVector? = null
