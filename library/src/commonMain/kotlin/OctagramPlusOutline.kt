package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OctagramPlusOutline: ImageVector
    get() {
        if (_OctagramPlusOutline != null) {
            return _OctagramPlusOutline!!
        }
        _OctagramPlusOutline = ImageVector.Builder(
            name = "OctagramPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.2f, 16.06f)
                lineTo(3.88f, 12f)
                lineTo(2.2f, 7.94f)
                lineTo(6.26f, 6.26f)
                lineTo(7.94f, 2.2f)
                lineTo(12f, 3.88f)
                lineTo(16.06f, 2.2f)
                lineTo(17.74f, 6.26f)
                lineTo(21.8f, 7.94f)
                lineTo(20.12f, 12f)
                lineTo(20.63f, 13.22f)
                curveTo(20.11f, 13.08f, 19.56f, 13f, 19f, 13f)
                curveTo(18.79f, 13f, 18.58f, 13f, 18.38f, 13.03f)
                lineTo(17.95f, 12f)
                lineTo(19.19f, 9f)
                lineTo(16.21f, 7.79f)
                lineTo(15f, 4.81f)
                lineTo(12f, 6.05f)
                lineTo(9f, 4.81f)
                lineTo(7.79f, 7.79f)
                lineTo(4.81f, 9f)
                lineTo(6.05f, 12f)
                lineTo(4.81f, 15f)
                lineTo(7.79f, 16.21f)
                lineTo(9f, 19.19f)
                lineTo(12f, 17.95f)
                lineTo(13.03f, 18.38f)
                curveTo(13f, 18.58f, 13f, 18.79f, 13f, 19f)
                curveTo(13f, 19.56f, 13.08f, 20.11f, 13.22f, 20.63f)
                lineTo(12f, 20.12f)
                lineTo(7.94f, 21.8f)
                lineTo(6.26f, 17.74f)
                lineTo(2.2f, 16.06f)
                moveTo(20f, 20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _OctagramPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _OctagramPlusOutline: ImageVector? = null
