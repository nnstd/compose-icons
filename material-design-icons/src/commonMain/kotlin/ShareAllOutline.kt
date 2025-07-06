package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShareAllOutline: ImageVector
    get() {
        if (_ShareAllOutline != null) {
            return _ShareAllOutline!!
        }
        _ShareAllOutline = ImageVector.Builder(
            name = "ShareAllOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9.8f)
                verticalLineTo(10.7f)
                lineTo(11.3f, 10.9f)
                curveTo(8.7f, 11.3f, 6.8f, 12.3f, 5.4f, 13.6f)
                curveTo(7.1f, 13.1f, 8.9f, 12.8f, 11f, 12.8f)
                horizontalLineTo(13f)
                verticalLineTo(14.1f)
                lineTo(15.2f, 12f)
                lineTo(13f, 9.8f)
                moveTo(11f, 5f)
                lineTo(18f, 12f)
                lineTo(11f, 19f)
                verticalLineTo(14.9f)
                curveTo(6f, 14.9f, 2.5f, 16.5f, 0f, 20f)
                curveTo(1f, 15f, 4f, 10f, 11f, 9f)
                moveTo(17f, 8f)
                verticalLineTo(5f)
                lineTo(24f, 12f)
                lineTo(17f, 19f)
                verticalLineTo(16f)
                lineTo(21f, 12f)
            }
        }.build()

        return _ShareAllOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShareAllOutline: ImageVector? = null
