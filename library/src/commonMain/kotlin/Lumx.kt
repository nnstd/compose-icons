package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Lumx: ImageVector
    get() {
        if (_Lumx != null) {
            return _Lumx!!
        }
        _Lumx = ImageVector.Builder(
            name = "Lumx",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.35f, 1.75f)
                lineTo(20.13f, 9.53f)
                lineTo(13.77f, 15.89f)
                lineTo(12.35f, 14.47f)
                lineTo(17.3f, 9.53f)
                lineTo(10.94f, 3.16f)
                lineTo(12.35f, 1.75f)
                moveTo(15.89f, 9.53f)
                lineTo(14.47f, 10.94f)
                lineTo(10.23f, 6.7f)
                lineTo(5.28f, 11.65f)
                lineTo(3.87f, 10.23f)
                lineTo(10.23f, 3.87f)
                lineTo(15.89f, 9.53f)
                moveTo(10.23f, 8.11f)
                lineTo(11.65f, 9.53f)
                lineTo(6.7f, 14.47f)
                lineTo(13.06f, 20.84f)
                lineTo(11.65f, 22.25f)
                lineTo(3.87f, 14.47f)
                lineTo(10.23f, 8.11f)
                moveTo(8.11f, 14.47f)
                lineTo(9.53f, 13.06f)
                lineTo(13.77f, 17.3f)
                lineTo(18.72f, 12.35f)
                lineTo(20.13f, 13.77f)
                lineTo(13.77f, 20.13f)
                lineTo(8.11f, 14.47f)
                close()
            }
        }.build()

        return _Lumx!!
    }

@Suppress("ObjectPropertyName")
private var _Lumx: ImageVector? = null
