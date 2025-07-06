package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarDavid: ImageVector
    get() {
        if (_StarDavid != null) {
            return _StarDavid!!
        }
        _StarDavid = ImageVector.Builder(
            name = "StarDavid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                lineTo(9.1f, 7f)
                horizontalLineTo(3.3f)
                lineTo(6.3f, 12f)
                lineTo(3.3f, 17f)
                horizontalLineTo(9.1f)
                lineTo(12f, 22f)
                lineTo(14.9f, 17f)
                horizontalLineTo(20.7f)
                lineTo(17.7f, 12f)
                lineTo(20.7f, 7f)
                horizontalLineTo(14.9f)
                lineTo(12f, 2f)
                moveTo(12f, 5f)
                lineTo(13.2f, 7f)
                horizontalLineTo(10.8f)
                lineTo(12f, 5f)
                moveTo(8.2f, 8.5f)
                lineTo(7.1f, 10.5f)
                lineTo(5.9f, 8.5f)
                horizontalLineTo(8.2f)
                moveTo(10f, 8.5f)
                horizontalLineTo(14f)
                lineTo(16f, 12f)
                lineTo(14f, 15.5f)
                horizontalLineTo(10f)
                lineTo(8f, 12f)
                lineTo(10f, 8.5f)
                moveTo(18f, 8.5f)
                lineTo(16.8f, 10.5f)
                lineTo(15.7f, 8.5f)
                horizontalLineTo(18f)
                moveTo(7.1f, 13.5f)
                lineTo(8.2f, 15.5f)
                horizontalLineTo(6f)
                lineTo(7.1f, 13.5f)
                moveTo(16.9f, 13.5f)
                lineTo(18.1f, 15.5f)
                horizontalLineTo(15.8f)
                lineTo(16.9f, 13.5f)
                moveTo(13.3f, 17f)
                lineTo(12f, 19f)
                lineTo(10.8f, 17f)
                horizontalLineTo(13.3f)
                close()
            }
        }.build()

        return _StarDavid!!
    }

@Suppress("ObjectPropertyName")
private var _StarDavid: ImageVector? = null
