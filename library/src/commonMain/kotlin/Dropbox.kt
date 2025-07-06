package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Dropbox: ImageVector
    get() {
        if (_Dropbox != null) {
            return _Dropbox!!
        }
        _Dropbox = ImageVector.Builder(
            name = "Dropbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 6.2f)
                lineTo(8f, 9.39f)
                lineTo(13f, 6.2f)
                lineTo(8f, 3f)
                lineTo(3f, 6.2f)
                moveTo(13f, 6.2f)
                lineTo(18f, 9.39f)
                lineTo(23f, 6.2f)
                lineTo(18f, 3f)
                lineTo(13f, 6.2f)
                moveTo(3f, 12.55f)
                lineTo(8f, 15.74f)
                lineTo(13f, 12.55f)
                lineTo(8f, 9.35f)
                lineTo(3f, 12.55f)
                moveTo(18f, 9.35f)
                lineTo(13f, 12.55f)
                lineTo(18f, 15.74f)
                lineTo(23f, 12.55f)
                lineTo(18f, 9.35f)
                moveTo(8.03f, 16.8f)
                lineTo(13.04f, 20f)
                lineTo(18.04f, 16.8f)
                lineTo(13.04f, 13.61f)
                lineTo(8.03f, 16.8f)
                close()
            }
        }.build()

        return _Dropbox!!
    }

@Suppress("ObjectPropertyName")
private var _Dropbox: ImageVector? = null
